// Generated from PLCGrammar.g4 by ANTLR 4.13.1
package com.uta.edu.plc.utility;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLCGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, COMMENT=42, POINT_TYPE=43, INT=44, FLOAT=45, 
		WS=46, UNRECOGNIZED=47;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_msAssignment = 3, 
		RULE_assignmentOperator = 4, RULE_expression = 5, RULE_logicalExpression = 6, 
		RULE_logicalTerm = 7, RULE_logicalFactor = 8, RULE_timerControl = 9, RULE_alarmControl = 10, 
		RULE_logicalOperator = 11, RULE_conditionalBranching = 12, RULE_comparison = 13, 
		RULE_comparisonOperator = 14, RULE_term = 15, RULE_logicalAnd = 16, RULE_logicalOr = 17, 
		RULE_pointType = 18, RULE_value = 19, RULE_nonpointType = 20, RULE_timerType = 21, 
		RULE_messagePoint = 22, RULE_label = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "msAssignment", "assignmentOperator", 
			"expression", "logicalExpression", "logicalTerm", "logicalFactor", "timerControl", 
			"alarmControl", "logicalOperator", "conditionalBranching", "comparison", 
			"comparisonOperator", "term", "logicalAnd", "logicalOr", "pointType", 
			"value", "nonpointType", "timerType", "messagePoint", "label"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'MS,'", "'='", "'R='", "'('", "')'", "'NOT'", "'/'", "'P='", 
			"'HOLD'", "'RESM'", "','", "'AL'", "'AND'", "'OR'", "'JUMP'", "'IF'", 
			"'THEN'", "'=='", "'>'", "'<'", "'>='", "'<='", "'!='", "'&&'", "'_AND_'", 
			"'||'", "'_OR_'", "'INC'", "'DEC'", "'TIME'", "'DATE'", "'TIHR'", "'TIMN'", 
			"'TISC'", "'TITM'", "'TITO'", "'TIWO'", "'MSAL'", "'MSQW'", "'L'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "COMMENT", "POINT_TYPE", "INT", "FLOAT", 
			"WS", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PLCGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLCGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65970697875364L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MsAssignmentContext msAssignment() {
			return getRuleContext(MsAssignmentContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TimerControlContext timerControl() {
			return getRuleContext(TimerControlContext.class,0);
		}
		public AlarmControlContext alarmControl() {
			return getRuleContext(AlarmControlContext.class,0);
		}
		public ConditionalBranchingContext conditionalBranching() {
			return getRuleContext(ConditionalBranchingContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(PLCGrammarParser.COMMENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				msAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				logicalExpression();
				setState(56);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				timerControl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				alarmControl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				conditionalBranching();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				match(COMMENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public PointTypeContext pointType() {
			return getRuleContext(PointTypeContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			pointType();
			setState(65);
			assignmentOperator();
			setState(66);
			expression();
			setState(67);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MsAssignmentContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PLCGrammarParser.INT, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<LogicalOperatorContext> logicalOperator() {
			return getRuleContexts(LogicalOperatorContext.class);
		}
		public LogicalOperatorContext logicalOperator(int i) {
			return getRuleContext(LogicalOperatorContext.class,i);
		}
		public MsAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterMsAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitMsAssignment(this);
		}
	}

	public final MsAssignmentContext msAssignment() throws RecognitionException {
		MsAssignmentContext _localctx = new MsAssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_msAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__1);
			setState(70);
			match(INT);
			setState(71);
			assignmentOperator();
			setState(72);
			expression();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 49280L) != 0)) {
				{
				{
				setState(73);
				logicalOperator();
				setState(74);
				expression();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				logicalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<LogicalTermContext> logicalTerm() {
			return getRuleContexts(LogicalTermContext.class);
		}
		public LogicalTermContext logicalTerm(int i) {
			return getRuleContext(LogicalTermContext.class,i);
		}
		public List<LogicalOrContext> logicalOr() {
			return getRuleContexts(LogicalOrContext.class);
		}
		public LogicalOrContext logicalOr(int i) {
			return getRuleContext(LogicalOrContext.class,i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			logicalTerm();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					logicalOr();
					setState(91);
					logicalTerm();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalTermContext extends ParserRuleContext {
		public List<LogicalFactorContext> logicalFactor() {
			return getRuleContexts(LogicalFactorContext.class);
		}
		public LogicalFactorContext logicalFactor(int i) {
			return getRuleContext(LogicalFactorContext.class,i);
		}
		public List<LogicalAndContext> logicalAnd() {
			return getRuleContexts(LogicalAndContext.class);
		}
		public LogicalAndContext logicalAnd(int i) {
			return getRuleContext(LogicalAndContext.class,i);
		}
		public LogicalTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterLogicalTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitLogicalTerm(this);
		}
	}

	public final LogicalTermContext logicalTerm() throws RecognitionException {
		LogicalTermContext _localctx = new LogicalTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logicalTerm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			logicalFactor();
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					logicalAnd();
					setState(100);
					logicalFactor();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalFactorContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicalFactorContext logicalFactor() {
			return getRuleContext(LogicalFactorContext.class,0);
		}
		public LogicalFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterLogicalFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitLogicalFactor(this);
		}
	}

	public final LogicalFactorContext logicalFactor() throws RecognitionException {
		LogicalFactorContext _localctx = new LogicalFactorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicalFactor);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				comparison();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__4);
				setState(109);
				logicalExpression();
				setState(110);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(T__6);
				setState(113);
				logicalFactor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(T__7);
				setState(115);
				logicalFactor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimerControlContext extends ParserRuleContext {
		public TimerTypeContext timerType() {
			return getRuleContext(TimerTypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(PLCGrammarParser.INT, 0); }
		public TimerControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timerControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterTimerControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitTimerControl(this);
		}
	}

	public final TimerControlContext timerControl() throws RecognitionException {
		TimerControlContext _localctx = new TimerControlContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_timerControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			timerType();
			setState(120);
			match(T__11);
			setState(121);
			match(INT);
			setState(122);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlarmControlContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PLCGrammarParser.INT, 0); }
		public PointTypeContext pointType() {
			return getRuleContext(PointTypeContext.class,0);
		}
		public MessagePointContext messagePoint() {
			return getRuleContext(MessagePointContext.class,0);
		}
		public AlarmControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alarmControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterAlarmControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitAlarmControl(this);
		}
	}

	public final AlarmControlContext alarmControl() throws RecognitionException {
		AlarmControlContext _localctx = new AlarmControlContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alarmControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__12);
			setState(125);
			match(INT);
			setState(126);
			pointType();
			setState(127);
			match(T__2);
			setState(128);
			messagePoint();
			setState(129);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContext extends ParserRuleContext {
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 49280L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalBranchingContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionalBranchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBranching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterConditionalBranching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitConditionalBranching(this);
		}
	}

	public final ConditionalBranchingContext conditionalBranching() throws RecognitionException {
		ConditionalBranchingContext _localctx = new ConditionalBranchingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionalBranching);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__15);
				setState(134);
				label();
				setState(135);
				match(T__16);
				setState(136);
				logicalExpression();
				setState(137);
				match(T__0);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__16);
				setState(140);
				logicalExpression();
				setState(141);
				match(T__17);
				setState(142);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			term();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0)) {
				{
				setState(147);
				comparisonOperator();
				setState(148);
				term();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public PointTypeContext pointType() {
			return getRuleContext(PointTypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(PLCGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PLCGrammarParser.FLOAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				pointType();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(FLOAT);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(T__4);
				setState(158);
				expression();
				setState(159);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndContext extends ParserRuleContext {
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitLogicalAnd(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 100679680L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrContext extends ParserRuleContext {
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitLogicalOr(this);
		}
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 402685952L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointTypeContext extends ParserRuleContext {
		public TerminalNode POINT_TYPE() { return getToken(PLCGrammarParser.POINT_TYPE, 0); }
		public TerminalNode INT() { return getToken(PLCGrammarParser.INT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitPointType(this);
		}
	}

	public final PointTypeContext pointType() throws RecognitionException {
		PointTypeContext _localctx = new PointTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(POINT_TYPE);
			setState(168);
			match(T__11);
			setState(169);
			match(INT);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(170);
				match(T__11);
				setState(171);
				value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PLCGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PLCGrammarParser.FLOAT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonpointTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PLCGrammarParser.INT, 0); }
		public NonpointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonpointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterNonpointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitNonpointType(this);
		}
	}

	public final NonpointTypeContext nonpointType() throws RecognitionException {
		NonpointTypeContext _localctx = new NonpointTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nonpointType);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__12);
				setState(177);
				match(INT);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__29);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				match(T__10);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				match(T__31);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimerTypeContext extends ParserRuleContext {
		public TimerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterTimerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitTimerType(this);
		}
	}

	public final TimerTypeContext timerType() throws RecognitionException {
		TimerTypeContext _localctx = new TimerTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_timerType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MessagePointContext extends ParserRuleContext {
		public MessagePointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messagePoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterMessagePoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitMessagePoint(this);
		}
	}

	public final MessagePointContext messagePoint() throws RecognitionException {
		MessagePointContext _localctx = new MessagePointContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_messagePoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PLCGrammarParser.INT, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__40);
			setState(192);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0004\u0000"+
		"2\b\u0000\u000b\u0000\f\u00003\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005X\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006^\b\u0006\n\u0006\f\u0006a\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007g\b\u0007\n\u0007\f\u0007j\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bu\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0091\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0097"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a2\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ad\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ba\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\t\u0001"+
		"\u0000\u0003\u0004\u0001\u0000\t\u000b\u0002\u0000\u0007\u0007\u000e\u000f"+
		"\u0001\u0000\u0013\u0018\u0002\u0000\u000e\u000e\u0019\u001a\u0002\u0000"+
		"\u000f\u000f\u001b\u001c\u0001\u0000,-\u0001\u0000!&\u0001\u0000\'(\u00c5"+
		"\u00001\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004@"+
		"\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\bS\u0001\u0000"+
		"\u0000\u0000\nW\u0001\u0000\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000e"+
		"b\u0001\u0000\u0000\u0000\u0010t\u0001\u0000\u0000\u0000\u0012v\u0001"+
		"\u0000\u0000\u0000\u0014|\u0001\u0000\u0000\u0000\u0016\u0083\u0001\u0000"+
		"\u0000\u0000\u0018\u0090\u0001\u0000\u0000\u0000\u001a\u0092\u0001\u0000"+
		"\u0000\u0000\u001c\u0098\u0001\u0000\u0000\u0000\u001e\u00a1\u0001\u0000"+
		"\u0000\u0000 \u00a3\u0001\u0000\u0000\u0000\"\u00a5\u0001\u0000\u0000"+
		"\u0000$\u00a7\u0001\u0000\u0000\u0000&\u00ae\u0001\u0000\u0000\u0000("+
		"\u00b9\u0001\u0000\u0000\u0000*\u00bb\u0001\u0000\u0000\u0000,\u00bd\u0001"+
		"\u0000\u0000\u0000.\u00bf\u0001\u0000\u0000\u000002\u0003\u0002\u0001"+
		"\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u00004\u0001\u0001\u0000\u0000\u0000"+
		"5?\u0003\u0004\u0002\u00006?\u0003\u0006\u0003\u000078\u0003\f\u0006\u0000"+
		"89\u0005\u0001\u0000\u00009?\u0001\u0000\u0000\u0000:?\u0003\u0012\t\u0000"+
		";?\u0003\u0014\n\u0000<?\u0003\u0018\f\u0000=?\u0005*\u0000\u0000>5\u0001"+
		"\u0000\u0000\u0000>6\u0001\u0000\u0000\u0000>7\u0001\u0000\u0000\u0000"+
		">:\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0003"+
		"$\u0012\u0000AB\u0003\b\u0004\u0000BC\u0003\n\u0005\u0000CD\u0005\u0001"+
		"\u0000\u0000D\u0005\u0001\u0000\u0000\u0000EF\u0005\u0002\u0000\u0000"+
		"FG\u0005,\u0000\u0000GH\u0003\b\u0004\u0000HN\u0003\n\u0005\u0000IJ\u0003"+
		"\u0016\u000b\u0000JK\u0003\n\u0005\u0000KM\u0001\u0000\u0000\u0000LI\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QR\u0005\u0001\u0000\u0000R\u0007\u0001\u0000\u0000\u0000ST\u0007"+
		"\u0000\u0000\u0000T\t\u0001\u0000\u0000\u0000UX\u0003\f\u0006\u0000VX"+
		"\u0003\u001e\u000f\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000X\u000b\u0001\u0000\u0000\u0000Y_\u0003\u000e\u0007\u0000Z[\u0003"+
		"\"\u0011\u0000[\\\u0003\u000e\u0007\u0000\\^\u0001\u0000\u0000\u0000]"+
		"Z\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`\r\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000bh\u0003\u0010\b\u0000cd\u0003 \u0010\u0000de\u0003\u0010"+
		"\b\u0000eg\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000gj\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u000f"+
		"\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ku\u0003\u001a\r\u0000"+
		"lm\u0005\u0005\u0000\u0000mn\u0003\f\u0006\u0000no\u0005\u0006\u0000\u0000"+
		"ou\u0001\u0000\u0000\u0000pq\u0005\u0007\u0000\u0000qu\u0003\u0010\b\u0000"+
		"rs\u0005\b\u0000\u0000su\u0003\u0010\b\u0000tk\u0001\u0000\u0000\u0000"+
		"tl\u0001\u0000\u0000\u0000tp\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000u\u0011\u0001\u0000\u0000\u0000vw\u0007\u0001\u0000\u0000wx\u0003"+
		"*\u0015\u0000xy\u0005\f\u0000\u0000yz\u0005,\u0000\u0000z{\u0005\u0001"+
		"\u0000\u0000{\u0013\u0001\u0000\u0000\u0000|}\u0005\r\u0000\u0000}~\u0005"+
		",\u0000\u0000~\u007f\u0003$\u0012\u0000\u007f\u0080\u0005\u0003\u0000"+
		"\u0000\u0080\u0081\u0003,\u0016\u0000\u0081\u0082\u0005\u0001\u0000\u0000"+
		"\u0082\u0015\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0002\u0000\u0000"+
		"\u0084\u0017\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0010\u0000\u0000"+
		"\u0086\u0087\u0003.\u0017\u0000\u0087\u0088\u0005\u0011\u0000\u0000\u0088"+
		"\u0089\u0003\f\u0006\u0000\u0089\u008a\u0005\u0001\u0000\u0000\u008a\u0091"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0011\u0000\u0000\u008c\u008d"+
		"\u0003\f\u0006\u0000\u008d\u008e\u0005\u0012\u0000\u0000\u008e\u008f\u0003"+
		"\u0002\u0001\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0085\u0001"+
		"\u0000\u0000\u0000\u0090\u008b\u0001\u0000\u0000\u0000\u0091\u0019\u0001"+
		"\u0000\u0000\u0000\u0092\u0096\u0003\u001e\u000f\u0000\u0093\u0094\u0003"+
		"\u001c\u000e\u0000\u0094\u0095\u0003\u001e\u000f\u0000\u0095\u0097\u0001"+
		"\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u001b\u0001\u0000\u0000\u0000\u0098\u0099\u0007"+
		"\u0003\u0000\u0000\u0099\u001d\u0001\u0000\u0000\u0000\u009a\u00a2\u0003"+
		"$\u0012\u0000\u009b\u00a2\u0005,\u0000\u0000\u009c\u00a2\u0005-\u0000"+
		"\u0000\u009d\u009e\u0005\u0005\u0000\u0000\u009e\u009f\u0003\n\u0005\u0000"+
		"\u009f\u00a0\u0005\u0006\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a1\u009a\u0001\u0000\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000"+
		"\u00a1\u009c\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000"+
		"\u00a2\u001f\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007\u0004\u0000\u0000"+
		"\u00a4!\u0001\u0000\u0000\u0000\u00a5\u00a6\u0007\u0005\u0000\u0000\u00a6"+
		"#\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005+\u0000\u0000\u00a8\u00a9\u0005"+
		"\f\u0000\u0000\u00a9\u00ac\u0005,\u0000\u0000\u00aa\u00ab\u0005\f\u0000"+
		"\u0000\u00ab\u00ad\u0003&\u0013\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad%\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0007\u0006\u0000\u0000\u00af\'\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\r\u0000\u0000\u00b1\u00ba\u0005,\u0000\u0000\u00b2\u00ba\u0005"+
		"\u001d\u0000\u0000\u00b3\u00ba\u0005\u001e\u0000\u0000\u00b4\u00ba\u0005"+
		"\n\u0000\u0000\u00b5\u00ba\u0005\u000b\u0000\u0000\u00b6\u00ba\u0005\u001f"+
		"\u0000\u0000\u00b7\u00ba\u0005 \u0000\u0000\u00b8\u00ba\u0005\u0010\u0000"+
		"\u0000\u00b9\u00b0\u0001\u0000\u0000\u0000\u00b9\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b3\u0001\u0000\u0000\u0000\u00b9\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba)\u0001\u0000\u0000\u0000\u00bb\u00bc\u0007\u0007\u0000\u0000"+
		"\u00bc+\u0001\u0000\u0000\u0000\u00bd\u00be\u0007\b\u0000\u0000\u00be"+
		"-\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005)\u0000\u0000\u00c0\u00c1\u0005"+
		",\u0000\u0000\u00c1/\u0001\u0000\u0000\u0000\f3>NW_ht\u0090\u0096\u00a1"+
		"\u00ac\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}