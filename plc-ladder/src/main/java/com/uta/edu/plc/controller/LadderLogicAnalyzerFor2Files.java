package com.uta.edu.plc.controller;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.uta.edu.plc.utility.LadderLogicLexer;
import com.uta.edu.plc.utility.LadderLogicParser;

import java.util.ArrayList;
import java.util.List;

public class LadderLogicAnalyzerFor2Files {
	
	public static void main(String[] args) {
		
		CharStream input1 = CharStreams.fromFileName("file1.plc");
		LadderLogicLexer lexer1 = new LadderLogicLexer(input1);
	    CommonTokenStream tokens1 = new CommonTokenStream(lexer1);
	    LadderLogicParser parser1 = new LadderLogicParser(tokens1);
	    ParseTree tree1 = parser1.program(); // assuming 'program' is the start rule

	    CharStream input2 = CharStreams.fromFileName("file2.plc");
	    LadderLogicLexer lexer2 = new LadderLogicLexer(input2);
	    CommonTokenStream tokens2 = new CommonTokenStream(lexer2);
	    LadderLogicParser parser2 = new LadderLogicParser(tokens2);
	    ParseTree tree2 = parser2.program();

	 // Implement your tree comparison logic here
	    boolean areEqual = tree1.equals(tree2);
	    System.out.println("The two PLC code files are " + (areEqual ? "identical" : "different"));

	    // Display results in UI
	    launchUI(areEqual ? "identical" : "different");
		
	}
	
	 private static void launchUI(String comparisonResult) {
	        // Implement a simple UI using JavaFX
	        javafx.application.Application.launch(UIApp.class, comparisonResult);
	    }
	

}
