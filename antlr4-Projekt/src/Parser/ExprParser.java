// Generated from C:/Users/resul/Desktop/all/compilerbau antlr/src/antlr\Expr.g4 by ANTLR 4.10.1
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
		RULE_compilationUnit = 0, RULE_methodCaller = 1, RULE_methodMember = 2, 
		RULE_block = 3, RULE_blockStatements = 4, RULE_if_and_or_else_expression = 5, 
		RULE_for_loop = 6, RULE_bool_statement = 7, RULE_returner = 8, RULE_localvariableCaller = 9, 
		RULE_printCall = 10, RULE_methodCall = 11, RULE_type = 12, RULE_typeProduction = 13, 
		RULE_stringliteral = 14, RULE_intliteral = 15, RULE_floatliteral = 16, 
		RULE_boolliteral = 17, RULE_packageProdcution = 18, RULE_importProduction = 19, 
		RULE_nameGiver = 20, RULE_arithmetics = 21, RULE_booleans = 22, RULE_logicals = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "methodCaller", "methodMember", "block", "blockStatements", 
			"if_and_or_else_expression", "for_loop", "bool_statement", "returner", 
			"localvariableCaller", "printCall", "methodCall", "type", "typeProduction", 
			"stringliteral", "intliteral", "floatliteral", "boolliteral", "packageProdcution", 
			"importProduction", "nameGiver", "arithmetics", "booleans", "logicals"
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public PackageProdcutionContext packageProdcution() {
			return getRuleContext(PackageProdcutionContext.class,0);
		}
		public ImportProductionContext importProduction() {
			return getRuleContext(ImportProductionContext.class,0);
		}
		public List<MethodCallerContext> methodCaller() {
			return getRuleContexts(MethodCallerContext.class);
		}
		public MethodCallerContext methodCaller(int i) {
			return getRuleContext(MethodCallerContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			packageProdcution();
			setState(49);
			importProduction();
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				methodCaller();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC );
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
		public TerminalNode MAIN() { return getToken(ExprParser.MAIN, 0); }
		public TerminalNode LEFTPAR() { return getToken(ExprParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(ExprParser.RIGHTPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NameGiverContext nameGiver() {
			return getRuleContext(NameGiverContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 2, RULE_methodCaller);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(FUNC);
				setState(56);
				match(MAIN);
				setState(57);
				match(LEFTPAR);
				setState(58);
				match(RIGHTPAR);
				setState(59);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(FUNC);
				setState(61);
				nameGiver();
				setState(62);
				match(LEFTPAR);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LETTER || _la==DIGITINCL) {
					{
					{
					setState(63);
					methodMember();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(RIGHTPAR);
				setState(70);
				type();
				setState(71);
				block();
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
		enterRule(_localctx, 4, RULE_methodMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			nameGiver();
			setState(76);
			type();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(77);
				match(T__0);
				setState(78);
				nameGiver();
				setState(79);
				type();
				}
				}
				setState(85);
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
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(LEFTBRACE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FMT) | (1L << IF_TOKEN) | (1L << FOR_TOKEN) | (1L << VAR) | (1L << LETTER) | (1L << DIGITINCL) | (1L << RETURN))) != 0)) {
				{
				{
				setState(87);
				blockStatements();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
		public LocalvariableCallerContext localvariableCaller() {
			return getRuleContext(LocalvariableCallerContext.class,0);
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
		enterRule(_localctx, 8, RULE_blockStatements);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				localvariableCaller();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				if_and_or_else_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				printCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				methodCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				returner();
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
		enterRule(_localctx, 10, RULE_if_and_or_else_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IF_TOKEN);
			setState(104);
			bool_statement();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOGICAL_AND) | (1L << LOGICAL_OR) | (1L << LOGICAL_NOT))) != 0)) {
				{
				{
				setState(105);
				logicals();
				setState(106);
				bool_statement();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			block();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_TOKEN) {
				{
				{
				setState(114);
				match(ELSE_TOKEN);
				setState(115);
				block();
				}
				}
				setState(120);
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
		enterRule(_localctx, 12, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FOR_TOKEN);
			setState(122);
			bool_statement();
			setState(123);
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
		enterRule(_localctx, 14, RULE_bool_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(125);
				nameGiver();
				}
				break;
			case 2:
				{
				setState(126);
				typeProduction();
				}
				break;
			}
			setState(129);
			booleans();
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(130);
				nameGiver();
				}
				break;
			case 2:
				{
				setState(131);
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
		enterRule(_localctx, 16, RULE_returner);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(RETURN);
			setState(139); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(135);
						methodCall();
						}
						break;
					case 2:
						{
						setState(136);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(137);
						typeProduction();
						}
						break;
					case 4:
						{
						setState(138);
						arithmetics();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class LocalvariableCallerContext extends ParserRuleContext {
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
		public LocalvariableCallerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localvariableCaller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLocalvariableCaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLocalvariableCaller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprVisitor ) return ((ExprVisitor<? extends T>)visitor).visitLocalvariableCaller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalvariableCallerContext localvariableCaller() throws RecognitionException {
		LocalvariableCallerContext _localctx = new LocalvariableCallerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_localvariableCaller);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(VAR);
				setState(144);
				nameGiver();
				setState(145);
				type();
				setState(146);
				match(ASSERT);
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(147);
					typeProduction();
					}
					break;
				case 2:
					{
					setState(148);
					nameGiver();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				nameGiver();
				setState(152);
				match(ASSERT);
				setState(153);
				methodCall();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
					{
					setState(163);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(154);
						arithmetics();
						setState(155);
						typeProduction();
						}
						break;
					case 2:
						{
						setState(157);
						arithmetics();
						setState(158);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(160);
						arithmetics();
						setState(161);
						methodCall();
						}
						break;
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				nameGiver();
				setState(169);
				match(ASSERT);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(170);
					typeProduction();
					}
					break;
				case 2:
					{
					setState(171);
					nameGiver();
					}
					break;
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(174);
						arithmetics();
						setState(175);
						typeProduction();
						}
						break;
					case 2:
						{
						setState(177);
						arithmetics();
						setState(178);
						nameGiver();
						}
						break;
					case 3:
						{
						setState(180);
						arithmetics();
						setState(181);
						methodCall();
						}
						break;
					}
					}
					setState(187);
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
		enterRule(_localctx, 20, RULE_printCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(FMT);
			setState(191);
			match(DOT);
			setState(192);
			match(PRINT_LN);
			setState(193);
			match(LEFTPAR);
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(194);
				methodCall();
				}
				break;
			case 2:
				{
				setState(195);
				stringliteral();
				}
				break;
			case 3:
				{
				setState(196);
				nameGiver();
				}
				break;
			}
			setState(199);
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
		enterRule(_localctx, 22, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			nameGiver();
			setState(202);
			match(LEFTPAR);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(203);
				nameGiver();
				}
				break;
			case 2:
				{
				setState(204);
				typeProduction();
				}
				break;
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTATIONS) | (1L << MODULO) | (1L << LETTER) | (1L << DIGITINCL) | (1L << TRUE) | (1L << FALSE) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(207);
					arithmetics();
					}
					break;
				case 2:
					{
					setState(208);
					nameGiver();
					}
					break;
				case 3:
					{
					setState(209);
					typeProduction();
					}
					break;
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(215);
				match(T__0);
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(216);
					nameGiver();
					}
					break;
				case 2:
					{
					setState(217);
					typeProduction();
					}
					break;
				}
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
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
		public TerminalNode BOOLEAN() { return getToken(ExprParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		enterRule(_localctx, 26, RULE_typeProduction);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				intliteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				floatliteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				boolliteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
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
		enterRule(_localctx, 28, RULE_stringliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(NOTATIONS);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODULO) | (1L << EQUALS) | (1L << SMALLER) | (1L << SMALLER_OR_EQUAL) | (1L << GREATER) | (1L << GREATER_OR_EQUAL) | (1L << NOT_EQUAL) | (1L << LETTER) | (1L << DIGITINCL) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(236);
					nameGiver();
					}
					break;
				case 2:
					{
					setState(237);
					arithmetics();
					}
					break;
				case 3:
					{
					setState(238);
					booleans();
					}
					break;
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
		public List<ArithmeticsContext> arithmetics() {
			return getRuleContexts(ArithmeticsContext.class);
		}
		public ArithmeticsContext arithmetics(int i) {
			return getRuleContext(ArithmeticsContext.class,i);
		}
		public List<NameGiverContext> nameGiver() {
			return getRuleContexts(NameGiverContext.class);
		}
		public NameGiverContext nameGiver(int i) {
			return getRuleContext(NameGiverContext.class,i);
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
		enterRule(_localctx, 30, RULE_intliteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(246);
					match(DIGITINCL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(249); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(251);
						arithmetics();
						setState(252);
						match(DIGITINCL);
						}
						break;
					case 2:
						{
						setState(254);
						arithmetics();
						setState(255);
						nameGiver();
						}
						break;
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class FloatliteralContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ExprParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ExprParser.DOT, i);
		}
		public List<TerminalNode> DIGITINCL() { return getTokens(ExprParser.DIGITINCL); }
		public TerminalNode DIGITINCL(int i) {
			return getToken(ExprParser.DIGITINCL, i);
		}
		public List<ArithmeticsContext> arithmetics() {
			return getRuleContexts(ArithmeticsContext.class);
		}
		public ArithmeticsContext arithmetics(int i) {
			return getRuleContext(ArithmeticsContext.class,i);
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
		enterRule(_localctx, 32, RULE_floatliteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				match(DIGITINCL);
				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITINCL );
			setState(267);
			match(DOT);
			setState(269); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(268);
					match(DIGITINCL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(271); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					arithmetics();
					setState(275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(274);
						match(DIGITINCL);
						}
						}
						setState(277); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DIGITINCL );
					setState(279);
					match(DOT);
					setState(281); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(280);
							match(DIGITINCL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(283); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class BoolliteralContext extends ParserRuleContext {
		public List<TerminalNode> TRUE() { return getTokens(ExprParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(ExprParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(ExprParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(ExprParser.FALSE, i);
		}
		public List<LogicalsContext> logicals() {
			return getRuleContexts(LogicalsContext.class);
		}
		public LogicalsContext logicals(int i) {
			return getRuleContext(LogicalsContext.class,i);
		}
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
		enterRule(_localctx, 34, RULE_boolliteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291);
					logicals();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
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
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 36, RULE_packageProdcution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(PACKAGE);
			setState(304);
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
		enterRule(_localctx, 38, RULE_importProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IMPORT);
			setState(307);
			match(NOTATIONS);
			setState(308);
			match(FMT);
			setState(309);
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
		enterRule(_localctx, 40, RULE_nameGiver);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(311);
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
				setState(314); 
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
		enterRule(_localctx, 42, RULE_arithmetics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		enterRule(_localctx, 44, RULE_booleans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		enterRule(_localctx, 46, RULE_logicals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
		"\u0004\u0001*\u0143\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002R\b\u0002\n\u0002\f\u0002U\t\u0002\u0001\u0003\u0001\u0003\u0005"+
		"\u0003Y\b\u0003\n\u0003\f\u0003\\\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004f\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005p\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005u\b\u0005\n\u0005\f\u0005x\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0080\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0085"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u008c\b\b\u000b"+
		"\b\f\b\u008d\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0096"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a4\b\t\n\t\f\t\u00a7\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u00ad\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b8\b\t\n\t\f\t\u00bb"+
		"\t\t\u0003\t\u00bd\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00c6\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00ce\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00d3\b\u000b\n\u000b\f\u000b\u00d6\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00db\b\u000b\u0005\u000b\u00dd\b"+
		"\u000b\n\u000b\f\u000b\u00e0\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ea\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00f0\b\u000e\n\u000e\f\u000e"+
		"\u00f3\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u00f8\b"+
		"\u000f\u000b\u000f\f\u000f\u00f9\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0102\b\u000f\n\u000f\f\u000f"+
		"\u0105\t\u000f\u0001\u0010\u0004\u0010\u0108\b\u0010\u000b\u0010\f\u0010"+
		"\u0109\u0001\u0010\u0001\u0010\u0004\u0010\u010e\b\u0010\u000b\u0010\f"+
		"\u0010\u010f\u0001\u0010\u0001\u0010\u0004\u0010\u0114\b\u0010\u000b\u0010"+
		"\f\u0010\u0115\u0001\u0010\u0001\u0010\u0004\u0010\u011a\b\u0010\u000b"+
		"\u0010\f\u0010\u011b\u0005\u0010\u011e\b\u0010\n\u0010\f\u0010\u0121\t"+
		"\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0125\b\u0011\n\u0011\f\u0011"+
		"\u0128\t\u0011\u0001\u0011\u0005\u0011\u012b\b\u0011\n\u0011\f\u0011\u012e"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0004\u0014\u0139\b\u0014\u000b"+
		"\u0014\f\u0014\u013a\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"\u0000\u0006\u0001\u0000\u001e!\u0001\u0000#$\u0001\u0000\u001c\u001d"+
		"\u0002\u0000\u000e\u000e&)\u0001\u0000\u000e\u0014\u0001\u0000\u0015\u0017"+
		"\u015f\u00000\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004"+
		"K\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\be\u0001\u0000"+
		"\u0000\u0000\ng\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000\u000e"+
		"\u007f\u0001\u0000\u0000\u0000\u0010\u0086\u0001\u0000\u0000\u0000\u0012"+
		"\u00bc\u0001\u0000\u0000\u0000\u0014\u00be\u0001\u0000\u0000\u0000\u0016"+
		"\u00c9\u0001\u0000\u0000\u0000\u0018\u00e3\u0001\u0000\u0000\u0000\u001a"+
		"\u00e9\u0001\u0000\u0000\u0000\u001c\u00eb\u0001\u0000\u0000\u0000\u001e"+
		"\u00f7\u0001\u0000\u0000\u0000 \u0107\u0001\u0000\u0000\u0000\"\u0122"+
		"\u0001\u0000\u0000\u0000$\u012f\u0001\u0000\u0000\u0000&\u0132\u0001\u0000"+
		"\u0000\u0000(\u0138\u0001\u0000\u0000\u0000*\u013c\u0001\u0000\u0000\u0000"+
		",\u013e\u0001\u0000\u0000\u0000.\u0140\u0001\u0000\u0000\u000001\u0003"+
		"$\u0012\u000013\u0003&\u0013\u000024\u0003\u0002\u0001\u000032\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\u0001\u0001\u0000\u0000\u000078\u0005\b\u0000\u0000"+
		"89\u0005\u0004\u0000\u00009:\u0005\t\u0000\u0000:;\u0005\n\u0000\u0000"+
		";J\u0003\u0006\u0003\u0000<=\u0005\b\u0000\u0000=>\u0003(\u0014\u0000"+
		">B\u0005\t\u0000\u0000?A\u0003\u0004\u0002\u0000@?\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005\n\u0000"+
		"\u0000FG\u0003\u0018\f\u0000GH\u0003\u0006\u0003\u0000HJ\u0001\u0000\u0000"+
		"\u0000I7\u0001\u0000\u0000\u0000I<\u0001\u0000\u0000\u0000J\u0003\u0001"+
		"\u0000\u0000\u0000KL\u0003(\u0014\u0000LS\u0003\u0018\f\u0000MN\u0005"+
		"\u0001\u0000\u0000NO\u0003(\u0014\u0000OP\u0003\u0018\f\u0000PR\u0001"+
		"\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0005\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000VZ\u0005\u000b\u0000\u0000WY\u0003"+
		"\b\u0004\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX"+
		"\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\f\u0000\u0000^\u0007\u0001\u0000"+
		"\u0000\u0000_f\u0003\u0012\t\u0000`f\u0003\n\u0005\u0000af\u0003\f\u0006"+
		"\u0000bf\u0003\u0014\n\u0000cf\u0003\u0016\u000b\u0000df\u0003\u0010\b"+
		"\u0000e_\u0001\u0000\u0000\u0000e`\u0001\u0000\u0000\u0000ea\u0001\u0000"+
		"\u0000\u0000eb\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ed\u0001"+
		"\u0000\u0000\u0000f\t\u0001\u0000\u0000\u0000gh\u0005\u0018\u0000\u0000"+
		"hn\u0003\u000e\u0007\u0000ij\u0003.\u0017\u0000jk\u0003\u000e\u0007\u0000"+
		"km\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000qv\u0003\u0006\u0003\u0000rs\u0005"+
		"\u0019\u0000\u0000su\u0003\u0006\u0003\u0000tr\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000w\u000b\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005"+
		"\u001a\u0000\u0000z{\u0003\u000e\u0007\u0000{|\u0003\u0006\u0003\u0000"+
		"|\r\u0001\u0000\u0000\u0000}\u0080\u0003(\u0014\u0000~\u0080\u0003\u001a"+
		"\r\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084\u0003,\u0016\u0000\u0082"+
		"\u0085\u0003(\u0014\u0000\u0083\u0085\u0003\u001a\r\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u000f"+
		"\u0001\u0000\u0000\u0000\u0086\u008b\u0005*\u0000\u0000\u0087\u008c\u0003"+
		"\u0016\u000b\u0000\u0088\u008c\u0003(\u0014\u0000\u0089\u008c\u0003\u001a"+
		"\r\u0000\u008a\u008c\u0003*\u0015\u0000\u008b\u0087\u0001\u0000\u0000"+
		"\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u0011\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001b\u0000"+
		"\u0000\u0090\u0091\u0003(\u0014\u0000\u0091\u0092\u0003\u0018\f\u0000"+
		"\u0092\u0095\u0005\r\u0000\u0000\u0093\u0096\u0003\u001a\r\u0000\u0094"+
		"\u0096\u0003(\u0014\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u00bd\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0003(\u0014\u0000\u0098\u0099\u0005\r\u0000\u0000\u0099\u00a5\u0003"+
		"\u0016\u000b\u0000\u009a\u009b\u0003*\u0015\u0000\u009b\u009c\u0003\u001a"+
		"\r\u0000\u009c\u00a4\u0001\u0000\u0000\u0000\u009d\u009e\u0003*\u0015"+
		"\u0000\u009e\u009f\u0003(\u0014\u0000\u009f\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0003*\u0015\u0000\u00a1\u00a2\u0003\u0016\u000b\u0000\u00a2"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a3\u009a\u0001\u0000\u0000\u0000\u00a3"+
		"\u009d\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00bd\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003(\u0014\u0000\u00a9\u00ac"+
		"\u0005\r\u0000\u0000\u00aa\u00ad\u0003\u001a\r\u0000\u00ab\u00ad\u0003"+
		"(\u0014\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b9\u0001\u0000\u0000\u0000\u00ae\u00af\u0003*\u0015"+
		"\u0000\u00af\u00b0\u0003\u001a\r\u0000\u00b0\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0003*\u0015\u0000\u00b2\u00b3\u0003(\u0014\u0000\u00b3\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003*\u0015\u0000\u00b5\u00b6\u0003"+
		"\u0016\u000b\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u008f\u0001"+
		"\u0000\u0000\u0000\u00bc\u0097\u0001\u0000\u0000\u0000\u00bc\u00a8\u0001"+
		"\u0000\u0000\u0000\u00bd\u0013\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"\u0007\u0000\u0000\u00bf\u00c0\u0005\"\u0000\u0000\u00c0\u00c1\u0005%"+
		"\u0000\u0000\u00c1\u00c5\u0005\t\u0000\u0000\u00c2\u00c6\u0003\u0016\u000b"+
		"\u0000\u00c3\u00c6\u0003\u001c\u000e\u0000\u00c4\u00c6\u0003(\u0014\u0000"+
		"\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005\n\u0000\u0000\u00c8\u0015\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0003(\u0014\u0000\u00ca\u00cd\u0005\t\u0000\u0000\u00cb\u00ce"+
		"\u0003(\u0014\u0000\u00cc\u00ce\u0003\u001a\r\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d4\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d3\u0003*\u0015\u0000\u00d0\u00d3\u0003(\u0014"+
		"\u0000\u00d1\u00d3\u0003\u001a\r\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00de\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da\u0005\u0001\u0000\u0000"+
		"\u00d8\u00db\u0003(\u0014\u0000\u00d9\u00db\u0003\u001a\r\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\n\u0000\u0000\u00e2\u0017"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0007\u0000\u0000\u0000\u00e4\u0019"+
		"\u0001\u0000\u0000\u0000\u00e5\u00ea\u0003\u001e\u000f\u0000\u00e6\u00ea"+
		"\u0003 \u0010\u0000\u00e7\u00ea\u0003\"\u0011\u0000\u00e8\u00ea\u0003"+
		"\u001c\u000e\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u001b\u0001\u0000\u0000\u0000\u00eb\u00f1\u0005"+
		"\u0006\u0000\u0000\u00ec\u00f0\u0003(\u0014\u0000\u00ed\u00f0\u0003*\u0015"+
		"\u0000\u00ee\u00f0\u0003,\u0016\u0000\u00ef\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0006\u0000\u0000"+
		"\u00f5\u001d\u0001\u0000\u0000\u0000\u00f6\u00f8\u0005\u001d\u0000\u0000"+
		"\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u0103\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003*\u0015\u0000\u00fc"+
		"\u00fd\u0005\u001d\u0000\u0000\u00fd\u0102\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0003*\u0015\u0000\u00ff\u0100\u0003(\u0014\u0000\u0100\u0102\u0001"+
		"\u0000\u0000\u0000\u0101\u00fb\u0001\u0000\u0000\u0000\u0101\u00fe\u0001"+
		"\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u001f\u0001"+
		"\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0108\u0005"+
		"\u001d\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0005"+
		"\"\u0000\u0000\u010c\u010e\u0005\u001d\u0000\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u011f\u0001\u0000"+
		"\u0000\u0000\u0111\u0113\u0003*\u0015\u0000\u0112\u0114\u0005\u001d\u0000"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0005\"\u0000\u0000"+
		"\u0118\u011a\u0005\u001d\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000"+
		"\u011d\u0111\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120!\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122"+
		"\u0126\u0007\u0001\u0000\u0000\u0123\u0125\u0003.\u0017\u0000\u0124\u0123"+
		"\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u012c"+
		"\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012b"+
		"\u0007\u0001\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012e"+
		"\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0001\u0000\u0000\u0000\u012d#\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0005\u0003\u0000\u0000\u0130\u0131\u0005"+
		"\u0004\u0000\u0000\u0131%\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0005"+
		"\u0000\u0000\u0133\u0134\u0005\u0006\u0000\u0000\u0134\u0135\u0005\u0007"+
		"\u0000\u0000\u0135\u0136\u0005\u0006\u0000\u0000\u0136\'\u0001\u0000\u0000"+
		"\u0000\u0137\u0139\u0007\u0002\u0000\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b)\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0007\u0003\u0000\u0000\u013d+\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0007\u0004\u0000\u0000\u013f-\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0007\u0005\u0000\u0000\u0141/\u0001\u0000\u0000\u0000\'5BISZenv\u007f"+
		"\u0084\u008b\u008d\u0095\u00a3\u00a5\u00ac\u00b7\u00b9\u00bc\u00c5\u00cd"+
		"\u00d2\u00d4\u00da\u00de\u00e9\u00ef\u00f1\u00f9\u0101\u0103\u0109\u010f"+
		"\u0115\u011b\u011f\u0126\u012c\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}