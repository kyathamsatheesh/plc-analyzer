// Generated from PLCGrammar.g4 by ANTLR 4.13.1
package com.uta.edu.plc.utility;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLCGrammarParser}.
 */
public interface PLCGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PLCGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PLCGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PLCGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PLCGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PLCGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PLCGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#msAssignment}.
	 * @param ctx the parse tree
	 */
	void enterMsAssignment(PLCGrammarParser.MsAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#msAssignment}.
	 * @param ctx the parse tree
	 */
	void exitMsAssignment(PLCGrammarParser.MsAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(PLCGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(PLCGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PLCGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PLCGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(PLCGrammarParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(PLCGrammarParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLogicalTerm(PLCGrammarParser.LogicalTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLogicalTerm(PLCGrammarParser.LogicalTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#logicalFactor}.
	 * @param ctx the parse tree
	 */
	void enterLogicalFactor(PLCGrammarParser.LogicalFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#logicalFactor}.
	 * @param ctx the parse tree
	 */
	void exitLogicalFactor(PLCGrammarParser.LogicalFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#timerControl}.
	 * @param ctx the parse tree
	 */
	void enterTimerControl(PLCGrammarParser.TimerControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#timerControl}.
	 * @param ctx the parse tree
	 */
	void exitTimerControl(PLCGrammarParser.TimerControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#alarmControl}.
	 * @param ctx the parse tree
	 */
	void enterAlarmControl(PLCGrammarParser.AlarmControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#alarmControl}.
	 * @param ctx the parse tree
	 */
	void exitAlarmControl(PLCGrammarParser.AlarmControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(PLCGrammarParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(PLCGrammarParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#conditionalBranching}.
	 * @param ctx the parse tree
	 */
	void enterConditionalBranching(PLCGrammarParser.ConditionalBranchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#conditionalBranching}.
	 * @param ctx the parse tree
	 */
	void exitConditionalBranching(PLCGrammarParser.ConditionalBranchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PLCGrammarParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PLCGrammarParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(PLCGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(PLCGrammarParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PLCGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PLCGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(PLCGrammarParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(PLCGrammarParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(PLCGrammarParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(PLCGrammarParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#pointType}.
	 * @param ctx the parse tree
	 */
	void enterPointType(PLCGrammarParser.PointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#pointType}.
	 * @param ctx the parse tree
	 */
	void exitPointType(PLCGrammarParser.PointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PLCGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PLCGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#nonpointType}.
	 * @param ctx the parse tree
	 */
	void enterNonpointType(PLCGrammarParser.NonpointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#nonpointType}.
	 * @param ctx the parse tree
	 */
	void exitNonpointType(PLCGrammarParser.NonpointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#timerType}.
	 * @param ctx the parse tree
	 */
	void enterTimerType(PLCGrammarParser.TimerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#timerType}.
	 * @param ctx the parse tree
	 */
	void exitTimerType(PLCGrammarParser.TimerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#messagePoint}.
	 * @param ctx the parse tree
	 */
	void enterMessagePoint(PLCGrammarParser.MessagePointContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#messagePoint}.
	 * @param ctx the parse tree
	 */
	void exitMessagePoint(PLCGrammarParser.MessagePointContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLCGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PLCGrammarParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLCGrammarParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PLCGrammarParser.LabelContext ctx);
}