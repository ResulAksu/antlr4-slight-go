package exp;


import Parser.ExprBaseVisitor;
import Parser.ExprParser;
import org.antlr.v4.runtime.Token;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;

public class AntlrToExpr extends ExprBaseVisitor<Expression> {

    private List<String> vars = new ArrayList<>();  //stores the variables declared
    private List<String> semanticErrors = new ArrayList<>(); // 1.duplicate or 2.reference undeclared

    @Override
    public Expression visitMethodCaller(ExprParser.MethodCallerContext ctx) {
        return super.visitMethodCaller(ctx);
    }

    @Override
    public Expression visitMethodMember(ExprParser.MethodMemberContext ctx) {
        return super.visitMethodMember(ctx);
    }

    @Override
    public Expression visitBlock(ExprParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Expression visitBlockStatements(ExprParser.BlockStatementsContext ctx) {
        return super.visitBlockStatements(ctx);
    }

    @Override
    public Expression visitIf_and_or_else_expression(ExprParser.If_and_or_else_expressionContext ctx) {
        return super.visitIf_and_or_else_expression(ctx);
    }

    @Override
    public Expression visitFor_loop(ExprParser.For_loopContext ctx) {
        return super.visitFor_loop(ctx);
    }

    @Override
    public Expression visitBool_statement(ExprParser.Bool_statementContext ctx) {
        return super.visitBool_statement(ctx);
    }

    @Override
    public Expression visitReturner(ExprParser.ReturnerContext ctx) {
        return super.visitReturner(ctx);
    }

    @Override
    public Expression visitMainCaller(ExprParser.MainCallerContext ctx) {
        return super.visitMainCaller(ctx);
    }

    @Override
    public Expression visitLocalvariableInit(ExprParser.LocalvariableInitContext ctx) {
        return super.visitLocalvariableInit(ctx);
    }

    @Override
    public Expression visitVariableVis(ExprParser.VariableVisContext ctx) {
        return super.visitVariableVis(ctx);
    }

    @Override
    public Expression visitPrintCall(ExprParser.PrintCallContext ctx) {
        return super.visitPrintCall(ctx);
    }

    @Override
    public Expression visitMethodCall(ExprParser.MethodCallContext ctx) {
        return super.visitMethodCall(ctx);
    }

    @Override
    public Expression visitType(ExprParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Expression visitTypeProduction(ExprParser.TypeProductionContext ctx) {
        return super.visitTypeProduction(ctx);
    }

    @Override
    public Expression visitStringliteral(ExprParser.StringliteralContext ctx) {
        return super.visitStringliteral(ctx);
    }

    @Override
    public Expression visitIntliteral(ExprParser.IntliteralContext ctx) {
        String literal = ctx.getChild(0).getText();
        Token t = ctx.DIGITINCL().get(0).getSymbol();
        int line = t.getLine();
        try {
           Integer.parseInt(literal);
        } catch (NumberFormatException e){
            semanticErrors.add("Error: variable wrong type at Line: "+ line);
        }
        return super.visitIntliteral(ctx);
    }

    @Override
    public Expression visitFloatliteral(ExprParser.FloatliteralContext ctx) {
        String literal = ctx.getChild(0).getText();
        Token t = ctx.DIGITINCL().get(0).getSymbol();
        int line = t.getLine();
        try {
            Float.parseFloat(literal);
        } catch (NumberFormatException e){
            semanticErrors.add("Error: variable wrong type at Line: "+ line);
        }

        return super.visitFloatliteral(ctx);
    }

    @Override
    public Expression visitBoolliteral(ExprParser.BoolliteralContext ctx) {
        return super.visitBoolliteral(ctx);
    }

    @Override
    public Expression visitPackageProdcution(ExprParser.PackageProdcutionContext ctx) {
        return super.visitPackageProdcution(ctx);
    }

    @Override
    public Expression visitImportProduction(ExprParser.ImportProductionContext ctx) {
        return super.visitImportProduction(ctx);
    }

    @Override
    public Expression visitNameGiver(ExprParser.NameGiverContext ctx) {
        return super.visitNameGiver(ctx);
    }


    @Override
    public Expression visitArithmetics(ExprParser.ArithmeticsContext ctx) {
        return super.visitArithmetics(ctx);
    }

    @Override
    public Expression visitBooleans(ExprParser.BooleansContext ctx) {
        return super.visitBooleans(ctx);
    }

    @Override
    public Expression visitLogicals(ExprParser.LogicalsContext ctx) {
        return super.visitLogicals(ctx);
    }
}
