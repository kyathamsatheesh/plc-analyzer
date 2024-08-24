package com.uta.edu.plc.controller;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.uta.edu.plc.utility.LadderLogicBaseListener;
import com.uta.edu.plc.utility.LadderLogicLexer;
import com.uta.edu.plc.utility.LadderLogicParser;

import java.util.HashMap;
import java.util.Map;

public class LadderLogicAnalyzer {
    public static void main(String[] args) throws Exception {
        String inputFile = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\Old EQ\\LOGEQU.S05";
//    	String inputFile = "D:\\Satheesh\\Personal\\UTA\\GRA\\Sample\\Sample EQ\\New EQ\\LOGEQU.S05";
        
        
        CharStream input = CharStreams.fromFileName(inputFile);

        LadderLogicLexer lexer = new LadderLogicLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LadderLogicParser parser = new LadderLogicParser(tokens);

        ParseTree tree = parser.logic(); // parse the content
        ParseTreeWalker walker = new ParseTreeWalker();
        LadderLogicEvaluator evaluator = new LadderLogicEvaluator();
        walker.walk(evaluator, tree);
        evaluator.printResults();
    }
}

class LadderLogicEvaluator extends LadderLogicBaseListener {
    private Map<String, Boolean> variables = new HashMap<>();

    @Override
    public void exitAssignment(LadderLogicParser.AssignmentContext ctx) {
        String varName = ctx.ID().getText();
        boolean value = evaluateExpression(ctx.expression());
        variables.put(varName, value);
    }

    private boolean evaluateExpression(LadderLogicParser.ExpressionContext ctx) {
        boolean result = evaluateTerm(ctx.term(0));
        for (int i = 1; i < ctx.term().size(); i++) {
            result = result || evaluateTerm(ctx.term(i));
        }
        return result;
    }

    private boolean evaluateTerm(LadderLogicParser.TermContext ctx) {
        boolean result = evaluateFactor(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            result = result && evaluateFactor(ctx.factor(i));
        }
        return result;
    }

    private boolean evaluateFactor(LadderLogicParser.FactorContext ctx) {
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            return variables.getOrDefault(varName, false);
        } 
//        else if (ctx.NOT() != null) {
//            String varName = ctx.ID(0).getText();
//            return !variables.getOrDefault(varName, false);
//        } 
        else {
            return evaluateExpression(ctx.expression());
        }
    }

    public void printResults() {
        for (Map.Entry<String, Boolean> entry : variables.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

