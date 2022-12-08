// Generated from C:/Users/resul/Desktop/all/antlr4-Projekt/antlr4-slight-go/antlr4-Projekt/src/antlr\Expr.g4 by ANTLR 4.10.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#mainCaller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainCaller(ExprParser.MainCallerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#methodCaller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCaller(ExprParser.MethodCallerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#methodMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodMember(ExprParser.MethodMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ExprParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(ExprParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#if_and_or_else_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_and_or_else_expression(ExprParser.If_and_or_else_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(ExprParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#returner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturner(ExprParser.ReturnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#localvariableInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalvariableInit(ExprParser.LocalvariableInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#boolCollector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCollector(ExprParser.BoolCollectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#variableVis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableVis(ExprParser.VariableVisContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#printCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCall(ExprParser.PrintCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ExprParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(ExprParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#boolStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolStat(ExprParser.BoolStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExprParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#second_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_type(ExprParser.Second_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#typeProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProduction(ExprParser.TypeProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stringliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringliteral(ExprParser.StringliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#intliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntliteral(ExprParser.IntliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#floatliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatliteral(ExprParser.FloatliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#boolliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolliteral(ExprParser.BoolliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#packageProdcution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageProdcution(ExprParser.PackageProdcutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#importProduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportProduction(ExprParser.ImportProductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#nameGiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameGiver(ExprParser.NameGiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#onlyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyName(ExprParser.OnlyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#arithmetics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetics(ExprParser.ArithmeticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#booleans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleans(ExprParser.BooleansContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#logicals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicals(ExprParser.LogicalsContext ctx);
}