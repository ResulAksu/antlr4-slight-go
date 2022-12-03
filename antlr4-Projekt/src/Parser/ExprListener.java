// Generated from java-escape by ANTLR 4.11.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ExprParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ExprParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#mainCaller}.
	 * @param ctx the parse tree
	 */
	void enterMainCaller(ExprParser.MainCallerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#mainCaller}.
	 * @param ctx the parse tree
	 */
	void exitMainCaller(ExprParser.MainCallerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#methodCaller}.
	 * @param ctx the parse tree
	 */
	void enterMethodCaller(ExprParser.MethodCallerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#methodCaller}.
	 * @param ctx the parse tree
	 */
	void exitMethodCaller(ExprParser.MethodCallerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#methodMember}.
	 * @param ctx the parse tree
	 */
	void enterMethodMember(ExprParser.MethodMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#methodMember}.
	 * @param ctx the parse tree
	 */
	void exitMethodMember(ExprParser.MethodMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExprParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(ExprParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(ExprParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#if_and_or_else_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_and_or_else_expression(ExprParser.If_and_or_else_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#if_and_or_else_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_and_or_else_expression(ExprParser.If_and_or_else_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(ExprParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(ExprParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#bool_statement}.
	 * @param ctx the parse tree
	 */
	void enterBool_statement(ExprParser.Bool_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#bool_statement}.
	 * @param ctx the parse tree
	 */
	void exitBool_statement(ExprParser.Bool_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#returner}.
	 * @param ctx the parse tree
	 */
	void enterReturner(ExprParser.ReturnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#returner}.
	 * @param ctx the parse tree
	 */
	void exitReturner(ExprParser.ReturnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#localvariableInit}.
	 * @param ctx the parse tree
	 */
	void enterLocalvariableInit(ExprParser.LocalvariableInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#localvariableInit}.
	 * @param ctx the parse tree
	 */
	void exitLocalvariableInit(ExprParser.LocalvariableInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#variableVis}.
	 * @param ctx the parse tree
	 */
	void enterVariableVis(ExprParser.VariableVisContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#variableVis}.
	 * @param ctx the parse tree
	 */
	void exitVariableVis(ExprParser.VariableVisContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#printCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintCall(ExprParser.PrintCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#printCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintCall(ExprParser.PrintCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ExprParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ExprParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExprParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExprParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#typeProduction}.
	 * @param ctx the parse tree
	 */
	void enterTypeProduction(ExprParser.TypeProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#typeProduction}.
	 * @param ctx the parse tree
	 */
	void exitTypeProduction(ExprParser.TypeProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void enterStringliteral(ExprParser.StringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void exitStringliteral(ExprParser.StringliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#intliteral}.
	 * @param ctx the parse tree
	 */
	void enterIntliteral(ExprParser.IntliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#intliteral}.
	 * @param ctx the parse tree
	 */
	void exitIntliteral(ExprParser.IntliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#floatliteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatliteral(ExprParser.FloatliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#floatliteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatliteral(ExprParser.FloatliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#boolliteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolliteral(ExprParser.BoolliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#boolliteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolliteral(ExprParser.BoolliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#packageProdcution}.
	 * @param ctx the parse tree
	 */
	void enterPackageProdcution(ExprParser.PackageProdcutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#packageProdcution}.
	 * @param ctx the parse tree
	 */
	void exitPackageProdcution(ExprParser.PackageProdcutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#importProduction}.
	 * @param ctx the parse tree
	 */
	void enterImportProduction(ExprParser.ImportProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#importProduction}.
	 * @param ctx the parse tree
	 */
	void exitImportProduction(ExprParser.ImportProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#nameGiver}.
	 * @param ctx the parse tree
	 */
	void enterNameGiver(ExprParser.NameGiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#nameGiver}.
	 * @param ctx the parse tree
	 */
	void exitNameGiver(ExprParser.NameGiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#arithmetics}.
	 * @param ctx the parse tree
	 */
	void enterArithmetics(ExprParser.ArithmeticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#arithmetics}.
	 * @param ctx the parse tree
	 */
	void exitArithmetics(ExprParser.ArithmeticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#booleans}.
	 * @param ctx the parse tree
	 */
	void enterBooleans(ExprParser.BooleansContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#booleans}.
	 * @param ctx the parse tree
	 */
	void exitBooleans(ExprParser.BooleansContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#logicals}.
	 * @param ctx the parse tree
	 */
	void enterLogicals(ExprParser.LogicalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#logicals}.
	 * @param ctx the parse tree
	 */
	void exitLogicals(ExprParser.LogicalsContext ctx);
}