package com.uta.edu.plc.controller;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.uta.edu.plc.grammer.PLCGrammarLexer;
import com.uta.edu.plc.grammer.PLCGrammarParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PLCComparatorantlr {

    public static void main(String[] args) throws IOException {
        String file1 = new String(Files.readAllBytes(Paths.get("D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQUOld.S05")));
//        String file2 = new String(Files.readAllBytes(Paths.get("path/to/LOGEQUNew.S05")));
        String file2 = new String(Files.readAllBytes(Paths.get("D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\New EQ\\LOGEQUNew.S05")));

        boolean areIdentical = compareFiles(file1, file2);
        if (areIdentical) {
            System.out.println("The structures are identical.");
        } else {
            System.out.println("The structures are not identical.");
        }
    }

    private static boolean compareFiles(String file1Content, String file2Content) {
        ParseTree tree1 = parseContent(file1Content);
        ParseTree tree2 = parseContent(file2Content);

        return tree1.toStringTree().equals(tree2.toStringTree());
    }

    private static ParseTree parseContent(String content) {
        CharStream charStream = CharStreams.fromString(content);
        PLCGrammarLexer lexer = new PLCGrammarLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PLCGrammarParser parser = new PLCGrammarParser(tokens);
        return parser.program();
    }
}

