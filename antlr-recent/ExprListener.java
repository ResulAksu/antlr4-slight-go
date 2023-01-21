// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Expr}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Expr#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Expr.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Expr.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#methodCaller}.
	 * @param ctx the parse tree
	 */
	void enterMethodCaller(Expr.MethodCallerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#methodCaller}.
	 * @param ctx the parse tree
	 */
	void exitMethodCaller(Expr.MethodCallerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#methodMember}.
	 * @param ctx the parse tree
	 */
	void enterMethodMember(Expr.MethodMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#methodMember}.
	 * @param ctx the parse tree
	 */
	void exitMethodMember(Expr.MethodMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Expr.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Expr.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(Expr.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(Expr.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Expr.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Expr.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#stringliteral}.
	 * @param ctx the parse tree
	 */
	void enterStringliteral(Expr.StringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#stringliteral}.
	 * @param ctx the parse tree
	 */
	void exitStringliteral(Expr.StringliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#if_and_or_else_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_and_or_else_expression(Expr.If_and_or_else_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#if_and_or_else_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_and_or_else_expression(Expr.If_and_or_else_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(Expr.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(Expr.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#returner}.
	 * @param ctx the parse tree
	 */
	void enterReturner(Expr.ReturnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#returner}.
	 * @param ctx the parse tree
	 */
	void exitReturner(Expr.ReturnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#localvariableInit}.
	 * @param ctx the parse tree
	 */
	void enterLocalvariableInit(Expr.LocalvariableInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#localvariableInit}.
	 * @param ctx the parse tree
	 */
	void exitLocalvariableInit(Expr.LocalvariableInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Expr.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Expr.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(Expr.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(Expr.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#printCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintCall(Expr.PrintCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#printCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintCall(Expr.PrintCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(Expr.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(Expr.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Expr.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Expr.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#nameGiver}.
	 * @param ctx the parse tree
	 */
	void enterNameGiver(Expr.NameGiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#nameGiver}.
	 * @param ctx the parse tree
	 */
	void exitNameGiver(Expr.NameGiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#typeProduction}.
	 * @param ctx the parse tree
	 */
	void enterTypeProduction(Expr.TypeProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#typeProduction}.
	 * @param ctx the parse tree
	 */
	void exitTypeProduction(Expr.TypeProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#intliteral}.
	 * @param ctx the parse tree
	 */
	void enterIntliteral(Expr.IntliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#intliteral}.
	 * @param ctx the parse tree
	 */
	void exitIntliteral(Expr.IntliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#floatliteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatliteral(Expr.FloatliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#floatliteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatliteral(Expr.FloatliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#boolliteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolliteral(Expr.BoolliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#boolliteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolliteral(Expr.BoolliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#packageProdcution}.
	 * @param ctx the parse tree
	 */
	void enterPackageProdcution(Expr.PackageProdcutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#packageProdcution}.
	 * @param ctx the parse tree
	 */
	void exitPackageProdcution(Expr.PackageProdcutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#importProduction}.
	 * @param ctx the parse tree
	 */
	void enterImportProduction(Expr.ImportProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#importProduction}.
	 * @param ctx the parse tree
	 */
	void exitImportProduction(Expr.ImportProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Expr#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(Expr.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link Expr#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(Expr.EofContext ctx);
}