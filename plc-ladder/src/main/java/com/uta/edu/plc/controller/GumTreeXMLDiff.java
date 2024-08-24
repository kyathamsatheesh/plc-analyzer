package com.uta.edu.plc.controller;

import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.actions.model.ActionGenerator;
import com.github.gumtreediff.gen.srcml.SrcmlTreeGenerator;
import com.github.gumtreediff.gen.TreeGenerator;
import com.github.gumtreediff.matchers.Mapping;
import com.github.gumtreediff.matchers.MappingStore;
import com.github.gumtreediff.matchers.Matchers;
import com.github.gumtreediff.tree.TreeContext;
import com.github.gumtreediff.client.Run;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GumTreeXMLDiff {
    public static void main(String[] args) throws Exception {
        // Initialize GumTree
        Run.initGenerators();

        // Parse XML files
        TreeContext tc1 = parseXMLFile("file1.xml");
        TreeContext tc2 = parseXMLFile("file2.xml");

        // Match trees
        MappingStore mappings = Matchers.getInstance().getMatcher().match(tc1.getRoot(), tc2.getRoot());

        // Generate actions
        ActionGenerator actionGenerator = new ActionGenerator(tc1.getRoot(), tc2.getRoot(), mappings);
        List<Action> actions = actionGenerator.generate();

        // Display actions (differences)
        for (Action action : actions) {
            System.out.println(action);
        }

        // Show in GUI
        showInGUI(actions);
    }

    private static TreeContext parseXMLFile(String filePath) throws Exception {
        TreeGenerator generator = new SrcmlTreeGenerator();
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        return generator.generateFrom().string(content);
    }

    private static void showInGUI(List<Action> actions) {
        // Implement GUI code to display the actions
        // For example, using Java Swing or JavaFX
    }
}

