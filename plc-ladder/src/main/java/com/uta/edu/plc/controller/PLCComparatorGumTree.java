package com.uta.edu.plc.controller;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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

public class PLCComparatorGumTree {

    public static void main(String[] args) throws Exception {
        Run.initGenerators();  // Initializes the GumTree generators

//        //scenario 1
//        String file1 = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQUOld.S05";
//        String file2 = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQUOldNew.S05";
        
        //scenario 2
        String file1 = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\0364_eqFile.txt";
        String file2 = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\New EQ\\LOGEQU.S0364";

        
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

//    private static void showUnmatchedNodes(TreeContext tc1, TreeContext tc2, MappingStore mappings, String file1, String file2) throws IOException {
//        Set<Tree> matchedSrcNodes = new HashSet<>();
//        Set<Tree> matchedDstNodes = new HashSet<>();
//
//        for (Mapping mapping : mappings) {
//            matchedSrcNodes.add(mapping.first);
//            matchedDstNodes.add(mapping.second);
//            System.out.println("UnMatch Source Tree: " + mapping.first.toTreeString());
//            System.out.println("UnMatch Destination Tree: " + mapping.second.toTreeString());
//        }
//
//        JFrame frame = new JFrame("Matched/Unmatched Nodes");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(1200, 600);
//
//        JTextArea textArea1 = new JTextArea();
//        JTextArea textArea2 = new JTextArea();
//        textArea1.setEditable(false);
//        textArea2.setEditable(false);
//        Highlighter highlighter1 = textArea1.getHighlighter();
//        Highlighter highlighter2 = textArea2.getHighlighter();
//        Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.YELLOW);
//
//        String xmlContent1 = new String(Files.readAllBytes(Paths.get(file1)));
//        String xmlContent2 = new String(Files.readAllBytes(Paths.get(file2)));
//        System.out.println("Satheesh1:-"+xmlContent1);
//        System.out.println("Satheesh2:-"+xmlContent2);
//        textArea1.setText(xmlContent1);
//        textArea2.setText(xmlContent2);
//
//        highlightNodes(tc1.getRoot(), matchedSrcNodes, textArea1, highlighter1, painter);
//        highlightNodes(tc2.getRoot(), matchedDstNodes, textArea2, highlighter2, painter);
//
//        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(textArea1), new JScrollPane(textArea2));
//        splitPane.setDividerLocation(600);
//        
//        frame.add(splitPane);
//        frame.setVisible(true);
//    }
    
//    private static void showUnmatchedNodes(TreeContext tc1, TreeContext tc2, MappingStore mappings, String file1, String file2) throws IOException {
//        Set<Tree> matchedSrcNodes = new HashSet<>();
//        Set<Tree> matchedDstNodes = new HashSet<>();
//
//        for (Mapping mapping : mappings) {
//            matchedSrcNodes.add(mapping.first);
//            matchedDstNodes.add(mapping.second);
//        }
//
//        JFrame frame = new JFrame("Comparison Results");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(1400, 800);
//
//        JPanel mainPanel = new JPanel(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.insets = new Insets(10, 10, 10, 10);
//        gbc.fill = GridBagConstraints.BOTH;
//
//        JLabel label1 = new JLabel("Unmatched Nodes in File 1");
//        JLabel label2 = new JLabel("Unmatched Nodes in File 2");
//
//        JTextArea textArea1 = new JTextArea();
//        JTextArea textArea2 = new JTextArea();
//        textArea1.setEditable(false);
//        textArea2.setEditable(false);
//
//        Highlighter highlighter1 = textArea1.getHighlighter();
//        Highlighter highlighter2 = textArea2.getHighlighter();
//        Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.YELLOW);
//
//        String xmlContent1 = new String(Files.readAllBytes(Paths.get(file1)));
//        String xmlContent2 = new String(Files.readAllBytes(Paths.get(file2)));
//
//        textArea1.setText(xmlContent1);
//        textArea2.setText(xmlContent2);
//        String outputFilePath = "D:\\Satheesh\\unmatched_nodes.txt";
//        highlightNodes(tc1.getRoot(), matchedSrcNodes, textArea1, highlighter1, painter,file1,outputFilePath);
//        highlightNodes(tc2.getRoot(), matchedDstNodes, textArea2, highlighter2, painter,file2,outputFilePath);
//
//        JScrollPane scrollPane1 = new JScrollPane(textArea1);
//        JScrollPane scrollPane2 = new JScrollPane(textArea2);
//
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        mainPanel.add(label1, gbc);
//
//        gbc.gridx = 1;
//        mainPanel.add(label2, gbc);
//
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        gbc.weightx = 0.5;
//        gbc.weighty = 1.0;
//        mainPanel.add(scrollPane1, gbc);
//
//        gbc.gridx = 1;
//        mainPanel.add(scrollPane2, gbc);
//
//        frame.add(mainPanel);
//        frame.setVisible(true);
//    }

    static String outputFilePath = "D:\\Satheesh\\unmatched_nodes.txt";

    private static void showUnmatchedNodes(TreeContext tc1, TreeContext tc2, MappingStore mappings, String file1, String file2) throws IOException {
        Set<Tree> matchedSrcNodes = new HashSet<>();
        Set<Tree> matchedDstNodes = new HashSet<>();
        Map<String, String> identifierMap1 = new HashMap<>();  
        Map<String, String> identifierMap2 = new HashMap<>();  

        for (Mapping mapping : mappings) {
            matchedSrcNodes.add(mapping.first);
            matchedDstNodes.add(mapping.second);
        }

        JFrame frame = new JFrame("Comparison Results");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 800);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.BOTH;

        JLabel label1 = new JLabel("Unmatched Nodes in File 1");
        JLabel label2 = new JLabel("Unmatched Nodes in File 2");

        JTextArea textArea1 = new JTextArea();
        JTextArea textArea2 = new JTextArea();
        textArea1.setEditable(false);
        textArea2.setEditable(false);

        Highlighter highlighter1 = textArea1.getHighlighter();
        Highlighter highlighter2 = textArea2.getHighlighter();
        Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.YELLOW);

        String xmlContent1 = new String(Files.readAllBytes(Paths.get(file1)));
        String xmlContent2 = new String(Files.readAllBytes(Paths.get(file2)));

        textArea1.setText(xmlContent1);
        textArea2.setText(xmlContent2);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) { 
	        // Process the first file
	       try {
	    	   	boolean status =  highlightNodes(tc1.getRoot(), matchedSrcNodes, textArea1, highlighter1, painter, file1, outputFilePath, identifierMap1);
				boolean status1 =  highlightNodes(tc2.getRoot(), matchedDstNodes, textArea2, highlighter2, painter, file2, outputFilePath, identifierMap2);
				if(status || status1)
				{
					System.out.println("Structure is unidentical..........");
					writer.write("Structure is unidentical!!!!!!");
	                writer.newLine();
				}
				else
				{
					System.out.println("Structure is identical..........");
					writer.write("Structure is identical!!!!!");
	                writer.newLine();
				}
	       } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	       }
        }
        catch (Exception e) {
        	e.printStackTrace();
		}
        
      
        
        compareIdentifierMaps(identifierMap1, identifierMap2, outputFilePath);
        
        
        /// 29-08-2024 - start
        Map<String, String> identifiers1 = extractIdentifiers(tc1.getRoot());
        Map<String, String> identifiers2 = extractIdentifiers(tc2.getRoot());

        compareIdentifiers(identifiers1, identifiers2);
        /// 29-08-2024 - END
        
        Map<String, Integer> oldPositions = mapNodeToPosition(tc1.getRoot());
        Map<String, Integer> newPositions = mapNodeToPosition(tc2.getRoot());

        detectLineShifts(oldPositions, newPositions);

        JScrollPane scrollPane1 = new JScrollPane(textArea1);
        JScrollPane scrollPane2 = new JScrollPane(textArea2);

        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(label1, gbc);

        gbc.gridx = 1;
        mainPanel.add(label2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 1.0;
        mainPanel.add(scrollPane1, gbc);

        gbc.gridx = 1;
        mainPanel.add(scrollPane2, gbc);

        frame.add(mainPanel);
        frame.setVisible(true);
    }


//    private static void compareIdentifierMaps(Map<String, String> map1, Map<String, String> map2, String outputFilePath) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) { // Append mode
//            for (String identifier : map1.keySet()) {
//                String value1 = map1.get(identifier);
//                String value2 = map2.get(identifier);
//                
//                if (value2 == null) {
//                    // Identifier missing in the second file
//                    String changeInfo = "Identifier " + identifier + " present in first file with value " + value1 + " but missing in second file.";
//                    System.out.println(changeInfo);
//                    writer.write(changeInfo);
//                    writer.newLine();
//                } else if (!value1.equals(value2)) {
//                    // Value changed
//                    String changeInfo = "Change detected for " + identifier + ": " + value1 + " -> " + value2;
//                    System.out.println(changeInfo);
//                    writer.write(changeInfo);
//                    writer.newLine();
//                }
//            }
//
//            // Check for identifiers present in the second file but missing in the first
//            for (String identifier : map2.keySet()) {
//                if (!map1.containsKey(identifier)) {
//                    String value2 = map2.get(identifier);
//                    String changeInfo = "Identifier " + identifier + " present in second file with value " + value2 + " but missing in first file.";
//                    System.out.println(changeInfo);
//                    writer.write(changeInfo);
//                    writer.newLine();
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    
    private static void compareIdentifierMaps(Map<String, String> map1, Map<String, String> map2, String outputFilePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) { // Append mode
            for (String contextIdentifier : map1.keySet()) {
                String value1 = map1.get(contextIdentifier);
                String value2 = map2.get(contextIdentifier);
                
                if (value2 == null) {
                    String changeInfo = "In context " + contextIdentifier + ", value " + value1 + " is missing in the second file.";
//                    System.out.println(changeInfo);
//                    writer.write(changeInfo);
//                    writer.newLine();
                } else if (!value1.equals(value2)) {
                    String changeInfo = "Change detected in context " + contextIdentifier + ": " + value1 + " -> " + value2;
                    System.out.println(changeInfo);
//                    writer.write(changeInfo);
//                    writer.newLine();
                }
            }

            for (String contextIdentifier : map2.keySet()) {
                if (!map1.containsKey(contextIdentifier)) {
                    String value2 = map2.get(contextIdentifier);
                    String changeInfo = "In context " + contextIdentifier + ", value " + value2 + " is present in the second file but missing in the first file.";
                    System.out.println(changeInfo);
//                    writer.write(changeInfo);
//                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



//    private static void highlightNodes(Tree root, Set<Tree> matchedNodes, JTextArea textArea, Highlighter highlighter, Highlighter.HighlightPainter painter) {
//        for (Tree node : root.preOrder()) {
//            boolean isMatched = matchedNodes.contains(node);
//            if (!isMatched) {
//                String nodeString = node.toTreeString() + "\n";
//                textArea.append(nodeString);
//                try {
//                    int start = textArea.getLineStartOffset(textArea.getLineCount() - 2); // -2 to correctly place the highlight
//                    int end = textArea.getLineEndOffset(textArea.getLineCount() - 2); // -2 to correctly place the highlight
//                    highlighter.addHighlight(start, end, painter);
//                } catch (BadLocationException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//    private static void highlightNodes(Tree root, Set<Tree> matchedNodes, JTextArea textArea, Highlighter highlighter, Highlighter.HighlightPainter painter) {
//        for (Tree node : root.preOrder()) {
//            boolean isMatched = matchedNodes.contains(node);
//            if (!isMatched) {
//                // Calculate line number from node position
//                int startPos = node.getPos();
//                try {
//                    int lineNumber = textArea.getLineOfOffset(startPos); // Find the line number of the node position
//                    int start = textArea.getLineStartOffset(lineNumber); // Start of the line
//                    int end = textArea.getLineEndOffset(lineNumber); // End of the line
//                    
//                    // Highlight the entire line
//                    highlighter.addHighlight(start, end, painter);
//                    
//                    // Optionally: Add the unmatched node content to the text area (as text area is static).
//                    textArea.insert(node.toTreeString() + "\n", start);
//                    
//                } catch (BadLocationException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
    

//    private static void highlightNodes(Tree root, Set<Tree> matchedNodes, JTextArea textArea, Highlighter highlighter, Highlighter.HighlightPainter painter, String fileName, String outputFilePath, Map<String, String> identifierMap) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) { // Append mode
//            for (Tree node : root.preOrder()) {
//                boolean isMatched = matchedNodes.contains(node);
//                if (!isMatched) {
//                    // Calculate the start position of the node
//                    int startPos = node.getPos();
//                    try {
//                        int lineNumber = textArea.getLineOfOffset(startPos); // Find the line number of the node position
//                        int start = textArea.getLineStartOffset(lineNumber); // Start of the line
//                        int end = textArea.getLineEndOffset(lineNumber); // End of the line
//                        
//                        // Get the entire line text
//                        String lineText = textArea.getText(start, end - start).trim();
//                        
//                        // Extract identifier and value (e.g., "MS,500")
//                        String identifier = extractIdentifier(lineText);
//                        String value = extractValue(lineText);
//                        
//                        // Store the identifier and value in the map, using the parent node context as a key
//                        if (identifier != null && value != null) {
//                            String parentContext = getParentContext(node);
//                            String contextKey = parentContext + "-" + identifier; // Create a unique key for context + identifier
//                            identifierMap.put(contextKey, value);
//                        }
//                        
//                        // Concatenate the node name with the line text
//                        String nodeInfo = fileName + " - " + node.getType().name + ": " + lineText+" Line No:-"+lineNumber;
//                        
//                        // Highlight the entire line
//                        highlighter.addHighlight(start, end, painter);
//                        
//                        // Print the node name and its corresponding line text on the console
////                        System.out.println(nodeInfo);
//                       // System.out.println(identifierMap);
//                        //System.out.println(value);
//                        System.out.println(lineText+"- is missing at "+fileName +" file and line number is "+lineNumber);
//                        // Write the nodeInfo to the output file
//                        if(node.getType().name.contains("name"))
//                        {
//	                        writer.write(lineText+" - is missing at "+fileName +" file and line number is "+lineNumber);
//	                        writer.newLine();
//                        }
//                        
//                    } catch (BadLocationException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    static boolean isIdentical = false;
    private static boolean highlightNodes(Tree root, Set<Tree> matchedNodes, JTextArea textArea, Highlighter highlighter, Highlighter.HighlightPainter painter, String fileName, String outputFilePath, Map<String, String> identifierMap) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) { // Append mode
           
        	for (Tree node : root.preOrder()) {
                boolean isMatched = matchedNodes.contains(node);
                if (!isMatched) {
                	isIdentical = true;
                    int startPos = node.getPos();
                    try {
                        int lineNumber = textArea.getLineOfOffset(startPos); // Find the line number of the node position
                        int start = textArea.getLineStartOffset(lineNumber); // Start of the line
                        int end = textArea.getLineEndOffset(lineNumber); // End of the line
                        
                        String lineText = textArea.getText(start, end - start).trim();
                        
                        String identifier = extractIdentifier(lineText);
                        String value = extractValue(lineText);
                        
                        if (identifier != null && value != null) {
                            String parentContext = getParentContext(node);
                            String contextKey = parentContext + "-" + identifier; 
                            identifierMap.put(contextKey, value);
                        }
                        
                        String nodeInfo = fileName + " - " + node.getType().name + ": " + lineText + " Line No:-" + lineNumber;
                        
                        highlighter.addHighlight(start, end, painter);
                        
                        System.out.println(lineText + " - is missing or changed in " + fileName + " file at line number " + lineNumber);
                        
                        if (node.getType().name.contains("name")) {
                            writer.write(lineText + " - is missing or changed in " + fileName + " file at line number " + lineNumber);
                            writer.newLine();
                        }
                        
                    } catch (BadLocationException e) {
                        e.printStackTrace();
                    }
//                    if(isIdentical)
//                    {
//                    	writer.write("Structure is unidentical..........");
//                        writer.newLine();
//                    }                 
                    	
                }
            }
        	
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isIdentical;
    }


    private static String extractIdentifier(String lineText) {
        if (lineText.contains(",")) {
            return lineText.split(",")[0].trim();
        }
        return null;
    }

    private static String extractValue(String lineText) {
        if (lineText.contains(",")) {
            return lineText.split(",")[1].trim();
        }
        return null;
    }

    private static String getParentContext(Tree node) {
        Tree parent = node.getParent();
        if (parent != null) {
            return parent.getLabel().trim();
        }
        return "global";
    }

   ///. 29-08-2024 - Start
    public static Map<String, String> extractIdentifiers(Tree root) {
        Map<String, String> identifierMap = new HashMap<>();

        for (Tree node : root.preOrder()) {

            if (isIdentifierNode(node)) { 
                String identifier = extractIdentifier(node);
                String value = extractValue(node);

                String context = getContext(node);
                String key = context + "-" + identifier;

                identifierMap.put(key, value);
            }
        }

        return identifierMap;
    }

    public static void compareIdentifiers(Map<String, String> identifiers1, Map<String, String> identifiers2) {
    	try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) {
        for (String key : identifiers1.keySet()) {
            String value1 = identifiers1.get(key);
            String value2 = identifiers2.get(key);

            if (value2 == null) {
                System.out.println("Identifier " + key + " is missing in the second file.");
                writer.write("Identifier " + key + " is missing in the second file.");
                writer.newLine();
            } else if (!value1.equals(value2)) {
                System.out.println("Change detected for " + key + ": " + value1 + " -> " + value2);
                writer.write("Change detected for " + key + ": " + value1 + " -> " + value2);
                writer.newLine();
            }
        }

        for (String key : identifiers2.keySet()) {
            if (!identifiers1.containsKey(key)) {
                System.out.println("Identifier " + key + " is missing in the first file.");
                writer.write("Identifier " + key + " is missing in the first file.");
                writer.newLine();
            }
        }
    	}
        catch (Exception e) {
			e.printStackTrace();
		}
    }

    private static boolean isIdentifierNode(Tree node) {
        return node.getType().name.equals("literal");
    }

    private static String extractIdentifier(Tree node) {
        return node.getLabel();
    }

    private static String extractValue(Tree node) {
        return node.getLabel(); // Simplified example
    }

    private static String getContext(Tree node) {
        Tree parent = node.getParent();
        return parent != null ? parent.getLabel() : "global";
    }

    private static Map<String, Integer> mapNodeToPosition(Tree root) {
        Map<String, Integer> nodePositionMap = new HashMap<>();

        for (Tree node : root.preOrder()) {
            String identifier = extractIdentifier12(node);
            int startLine = node.getPos();  
            if (identifier != null) {
                nodePositionMap.put(identifier, startLine);
            }
        }

        return nodePositionMap;
    }

    private static void detectLineShifts(Map<String, Integer> oldPositions, Map<String, Integer> newPositions) {
    	try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) {
    	for (String key : oldPositions.keySet()) {
            Integer oldPosition = oldPositions.get(key);
            Integer newPosition = newPositions.get(key);

            if (newPosition != null && !oldPosition.equals(newPosition)) {
                System.out.println("Node '" + key + "' has moved from position " + oldPosition + " to position " + newPosition);
                writer.write("Node '" + key + "' has moved from position " + oldPosition + " to position " + newPosition);
                writer.newLine();
            }
        }
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    private static String extractIdentifier12(Tree node) {
//        return node.getType().name + "-" + node.getLabel();
    	return node.getLabel();
    }



}
