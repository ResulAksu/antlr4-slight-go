// Generated from java-escape by ANTLR 4.11.1
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LINE_COMMENT=3, PACKAGE=4, MAIN=5, IMPORT=6, NOTATIONS=7, 
		FMT=8, FUNC=9, LEFTPAR=10, RIGHTPAR=11, LEFTBRACE=12, RIGHTBRACE=13, ASSERT=14, 
		KOMMA=15, MODULO=16, EQUALS=17, SMALLER=18, SMALLER_OR_EQUAL=19, GREATER=20, 
		GREATER_OR_EQUAL=21, NOT_EQUAL=22, LOGICAL_AND=23, LOGICAL_OR=24, LOGICAL_NOT=25, 
		IF_TOKEN=26, ELSE_TOKEN=27, FOR_TOKEN=28, VAR=29, LETTER=30, DIGITINCL=31, 
		INT=32, FLOAT64=33, BOOLEAN=34, STRING=35, DOT=36, TRUE=37, FALSE=38, 
		PRINT_LN=39, ADD=40, SUB=41, MUL=42, DIV=43, RETURN=44;
	public static final int
		RULE_prog = 0, RULE_mainCaller = 1, RULE_methodCaller = 2, RULE_methodMember = 3, 
		RULE_block = 4, RULE_blockStatements = 5, RULE_if_and_or_else_expression = 6, 
		RULE_for_loop = 7, RULE_returner = 8, RULE_localvariableInit = 9, RULE_boolCollector = 10, 
		RULE_variableVis = 11, RULE_printCall = 12, RULE_methodCall = 13, RULE_boolExpr = 14, 
		RULE_boolStat = 15, RULE_type = 16, RULE_second_type = 17, RULE_typeProduction = 18, 
		RULE_stringliteral = 19, RULE_intliteral = 20, RULE_floatliteral = 21, 
		RULE_boolliteral = 22, RULE_packageProdcution = 23, RULE_importProduction = 24, 
		RULE_nameGiver = 25, RULE_onlyName = 26, RULE_arithmetics = 27, RULE_booleans = 28, 
		RULE_logicals = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "mainCaller", "methodCaller", "methodMember", "block", "blockStatements", 
			"if_and_or_else_expression", "for_loop", "returner", "localvariableInit", 
			"boolCollector", "variableVis", "printCall", "methodCall", "boolExpr", 
			"boolStat", "type", "second_type", "typeProduction", "stringliteral", 
			"intliteral", "floatliteral", "boolliteral", "packageProdcution", "importProduction", 
			"nameGiver", "onlyName", "arithmetics", "booleans", "logicals"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'package'", "'main'", "'import'", "'\"'", "'fmt'", 
			"'func'", "'('", "')'", "'{'", "'}'", "'='", "','", "'%'", "'=='", "'<'", 
			"'<='", "'>'", "'>='", "'!='", "'&&'", "'||'", "'!'", "'if'", "'else'", 
			"'for'", "'var'", null, null, "'int'", "'float64'", "'bool'", "'string'", 
			"'.'", "'true'", "'false'", "'Println'", "'+'", "'-'", "'*'", "'/'", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "LINE_COMMENT", "PACKAGE", "MAIN", "IMPORT", "NOTATIONS", 
			"FMT", "FUNC", "LEFTPAR", "RIGHTPAR", "LEFTBRACE", "RIGHTBRACE", "ASSERT", 
			"KOMMA", "MODULO", "EQUALS", "SMALLER", "SMALLER_OR_EQUAL", "GREATER", 
			"GREATER_OR_EQUAL", "NOT_EQUAL", "LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", 
			"IF_TOKEN", "ELSE_TOKEN", "FOR_TOKEN", "VAR", "LETTER", "DIGITINCL", 
			"INT", "FLOAT64", "BOOLEAN", "STRING", "DOT", "TRUE", "FALSE", "PRINT_LN", 
			"ADD", "SUB", "MUL", "DIV", "RETURN"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public PackageProdcutionContext packageProdcution() {
			return getRuleContext(PackageProdcutionContext.class,0);
		}
		public ImportProductionContext importProduction() {
			return getRuleContext(ImportProductionContext.class,0);
		}
		public MainCallerContext mainCaller() {
			return getRuleContext(MainCallerContext.class,0);
		}
		public List<MethodCallerContext> methodCaller() {
			return getRuleContexts(MethodCallerContext.class);
		}
		public MethodCallerContext methodCaller(int i) {
			return getRuleContext(MethodCallerContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			packageProdcution();
			setState(61);
			importProduction();
			setState(62);
			mainCaller();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(63);
				methodCaller();
				}
				}
				setState(68);
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
	public static class MainCallerContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(ExprParser.FUNC, 0); }
		public TerminalNode MAIN() { return getToken(ExprParser.MAIN, 0); }
		public TerminalNode LEFTPAR() { return getToken(ExprParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(ExprParser.RIGHTPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainCallerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainCaller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMainCaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMainCaller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMainCaller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainCallerContext mainCaller() throws RecognitionException {
		MainCallerContext _localctx = new MainCallerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainCaller);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(FUNC);
			setState(70);
			match(MAIN);
			setState(71);
			match(LEFTPAR);
			setState(72);
			match(RIGHTPAR);
			setState(73);
			block();
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
	public static class MethodCallerContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(ExprParser.FUNC, 0); }
		public NameGiverContext nameGiver() {
			return getRuleContext(NameGiverContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(ExprParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(ExprParser.RIGHTPAR, 0); }
		public Second_typeContext second_type() {
			return getRuleContext(Second_typeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<MethodMemberContext> methodMember() {
			return getRuleContexts(MethodMemberContext.class);
		}
		public MethodMemberContext methodMember(int i) {
			return getRuleContext(MethodMemberContext.class,i);
		}
		public MethodCallerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCaller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMethodCaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMethodCaller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMethodCaller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallerContext methodCaller() throws RecognitionException {
		MethodCallerContext _localctx = new MethodCallerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodCaller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(FUNC);
			setState(76);
			nameGiver();
			setState(77);
			match(LEFTPAR);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGITINCL) {
				{
				{
				setState(78);
				methodMember();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(RIGHTPAR);
			setState(85);
			second_type();
			setState(86);
			block();
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
	public static class MethodMemberContext extends ParserRuleContext {
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public List<Second_typeContext> second_type() {
			return getRuleContexts(Second_typeContext.class);
		}
		public Second_typeContext second_type(int i) {
			return getRuleContext(Second_typeContext.class,i);
		}
		public List<TerminalNode> KOMMA() { return getTokens(ExprParser.KOMMA); }
		public TerminalNode KOMMA(int i) {
			return getToken(ExprParser.KOMMA, i);
		}
		public MethodMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMethodMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMethodMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMethodMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodMemberContext methodMember() throws RecognitionException {
		MethodMemberContext _localctx = new MethodMemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			nameGiver();
			setState(89);
			second_type();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KOMMA) {
				{
				{
				setState(90);
				match(KOMMA);
				setState(91);
				nameGiver();
				setState(92);
				second_type();
				}
				}
				setState(98);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFTBRACE() { return getToken(ExprParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(ExprParser.RIGHTBRACE, 0); }
		public List<BlockStatementsContext> blockStatements() {
			return getRuleContexts(BlockStatementsContext.class);
		}
		public BlockStatementsContext blockStatements(int i) {
			return getRuleContext(BlockStatementsContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(LEFTBRACE);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18146035499264L) != 0) {
				{
				{
				setState(100);
				blockStatements();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(RIGHTBRACE);
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
	public static class BlockStatementsContext extends ParserRuleContext {
		public LocalvariableInitContext localvariableInit() {
			return getRuleContext(LocalvariableInitContext.class,0);
		}
		public If_and_or_else_expressionContext if_and_or_else_expression() {
			return getRuleContext(If_and_or_else_expressionContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public PrintCallContext printCall() {
			return getRuleContext(PrintCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ReturnerContext returner() {
			return getRuleContext(ReturnerContext.class,0);
		}
		public VariableVisContext variableVis() {
			return getRuleContext(VariableVisContext.class,0);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBlockStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBlockStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blockStatements);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				localvariableInit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				if_and_or_else_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				printCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				methodCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				returner();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				variableVis();
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
	public static class If_and_or_else_expressionContext extends ParserRuleContext {
		public TerminalNode IF_TOKEN() { return getToken(ExprParser.IF_TOKEN, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<LogicalsContext> logicals() {
			return getRuleContexts(LogicalsContext.class);
		}
		public LogicalsContext logicals(int i) {
			return getRuleContext(LogicalsContext.class,i);
		}
		public List<TerminalNode> ELSE_TOKEN() { return getTokens(ExprParser.ELSE_TOKEN); }
		public TerminalNode ELSE_TOKEN(int i) {
			return getToken(ExprParser.ELSE_TOKEN, i);
		}
		public If_and_or_else_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_and_or_else_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIf_and_or_else_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIf_and_or_else_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIf_and_or_else_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_and_or_else_expressionContext if_and_or_else_expression() throws RecognitionException {
		If_and_or_else_expressionContext _localctx = new If_and_or_else_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_and_or_else_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IF_TOKEN);
			setState(118);
			boolExpr();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND || _la==LOGICAL_OR) {
				{
				{
				setState(119);
				logicals();
				setState(120);
				boolExpr();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			block();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_TOKEN) {
				{
				{
				setState(128);
				match(ELSE_TOKEN);
				setState(129);
				block();
				}
				}
				setState(134);
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
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR_TOKEN() { return getToken(ExprParser.FOR_TOKEN, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<LogicalsContext> logicals() {
			return getRuleContexts(LogicalsContext.class);
		}
		public LogicalsContext logicals(int i) {
			return getRuleContext(LogicalsContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FOR_TOKEN);
			setState(136);
			boolExpr();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND || _la==LOGICAL_OR) {
				{
				{
				setState(137);
				logicals();
				setState(138);
				boolExpr();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			block();
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
	public static class ReturnerContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ExprParser.RETURN, 0); }
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public List<TypeProductionContext> typeProduction() {
			return getRuleContexts(TypeProductionContext.class);
		}
		public TypeProductionContext typeProduction(int i) {
			return getRuleContext(TypeProductionContext.class,i);
		}
		public List<BoolCollectorContext> boolCollector() {
			return getRuleContexts(BoolCollectorContext.class);
		}
		public BoolCollectorContext boolCollector(int i) {
			return getRuleContext(BoolCollectorContext.class,i);
		}
		public List<ArithmeticsContext> arithmetics() {
			return getRuleContexts(ArithmeticsContext.class);
		}
		public ArithmeticsContext arithmetics(int i) {
			return getRuleContext(ArithmeticsContext.class,i);
		}
		public ReturnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterReturner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitReturner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitReturner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnerContext returner() throws RecognitionException {
		ReturnerContext _localctx = new ReturnerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returner);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(RETURN);
			setState(153); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(148);
						methodCall();
						}
						break;
					case 2:
						{
						setState(149);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(150);
						typeProduction();
						}
						break;
					case 4:
						{
						setState(151);
						boolCollector();
						}
						break;
					case 5:
						{
						setState(152);
						arithmetics();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class LocalvariableInitContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public TerminalNode BOOLEAN() { return getToken(ExprParser.BOOLEAN, 0); }
		public TerminalNode ASSERT() { return getToken(ExprParser.ASSERT, 0); }
		public BoolCollectorContext boolCollector() {
			return getRuleContext(BoolCollectorContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<TypeProductionContext> typeProduction() {
			return getRuleContexts(TypeProductionContext.class);
		}
		public TypeProductionContext typeProduction(int i) {
			return getRuleContext(TypeProductionContext.class,i);
		}
		public List<ArithmeticsContext> arithmetics() {
			return getRuleContexts(ArithmeticsContext.class);
		}
		public ArithmeticsContext arithmetics(int i) {
			return getRuleContext(ArithmeticsContext.class,i);
		}
		public LocalvariableInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localvariableInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLocalvariableInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLocalvariableInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLocalvariableInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalvariableInitContext localvariableInit() throws RecognitionException {
		LocalvariableInitContext _localctx = new LocalvariableInitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_localvariableInit);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(VAR);
				setState(158);
				nameGiver();
				setState(159);
				match(BOOLEAN);
				setState(160);
				match(ASSERT);
				setState(161);
				boolCollector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(VAR);
				setState(164);
				nameGiver();
				setState(165);
				type();
				setState(166);
				match(ASSERT);
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(167);
					methodCall();
					}
					break;
				case 2:
					{
					setState(168);
					typeProduction();
					}
					break;
				case 3:
					{
					setState(169);
					nameGiver();
					}
					break;
				case 4:
					{
					}
					break;
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674482176L) != 0) {
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(173);
						arithmetics();
						setState(174);
						typeProduction();
						}
						break;
					case 2:
						{
						setState(176);
						arithmetics();
						setState(177);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(179);
						arithmetics();
						setState(180);
						methodCall();
						}
						break;
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class BoolCollectorContext extends ParserRuleContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<LogicalsContext> logicals() {
			return getRuleContexts(LogicalsContext.class);
		}
		public LogicalsContext logicals(int i) {
			return getRuleContext(LogicalsContext.class,i);
		}
		public BoolCollectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolCollector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBoolCollector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBoolCollector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBoolCollector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolCollectorContext boolCollector() throws RecognitionException {
		BoolCollectorContext _localctx = new BoolCollectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolCollector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			boolExpr();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_AND || _la==LOGICAL_OR) {
				{
				{
				setState(190);
				logicals();
				setState(191);
				boolExpr();
				}
				}
				setState(197);
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
	public static class VariableVisContext extends ParserRuleContext {
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public TerminalNode ASSERT() { return getToken(ExprParser.ASSERT, 0); }
		public BoolCollectorContext boolCollector() {
			return getRuleContext(BoolCollectorContext.class,0);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<ArithmeticsContext> arithmetics() {
			return getRuleContexts(ArithmeticsContext.class);
		}
		public ArithmeticsContext arithmetics(int i) {
			return getRuleContext(ArithmeticsContext.class,i);
		}
		public List<TypeProductionContext> typeProduction() {
			return getRuleContexts(TypeProductionContext.class);
		}
		public TypeProductionContext typeProduction(int i) {
			return getRuleContext(TypeProductionContext.class,i);
		}
		public VariableVisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableVis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterVariableVis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitVariableVis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitVariableVis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableVisContext variableVis() throws RecognitionException {
		VariableVisContext _localctx = new VariableVisContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableVis);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				nameGiver();
				setState(199);
				match(ASSERT);
				setState(200);
				boolCollector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				nameGiver();
				setState(203);
				match(ASSERT);
				setState(204);
				methodCall();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674482176L) != 0) {
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(205);
						arithmetics();
						setState(206);
						typeProduction();
						}
						break;
					case 2:
						{
						setState(208);
						arithmetics();
						setState(209);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(211);
						arithmetics();
						setState(212);
						methodCall();
						}
						break;
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				nameGiver();
				setState(220);
				match(ASSERT);
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(221);
					typeProduction();
					}
					break;
				case 2:
					{
					setState(222);
					nameGiver();
					}
					break;
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674482176L) != 0) {
					{
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(225);
						arithmetics();
						setState(226);
						typeProduction();
						}
						break;
					case 2:
						{
						setState(228);
						arithmetics();
						setState(229);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(231);
						arithmetics();
						setState(232);
						methodCall();
						}
						break;
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class PrintCallContext extends ParserRuleContext {
		public TerminalNode FMT() { return getToken(ExprParser.FMT, 0); }
		public TerminalNode DOT() { return getToken(ExprParser.DOT, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public PrintCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPrintCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPrintCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPrintCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintCallContext printCall() throws RecognitionException {
		PrintCallContext _localctx = new PrintCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(FMT);
			setState(242);
			match(DOT);
			setState(243);
			methodCall();
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
	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode LEFTPAR() { return getToken(ExprParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(ExprParser.RIGHTPAR, 0); }
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public TerminalNode PRINT_LN() { return getToken(ExprParser.PRINT_LN, 0); }
		public List<BoolCollectorContext> boolCollector() {
			return getRuleContexts(BoolCollectorContext.class);
		}
		public BoolCollectorContext boolCollector(int i) {
			return getRuleContext(BoolCollectorContext.class,i);
		}
		public List<TerminalNode> KOMMA() { return getTokens(ExprParser.KOMMA); }
		public TerminalNode KOMMA(int i) {
			return getToken(ExprParser.KOMMA, i);
		}
		public List<TypeProductionContext> typeProduction() {
			return getRuleContexts(TypeProductionContext.class);
		}
		public TypeProductionContext typeProduction(int i) {
			return getRuleContext(TypeProductionContext.class,i);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<ArithmeticsContext> arithmetics() {
			return getRuleContexts(ArithmeticsContext.class);
		}
		public ArithmeticsContext arithmetics(int i) {
			return getRuleContext(ArithmeticsContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case DIGITINCL:
				{
				setState(245);
				nameGiver();
				}
				break;
			case PRINT_LN:
				{
				setState(246);
				match(PRINT_LN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(249);
			match(LEFTPAR);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 965327454336L) != 0) {
				{
				{
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(250);
						typeProduction();
						}
						break;
					case 2:
						{
						setState(251);
						methodCall();
						}
						break;
					case 3:
						{
						setState(252);
						nameGiver();
						}
						break;
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674482176L) != 0) {
						{
						setState(264);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
						case 1:
							{
							setState(255);
							arithmetics();
							setState(256);
							typeProduction();
							}
							break;
						case 2:
							{
							setState(258);
							arithmetics();
							setState(259);
							methodCall();
							}
							break;
						case 3:
							{
							setState(261);
							arithmetics();
							setState(262);
							nameGiver();
							}
							break;
						}
						}
						setState(268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(269);
					boolCollector();
					}
					break;
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KOMMA) {
					{
					{
					setState(272);
					match(KOMMA);
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(275);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(273);
							typeProduction();
							}
							break;
						case 2:
							{
							setState(274);
							nameGiver();
							}
							break;
						}
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674482176L) != 0) {
							{
							setState(283);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
							case 1:
								{
								setState(277);
								arithmetics();
								setState(278);
								typeProduction();
								}
								break;
							case 2:
								{
								setState(280);
								arithmetics();
								setState(281);
								nameGiver();
								}
								break;
							}
							}
							setState(287);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(288);
						boolCollector();
						}
						break;
					}
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(RIGHTPAR);
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
	public static class BoolExprContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public BoolliteralContext boolliteral() {
			return getRuleContext(BoolliteralContext.class,0);
		}
		public OnlyNameContext onlyName() {
			return getRuleContext(OnlyNameContext.class,0);
		}
		public BoolStatContext boolStat() {
			return getRuleContext(BoolStatContext.class,0);
		}
		public List<TerminalNode> LOGICAL_NOT() { return getTokens(ExprParser.LOGICAL_NOT); }
		public TerminalNode LOGICAL_NOT(int i) {
			return getToken(ExprParser.LOGICAL_NOT, i);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					match(LOGICAL_NOT);
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(309);
				methodCall();
				}
				break;
			case 2:
				{
				setState(310);
				boolliteral();
				}
				break;
			case 3:
				{
				setState(311);
				onlyName();
				}
				break;
			case 4:
				{
				setState(312);
				boolStat();
				}
				break;
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
	public static class BoolStatContext extends ParserRuleContext {
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public List<MethodCallContext> methodCall() {
			return getRuleContexts(MethodCallContext.class);
		}
		public MethodCallContext methodCall(int i) {
			return getRuleContext(MethodCallContext.class,i);
		}
		public List<BoolliteralContext> boolliteral() {
			return getRuleContexts(BoolliteralContext.class);
		}
		public BoolliteralContext boolliteral(int i) {
			return getRuleContext(BoolliteralContext.class,i);
		}
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public List<TypeProductionContext> typeProduction() {
			return getRuleContexts(TypeProductionContext.class);
		}
		public TypeProductionContext typeProduction(int i) {
			return getRuleContext(TypeProductionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_NOT() { return getTokens(ExprParser.LOGICAL_NOT); }
		public TerminalNode LOGICAL_NOT(int i) {
			return getToken(ExprParser.LOGICAL_NOT, i);
		}
		public BoolStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBoolStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBoolStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBoolStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolStatContext boolStat() throws RecognitionException {
		BoolStatContext _localctx = new BoolStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_NOT) {
				{
				{
				setState(315);
				match(LOGICAL_NOT);
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(321);
				methodCall();
				}
				break;
			case 2:
				{
				setState(322);
				boolliteral();
				}
				break;
			case 3:
				{
				setState(323);
				nameGiver();
				}
				break;
			case 4:
				{
				setState(324);
				typeProduction();
				}
				break;
			}
			setState(327);
			booleans();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_NOT) {
				{
				{
				setState(328);
				match(LOGICAL_NOT);
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(334);
				methodCall();
				}
				break;
			case 2:
				{
				setState(335);
				boolliteral();
				}
				break;
			case 3:
				{
				setState(336);
				nameGiver();
				}
				break;
			case 4:
				{
				setState(337);
				typeProduction();
				}
				break;
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode FLOAT64() { return getToken(ExprParser.FLOAT64, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 47244640256L) != 0) ) {
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
	public static class Second_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode FLOAT64() { return getToken(ExprParser.FLOAT64, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(ExprParser.BOOLEAN, 0); }
		public Second_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterSecond_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitSecond_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitSecond_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_typeContext second_type() throws RecognitionException {
		Second_typeContext _localctx = new Second_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_second_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0) ) {
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
	public static class TypeProductionContext extends ParserRuleContext {
		public IntliteralContext intliteral() {
			return getRuleContext(IntliteralContext.class,0);
		}
		public FloatliteralContext floatliteral() {
			return getRuleContext(FloatliteralContext.class,0);
		}
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public TypeProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTypeProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTypeProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitTypeProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeProductionContext typeProduction() throws RecognitionException {
		TypeProductionContext _localctx = new TypeProductionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeProduction);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				intliteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				floatliteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				stringliteral();
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
	public static class StringliteralContext extends ParserRuleContext {
		public List<TerminalNode> NOTATIONS() { return getTokens(ExprParser.NOTATIONS); }
		public TerminalNode NOTATIONS(int i) {
			return getToken(ExprParser.NOTATIONS, i);
		}
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public List<ArithmeticsContext> arithmetics() {
			return getRuleContexts(ArithmeticsContext.class);
		}
		public ArithmeticsContext arithmetics(int i) {
			return getRuleContext(ArithmeticsContext.class,i);
		}
		public List<BooleansContext> booleans() {
			return getRuleContexts(BooleansContext.class);
		}
		public BooleansContext booleans(int i) {
			return getRuleContext(BooleansContext.class,i);
		}
		public StringliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStringliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStringliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitStringliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringliteralContext stringliteral() throws RecognitionException {
		StringliteralContext _localctx = new StringliteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stringliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(NOTATIONS);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 16495903965184L) != 0) {
				{
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(350);
					nameGiver();
					}
					break;
				case 2:
					{
					setState(351);
					arithmetics();
					}
					break;
				case 3:
					{
					setState(352);
					booleans();
					}
					break;
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(NOTATIONS);
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
	public static class IntliteralContext extends ParserRuleContext {
		public List<TerminalNode> DIGITINCL() { return getTokens(ExprParser.DIGITINCL); }
		public TerminalNode DIGITINCL(int i) {
			return getToken(ExprParser.DIGITINCL, i);
		}
		public IntliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIntliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIntliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitIntliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntliteralContext intliteral() throws RecognitionException {
		IntliteralContext _localctx = new IntliteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_intliteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(360);
					match(DIGITINCL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(363); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class FloatliteralContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ExprParser.DOT, 0); }
		public List<TerminalNode> DIGITINCL() { return getTokens(ExprParser.DIGITINCL); }
		public TerminalNode DIGITINCL(int i) {
			return getToken(ExprParser.DIGITINCL, i);
		}
		public FloatliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFloatliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFloatliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitFloatliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatliteralContext floatliteral() throws RecognitionException {
		FloatliteralContext _localctx = new FloatliteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_floatliteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(365);
				match(DIGITINCL);
				}
				}
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITINCL );
			setState(370);
			match(DOT);
			setState(372); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(371);
					match(DIGITINCL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(374); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class BoolliteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExprParser.FALSE, 0); }
		public BoolliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBoolliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBoolliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBoolliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolliteralContext boolliteral() throws RecognitionException {
		BoolliteralContext _localctx = new BoolliteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class PackageProdcutionContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(ExprParser.PACKAGE, 0); }
		public TerminalNode MAIN() { return getToken(ExprParser.MAIN, 0); }
		public PackageProdcutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageProdcution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterPackageProdcution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitPackageProdcution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitPackageProdcution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageProdcutionContext packageProdcution() throws RecognitionException {
		PackageProdcutionContext _localctx = new PackageProdcutionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_packageProdcution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(PACKAGE);
			setState(379);
			match(MAIN);
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
	public static class ImportProductionContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ExprParser.IMPORT, 0); }
		public List<TerminalNode> NOTATIONS() { return getTokens(ExprParser.NOTATIONS); }
		public TerminalNode NOTATIONS(int i) {
			return getToken(ExprParser.NOTATIONS, i);
		}
		public TerminalNode FMT() { return getToken(ExprParser.FMT, 0); }
		public ImportProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importProduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterImportProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitImportProduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitImportProduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportProductionContext importProduction() throws RecognitionException {
		ImportProductionContext _localctx = new ImportProductionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_importProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(IMPORT);
			setState(382);
			match(NOTATIONS);
			setState(383);
			match(FMT);
			setState(384);
			match(NOTATIONS);
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
	public static class NameGiverContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(ExprParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(ExprParser.LETTER, i);
		}
		public List<TerminalNode> DIGITINCL() { return getTokens(ExprParser.DIGITINCL); }
		public TerminalNode DIGITINCL(int i) {
			return getToken(ExprParser.DIGITINCL, i);
		}
		public NameGiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameGiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNameGiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNameGiver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitNameGiver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameGiverContext nameGiver() throws RecognitionException {
		NameGiverContext _localctx = new NameGiverContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nameGiver);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(386);
					_la = _input.LA(1);
					if ( !(_la==LETTER || _la==DIGITINCL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(389); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class OnlyNameContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(ExprParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(ExprParser.LETTER, i);
		}
		public OnlyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onlyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOnlyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOnlyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitOnlyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyNameContext onlyName() throws RecognitionException {
		OnlyNameContext _localctx = new OnlyNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_onlyName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(391);
					match(LETTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(394); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ArithmeticsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(ExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public TerminalNode MODULO() { return getToken(ExprParser.MODULO, 0); }
		public ArithmeticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArithmetics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArithmetics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitArithmetics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticsContext arithmetics() throws RecognitionException {
		ArithmeticsContext _localctx = new ArithmeticsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithmetics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674482176L) != 0) ) {
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
	public static class BooleansContext extends ParserRuleContext {
		public TerminalNode MODULO() { return getToken(ExprParser.MODULO, 0); }
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public TerminalNode SMALLER() { return getToken(ExprParser.SMALLER, 0); }
		public TerminalNode SMALLER_OR_EQUAL() { return getToken(ExprParser.SMALLER_OR_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(ExprParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(ExprParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(ExprParser.NOT_EQUAL, 0); }
		public BooleansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBooleans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBooleans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBooleans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleansContext booleans() throws RecognitionException {
		BooleansContext _localctx = new BooleansContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8323072L) != 0) ) {
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
	public static class LogicalsContext extends ParserRuleContext {
		public TerminalNode LOGICAL_AND() { return getToken(ExprParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(ExprParser.LOGICAL_OR, 0); }
		public LogicalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLogicals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLogicals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLogicals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalsContext logicals() throws RecognitionException {
		LogicalsContext _localctx = new LogicalsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_logicals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if ( !(_la==LOGICAL_AND || _la==LOGICAL_OR) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001,\u0193\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000A\b\u0000\n\u0000\f\u0000D\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002P\b\u0002"+
		"\n\u0002\f\u0002S\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003_\b\u0003\n\u0003\f\u0003b\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0005\u0004f\b\u0004\n\u0004\f\u0004i\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005t\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006{\b\u0006\n\u0006\f\u0006~\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0083\b\u0006\n\u0006"+
		"\f\u0006\u0086\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u008d\b\u0007\n\u0007\f\u0007\u0090\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u009a\b\b\u000b\b\f\b\u009b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00ac\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00b7\b\t\n\t\f\t\u00ba\t\t\u0003\t\u00bc\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c2\b\n\n\n\f\n\u00c5\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d7\b\u000b"+
		"\n\u000b\f\u000b\u00da\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00e0\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00eb\b\u000b\n\u000b\f\u000b\u00ee\t\u000b\u0003\u000b\u00f0\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00f8\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00fe\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0109\b\r\n"+
		"\r\f\r\u010c\t\r\u0001\r\u0003\r\u010f\b\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0114\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u011c"+
		"\b\r\n\r\f\r\u011f\t\r\u0001\r\u0003\r\u0122\b\r\u0005\r\u0124\b\r\n\r"+
		"\f\r\u0127\t\r\u0005\r\u0129\b\r\n\r\f\r\u012c\t\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0005\u000e\u0131\b\u000e\n\u000e\f\u000e\u0134\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u013a\b\u000e\u0001\u000f"+
		"\u0005\u000f\u013d\b\u000f\n\u000f\f\u000f\u0140\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0146\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u014a\b\u000f\n\u000f\f\u000f\u014d\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0153\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u015c\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0162\b\u0013\n\u0013\f\u0013\u0165\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0004\u0014\u016a\b\u0014\u000b\u0014\f\u0014\u016b"+
		"\u0001\u0015\u0004\u0015\u016f\b\u0015\u000b\u0015\f\u0015\u0170\u0001"+
		"\u0015\u0001\u0015\u0004\u0015\u0175\b\u0015\u000b\u0015\f\u0015\u0176"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0004\u0019"+
		"\u0184\b\u0019\u000b\u0019\f\u0019\u0185\u0001\u001a\u0004\u001a\u0189"+
		"\b\u001a\u000b\u001a\f\u001a\u018a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:\u0000\u0007\u0002\u0000 !##\u0001\u0000 #\u0001"+
		"\u0000%&\u0001\u0000\u001e\u001f\u0002\u0000\u0010\u0010(+\u0001\u0000"+
		"\u0010\u0016\u0001\u0000\u0017\u0018\u01ba\u0000<\u0001\u0000\u0000\u0000"+
		"\u0002E\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006X"+
		"\u0001\u0000\u0000\u0000\bc\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000"+
		"\u0000\fu\u0001\u0000\u0000\u0000\u000e\u0087\u0001\u0000\u0000\u0000"+
		"\u0010\u0093\u0001\u0000\u0000\u0000\u0012\u00bb\u0001\u0000\u0000\u0000"+
		"\u0014\u00bd\u0001\u0000\u0000\u0000\u0016\u00ef\u0001\u0000\u0000\u0000"+
		"\u0018\u00f1\u0001\u0000\u0000\u0000\u001a\u00f7\u0001\u0000\u0000\u0000"+
		"\u001c\u0132\u0001\u0000\u0000\u0000\u001e\u013e\u0001\u0000\u0000\u0000"+
		" \u0154\u0001\u0000\u0000\u0000\"\u0156\u0001\u0000\u0000\u0000$\u015b"+
		"\u0001\u0000\u0000\u0000&\u015d\u0001\u0000\u0000\u0000(\u0169\u0001\u0000"+
		"\u0000\u0000*\u016e\u0001\u0000\u0000\u0000,\u0178\u0001\u0000\u0000\u0000"+
		".\u017a\u0001\u0000\u0000\u00000\u017d\u0001\u0000\u0000\u00002\u0183"+
		"\u0001\u0000\u0000\u00004\u0188\u0001\u0000\u0000\u00006\u018c\u0001\u0000"+
		"\u0000\u00008\u018e\u0001\u0000\u0000\u0000:\u0190\u0001\u0000\u0000\u0000"+
		"<=\u0003.\u0017\u0000=>\u00030\u0018\u0000>B\u0003\u0002\u0001\u0000?"+
		"A\u0003\u0004\u0002\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0001\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\t\u0000\u0000FG\u0005"+
		"\u0005\u0000\u0000GH\u0005\n\u0000\u0000HI\u0005\u000b\u0000\u0000IJ\u0003"+
		"\b\u0004\u0000J\u0003\u0001\u0000\u0000\u0000KL\u0005\t\u0000\u0000LM"+
		"\u00032\u0019\u0000MQ\u0005\n\u0000\u0000NP\u0003\u0006\u0003\u0000ON"+
		"\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000"+
		"\u0000\u0000TU\u0005\u000b\u0000\u0000UV\u0003\"\u0011\u0000VW\u0003\b"+
		"\u0004\u0000W\u0005\u0001\u0000\u0000\u0000XY\u00032\u0019\u0000Y`\u0003"+
		"\"\u0011\u0000Z[\u0005\u000f\u0000\u0000[\\\u00032\u0019\u0000\\]\u0003"+
		"\"\u0011\u0000]_\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000_b\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"a\u0007\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cg\u0005\f\u0000"+
		"\u0000df\u0003\n\u0005\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\r\u0000\u0000k\t\u0001"+
		"\u0000\u0000\u0000lt\u0003\u0012\t\u0000mt\u0003\f\u0006\u0000nt\u0003"+
		"\u000e\u0007\u0000ot\u0003\u0018\f\u0000pt\u0003\u001a\r\u0000qt\u0003"+
		"\u0010\b\u0000rt\u0003\u0016\u000b\u0000sl\u0001\u0000\u0000\u0000sm\u0001"+
		"\u0000\u0000\u0000sn\u0001\u0000\u0000\u0000so\u0001\u0000\u0000\u0000"+
		"sp\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000"+
		"\u0000t\u000b\u0001\u0000\u0000\u0000uv\u0005\u001a\u0000\u0000v|\u0003"+
		"\u001c\u000e\u0000wx\u0003:\u001d\u0000xy\u0003\u001c\u000e\u0000y{\u0001"+
		"\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0084\u0003\b\u0004\u0000"+
		"\u0080\u0081\u0005\u001b\u0000\u0000\u0081\u0083\u0003\b\u0004\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\r\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005\u001c\u0000\u0000\u0088\u008e\u0003\u001c\u000e\u0000\u0089\u008a"+
		"\u0003:\u001d\u0000\u008a\u008b\u0003\u001c\u000e\u0000\u008b\u008d\u0001"+
		"\u0000\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0003\b\u0004\u0000\u0092\u000f\u0001\u0000"+
		"\u0000\u0000\u0093\u0099\u0005,\u0000\u0000\u0094\u009a\u0003\u001a\r"+
		"\u0000\u0095\u009a\u00032\u0019\u0000\u0096\u009a\u0003$\u0012\u0000\u0097"+
		"\u009a\u0003\u0014\n\u0000\u0098\u009a\u00036\u001b\u0000\u0099\u0094"+
		"\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0096"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u0011"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u001d\u0000\u0000\u009e\u009f"+
		"\u00032\u0019\u0000\u009f\u00a0\u0005\"\u0000\u0000\u00a0\u00a1\u0005"+
		"\u000e\u0000\u0000\u00a1\u00a2\u0003\u0014\n\u0000\u00a2\u00bc\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0005\u001d\u0000\u0000\u00a4\u00a5\u00032\u0019"+
		"\u0000\u00a5\u00a6\u0003 \u0010\u0000\u00a6\u00ab\u0005\u000e\u0000\u0000"+
		"\u00a7\u00ac\u0003\u001a\r\u0000\u00a8\u00ac\u0003$\u0012\u0000\u00a9"+
		"\u00ac\u00032\u0019\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a7"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u00036\u001b\u0000\u00ae\u00af\u0003"+
		"$\u0012\u0000\u00af\u00b7\u0001\u0000\u0000\u0000\u00b0\u00b1\u00036\u001b"+
		"\u0000\u00b1\u00b2\u00032\u0019\u0000\u00b2\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u00036\u001b\u0000\u00b4\u00b5\u0003\u001a\r\u0000\u00b5"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b7"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u009d\u0001\u0000\u0000\u0000\u00bb"+
		"\u00a3\u0001\u0000\u0000\u0000\u00bc\u0013\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c3\u0003\u001c\u000e\u0000\u00be\u00bf\u0003:\u001d\u0000\u00bf\u00c0"+
		"\u0003\u001c\u000e\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00be"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u0015"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u00032\u0019\u0000\u00c7\u00c8\u0005\u000e\u0000\u0000\u00c8\u00c9\u0003"+
		"\u0014\n\u0000\u00c9\u00f0\u0001\u0000\u0000\u0000\u00ca\u00cb\u00032"+
		"\u0019\u0000\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc\u00d8\u0003\u001a"+
		"\r\u0000\u00cd\u00ce\u00036\u001b\u0000\u00ce\u00cf\u0003$\u0012\u0000"+
		"\u00cf\u00d7\u0001\u0000\u0000\u0000\u00d0\u00d1\u00036\u001b\u0000\u00d1"+
		"\u00d2\u00032\u0019\u0000\u00d2\u00d7\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u00036\u001b\u0000\u00d4\u00d5\u0003\u001a\r\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00cd\u0001\u0000\u0000\u0000\u00d6\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00f0\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u00032\u0019\u0000\u00dc\u00df\u0005\u000e"+
		"\u0000\u0000\u00dd\u00e0\u0003$\u0012\u0000\u00de\u00e0\u00032\u0019\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00ec\u0001\u0000\u0000\u0000\u00e1\u00e2\u00036\u001b\u0000\u00e2"+
		"\u00e3\u0003$\u0012\u0000\u00e3\u00eb\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u00036\u001b\u0000\u00e5\u00e6\u00032\u0019\u0000\u00e6\u00eb\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u00036\u001b\u0000\u00e8\u00e9\u0003\u001a\r"+
		"\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e1\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e4\u0001\u0000\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00c6\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ca\u0001\u0000\u0000\u0000\u00ef\u00db\u0001\u0000\u0000"+
		"\u0000\u00f0\u0017\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\b\u0000\u0000"+
		"\u00f2\u00f3\u0005$\u0000\u0000\u00f3\u00f4\u0003\u001a\r\u0000\u00f4"+
		"\u0019\u0001\u0000\u0000\u0000\u00f5\u00f8\u00032\u0019\u0000\u00f6\u00f8"+
		"\u0005\'\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u012a\u0005"+
		"\n\u0000\u0000\u00fa\u00fe\u0003$\u0012\u0000\u00fb\u00fe\u0003\u001a"+
		"\r\u0000\u00fc\u00fe\u00032\u0019\u0000\u00fd\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe\u010a\u0001\u0000\u0000\u0000\u00ff\u0100\u00036\u001b\u0000"+
		"\u0100\u0101\u0003$\u0012\u0000\u0101\u0109\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u00036\u001b\u0000\u0103\u0104\u0003\u001a\r\u0000\u0104\u0109"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u00036\u001b\u0000\u0106\u0107\u0003"+
		"2\u0019\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u00ff\u0001\u0000"+
		"\u0000\u0000\u0108\u0102\u0001\u0000\u0000\u0000\u0108\u0105\u0001\u0000"+
		"\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010f\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010f\u0003\u0014"+
		"\n\u0000\u010e\u00fd\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0125\u0001\u0000\u0000\u0000\u0110\u0121\u0005\u000f\u0000"+
		"\u0000\u0111\u0114\u0003$\u0012\u0000\u0112\u0114\u00032\u0019\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114"+
		"\u011d\u0001\u0000\u0000\u0000\u0115\u0116\u00036\u001b\u0000\u0116\u0117"+
		"\u0003$\u0012\u0000\u0117\u011c\u0001\u0000\u0000\u0000\u0118\u0119\u0003"+
		"6\u001b\u0000\u0119\u011a\u00032\u0019\u0000\u011a\u011c\u0001\u0000\u0000"+
		"\u0000\u011b\u0115\u0001\u0000\u0000\u0000\u011b\u0118\u0001\u0000\u0000"+
		"\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0122\u0001\u0000\u0000"+
		"\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0122\u0003\u0014\n\u0000"+
		"\u0121\u0113\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0110\u0001\u0000\u0000\u0000"+
		"\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u010e\u0001\u0000\u0000\u0000"+
		"\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u000b\u0000\u0000"+
		"\u012e\u001b\u0001\u0000\u0000\u0000\u012f\u0131\u0005\u0019\u0000\u0000"+
		"\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000"+
		"\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000"+
		"\u0133\u0139\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0135\u013a\u0003\u001a\r\u0000\u0136\u013a\u0003,\u0016\u0000\u0137"+
		"\u013a\u00034\u001a\u0000\u0138\u013a\u0003\u001e\u000f\u0000\u0139\u0135"+
		"\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u001d"+
		"\u0001\u0000\u0000\u0000\u013b\u013d\u0005\u0019\u0000\u0000\u013c\u013b"+
		"\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0145"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0146"+
		"\u0003\u001a\r\u0000\u0142\u0146\u0003,\u0016\u0000\u0143\u0146\u0003"+
		"2\u0019\u0000\u0144\u0146\u0003$\u0012\u0000\u0145\u0141\u0001\u0000\u0000"+
		"\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u014b\u00038\u001c\u0000\u0148\u014a\u0005\u0019\u0000\u0000"+
		"\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u0152\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014e\u0153\u0003\u001a\r\u0000\u014f\u0153\u0003,\u0016\u0000\u0150"+
		"\u0153\u00032\u0019\u0000\u0151\u0153\u0003$\u0012\u0000\u0152\u014e\u0001"+
		"\u0000\u0000\u0000\u0152\u014f\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u001f\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0007\u0000\u0000\u0000\u0155!\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0007\u0001\u0000\u0000\u0157#\u0001\u0000\u0000"+
		"\u0000\u0158\u015c\u0003(\u0014\u0000\u0159\u015c\u0003*\u0015\u0000\u015a"+
		"\u015c\u0003&\u0013\u0000\u015b\u0158\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c%\u0001"+
		"\u0000\u0000\u0000\u015d\u0163\u0005\u0007\u0000\u0000\u015e\u0162\u0003"+
		"2\u0019\u0000\u015f\u0162\u00036\u001b\u0000\u0160\u0162\u00038\u001c"+
		"\u0000\u0161\u015e\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000"+
		"\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005\u0007\u0000\u0000\u0167\'\u0001\u0000\u0000\u0000"+
		"\u0168\u016a\u0005\u001f\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0001\u0000\u0000\u0000\u016c)\u0001\u0000\u0000\u0000\u016d"+
		"\u016f\u0005\u001f\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0174\u0005$\u0000\u0000\u0173\u0175\u0005\u001f\u0000\u0000\u0174\u0173"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177+\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0007\u0002\u0000\u0000\u0179-\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0005\u0004\u0000\u0000\u017b\u017c\u0005\u0005"+
		"\u0000\u0000\u017c/\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u0006\u0000"+
		"\u0000\u017e\u017f\u0005\u0007\u0000\u0000\u017f\u0180\u0005\b\u0000\u0000"+
		"\u0180\u0181\u0005\u0007\u0000\u0000\u01811\u0001\u0000\u0000\u0000\u0182"+
		"\u0184\u0007\u0003\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185"+
		"\u0186\u0001\u0000\u0000\u0000\u01863\u0001\u0000\u0000\u0000\u0187\u0189"+
		"\u0005\u001e\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b"+
		"\u0001\u0000\u0000\u0000\u018b5\u0001\u0000\u0000\u0000\u018c\u018d\u0007"+
		"\u0004\u0000\u0000\u018d7\u0001\u0000\u0000\u0000\u018e\u018f\u0007\u0005"+
		"\u0000\u0000\u018f9\u0001\u0000\u0000\u0000\u0190\u0191\u0007\u0006\u0000"+
		"\u0000\u0191;\u0001\u0000\u0000\u0000.BQ`gs|\u0084\u008e\u0099\u009b\u00ab"+
		"\u00b6\u00b8\u00bb\u00c3\u00d6\u00d8\u00df\u00ea\u00ec\u00ef\u00f7\u00fd"+
		"\u0108\u010a\u010e\u0113\u011b\u011d\u0121\u0125\u012a\u0132\u0139\u013e"+
		"\u0145\u014b\u0152\u015b\u0161\u0163\u016b\u0170\u0176\u0185\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}