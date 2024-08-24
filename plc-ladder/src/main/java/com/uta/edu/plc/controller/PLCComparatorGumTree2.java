package com.uta.edu.plc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
//import com.github.gumtreediff.tree.ITree;
import com.github.gumtreediff.tree.TreeContext;
//import com.uta.edu.plc.custom.TreeGenerator1;
import com.uta.edu.plc.grammer.PLCGrammarLexer;
import com.uta.edu.plc.grammer.PLCGrammarParser;


public class PLCComparatorGumTree2 {

    public static void main(String[] args) throws Exception {
        Run.initGenerators();  // Initializes the GumTree generators

        String file1 = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQUOld.S05";
//        String file2 = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\New EQ\\LOGEQUNew.S05";
        
        String file2 = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQUOldNew.S05";
        // Use ANTLR to parse the files into ASTs
        TreeContext tc1 = parseFileWithANTLR(file1);
        TreeContext tc2 = parseFileWithANTLR(file2);
       // System.out.println("tc1: " + tc1);
       // System.out.println("tc2: " + tc2);
        if (tc1 == null || tc2 == null || tc1.getRoot() == null || tc2.getRoot() == null) {
            System.err.println("One of the TreeContexts or their roots is null.");
            //return;
        }
        

        try {
        	 Matcher matcher = Matchers.getInstance().getMatcher();
             matcher.match(tc1.getRoot(), tc2.getRoot());
             System.out.println("Differences found: " + matcher);
             System.out.println("Differences found: " + matcher.toString());
             MappingStore mappings = matcher.match(tc1.getRoot(), tc2.getRoot());
//             showMatches(mappings);
             showUnmatchedNodes(tc1, tc2, mappings);
//             ActionGenerator actionGenerator = new ActionGenerator(tc1.getRoot(), tc2.getRoot(), matcher.getMappings());
//             EditScript actions = actionGenerator.generate();
             
             
        } catch (NullPointerException e) {
            System.err.println("Failed to match trees due to null pointer: " + e.getMessage());
            e.printStackTrace();
        }
     // Generate edit script
     
        
//        List<Action> actions = new com.github.gumtreediff.actions.ActionGenerator(tc1.getRoot(), tc2.getRoot(), matcher.getMappings()).generate();
        


        // Print differences
//        if (actions.isEmpty()) {
//            System.out.println("The structures are identical.");
//        } else {
//            System.out.println("The structures are not identical.");
//            actions.forEach(action -> System.out.println(action.toString()));
//        }
    }

    private static TreeContext parseFileWithANTLR(String filePath) throws IOException {
    	runExternalCommand(filePath);
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
//        System.out.println("content:-"+content);
        CharStream charStream = CharStreams.fromString(content);
//        System.out.println("charStream:-"+charStream);
        PLCGrammarLexer lexer = new PLCGrammarLexer(charStream);
//        System.out.println("lexer:-"+lexer.getState());
//        System.out.println("lexer:-"+lexer.getGrammarFileName());
        //System.out.println("lexer:-"+lexer.getText());
        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        System.out.println("tokens size-"+tokens.size());
//        System.out.println("tokens-"+tokens.getNumberOfOnChannelTokens());
//        System.out.println("tokens-"+tokens.getSourceName());
        PLCGrammarParser parser = new PLCGrammarParser(tokens);
        parser.setTrace(true);
        System.out.println("parser-"+parser.toString());
        
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });
        
        ParseTree tree = parser.program();
        System.out.println("Tree:-"+tree);
        System.out.println("Tree Praser:-"+tree.toStringTree(parser));

        if (tree != null) {
            System.out.println("Parsing completed successfully.");
        } else {
            System.out.println("Parsing failed.");
        }
        // Assuming SrcmlGenerator can handle the AST format used by ANTLR
        // If not, a custom implementation of TreeGenerator may be needed
        //TreeGenerator treeGenerator = new SrcmlJavaTreeGenerator();
        //TreeContext ctx = new SrcmlJavaTreeGenerator().generateFrom().string(content);//some changes need to done
        //com.github.gumtreediff.gen.TreeGenerator treeGenerator = new SrcmlJavaTreeGenerator();
        //TreeGenerator treeGenerator = new TreeGenerator(); // Adjust based on actual usage
        //return treeGenerator.generateFrom().generate(tree);
        
        TreeGenerator g1 = new SrcmlJavaTreeGenerator();
        
        TreeContext context2 = g1.generateFrom().string(content);
        //g1.generateFrom().file(srcFile);
        //TreeGenerator1 treeGenerator = new TreeGenerator1(); // Adjust based on actual usage
       // TreeContext context = treeGenerator.generate(tree);
        
        // generator = new TreeGenerator1();
       // TreeContext context1 = generator.generate(tree);
        
        
        return context2;
        //return ctx;
    }
    
    private static void runExternalCommand(String filePath) throws IOException {
    	
    	
    	try
        { //this is the file which we want to get its xml representation
            //String javaFileName = "C:\\Users\\Anosa\\Desktop\\tests\\BookController.java";
            //use ProcessBuilder class and give it the arguements
//            ProcessBuilder processBuilder = new ProcessBuilder("srcml", filePath);
            //spicify the directory of [srcml.exe]
//            processBuilder.directory(new File("C:\\Program Files\\srcML\\"));
    		ProcessBuilder processBuilder = new ProcessBuilder("C:\\Program Files\\srcML\\srcml.exe",filePath);
            //create the process
            Process process = processBuilder.start();
            //let's read the output of this process[ie: the xml data]
            InputStream inputStream = process.getInputStream();
            int i;
            try
            {
            StringBuilder xmlData = new StringBuilder();
            while ((i = inputStream.read()) != -1)
            {
                xmlData.append((char) i);
            }
            	System.out.println("XML Data:-"+xmlData.toString());
            }
            catch (Exception e) {
            	e.printStackTrace();
				// TODO: handle exception
			}
        } catch (IOException e)
        {
            System.out.println("ERROR: " + e.getMessage());
        }
    	
//        ProcessBuilder processBuilder = new ProcessBuilder("srcml.exe");
//        processBuilder.directory(new File("C:\\Program Files\\srcML\\")); // Ensure this path is correct
//        Process process = processBuilder.start();
//
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        }
    }
    
    private static void showMatches(MappingStore mappings) {
//        for (Mapping mapping : mappings) {
//            Tree src = mapping.first;
//            Tree dst = mapping.second;
//            System.out.println("Match: ");
//            System.out.println("Source: " + src.toTreeString());
//            System.out.println("Destination: " + dst.toTreeString());
//        }
    	System.out.println("Matchdsfsfsdf: ");
    	 for (Mapping mapping : mappings) {
             System.out.println("Match: ");
             System.out.println("Match Source Tree: " + mapping.first.toTreeString());
             System.out.println("Match Destination Tree: " + mapping.second.toTreeString());
         }
    }
    
    
    private static void showUnmatchedNodes(TreeContext tc1, TreeContext tc2, MappingStore mappings) {
        Set<Tree> matchedSrcNodes = new HashSet<>();
        Set<Tree> matchedDstNodes = new HashSet<>();

        for (Mapping mapping : mappings) {
            matchedSrcNodes.add(mapping.first);
            matchedDstNodes.add(mapping.second);
        }

        System.out.println("Unmatched nodes in source tree:");
        showUnmatched(tc1.getRoot(), matchedSrcNodes);

        System.out.println("Unmatched nodes in destination tree:");
        showUnmatched(tc2.getRoot(), matchedDstNodes);
    }

    private static void showUnmatched(Tree root, Set<Tree> matchedNodes) {
        for (Tree node : root.preOrder()) {
            if (!matchedNodes.contains(node)) {
                System.out.println(node.toTreeString());
            }
        }
    }
    
    public static void showInGUI(List<Action> actions) {
        JFrame frame = new JFrame("XML Differences");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        for (Action action : actions) {
            textArea.append(action.toString() + "\n");
        }

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}


