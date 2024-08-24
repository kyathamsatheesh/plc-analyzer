package com.uta.edu.plc.controller;
import com.github.gumtreediff.client.Run;
import com.github.gumtreediff.client.diff.AbstractDiffClient;
import com.github.gumtreediff.gen.TreeGenerators;
import com.github.gumtreediff.tree.TreeContext;

public class FileDiff {
	    public static void main(String[] args) throws Exception {
	        // Initialize the tree generators, compatible with Java 21 features
	        Run.initGenerators();  

	        // Paths to the Java source files
	        String file1 = "path_to_file1.java";
	        String file2 = "path_to_file2.java";

	        // Generate the Abstract Syntax Trees (ASTs) for both files
	        TreeContext tc1 = TreeGenerators.getInstance().getTree(file1);
	        TreeContext tc2 = TreeGenerators.getInstance().getTree(file2);

	        // Compute the diff between both trees using an abstract diff client
	        AbstractDiffClient<DiffOptions> diffClient = new TextDiff();
	        diffClient.setContext(tc1, tc2);
	        diffClient.diff();  // Performs the diff

	        // Output the differences
	        System.out.println(diffClient.getMappings());
	}

}

