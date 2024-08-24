package com.uta.edu.plc.controller;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.uta.edu.plc.grammer.PLCGrammarLexer;
import com.uta.edu.plc.grammer.PLCGrammarParser;
import com.uta.edu.plc.view.UIApp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ComparePLCCodeController {
    public static void main(String[] args) throws IOException {
        CharStream input1 = CharStreams.fromFileName("D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQU.S05");
        PLCGrammarLexer lexer1 = new PLCGrammarLexer(input1);
        CommonTokenStream tokens1 = new CommonTokenStream(lexer1);
        PLCGrammarParser parser1 = new PLCGrammarParser(tokens1);
        ParseTree tree1 = parser1.equation(); // Assuming 'equation' is the start rule

        //CharStream input2 = CharStreams.fromFileName("LOGEQU2.S05");
        CharStream input2 = CharStreams.fromFileName("D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\New EQ\\LOGEQU.S05");
        PLCGrammarLexer lexer2 = new PLCGrammarLexer(input2);
        CommonTokenStream tokens2 = new CommonTokenStream(lexer2);
        PLCGrammarParser parser2 = new PLCGrammarParser(tokens2);
        ParseTree tree2 = parser2.equation();

        List<String> differences = compareASTs(tree1, tree2);

        launchUI(differences);
    }

    private static List<String> compareASTs(ParseTree tree1, ParseTree tree2) {
        // Implement a method to compare ASTs and return a list of differences
        List<String> differences = new ArrayList<>();
        // Example placeholder for comparison logic
         differences.add("Difference at line X: " + tree1.toString() + " vs " + tree2.toString());
        return differences;
    }

    private static void launchUI(List<String> differences) {
        // Implement a simple UI using JavaFX
        javafx.application.Application.launch(UIApp.class, differences.toArray(new String[0]));
    }
}
