// Generated from PLCGrammar.g4 by ANTLR 4.13.1
package com.uta.edu.plc.grammer;
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
		T__38=39, T__39=40, T__40=41, POINT_TYPE=42, INT=43, FLOAT=44, WS=45, 
		UNRECOGNIZED=46;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_comment = 2, RULE_assignment = 3, 
		RULE_assignmentOperator = 4, RULE_expression = 5, RULE_logicalExpression = 6, 
		RULE_logicalTerm = 7, RULE_logicalFactor = 8, RULE_timerControl = 9, RULE_alarmControl = 10, 
		RULE_conditionalBranching = 11, RULE_booleanExpression = 12, RULE_comparison = 13, 
		RULE_comparisonOperator = 14, RULE_term = 15, RULE_logicalAnd = 16, RULE_logicalOr = 17, 
		RULE_pointType = 18, RULE_value = 19, RULE_nonpointType = 20, RULE_timerType = 21, 
		RULE_messagePoint = 22, RULE_label = 23, RULE_modifier = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "comment", "assignment", "assignmentOperator", 
			"expression", "logicalExpression", "logicalTerm", "logicalFactor", "timerControl", 
			"alarmControl", "conditionalBranching", "booleanExpression", "comparison", 
			"comparisonOperator", "term", "logicalAnd", "logicalOr", "pointType", 
			"value", "nonpointType", "timerType", "messagePoint", "label", "modifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'R='", "'('", "')'", "'NOT'", "'/'", "'P='", "','", 
			"'HOLD'", "'RESM'", "'AL'", "'JUMP'", "'IF'", "'=='", "'>'", "'<'", "'>='", 
			"'<='", "'!='", "'AND'", "'&&'", "'_AND_'", "'OR'", "'||'", "'_OR_'", 
			"'INC'", "'DEC'", "'TIME'", "'DATE'", "'TIHR'", "'TIMN'", "'TISC'", "'TITM'", 
			"'TITO'", "'TIWO'", "'MSAL'", "'MSQW'", "'MS'", "'L'", "'R4'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "POINT_TYPE", "INT", "FLOAT", "WS", 
			"UNRECOGNIZED"
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
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 31885837237714L) != 0) );
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
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
				setState(55);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				logicalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				timerControl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				alarmControl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				conditionalBranching();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				label();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				comment();
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
	public static class CommentContext extends ParserRuleContext {
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
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
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			pointType();
			setState(67);
			assignmentOperator();
			setState(68);
			expression();
			setState(69);
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
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			logicalExpression();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			logicalTerm();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) {
				{
				{
				setState(76);
				logicalOr();
				setState(77);
				logicalTerm();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			logicalFactor();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
				{
				{
				setState(85);
				logicalAnd();
				setState(86);
				logicalFactor();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				booleanExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__3);
				setState(95);
				logicalExpression();
				setState(96);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(T__5);
				setState(99);
				logicalFactor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(T__6);
				setState(101);
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
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__7);
				setState(105);
				timerType();
				setState(106);
				match(T__8);
				setState(107);
				match(INT);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__9);
				setState(110);
				timerType();
				setState(111);
				match(T__8);
				setState(112);
				match(INT);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__10);
				setState(115);
				timerType();
				setState(116);
				match(T__8);
				setState(117);
				match(INT);
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
			setState(121);
			match(T__11);
			setState(122);
			match(INT);
			setState(123);
			pointType();
			setState(124);
			match(T__1);
			setState(125);
			messagePoint();
			setState(126);
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
		enterRule(_localctx, 22, RULE_conditionalBranching);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__12);
				setState(129);
				label();
				setState(130);
				match(T__13);
				setState(131);
				logicalExpression();
				setState(132);
				match(T__0);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__13);
				setState(135);
				logicalExpression();
				setState(136);
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
	public static class BooleanExpressionContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			comparison();
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
			setState(142);
			term();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) {
				{
				setState(143);
				comparisonOperator();
				setState(144);
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
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) ) {
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
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				pointType();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(FLOAT);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(T__3);
				setState(154);
				expression();
				setState(155);
				match(T__4);
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
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
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
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
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
			setState(163);
			match(POINT_TYPE);
			setState(164);
			match(T__8);
			setState(165);
			match(INT);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(166);
				match(T__8);
				setState(167);
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
			setState(170);
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__11);
				setState(173);
				match(INT);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__27);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(T__10);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				match(T__29);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				match(T__12);
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
		public TerminalNode INT() { return getToken(PLCGrammarParser.INT, 0); }
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
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8931384492032L) != 0)) ) {
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
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
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
			setState(187);
			match(T__39);
			setState(188);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLCGrammarListener ) ((PLCGrammarListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__40);
			setState(191);
			match(T__8);
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
		"\u0004\u0001.\u00c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006P\b"+
		"\u0006\n\u0006\f\u0006S\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007Y\b\u0007\n\u0007\f\u0007\\\t\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bg\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tx\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u008b\b\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0093\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u009e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00a9\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00b6\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0007"+
		"\u0001\u0000\u0002\u0003\u0001\u0000\u000f\u0014\u0001\u0000\u0015\u0017"+
		"\u0001\u0000\u0018\u001a\u0001\u0000+,\u0002\u0000\u001f$++\u0001\u0000"+
		"%\'\u00c3\u00003\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000"+
		"\u0004@\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bG\u0001"+
		"\u0000\u0000\u0000\nI\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000"+
		"\u000eT\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012w"+
		"\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016\u008a\u0001"+
		"\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000\u001a\u008e\u0001"+
		"\u0000\u0000\u0000\u001c\u0094\u0001\u0000\u0000\u0000\u001e\u009d\u0001"+
		"\u0000\u0000\u0000 \u009f\u0001\u0000\u0000\u0000\"\u00a1\u0001\u0000"+
		"\u0000\u0000$\u00a3\u0001\u0000\u0000\u0000&\u00aa\u0001\u0000\u0000\u0000"+
		"(\u00b5\u0001\u0000\u0000\u0000*\u00b7\u0001\u0000\u0000\u0000,\u00b9"+
		"\u0001\u0000\u0000\u0000.\u00bb\u0001\u0000\u0000\u00000\u00be\u0001\u0000"+
		"\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6\u0001\u0001\u0000\u0000\u00007?\u0003\u0006\u0003\u00008?\u0003\f\u0006"+
		"\u00009?\u0003\u0012\t\u0000:?\u0003\u0014\n\u0000;?\u0003\u0016\u000b"+
		"\u0000<?\u0003.\u0017\u0000=?\u0003\u0004\u0002\u0000>7\u0001\u0000\u0000"+
		"\u0000>8\u0001\u0000\u0000\u0000>9\u0001\u0000\u0000\u0000>:\u0001\u0000"+
		"\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0005\u0001\u0000"+
		"\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0003$\u0012\u0000CD\u0003\b\u0004"+
		"\u0000DE\u0003\n\u0005\u0000EF\u0005\u0001\u0000\u0000F\u0007\u0001\u0000"+
		"\u0000\u0000GH\u0007\u0000\u0000\u0000H\t\u0001\u0000\u0000\u0000IJ\u0003"+
		"\f\u0006\u0000J\u000b\u0001\u0000\u0000\u0000KQ\u0003\u000e\u0007\u0000"+
		"LM\u0003\"\u0011\u0000MN\u0003\u000e\u0007\u0000NP\u0001\u0000\u0000\u0000"+
		"OL\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000R\r\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000TZ\u0003\u0010\b\u0000UV\u0003 \u0010\u0000VW\u0003\u0010"+
		"\b\u0000WY\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000Y\\\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\u000f\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]g\u0003\u0018"+
		"\f\u0000^_\u0005\u0004\u0000\u0000_`\u0003\f\u0006\u0000`a\u0005\u0005"+
		"\u0000\u0000ag\u0001\u0000\u0000\u0000bc\u0005\u0006\u0000\u0000cg\u0003"+
		"\u0010\b\u0000de\u0005\u0007\u0000\u0000eg\u0003\u0010\b\u0000f]\u0001"+
		"\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000g\u0011\u0001\u0000\u0000\u0000hi\u0005\b\u0000"+
		"\u0000ij\u0003*\u0015\u0000jk\u0005\t\u0000\u0000kl\u0005+\u0000\u0000"+
		"lx\u0001\u0000\u0000\u0000mn\u0005\n\u0000\u0000no\u0003*\u0015\u0000"+
		"op\u0005\t\u0000\u0000pq\u0005+\u0000\u0000qx\u0001\u0000\u0000\u0000"+
		"rs\u0005\u000b\u0000\u0000st\u0003*\u0015\u0000tu\u0005\t\u0000\u0000"+
		"uv\u0005+\u0000\u0000vx\u0001\u0000\u0000\u0000wh\u0001\u0000\u0000\u0000"+
		"wm\u0001\u0000\u0000\u0000wr\u0001\u0000\u0000\u0000x\u0013\u0001\u0000"+
		"\u0000\u0000yz\u0005\f\u0000\u0000z{\u0005+\u0000\u0000{|\u0003$\u0012"+
		"\u0000|}\u0005\u0002\u0000\u0000}~\u0003,\u0016\u0000~\u007f\u0005\u0001"+
		"\u0000\u0000\u007f\u0015\u0001\u0000\u0000\u0000\u0080\u0081\u0005\r\u0000"+
		"\u0000\u0081\u0082\u0003.\u0017\u0000\u0082\u0083\u0005\u000e\u0000\u0000"+
		"\u0083\u0084\u0003\f\u0006\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085"+
		"\u008b\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087"+
		"\u0088\u0003\f\u0006\u0000\u0088\u0089\u0003\u0002\u0001\u0000\u0089\u008b"+
		"\u0001\u0000\u0000\u0000\u008a\u0080\u0001\u0000\u0000\u0000\u008a\u0086"+
		"\u0001\u0000\u0000\u0000\u008b\u0017\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0003\u001a\r\u0000\u008d\u0019\u0001\u0000\u0000\u0000\u008e\u0092\u0003"+
		"\u001e\u000f\u0000\u008f\u0090\u0003\u001c\u000e\u0000\u0090\u0091\u0003"+
		"\u001e\u000f\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u001b\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0007\u0001\u0000\u0000\u0095\u001d\u0001"+
		"\u0000\u0000\u0000\u0096\u009e\u0003$\u0012\u0000\u0097\u009e\u0005+\u0000"+
		"\u0000\u0098\u009e\u0005,\u0000\u0000\u0099\u009a\u0005\u0004\u0000\u0000"+
		"\u009a\u009b\u0003\n\u0005\u0000\u009b\u009c\u0005\u0005\u0000\u0000\u009c"+
		"\u009e\u0001\u0000\u0000\u0000\u009d\u0096\u0001\u0000\u0000\u0000\u009d"+
		"\u0097\u0001\u0000\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000\u009d"+
		"\u0099\u0001\u0000\u0000\u0000\u009e\u001f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0007\u0002\u0000\u0000\u00a0!\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0007\u0003\u0000\u0000\u00a2#\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"*\u0000\u0000\u00a4\u00a5\u0005\t\u0000\u0000\u00a5\u00a8\u0005+\u0000"+
		"\u0000\u00a6\u00a7\u0005\t\u0000\u0000\u00a7\u00a9\u0003&\u0013\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9%\u0001\u0000\u0000\u0000\u00aa\u00ab\u0007\u0004\u0000\u0000\u00ab"+
		"\'\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\f\u0000\u0000\u00ad\u00b6"+
		"\u0005+\u0000\u0000\u00ae\u00b6\u0005\u001b\u0000\u0000\u00af\u00b6\u0005"+
		"\u001c\u0000\u0000\u00b0\u00b6\u0005\n\u0000\u0000\u00b1\u00b6\u0005\u000b"+
		"\u0000\u0000\u00b2\u00b6\u0005\u001d\u0000\u0000\u00b3\u00b6\u0005\u001e"+
		"\u0000\u0000\u00b4\u00b6\u0005\r\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6)\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0007\u0005\u0000\u0000\u00b8+\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0007\u0006\u0000\u0000\u00ba-\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005(\u0000\u0000\u00bc\u00bd\u0005+\u0000\u0000\u00bd/\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005)\u0000\u0000\u00bf\u00c0\u0005\t\u0000"+
		"\u0000\u00c01\u0001\u0000\u0000\u0000\u000b5>QZfw\u008a\u0092\u009d\u00a8"+
		"\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}