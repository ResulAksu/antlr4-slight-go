// Generated from C:/Users/resul/Desktop/all/antlr4-Projekt/antlr4-slight-go/antlr4-Projekt/src/antlr\Expr.g4 by ANTLR 4.10.1
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, PACKAGE=3, MAIN=4, IMPORT=5, NOTATIONS=6, FMT=7, FUNC=8, 
		LEFTPAR=9, RIGHTPAR=10, LEFTBRACE=11, RIGHTBRACE=12, ASSERT=13, MODULO=14, 
		EQUALS=15, SMALLER=16, SMALLER_OR_EQUAL=17, GREATER=18, GREATER_OR_EQUAL=19, 
		NOT_EQUAL=20, LOGICAL_AND=21, LOGICAL_OR=22, LOGICAL_NOT=23, IF_TOKEN=24, 
		ELSE_TOKEN=25, FOR_TOKEN=26, VAR=27, LETTER=28, DIGITINCL=29, INT=30, 
		FLOAT64=31, BOOLEAN=32, STRING=33, DOT=34, TRUE=35, FALSE=36, PRINT_LN=37, 
		ADD=38, SUB=39, MUL=40, DIV=41, RETURN=42;
	public static final int
		RULE_prog = 0, RULE_mainCaller = 1, RULE_methodCaller = 2, RULE_methodMember = 3, 
		RULE_block = 4, RULE_blockStatements = 5, RULE_if_and_or_else_expression = 6, 
		RULE_for_loop = 7, RULE_bool_statement = 8, RULE_returner = 9, RULE_localvariableInit = 10, 
		RULE_variableVis = 11, RULE_printCall = 12, RULE_methodCall = 13, RULE_type = 14, 
		RULE_typeProduction = 15, RULE_stringliteral = 16, RULE_intliteral = 17, 
		RULE_floatliteral = 18, RULE_boolliteral = 19, RULE_packageProdcution = 20, 
		RULE_importProduction = 21, RULE_nameGiver = 22, RULE_arithmetics = 23, 
		RULE_booleans = 24, RULE_logicals = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "mainCaller", "methodCaller", "methodMember", "block", "blockStatements", 
			"if_and_or_else_expression", "for_loop", "bool_statement", "returner", 
			"localvariableInit", "variableVis", "printCall", "methodCall", "type", 
			"typeProduction", "stringliteral", "intliteral", "floatliteral", "boolliteral", 
			"packageProdcution", "importProduction", "nameGiver", "arithmetics", 
			"booleans", "logicals"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", null, "'package'", "'main'", "'import'", "'\"'", "'fmt'", 
			"'func'", "'('", "')'", "'{'", "'}'", "'='", "'%'", "'=='", "'<'", "'<='", 
			"'>'", "'>='", "'!='", "'&&'", "'||'", "'!'", "'if'", "'else'", "'for'", 
			"'var'", null, null, "'int'", "'float64'", "'bool'", "'string'", "'.'", 
			"'true'", "'false'", "'Println'", "'+'", "'-'", "'*'", "'/'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WS", "PACKAGE", "MAIN", "IMPORT", "NOTATIONS", "FMT", "FUNC", 
			"LEFTPAR", "RIGHTPAR", "LEFTBRACE", "RIGHTBRACE", "ASSERT", "MODULO", 
			"EQUALS", "SMALLER", "SMALLER_OR_EQUAL", "GREATER", "GREATER_OR_EQUAL", 
			"NOT_EQUAL", "LOGICAL_AND", "LOGICAL_OR", "LOGICAL_NOT", "IF_TOKEN", 
			"ELSE_TOKEN", "FOR_TOKEN", "VAR", "LETTER", "DIGITINCL", "INT", "FLOAT64", 
			"BOOLEAN", "STRING", "DOT", "TRUE", "FALSE", "PRINT_LN", "ADD", "SUB", 
			"MUL", "DIV", "RETURN"
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
	public String getGrammarFileName() { return "Expr.g4"; }

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
			setState(52);
			packageProdcution();
			setState(53);
			importProduction();
			setState(54);
			mainCaller();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(55);
				methodCaller();
				}
				}
				setState(60);
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
			setState(61);
			match(FUNC);
			setState(62);
			match(MAIN);
			setState(63);
			match(LEFTPAR);
			setState(64);
			match(RIGHTPAR);
			setState(65);
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

	public static class MethodCallerContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(ExprParser.FUNC, 0); }
		public NameGiverContext nameGiver() {
			return getRuleContext(NameGiverContext.class,0);
		}
		public TerminalNode LEFTPAR() { return getToken(ExprParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(ExprParser.RIGHTPAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(67);
			match(FUNC);
			setState(68);
			nameGiver();
			setState(69);
			match(LEFTPAR);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER || _la==DIGITINCL) {
				{
				{
				setState(70);
				methodMember();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(RIGHTPAR);
			setState(77);
			type();
			setState(78);
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

	public static class MethodMemberContext extends ParserRuleContext {
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
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
			setState(80);
			nameGiver();
			setState(81);
			type();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(82);
				match(T__0);
				setState(83);
				nameGiver();
				setState(84);
				type();
				}
				}
				setState(90);
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
			setState(91);
			match(LEFTBRACE);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FMT) | (1L << IF_TOKEN) | (1L << FOR_TOKEN) | (1L << VAR) | (1L << LETTER) | (1L << DIGITINCL) | (1L << RETURN))) != 0)) {
				{
				{
				setState(92);
				blockStatements();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				localvariableInit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				if_and_or_else_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				printCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				methodCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				returner();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
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

	public static class If_and_or_else_expressionContext extends ParserRuleContext {
		public TerminalNode IF_TOKEN() { return getToken(ExprParser.IF_TOKEN, 0); }
		public List<Bool_statementContext> bool_statement() {
			return getRuleContexts(Bool_statementContext.class);
		}
		public Bool_statementContext bool_statement(int i) {
			return getRuleContext(Bool_statementContext.class,i);
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
			setState(109);
			match(IF_TOKEN);
			setState(110);
			bool_statement();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGICAL_AND) | (1L << LOGICAL_OR) | (1L << LOGICAL_NOT))) != 0)) {
				{
				{
				setState(111);
				logicals();
				setState(112);
				bool_statement();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			block();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_TOKEN) {
				{
				{
				setState(120);
				match(ELSE_TOKEN);
				setState(121);
				block();
				}
				}
				setState(126);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR_TOKEN() { return getToken(ExprParser.FOR_TOKEN, 0); }
		public Bool_statementContext bool_statement() {
			return getRuleContext(Bool_statementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(FOR_TOKEN);
			setState(128);
			bool_statement();
			setState(129);
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

	public static class Bool_statementContext extends ParserRuleContext {
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
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
		public Bool_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterBool_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitBool_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitBool_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_statementContext bool_statement() throws RecognitionException {
		Bool_statementContext _localctx = new Bool_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(131);
				nameGiver();
				}
				break;
			case 2:
				{
				setState(132);
				typeProduction();
				}
				break;
			}
			setState(135);
			booleans();
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(136);
				nameGiver();
				}
				break;
			case 2:
				{
				setState(137);
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
		enterRule(_localctx, 18, RULE_returner);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(RETURN);
			setState(145); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(141);
						methodCall();
						}
						break;
					case 2:
						{
						setState(142);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(143);
						typeProduction();
						}
						break;
					case 4:
						{
						setState(144);
						arithmetics();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(147); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class LocalvariableInitContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(ExprParser.ASSERT, 0); }
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
		public List<BoolliteralContext> boolliteral() {
			return getRuleContexts(BoolliteralContext.class);
		}
		public BoolliteralContext boolliteral(int i) {
			return getRuleContext(BoolliteralContext.class,i);
		}
		public List<TerminalNode> LOGICAL_NOT() { return getTokens(ExprParser.LOGICAL_NOT); }
		public TerminalNode LOGICAL_NOT(int i) {
			return getToken(ExprParser.LOGICAL_NOT, i);
		}
		public List<LogicalsContext> logicals() {
			return getRuleContexts(LogicalsContext.class);
		}
		public LogicalsContext logicals(int i) {
			return getRuleContext(LogicalsContext.class,i);
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
		enterRule(_localctx, 20, RULE_localvariableInit);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(VAR);
				setState(150);
				nameGiver();
				setState(151);
				type();
				setState(152);
				match(ASSERT);
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(153);
					methodCall();
					}
					break;
				case 2:
					{
					setState(154);
					typeProduction();
					}
					break;
				case 3:
					{
					setState(155);
					nameGiver();
					}
					break;
				case 4:
					{
					}
					break;
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(159);
						arithmetics();
						setState(160);
						typeProduction();
						}
						break;
					case 2:
						{
						setState(162);
						arithmetics();
						setState(163);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(165);
						arithmetics();
						setState(166);
						methodCall();
						}
						break;
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(VAR);
				setState(174);
				nameGiver();
				setState(175);
				type();
				setState(176);
				match(ASSERT);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGICAL_NOT) {
					{
					{
					setState(177);
					match(LOGICAL_NOT);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
					{
					setState(183);
					boolliteral();
					}
					break;
				case LETTER:
				case DIGITINCL:
					{
					setState(184);
					nameGiver();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGICAL_AND) | (1L << LOGICAL_OR) | (1L << LOGICAL_NOT))) != 0)) {
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(187);
						logicals();
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==LOGICAL_NOT) {
							{
							{
							setState(188);
							match(LOGICAL_NOT);
							}
							}
							setState(193);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(194);
						boolliteral();
						}
						break;
					case 2:
						{
						setState(196);
						logicals();
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==LOGICAL_NOT) {
							{
							{
							setState(197);
							match(LOGICAL_NOT);
							}
							}
							setState(202);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(203);
						nameGiver();
						}
						break;
					}
					}
					setState(209);
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

	public static class VariableVisContext extends ParserRuleContext {
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public TerminalNode ASSERT() { return getToken(ExprParser.ASSERT, 0); }
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				nameGiver();
				setState(213);
				match(ASSERT);
				setState(214);
				methodCall();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
					{
					setState(224);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(215);
						arithmetics();
						setState(216);
						typeProduction();
						}
						break;
					case 2:
						{
						setState(218);
						arithmetics();
						setState(219);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(221);
						arithmetics();
						setState(222);
						methodCall();
						}
						break;
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				nameGiver();
				setState(230);
				match(ASSERT);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(231);
					typeProduction();
					}
					break;
				case 2:
					{
					setState(232);
					nameGiver();
					}
					break;
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(235);
						arithmetics();
						setState(236);
						typeProduction();
						}
						break;
					case 2:
						{
						setState(238);
						arithmetics();
						setState(239);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(241);
						arithmetics();
						setState(242);
						methodCall();
						}
						break;
					}
					}
					setState(248);
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

	public static class PrintCallContext extends ParserRuleContext {
		public TerminalNode FMT() { return getToken(ExprParser.FMT, 0); }
		public TerminalNode DOT() { return getToken(ExprParser.DOT, 0); }
		public TerminalNode PRINT_LN() { return getToken(ExprParser.PRINT_LN, 0); }
		public TerminalNode LEFTPAR() { return getToken(ExprParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(ExprParser.RIGHTPAR, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public NameGiverContext nameGiver() {
			return getRuleContext(NameGiverContext.class,0);
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
			setState(251);
			match(FMT);
			setState(252);
			match(DOT);
			setState(253);
			match(PRINT_LN);
			setState(254);
			match(LEFTPAR);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(255);
				methodCall();
				}
				break;
			case 2:
				{
				setState(256);
				stringliteral();
				}
				break;
			case 3:
				{
				setState(257);
				nameGiver();
				}
				break;
			}
			setState(260);
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

	public static class MethodCallContext extends ParserRuleContext {
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
		}
		public TerminalNode LEFTPAR() { return getToken(ExprParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(ExprParser.RIGHTPAR, 0); }
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
			setState(262);
			nameGiver();
			setState(263);
			match(LEFTPAR);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(264);
				nameGiver();
				}
				break;
			case 2:
				{
				setState(265);
				typeProduction();
				}
				break;
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTATIONS) | (1L << MODULO) | (1L << LETTER) | (1L << DIGITINCL) | (1L << TRUE) | (1L << FALSE) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(268);
					arithmetics();
					}
					break;
				case 2:
					{
					setState(269);
					nameGiver();
					}
					break;
				case 3:
					{
					setState(270);
					typeProduction();
					}
					break;
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(276);
				match(T__0);
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(277);
					nameGiver();
					}
					break;
				case 2:
					{
					setState(278);
					typeProduction();
					}
					break;
				}
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode FLOAT64() { return getToken(ExprParser.FLOAT64, 0); }
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(ExprParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT64) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
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

	public static class TypeProductionContext extends ParserRuleContext {
		public IntliteralContext intliteral() {
			return getRuleContext(IntliteralContext.class,0);
		}
		public FloatliteralContext floatliteral() {
			return getRuleContext(FloatliteralContext.class,0);
		}
		public BoolliteralContext boolliteral() {
			return getRuleContext(BoolliteralContext.class,0);
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
		enterRule(_localctx, 30, RULE_typeProduction);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				intliteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				floatliteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				boolliteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
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
		enterRule(_localctx, 32, RULE_stringliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(NOTATIONS);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << EQUALS) | (1L << SMALLER) | (1L << SMALLER_OR_EQUAL) | (1L << GREATER) | (1L << GREATER_OR_EQUAL) | (1L << NOT_EQUAL) | (1L << LETTER) | (1L << DIGITINCL) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(297);
					nameGiver();
					}
					break;
				case 2:
					{
					setState(298);
					arithmetics();
					}
					break;
				case 3:
					{
					setState(299);
					booleans();
					}
					break;
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
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
		enterRule(_localctx, 34, RULE_intliteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(307);
					match(DIGITINCL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(310); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 36, RULE_floatliteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				match(DIGITINCL);
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITINCL );
			setState(317);
			match(DOT);
			setState(319); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(318);
					match(DIGITINCL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(321); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
		enterRule(_localctx, 38, RULE_boolliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
		enterRule(_localctx, 40, RULE_packageProdcution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(PACKAGE);
			setState(326);
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
		enterRule(_localctx, 42, RULE_importProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(IMPORT);
			setState(329);
			match(NOTATIONS);
			setState(330);
			match(FMT);
			setState(331);
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
		enterRule(_localctx, 44, RULE_nameGiver);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(333);
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
				setState(336); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 46, RULE_arithmetics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
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
		enterRule(_localctx, 48, RULE_booleans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << EQUALS) | (1L << SMALLER) | (1L << SMALLER_OR_EQUAL) | (1L << GREATER) | (1L << GREATER_OR_EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
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

	public static class LogicalsContext extends ParserRuleContext {
		public TerminalNode LOGICAL_AND() { return getToken(ExprParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(ExprParser.LOGICAL_OR, 0); }
		public TerminalNode LOGICAL_NOT() { return getToken(ExprParser.LOGICAL_NOT, 0); }
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
		enterRule(_localctx, 50, RULE_logicals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGICAL_AND) | (1L << LOGICAL_OR) | (1L << LOGICAL_NOT))) != 0)) ) {
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
		"\u0004\u0001*\u0159\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003"+
		"\n\u0003\f\u0003Z\t\u0003\u0001\u0004\u0001\u0004\u0005\u0004^\b\u0004"+
		"\n\u0004\f\u0004a\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"l\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006s\b\u0006\n\u0006\f\u0006v\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006{\b\u0006\n\u0006\f\u0006~\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u0086\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u008b\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0004\t\u0092\b\t\u000b\t\f\t\u0093\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009e\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00a9"+
		"\b\n\n\n\f\n\u00ac\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u00b3\b\n\n\n\f\n\u00b6\t\n\u0001\n\u0001\n\u0003\n\u00ba\b\n\u0001\n"+
		"\u0001\n\u0005\n\u00be\b\n\n\n\f\n\u00c1\t\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00c7\b\n\n\n\f\n\u00ca\t\n\u0001\n\u0001\n\u0005\n\u00ce\b"+
		"\n\n\n\f\n\u00d1\t\n\u0003\n\u00d3\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e1\b\u000b\n\u000b"+
		"\f\u000b\u00e4\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00ea\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00f5\b\u000b\n\u000b\f\u000b\u00f8\t\u000b\u0003\u000b\u00fa\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0103"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u010b\b\r"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u0110\b\r\n\r\f\r\u0113\t\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0118\b\r\u0005\r\u011a\b\r\n\r\f\r\u011d\t\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0127\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u012d\b\u0010\n\u0010\f\u0010\u0130\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u0135\b\u0011\u000b\u0011\f"+
		"\u0011\u0136\u0001\u0012\u0004\u0012\u013a\b\u0012\u000b\u0012\f\u0012"+
		"\u013b\u0001\u0012\u0001\u0012\u0004\u0012\u0140\b\u0012\u000b\u0012\f"+
		"\u0012\u0141\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0004\u0016\u014f\b\u0016\u000b\u0016\f\u0016\u0150\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0000"+
		"\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0006\u0001\u0000\u001e!\u0001"+
		"\u0000#$\u0001\u0000\u001c\u001d\u0002\u0000\u000e\u000e&)\u0001\u0000"+
		"\u000e\u0014\u0001\u0000\u0015\u0017\u0177\u00004\u0001\u0000\u0000\u0000"+
		"\u0002=\u0001\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006P"+
		"\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\nk\u0001\u0000\u0000"+
		"\u0000\fm\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000"+
		"\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u008c\u0001\u0000\u0000\u0000"+
		"\u0014\u00d2\u0001\u0000\u0000\u0000\u0016\u00f9\u0001\u0000\u0000\u0000"+
		"\u0018\u00fb\u0001\u0000\u0000\u0000\u001a\u0106\u0001\u0000\u0000\u0000"+
		"\u001c\u0120\u0001\u0000\u0000\u0000\u001e\u0126\u0001\u0000\u0000\u0000"+
		" \u0128\u0001\u0000\u0000\u0000\"\u0134\u0001\u0000\u0000\u0000$\u0139"+
		"\u0001\u0000\u0000\u0000&\u0143\u0001\u0000\u0000\u0000(\u0145\u0001\u0000"+
		"\u0000\u0000*\u0148\u0001\u0000\u0000\u0000,\u014e\u0001\u0000\u0000\u0000"+
		".\u0152\u0001\u0000\u0000\u00000\u0154\u0001\u0000\u0000\u00002\u0156"+
		"\u0001\u0000\u0000\u000045\u0003(\u0014\u000056\u0003*\u0015\u00006:\u0003"+
		"\u0002\u0001\u000079\u0003\u0004\u0002\u000087\u0001\u0000\u0000\u0000"+
		"9<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;\u0001\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005"+
		"\b\u0000\u0000>?\u0005\u0004\u0000\u0000?@\u0005\t\u0000\u0000@A\u0005"+
		"\n\u0000\u0000AB\u0003\b\u0004\u0000B\u0003\u0001\u0000\u0000\u0000CD"+
		"\u0005\b\u0000\u0000DE\u0003,\u0016\u0000EI\u0005\t\u0000\u0000FH\u0003"+
		"\u0006\u0003\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LM\u0005\n\u0000\u0000MN\u0003\u001c\u000e"+
		"\u0000NO\u0003\b\u0004\u0000O\u0005\u0001\u0000\u0000\u0000PQ\u0003,\u0016"+
		"\u0000QX\u0003\u001c\u000e\u0000RS\u0005\u0001\u0000\u0000ST\u0003,\u0016"+
		"\u0000TU\u0003\u001c\u000e\u0000UW\u0001\u0000\u0000\u0000VR\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[_\u0005\u000b\u0000\u0000\\^\u0003\n\u0005\u0000]\\\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bc\u0005\f\u0000\u0000c\t\u0001\u0000\u0000\u0000dl\u0003\u0014\n\u0000"+
		"el\u0003\f\u0006\u0000fl\u0003\u000e\u0007\u0000gl\u0003\u0018\f\u0000"+
		"hl\u0003\u001a\r\u0000il\u0003\u0012\t\u0000jl\u0003\u0016\u000b\u0000"+
		"kd\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000"+
		"\u0000kg\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000l\u000b\u0001\u0000\u0000\u0000"+
		"mn\u0005\u0018\u0000\u0000nt\u0003\u0010\b\u0000op\u00032\u0019\u0000"+
		"pq\u0003\u0010\b\u0000qs\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w|\u0003\b\u0004"+
		"\u0000xy\u0005\u0019\u0000\u0000y{\u0003\b\u0004\u0000zx\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\r\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\u001a\u0000\u0000\u0080\u0081\u0003\u0010\b\u0000\u0081\u0082"+
		"\u0003\b\u0004\u0000\u0082\u000f\u0001\u0000\u0000\u0000\u0083\u0086\u0003"+
		",\u0016\u0000\u0084\u0086\u0003\u001e\u000f\u0000\u0085\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u00030\u0018\u0000\u0088\u008b\u0003,\u0016\u0000"+
		"\u0089\u008b\u0003\u001e\u000f\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u0011\u0001\u0000\u0000\u0000"+
		"\u008c\u0091\u0005*\u0000\u0000\u008d\u0092\u0003\u001a\r\u0000\u008e"+
		"\u0092\u0003,\u0016\u0000\u008f\u0092\u0003\u001e\u000f\u0000\u0090\u0092"+
		"\u0003.\u0017\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0013\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\u001b\u0000\u0000\u0096\u0097\u0003"+
		",\u0016\u0000\u0097\u0098\u0003\u001c\u000e\u0000\u0098\u009d\u0005\r"+
		"\u0000\u0000\u0099\u009e\u0003\u001a\r\u0000\u009a\u009e\u0003\u001e\u000f"+
		"\u0000\u009b\u009e\u0003,\u0016\u0000\u009c\u009e\u0001\u0000\u0000\u0000"+
		"\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u00aa\u0001\u0000\u0000\u0000\u009f\u00a0\u0003.\u0017\u0000\u00a0"+
		"\u00a1\u0003\u001e\u000f\u0000\u00a1\u00a9\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0003.\u0017\u0000\u00a3\u00a4\u0003,\u0016\u0000\u00a4\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0003.\u0017\u0000\u00a6\u00a7\u0003\u001a"+
		"\r\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u009f\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00d3\u0001\u0000\u0000"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u001b\u0000"+
		"\u0000\u00ae\u00af\u0003,\u0016\u0000\u00af\u00b0\u0003\u001c\u000e\u0000"+
		"\u00b0\u00b4\u0005\r\u0000\u0000\u00b1\u00b3\u0005\u0017\u0000\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00ba\u0003&\u0013\u0000\u00b8\u00ba\u0003,\u0016\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00cf\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bf\u00032\u0019\u0000\u00bc\u00be\u0005\u0017"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0003&\u0013\u0000\u00c3\u00ce\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c8\u00032\u0019\u0000\u00c5\u00c7\u0005\u0017\u0000\u0000"+
		"\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0003,\u0016\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00cd\u00c4\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u0095\u0001\u0000\u0000\u0000\u00d2"+
		"\u00ad\u0001\u0000\u0000\u0000\u00d3\u0015\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0003,\u0016\u0000\u00d5\u00d6\u0005\r\u0000\u0000\u00d6\u00e2"+
		"\u0003\u001a\r\u0000\u00d7\u00d8\u0003.\u0017\u0000\u00d8\u00d9\u0003"+
		"\u001e\u000f\u0000\u00d9\u00e1\u0001\u0000\u0000\u0000\u00da\u00db\u0003"+
		".\u0017\u0000\u00db\u00dc\u0003,\u0016\u0000\u00dc\u00e1\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0003.\u0017\u0000\u00de\u00df\u0003\u001a\r\u0000"+
		"\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00d7\u0001\u0000\u0000\u0000"+
		"\u00e0\u00da\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00fa\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003,\u0016\u0000\u00e6"+
		"\u00e9\u0005\r\u0000\u0000\u00e7\u00ea\u0003\u001e\u000f\u0000\u00e8\u00ea"+
		"\u0003,\u0016\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00f6\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003"+
		".\u0017\u0000\u00ec\u00ed\u0003\u001e\u000f\u0000\u00ed\u00f5\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0003.\u0017\u0000\u00ef\u00f0\u0003,\u0016\u0000"+
		"\u00f0\u00f5\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003.\u0017\u0000\u00f2"+
		"\u00f3\u0003\u001a\r\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00eb"+
		"\u0001\u0000\u0000\u0000\u00f4\u00ee\u0001\u0000\u0000\u0000\u00f4\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00fa"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00d4"+
		"\u0001\u0000\u0000\u0000\u00f9\u00e5\u0001\u0000\u0000\u0000\u00fa\u0017"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0007\u0000\u0000\u00fc\u00fd"+
		"\u0005\"\u0000\u0000\u00fd\u00fe\u0005%\u0000\u0000\u00fe\u0102\u0005"+
		"\t\u0000\u0000\u00ff\u0103\u0003\u001a\r\u0000\u0100\u0103\u0003 \u0010"+
		"\u0000\u0101\u0103\u0003,\u0016\u0000\u0102\u00ff\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0005\n\u0000\u0000\u0105"+
		"\u0019\u0001\u0000\u0000\u0000\u0106\u0107\u0003,\u0016\u0000\u0107\u010a"+
		"\u0005\t\u0000\u0000\u0108\u010b\u0003,\u0016\u0000\u0109\u010b\u0003"+
		"\u001e\u000f\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001"+
		"\u0000\u0000\u0000\u010b\u0111\u0001\u0000\u0000\u0000\u010c\u0110\u0003"+
		".\u0017\u0000\u010d\u0110\u0003,\u0016\u0000\u010e\u0110\u0003\u001e\u000f"+
		"\u0000\u010f\u010c\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u011b\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0114\u0117\u0005\u0001\u0000\u0000\u0115\u0118\u0003,\u0016\u0000"+
		"\u0116\u0118\u0003\u001e\u000f\u0000\u0117\u0115\u0001\u0000\u0000\u0000"+
		"\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000"+
		"\u0119\u0114\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005\n\u0000\u0000\u011f\u001b\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0007\u0000\u0000\u0000\u0121\u001d\u0001\u0000\u0000\u0000\u0122"+
		"\u0127\u0003\"\u0011\u0000\u0123\u0127\u0003$\u0012\u0000\u0124\u0127"+
		"\u0003&\u0013\u0000\u0125\u0127\u0003 \u0010\u0000\u0126\u0122\u0001\u0000"+
		"\u0000\u0000\u0126\u0123\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000"+
		"\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u001f\u0001\u0000"+
		"\u0000\u0000\u0128\u012e\u0005\u0006\u0000\u0000\u0129\u012d\u0003,\u0016"+
		"\u0000\u012a\u012d\u0003.\u0017\u0000\u012b\u012d\u00030\u0018\u0000\u012c"+
		"\u0129\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012b\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e"+
		"\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0005\u0006\u0000\u0000\u0132!\u0001\u0000\u0000\u0000\u0133\u0135"+
		"\u0005\u001d\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0001\u0000\u0000\u0000\u0137#\u0001\u0000\u0000\u0000\u0138\u013a\u0005"+
		"\u001d\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
		"\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0005"+
		"\"\u0000\u0000\u013e\u0140\u0005\u001d\u0000\u0000\u013f\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142%\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0007\u0001\u0000\u0000\u0144\'\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0005\u0003\u0000\u0000\u0146\u0147\u0005\u0004\u0000\u0000"+
		"\u0147)\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u0005\u0000\u0000\u0149"+
		"\u014a\u0005\u0006\u0000\u0000\u014a\u014b\u0005\u0007\u0000\u0000\u014b"+
		"\u014c\u0005\u0006\u0000\u0000\u014c+\u0001\u0000\u0000\u0000\u014d\u014f"+
		"\u0007\u0002\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151-\u0001\u0000\u0000\u0000\u0152\u0153\u0007"+
		"\u0003\u0000\u0000\u0153/\u0001\u0000\u0000\u0000\u0154\u0155\u0007\u0004"+
		"\u0000\u0000\u01551\u0001\u0000\u0000\u0000\u0156\u0157\u0007\u0005\u0000"+
		"\u0000\u01573\u0001\u0000\u0000\u0000(:IX_kt|\u0085\u008a\u0091\u0093"+
		"\u009d\u00a8\u00aa\u00b4\u00b9\u00bf\u00c8\u00cd\u00cf\u00d2\u00e0\u00e2"+
		"\u00e9\u00f4\u00f6\u00f9\u0102\u010a\u010f\u0111\u0117\u011b\u0126\u012c"+
		"\u012e\u0136\u013b\u0141\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}