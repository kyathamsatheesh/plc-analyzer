package com.uta.edu.plc.controller;

import java.io.IOException;
import java.util.regex.Matcher;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.github.gumtreediff.actions.ActionGenerator;
import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.client.Run;
import com.github.gumtreediff.gen.TreeGenerator;
import com.github.gumtreediff.matchers.Matchers;
import com.github.gumtreediff.matchers.MappingStore;
import com.github.gumtreediff.tree.ITree;
import com.github.gumtreediff.tree.Tree;
import com.github.gumtreediff.tree.TreeContext;
import com.uta.edu.plc.grammer.PLCGrammarLexer;
import com.uta.edu.plc.grammer.PLCGrammarParser;

import java.io.IOException;

public class PLCComparer {
    public static void main(String[] args) throws IOException {
        String file1 = "path/to/LOGEQUOld.S05";
        String file2 = "path/to/LOGEQUNew.S05";

        Run.initGenerators();

        TreeContext srcContext = new ANTLRTreeGenerator().generateFromFile(file1, "PLCGrammar", "program");
        TreeContext dstContext = new ANTLRTreeGenerator().generateFromFile(file2, "PLCGrammar", "program");

        ITree src = srcContext.getRoot();
        ITree dst = dstContext.getRoot();

        // Ensure the correct arguments are passed
//        MappingStore mappings = Matchers.getInstance().getMatcher(src, dst).match();
        Matcher defaultMatcher = Matchers.getInstance().getMatcher();
        MappingStore mappings = defaultMatcher.match(src, dst);

        ActionGenerator actionGenerator = new ActionGenerator(src, dst, mappings);
        actionGenerator.generate();

        for (Action action : actionGenerator.getActions()) {
            System.out.println(action.toString());
        }
    }
}

class ANTLRTreeGenerator extends TreeGenerator {
    public TreeContext generateFromFile(String filePath, String grammarName, String startRuleName) throws IOException {
        CharStream input = CharStreams.fromFileName(filePath);
        PLCGrammarLexer lexer = new PLCGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PLCGrammarParser parser = new PLCGrammarParser(tokens);
        ParseTree tree = parser.program();

        return generate(tree);
    }

    @Override
    public TreeContext generate(ParseTree tree) {
        TreeContext context = new TreeContext();
        Tree root = createNode(tree, context);
        context.setRoot(root);
        return context;
    }

    private Tree createNode(ParseTree tree, TreeContext context) {
        Tree node = context.createTree(tree.getClass().getSimpleName(), tree.getText());
        for (int i = 0; i < tree.getChildCount(); i++) {
            node.addChild(createNode(tree.getChild(i), context));
        }
        return node;
    }
}

