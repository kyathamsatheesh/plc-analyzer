package com.uta.edu.plc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.client.Run;
import com.github.gumtreediff.gen.TreeGenerator;
import com.github.gumtreediff.gen.srcml.SrcmlJavaTreeGenerator;
import com.github.gumtreediff.matchers.Mapping;
import com.github.gumtreediff.matchers.MappingStore;
import com.github.gumtreediff.matchers.Matcher;
import com.github.gumtreediff.matchers.Matchers;
import com.github.gumtreediff.tree.Tree;
import com.github.gumtreediff.tree.TreeContext;

import com.uta.edu.plc.grammer.PLCGrammarLexer;
import com.uta.edu.plc.grammer.PLCGrammarParser;

public class PLCComparatorGumTreeWorkingCode {

    public static void main(String[] args) throws Exception {
        Run.initGenerators();  // Initializes the GumTree generators

        String file1 = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQUOld.S05";
        String file2 = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQUOldNew.S05";
        
        // Use ANTLR to parse the files into ASTs
        TreeContext tc1 = parseFileWithANTLR(file1, "file1");
        TreeContext tc2 = parseFileWithANTLR(file2, "file2");
        
        if (tc1 == null || tc2 == null || tc1.getRoot() == null || tc2.getRoot() == null) {
            System.err.println("One of the TreeContexts or their roots is null.");
            return;
        }

        try {
            Matcher matcher = Matchers.getInstance().getMatcher();
            matcher.match(tc1.getRoot(), tc2.getRoot());
            MappingStore mappings = matcher.match(tc1.getRoot(), tc2.getRoot());
            
            showMatches(mappings);
            showUnmatchedNodes(tc1, tc2, mappings, file1, file2);
        } catch (NullPointerException e) {
            System.err.println("Failed to match trees due to null pointer: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static TreeContext parseFileWithANTLR(String filePath, String filename) throws IOException {
        runExternalCommand(filePath, filename);
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        CharStream charStream = CharStreams.fromString(content);
        PLCGrammarLexer lexer = new PLCGrammarLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PLCGrammarParser parser = new PLCGrammarParser(tokens);
        parser.setTrace(true);
        
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });
        
        ParseTree tree = parser.program();
        System.out.println("Tree: " + tree);
        System.out.println("Tree Parser: " + tree.toStringTree(parser));

        if (tree != null) {
            System.out.println("Parsing completed successfully.");
        } else {
            System.out.println("Parsing failed.");
        }
        
        TreeGenerator generator = new SrcmlJavaTreeGenerator();
        return generator.generateFrom().string(content);
    }

    private static void runExternalCommand(String filePath, String filename) throws IOException {
        try {
            // Include --language Java in the srcML command
            ProcessBuilder processBuilder = new ProcessBuilder(
                    "C:\\Program Files\\srcML\\srcml.exe", 
                    "--language", "Java", 
                    filePath);
            
            // Create and start the process
            Process process = processBuilder.start();
            
            // Read the output of the process (i.e., the XML data)
            InputStream inputStream = process.getInputStream();
            StringBuilder xmlData = new StringBuilder();
            int i;
            while ((i = inputStream.read()) != -1) {
                xmlData.append((char) i);
            }
            System.out.println("XML Data filePath: " + xmlData.toString());
            
            // Write the XML data to a file
            String xmlFilePath = "D:\\Satheesh\\" + filename + ".xml";
            Files.write(Paths.get(xmlFilePath), xmlData.toString().getBytes());
            System.out.println("XML data saved to: " + xmlFilePath);
            
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void showMatches(MappingStore mappings) {
        System.out.println("Match: ");
        for (Mapping mapping : mappings) {
            System.out.println("Match Source Tree: " + mapping.first.toTreeString());
            System.out.println("Match Destination Tree: " + mapping.second.toTreeString());
        }
    }

    private static void showUnmatchedNodes(TreeContext tc1, TreeContext tc2, MappingStore mappings, String file1, String file2) throws IOException {
        Set<Tree> matchedSrcNodes = new HashSet<>();
        Set<Tree> matchedDstNodes = new HashSet<>();

        for (Mapping mapping : mappings) {
            matchedSrcNodes.add(mapping.first);
            matchedDstNodes.add(mapping.second);
            System.out.println("UnMatch Source Tree: " + mapping.first.toTreeString());
            System.out.println("UnMatch Destination Tree: " + mapping.second.toTreeString());
        }

        JFrame frame = new JFrame("Matched/Unmatched Nodes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 600);

        JTextArea textArea1 = new JTextArea();
        JTextArea textArea2 = new JTextArea();
        textArea1.setEditable(false);
        textArea2.setEditable(false);
        Highlighter highlighter1 = textArea1.getHighlighter();
        Highlighter highlighter2 = textArea2.getHighlighter();
        Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.YELLOW);

        String xmlContent1 = new String(Files.readAllBytes(Paths.get(file1)));
        String xmlContent2 = new String(Files.readAllBytes(Paths.get(file2)));
        System.out.println("Satheesh1:-"+xmlContent1);
        System.out.println("Satheesh2:-"+xmlContent2);
        textArea1.setText(xmlContent1);
        textArea2.setText(xmlContent2);

        highlightNodes(tc1.getRoot(), matchedSrcNodes, textArea1, highlighter1, painter);
        highlightNodes(tc2.getRoot(), matchedDstNodes, textArea2, highlighter2, painter);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(textArea1), new JScrollPane(textArea2));
        splitPane.setDividerLocation(600);
        
        frame.add(splitPane);
        frame.setVisible(true);
    }

    private static void highlightNodes(Tree root, Set<Tree> matchedNodes, JTextArea textArea, Highlighter highlighter, Highlighter.HighlightPainter painter) {
        for (Tree node : root.preOrder()) {
            boolean isMatched = matchedNodes.contains(node);
            if (!isMatched) {
                String nodeString = node.toTreeString() + "\n";
                textArea.append(nodeString);
                try {
                    int start = textArea.getLineStartOffset(textArea.getLineCount() - 2); // -2 to correctly place the highlight
                    int end = textArea.getLineEndOffset(textArea.getLineCount() - 2); // -2 to correctly place the highlight
                    highlighter.addHighlight(start, end, painter);
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
