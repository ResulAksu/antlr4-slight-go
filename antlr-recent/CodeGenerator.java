import java.beans.Expression;
import java.util.*;

public class CodeGenerator extends ExprBaseVisitor<Expression> {

    private final Map<String,String> variableTyp = new HashMap<>();
    private final Map<String,Integer> variablePlace = new HashMap<>();
    private String code= """
            .class Go
            .super java/lang/Object
            .method public <init>()V
                .limit stack 1
                .limit locals 1
                aload_0
                invokespecial java/lang/Object/<init>()V
                return
            .end method
            
            """;

    public String getCode() {
        return code;
    }
    private int countOfMembers = 0;
    private int localCounter = 0;
    private String currentReturnType = "";

    private int countOfMethods = 0;
    private final Map<String,String> methodsAndReturns = new HashMap<>();
    @Override
    public Expression visitProg(Expr.ProgContext ctx) {
        countOfMethods = ctx.methodCaller().size();
        for (int j = 0; j < ctx.methodCaller().size(); j++) {
            if(ctx.methodCaller().get(j).methodMember() != null){
                visitMethodMember(ctx.methodCaller().get(j).methodMember(), true);
            }
            if(ctx.methodCaller().get(j).type() != null){
                methodsAndReturns.put(ctx.methodCaller().get(j).nameGiver().getText(),examineTyp(ctx.methodCaller().get(j).type().getText()));
            }

        }
        return super.visitProg(ctx);
    }



    int i = 0;

    @Override
    public Expression visitMethodCaller(Expr.MethodCallerContext ctx) {
        if(ctx.type() != null) {
            methodsAndReturns.put(ctx.nameGiver().getText(), examineTyp(ctx.type().getText()));
        }
        if(ctx.type() != null){
            currentReturnType = ctx.type().getText();
        }else{
            currentReturnType = null;
        }
        String toMakeMethod = "";
        if(ctx.nameGiver().getText().equals("main")){
            localCounter = 1;
            toMakeMethod = ".method public static main([Ljava/lang/String;)V \n" + " .limit stack 100\n"  + " .limit locals "+ (calcLocals(ctx.block().blockStatements())+1) + "\n" + " .line "+ ctx.FUNC().getSymbol().getLine() + "\n"+visitBlock(ctx.block(),true) +"   return\n"+ ".end method \n\n";
        }else{
            String type = examineTyp(ctx.type().getText());
            toMakeMethod = ".method public static " +ctx.nameGiver().getText() + "(" + visiter(ctx) + ")" + type +"\n" + " .limit stack 100\n" + " .limit locals "+ (countOfMembers+calcLocals(ctx.block().blockStatements())) + "\n" + " .line "+ ctx.FUNC().getSymbol().getLine() + "\n"+visitBlock(ctx.block(),true)+".end method \n\n";
        }
        countOfMembers = 0;
        code += toMakeMethod;
        return super.visitMethodCaller(ctx);
    }

    private String visiter(Expr.MethodCallerContext ctx){
        if(ctx.methodMember() != null){
            return visitMethodMember(ctx.methodMember(),true);
        }
        return "";
    }
    private int calcLocals(Expr.BlockStatementsContext ctx){
        if(ctx != null) return (int) ctx.statements().stream().filter(a -> a.localvariableInit() != null).count();
        return 0;
    }

    private String examineTyp(String s){
        return switch (s) {
            case "int" -> "I";
            case "float64" -> "D";
            case "string" -> "Ljava/lang/String;";
            case "bool" -> "Z";
            default -> "";
        };
    }

    // auf Name, ist Typ/Ort gespeichert
    private final Map<String, String> methodWithMembers = new HashMap<>();
    private final Map<String, List<String>> methodWithTyps = new HashMap<>();

    public String visitMethodMember(Expr.MethodMemberContext ctx, boolean ist) {
        localCounter = 0;
        variableTyp.clear();
        variablePlace.clear();
        //Examine types of method members
        StringBuilder types = new StringBuilder();
        int nameGiverCounter = 0;
        List<String> a = new ArrayList<>();
        if(ctx.type() != null){
            for(Expr.TypeContext s : ctx.type()){
                types.append(examineTyp(s.getText()));
                a.add(examineReturnTyp(s.getText()));
                variableTyp.put(s.parent.getChild(nameGiverCounter).getText(),examineReturnTyp((s.getText()).toLowerCase()));
                variablePlace.put(s.parent.getChild(nameGiverCounter).getText(),localCounter);
                notInit.put(s.parent.getChild(nameGiverCounter).getText(),examineReturnTyp((s.getText()).toLowerCase()));
                localCounter++;
                countOfMembers++;
                nameGiverCounter +=3;
            }
        }
        methodWithMembers.put(ctx.parent.getChild(1).getText(),types.toString());
        methodWithTyps.put(ctx.parent.getChild(1).getText(),a);
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
            inStatement += visitMethodCall(ctx.methodCall(),true);
        }else if(ctx.if_and_or_else_expression() != null){
            inStatement += visitIf_and_or_else_expression(ctx.if_and_or_else_expression(), true);
        }else if(ctx.for_loop() != null){
            inStatement += visitFor_loop(ctx.for_loop(),true);
        }else if(ctx.printCall() != null){
            inStatement += visitPrintCall(ctx.printCall(), true);
        }else if(ctx.block() != null){
            visitBlock(ctx.block(), true);
        }

        return ""+inStatement ;
    }

    @Override
    public Expression visitStringliteral(Expr.StringliteralContext ctx) {
        return super.visitStringliteral(ctx);
    }

    int currentIfLabel = 0;
    public String visitIf_and_or_else_expression(Expr.If_and_or_else_expressionContext ctx, boolean a) {
        String iffer = "";
        iffer+= visitExpression(ctx.expression(0),"if") + visitBlock(ctx.block(0),true);
        if(ctx.ELSE_TOKEN() != null){
            iffer+= "   goto LabelELSE\nLabel"+currentIfLabel+":\n"+ visitBlock(ctx.block(1),true)+"LabelELSE:\n";
        }else{
            iffer+= "Label"+currentIfLabel+":\n";
        }
        return iffer;
    }


    private int forco = 2;
    public String visitFor_loop(Expr.For_loopContext ctx, boolean a) {
        String loop = "";
        loop+="LabelFOR"+forco+":\n" + visitExpression(ctx.expression(0),"for") +" .line "+(ctx.FOR_TOKEN().getSymbol().getLine()+1)+"\n"
        +visitBlock(ctx.block(),true) +"   goto LabelFOR"+forco+"\nLabel"+currentForLabel+":\n";
        forco++;
        return loop;
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
            case "float64" -> "d";
            case "string" -> "a";
            default -> "";
        };
    }
    private final Map<String,String> notInit = new HashMap<>();
    public String visitLocalvariableInit(Expr.LocalvariableInitContext ctx, boolean ist) {
        String varInit = "";

        if(ctx.VAR() != null && ctx.ASSERT() != null){
            String examineTyp = examineReturnTyp(ctx.type().getText());

            //Variable init mit Expression
           varInit = visitExpression(ctx.expression(0), examineTyp) +"   "+examineTyp + "store_"+localCounter+"\n";
           variablePlace.put(ctx.nameGiver().getText(),localCounter);
           variableTyp.put(ctx.nameGiver().getText(),examineTyp);
           localCounter++;

        }else if(ctx.VAR() != null && ctx.ASSERT() == null){
            //Variable ohne Expression init
            //mappen mit typ und namen
            notInit.put(ctx.nameGiver().getText(),examineReturnTyp(ctx.type().getText()));

        }else{
            //namegiver mit Wert init
            //entweder vorhanden und loaden,storen oder aus temp map holen und storen
            //gucken ob vorhanden
            if(notInit.containsKey(ctx.nameGiver().getText())){
                varInit = visitExpression(ctx.expression(0),notInit.get(ctx.nameGiver().getText())) + "   "+ notInit.get(ctx.nameGiver().getText())+ "store_"+localCounter+"\n";
                variablePlace.put(ctx.nameGiver().getText(),localCounter);
                variableTyp.put(ctx.nameGiver().getText(),notInit.get(ctx.nameGiver().getText()));
                localCounter++;
                notInit.remove(ctx.nameGiver().getText());
            }else if(variableTyp.containsKey(ctx.nameGiver().getText())){
                varInit = visitExpression(ctx.expression(0),variableTyp.get(ctx.nameGiver().getText())) + "   "+ variableTyp.get(ctx.nameGiver().getText())+ "store_"+variablePlace.get(ctx.nameGiver().getText())+"\n";
            }
        }
        return varInit;
    }

    private int labelc = 10;
    private int currentForLabel = 0;

    private String s = "";
    public String visitExpression(Expr.ExpressionContext ctx, String typ) {
        String literal = "";
        if(ctx.unary_op != null){
            if(ctx.unary_op.getText().equals("-")){
                String right = visitExpression(ctx.right,typ);
                literal += right +"   "+ s+"neg \n";
            }else if(ctx.unary_op.getText().equals("!")){
                String right = visitExpression(ctx.right,typ);
                literal += right + "   ifne Label"+labelc+"\n"+"   iconst_1\n"+"   goto Label"+(labelc+1)+"\n" +labelcalcUnary_Not(labelc);
                labelc+=2;
            }
        }
        if(ctx.mul_op != null){
            if(ctx.mul_op.getText().equals("*")){
                String left = visitExpression(ctx.left, typ);
                String right= visitExpression(ctx.right, typ);
                literal += left +  right+  "   "+s+"mul \n";
            } else if (ctx.mul_op.getText().equals("/")) {
                String left = visitExpression(ctx.left, typ);
                String right= visitExpression(ctx.right, typ);
                literal += left + right +"   "+s+"div \n";
            }else if (ctx.mul_op.getText().equals("%")) {
                String left = visitExpression(ctx.left, typ);
                String right= visitExpression(ctx.right, typ);
                literal += left + right +"   "+s+"rem \n";
            }
        }if(ctx.add_op != null ){
            if(ctx.add_op.getText().equals("+")) {
                String left = visitExpression(ctx.left, typ);
                String right = visitExpression(ctx.right, typ);
                literal += left + right + "   " + s + "add \n";
            }else if(ctx.add_op.getText().equals("-")){
                String left = visitExpression(ctx.left, typ);
                String right = visitExpression(ctx.right, typ);
                literal += left + right + "   " + s + "sub \n";
            }
        }if(ctx.rel_op != null){
            if(ctx.rel_op.getText().equals("==")){
                String left = visitExpression(ctx.left,typ);
                String right = visitExpression(ctx.right,typ);
                if(!s.equals("a")){
                    literal += left + right + "   " + s + "sub \n   ifne Label"+labelc+"\n";
                    if(!typ.equals("if") && !typ.equals("for")){
                        literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                                + labelcalcEquals(labelc);
                    }
                    currentForLabel = labelc;
                    currentIfLabel = labelc;
                    labelc+=2;
                }else {
                    literal += left +right + "   " + "invokestatic java/util/Objects/equals(Ljava/lang/Object;Ljava/lang/Object;)Z\n";
                    if(typ.equals("if")){
                        literal +="   ifne Label"+labelc+"\n";
                        currentIfLabel = labelc;
                        labelc+=2;
                    }
                }
            }else if(ctx.rel_op.getText().equals("!=")){
                String left = visitExpression(ctx.left,typ);
                String right = visitExpression(ctx.right,typ);
                if(!s.equals("a")){
                    literal += left + right + "   " + s + "sub \n   ifeq Label"+labelc+"\n";
                    if(!typ.equals("if") && !typ.equals("for")){
                        literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                                + labelcalcEquals(labelc);
                    }
                    currentForLabel = labelc;
                    currentIfLabel = labelc;
                    labelc+=2;}
                else {
                    literal += left +right + "   " + "invokestatic java/util/Objects/equals(Ljava/lang/Object;Ljava/lang/Object;)Z\n"+"   ifeq Label"+labelc+"\n";
                    if(!typ.equals("if")){
                        literal+="   iconst_1\n"+"   goto Label"+(labelc+1)+"\n" +labelcalcEquals(labelc);
                    }
                    currentIfLabel = labelc;
                    labelc+=2;
                }
            }else if(ctx.rel_op.getText().equals("<")){
                String left = visitExpression(ctx.left,typ);
                String right = visitExpression(ctx.right,typ);
                literal+= left+right + "   "+ s+ "sub\n   ifge Label"+labelc+"\n";
                if(!typ.equals("if") && !typ.equals("for")){
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcEquals(labelc);
                }
                currentForLabel = labelc;
                currentIfLabel = labelc;
                labelc+=2;
            }else if(ctx.rel_op.getText().equals("<=")){
                String left = visitExpression(ctx.left,typ);
                String right = visitExpression(ctx.right,typ);
                literal += left+right + "   "+ s+ "sub\n   ifgt Label"+labelc+"\n";
                if(!typ.equals("if") && !typ.equals("for")){
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcEquals(labelc);
                }
                currentForLabel = labelc;
                currentIfLabel = labelc;
                labelc+=2;
            }else if(ctx.rel_op.getText().equals(">")){
                String left = visitExpression(ctx.left,typ);
                String right = visitExpression(ctx.right,typ);
                literal += left+right+ "   "+ s+ "sub\n   ifle Label"+labelc+"\n";
                if(!typ.equals("if") && !typ.equals("for")){
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcEquals(labelc);
                }
                currentForLabel = labelc;
                currentIfLabel = labelc;
                labelc+=2;
            }else if(ctx.rel_op.getText().equals(">=")){
                String left = visitExpression(ctx.left,typ);
                String right= visitExpression(ctx.right,typ);
                literal += left+right+ "   "+ s+ "sub\n   iflt Label"+labelc+"\n";
                if(!typ.equals("if") && !typ.equals("for")){
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcEquals(labelc);
                }
                currentForLabel = labelc;
                currentIfLabel = labelc;
                labelc+=2;
            }
        }else if(ctx.LOGICAL_AND()!=null){
            String left = visitExpression(ctx.left,typ);
            String right = visitExpression(ctx.right,typ);
            literal += left+right+ "   "+ "iand\n";
        }else if(ctx.LOGICAL_OR()!= null){
            String left = visitExpression(ctx.left,typ);
            String right = visitExpression(ctx.right,typ);
            literal += left+right+ "   "+ "ior\n";
        }
        else if(ctx.primaryExpr() != null){
            return visitPrimaryExpr(ctx.primaryExpr(),typ);
        }
        //boolean implementieren, Punkt vor Strich achten
        return literal;
    }

    private String labelcalcUnary_Not(int labelc) {
        return "Label"+labelc+":\n   iconst_0\nLabel"+(labelc+1)+":\n";
    }

    private String labelcalcEquals(int labelc) {
        return "Label"+labelc+":\n   iconst_0\nLabel"+(labelc+1)+":\n";
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
        }else if(ctx.methodCall() != null){
            finish = visitMethodCall(ctx.methodCall(),true);
        }
        return finish;
    }


    public String visitPrintCall(Expr.PrintCallContext ctx, boolean a) {
        String pri = "";
        pri +=visitMethodCall(ctx.methodCall(), true);
        return pri;
    }

    public String visitMethodCall(Expr.MethodCallContext ctx, boolean a) {
        StringBuilder methodCall = new StringBuilder();
        List<String> typs = methodWithTyps.get(ctx.nameGiver().getText());
        if(ctx.nameGiver().getText().equals("Println")){
            methodCall.append("   getstatic java/lang/System/out Ljava/io/PrintStream;\n");
        }
        if(ctx.expression() != null){
            int co = 0;
            if(typs == null) {
                for (Expr.ExpressionContext e : ctx.expression()) {
                    methodCall.append(visitExpression(e, null));
                }
            }else{
                for (Expr.ExpressionContext e : ctx.expression()) {
                    methodCall.append(visitExpression(e, typs.get(co)));
                    co++;
                }
            }

        }
        if(!ctx.nameGiver().getText().equals("Println")) {
            methodCall.append("   invokestatic Go/").append(ctx.nameGiver().getText()).append("(").append(methodWithMembers.get(ctx.nameGiver().getText())).append(")").append(methodsAndReturns.get(ctx.nameGiver().getText())).append("\n");
        }else{
            //in printcall current return noch rein
            methodCall.append("   invokevirtual java/io/PrintStream/println(I)V").append("\n");
        }
        return methodCall.toString();
    }

    public String visitNameGiver(Expr.NameGiverContext ctx, boolean ist) {
        s = variableTyp.get(ctx.getText()).toLowerCase();
        return "   "+variableTyp.get(ctx.getText()).toLowerCase()+"load_"+variablePlace.get(ctx.getText()) +"\n";
    }

    public String visitTypeProduction(Expr.TypeProductionContext ctx, boolean ist) {
        if(ctx.intliteral() != null){
            s = "i";
            return "   ldc "+ctx.intliteral().getText()+ "\n";
        }else if(ctx.floatliteral() != null){
            s = "d";
            return "   ldc2_w "+ctx.floatliteral().getText()+ "\n";
        }else if(ctx.stringliteral() != null){
            s= "a";
            return "   ldc "+ctx.stringliteral().getText()+ "\n";
        }else if(ctx.boolliteral() != null){
            s="i";
            return "   iconst_" + examineBooleanZeroOrOne(ctx.boolliteral().getText())+ "\n";
        }
        return "";
    }

    private String examineBooleanZeroOrOne(String text) {
        if(text.equals("true")){
            return "1";
        }else if(text.equals("false")){
            return "0";
        }
        return "";
    }
}
