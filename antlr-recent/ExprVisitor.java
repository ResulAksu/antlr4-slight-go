// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Expr}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Expr#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Expr.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#methodCaller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCaller(Expr.MethodCallerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#methodMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodMember(Expr.MethodMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Expr.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(Expr.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(Expr.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#stringliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringliteral(Expr.StringliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#if_and_or_else_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_and_or_else_expression(Expr.If_and_or_else_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(Expr.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#returner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturner(Expr.ReturnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#localvariableInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalvariableInit(Expr.LocalvariableInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Expr.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(Expr.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#printCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCall(Expr.PrintCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(Expr.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(Expr.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#nameGiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameGiver(Expr.NameGiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#typeProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProduction(Expr.TypeProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#intliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntliteral(Expr.IntliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#floatliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatliteral(Expr.FloatliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#boolliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolliteral(Expr.BoolliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#packageProdcution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageProdcution(Expr.PackageProdcutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#importProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportProduction(Expr.ImportProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Expr#eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(Expr.EofContext ctx);
}