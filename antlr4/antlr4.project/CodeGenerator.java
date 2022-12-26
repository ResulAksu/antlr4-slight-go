
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;

public class CodeGenerator extends ExprBaseVisitor<Expression> {

    private String code= """
            .bytecode 51.0
            .class Go
            .super java/lang/Object
            .method public <init>()V
                .limit stack 1
                .limit local 1
                aload_0
                invokespecial java/lang/Object/<init>()V
                return
            .end method
            
            """;

    public String getCode() {
        return code;
    }
    private int countOfMembers = 0;

    private String currentReturnType = "";
    @Override
    public Expression visitProg(Expr.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Expression visitMethodCaller(Expr.MethodCallerContext ctx) {

        if(ctx.type() != null){
            currentReturnType = ctx.type().getText();
        }else{
            currentReturnType = null;
        }
        String toMakeMethod = "";
        if(ctx.nameGiver().getText().equals("main")){
            toMakeMethod = ".method public static main([Ljava/lang/String;)V \n" + " .limit stack 2\n"  + " .limit locals "+ (calcLocals(ctx.block().blockStatements())+1) + "\n" + " .line "+ ctx.FUNC().getSymbol().getLine() + "\n"+visitBlock(ctx.block(),true) + ".end method \n\n";
        }else{
            String type = examineTyp(ctx.type().getText());
            toMakeMethod = ".method public static " +ctx.nameGiver().getText() + "(" + visitMethodMember(ctx.methodMember(), true) + ")" + type +"\n" + " .limit stack " + (countOfMembers+1) + "\n" + " .limit locals "+ (countOfMembers+calcLocals(ctx.block().blockStatements())) + "\n" + " .line "+ ctx.FUNC().getSymbol().getLine() + "\n"+visitBlock(ctx.block(),true)+".end method \n\n";
        }
        countOfMembers = 0;
        code += toMakeMethod;
        System.out.println(code);
        return super.visitMethodCaller(ctx);
    }

    private int calcLocals(Expr.BlockStatementsContext ctx){
        if(ctx != null) return (int) ctx.statements().stream().filter(a -> a.localvariableInit() != null).count();
        return 0;
    }

    private String examineTyp(String s){
        return switch (s) {
            case "int" -> "I";
            case "float64" -> "F";
            case "string" -> "Ljava/lang/String;";
            case "bool" -> "Z";
            default -> "";
        };
    }


    public String visitMethodMember(Expr.MethodMemberContext ctx, boolean ist) {
        //Examine types of method members
        StringBuilder types = new StringBuilder();
        if(ctx.type() != null){
            for(Expr.TypeContext s : ctx.type()){
                types.append(examineTyp(s.getText()));
                countOfMembers++;
            }
        }
        return types.toString();
    }

    public String visitBlock(Expr.BlockContext ctx, boolean ist) {
        if(ctx.returner() != null && ctx.blockStatements() != null){
            return visitBlockStatements(ctx.blockStatements(), true) + visitReturner(ctx.returner(), true);
        }else if(ctx.returner() != null && ctx.blockStatements() == null){
            return visitReturner(ctx.returner(), true);
        }else if(ctx.returner() == null && ctx.blockStatements() != null){
            return visitBlockStatements(ctx.blockStatements(), true);
        }
        return "";
    }

    public String visitBlockStatements(Expr.BlockStatementsContext ctx, boolean ist) {
        StringBuilder s = new StringBuilder();
        if(ctx.statements() != null){
        for (int j = 0; j < ctx.statements().size(); j++) {
            s.append(visitStatements(ctx.statements(j), true));
        }}
        return s.toString();
    }


    public String visitStatements(Expr.StatementsContext ctx, boolean ist) {
        String inStatement = "";
        if(ctx.localvariableInit() != null){
            inStatement += visitLocalvariableInit(ctx.localvariableInit(), true);
        }else if(ctx.methodCall() != null){

        }else if(ctx.if_and_or_else_expression() != null){

        }else if(ctx.for_loop() != null){

        }else if(ctx.printCall() != null){

        }else if(ctx.block() != null){
            visitBlock(ctx.block(), true);
        }

        return "   "+inStatement + "\n";
    }

    @Override
    public Expression visitStringliteral(Expr.StringliteralContext ctx) {
        return super.visitStringliteral(ctx);
    }

    @Override
    public Expression visitIf_and_or_else_expression(Expr.If_and_or_else_expressionContext ctx) {
        return super.visitIf_and_or_else_expression(ctx);
    }

    @Override
    public Expression visitFor_loop(Expr.For_loopContext ctx) {
        return super.visitFor_loop(ctx);
    }


    public String visitReturner(Expr.ReturnerContext ctx, boolean ist) {
        String returnString = "";
        String examineType = examineReturnTyp(currentReturnType);
        //boolean true = iconst_1 false = iconst_0
        if(currentReturnType != null && ctx.expression() != null){
            return " .line " +ctx.RETURN().getSymbol().getLine()+ "\n"+visitExpression(ctx.expression(),examineType)+"   "+examineType + "return"+ "\n";
        }
        return returnString;
    }

    private String examineReturnTyp(String s){
        return switch (s) {
            case "int", "bool" -> "i";
            case "float64" -> "f";
            case "string" -> "a";
            default -> "";
        };
    }

    public String visitLocalvariableInit(Expr.LocalvariableInitContext ctx, boolean ist) {
        String varInit = "";
        String examineTyp = examineReturnTyp(ctx.type().getText());
        if(ctx.VAR() != null && ctx.ASSERT() != null){
           //Variable init mit Expression
           varInit = visitExpression(ctx.expression(0), examineTyp) +"   "+examineTyp + "store_";

        }else if(ctx.VAR() != null && ctx.ASSERT() == null){
            //Variable ohne Expression init
        }else{
            //namegiver mit Wert init
        }
        return varInit;
    }


    public String visitExpression(Expr.ExpressionContext ctx, String typ) {
        String literal = "";

        if(ctx.add_op != null ){
            if(ctx.add_op.getText().equals("+")) {
                String left = visitExpression(ctx.left, typ);
                String right = visitExpression(ctx.right, typ);
                literal += left + right + "   " + typ + "add \n";
            }else if(ctx.add_op.getText().equals("-")){
                String left = visitExpression(ctx.left, typ);
                String right = visitExpression(ctx.right, typ);
                literal += left + right + "   " + typ + "sub \n";
            }
        }else if(ctx.primaryExpr() != null){
            return visitPrimaryExpr(ctx.primaryExpr(),typ);
        }else if(ctx.mul_op != null){
            if(ctx.mul_op.getText().equals("*")){
                String left = visitExpression(ctx.left, typ);
                String right= visitExpression(ctx.right, typ);
                literal += left + right +"   "+typ+"mul \n";
            } else if (ctx.mul_op.getText().equals("/")) {
                String left = visitExpression(ctx.left, typ);
                String right= visitExpression(ctx.right, typ);
                literal += left + right +"   "+typ+"div \n";
            }else if (ctx.mul_op.getText().equals("%")) {
                String left = visitExpression(ctx.left, typ);
                String right= visitExpression(ctx.right, typ);
                literal += left + right +"   "+typ+"rem \n";
            }
        }

        //boolean implementieren, Punkt vor Strich achten
        return literal;
    }


    public String visitPrimaryExpr(Expr.PrimaryExprContext ctx, String type) {
        //Methodmember
        String finish = "";
        if(ctx.expression() != null){
            finish =visitExpression(ctx.expression(),type);
        }else if(ctx.nameGiver() != null){
            finish = visitNameGiver(ctx.nameGiver(), true);
        }else if(ctx.typeProduction() != null){
            finish = visitTypeProduction(ctx.typeProduction(),true);
        }
        return finish;
    }

    @Override
    public Expression visitPrintCall(Expr.PrintCallContext ctx) {
        return super.visitPrintCall(ctx);
    }

    @Override
    public Expression visitMethodCall(Expr.MethodCallContext ctx) {
        return super.visitMethodCall(ctx);
    }

    @Override
    public Expression visitType(Expr.TypeContext ctx) {
        return super.visitType(ctx);
    }


    public String visitNameGiver(Expr.NameGiverContext ctx, boolean ist) {
        return "   "+examineReturnTyp(currentReturnType)+"load_ \n";
    }

    public String visitTypeProduction(Expr.TypeProductionContext ctx, boolean ist) {
        if(ctx.intliteral() != null){
            return "   ldc "+ctx.intliteral().getText()+ "\n";
        }else if(ctx.floatliteral() != null){
            return "   ldc "+ctx.floatliteral().getText()+ "\n";
        }else if(ctx.stringliteral() != null){
            return "   ldc "+ctx.stringliteral().getText()+ "\n";
        }
        //noch für boolean
        return "";
    }

    @Override
    public Expression visitIntliteral(Expr.IntliteralContext ctx) {
        return super.visitIntliteral(ctx);
    }

    @Override
    public Expression visitFloatliteral(Expr.FloatliteralContext ctx) {
        return super.visitFloatliteral(ctx);
    }

    @Override
    public Expression visitBoolliteral(Expr.BoolliteralContext ctx) {
        return super.visitBoolliteral(ctx);
    }

    @Override
    public Expression visitPackageProdcution(Expr.PackageProdcutionContext ctx) {
        return super.visitPackageProdcution(ctx);
    }

    @Override
    public Expression visitImportProduction(Expr.ImportProductionContext ctx) {
        return super.visitImportProduction(ctx);
    }

    @Override
    public Expression visitEof(Expr.EofContext ctx) {
        return super.visitEof(ctx);
    }

    @Override
    public Expression visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Expression visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Expression visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Expression visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Expression defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Expression aggregateResult(Expression aggregate, Expression nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Expression currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
