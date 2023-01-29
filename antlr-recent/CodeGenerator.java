import java.beans.Expression;
import java.util.*;

public class CodeGenerator extends ExprBaseVisitor<Expression> {
    private final Map<String, Integer> localLimits;
    int fId = 0;
    private final Stack<Integer> forStack = new Stack<>();
    private final Stack<Integer> ifStack = new Stack<>();
    private final String className;
    public CodeGenerator(Map<String,Integer> c, String classesName){
        localLimits = c;
        className = classesName;
    }
    private final Map<String,String> variableForPrint = new HashMap<>();
    private String s = "";
    private final Map<String,String> notInit = new HashMap<>();
    private int forco = 2;
    private int labelc = 10;

    private final Map<String, String> methodWithMembers = new HashMap<>();
    private final Map<String, List<String>> methodWithTyps = new HashMap<>();

    private final Map<String,String> variableTyp = new HashMap<>();
    private final Map<String,Integer> variablePlace = new HashMap<>();
    private String code = "";
    public String getCode() {
        return code;
    }

    private int localCounter = 0;
    private String currentReturnType = "";

    private final Map<String,String> methodsAndReturns = new HashMap<>();
    @Override
    public Expression visitProg(Expr.ProgContext ctx) {
        code = ".class "+className+"\n.super java/lang/Object\n.method public <init>()V\n    .limit stack 1\n    .limit locals 1\n    aload_0\n" +
                "    invokespecial java/lang/Object/<init>()V\n    return\n.end method\n\n";
        for (int j = 0; j < ctx.methodCaller().size(); j++) {
            if(ctx.methodCaller().get(j).methodMember() != null){
                visitMethodMembers(ctx.methodCaller().get(j).methodMember());
            }
            if(ctx.methodCaller().get(j).type() != null){
                methodsAndReturns.put(ctx.methodCaller().get(j).nameGiver().getText(),examineTyp(ctx.methodCaller().get(j).type().getText()));
            }

        }

        return super.visitProg(ctx);
    }

    @Override
    public Expression visitMethodCaller(Expr.MethodCallerContext ctx) {
        variableTyp.clear();
        variablePlace.clear();
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
            toMakeMethod = ".method public static main([Ljava/lang/String;)V \n" + " .limit stack 100\n"  + " .limit locals "+ (localLimits.get(ctx.nameGiver().getText())+1) + "\n" + " .line "+ ctx.FUNC().getSymbol().getLine() + "\n"+visitBlock(ctx.block(),true) +"   return\n"+ ".end method \n\n";
        }else{
            localCounter = 0;
            if(ctx.type() != null){
                String type = examineTyp(ctx.type().getText());
                toMakeMethod = ".method public static " +ctx.nameGiver().getText() + "(" + visited(ctx) + ")" + type +"\n" + " .limit stack 4\n" + " .limit locals "+ (localLimits.get(ctx.nameGiver().getText())+1) + "\n" + " .line "+ ctx.FUNC().getSymbol().getLine() + "\n"+visitBlock(ctx.block(),true)+".end method \n\n";
            }else{
                toMakeMethod = ".method public static " +ctx.nameGiver().getText() + "(" + visited(ctx) + ")V" +"\n" + " .limit stack 4\n" + " .limit locals "+ (localLimits.get(ctx.nameGiver().getText())+1) + "\n" + " .line "+ ctx.FUNC().getSymbol().getLine() + "\n"+visitBlock(ctx.block(),true)+".end method \n\n";
            }
        }
        code += toMakeMethod;
        s = currentReturnType;

        return super.visitMethodCaller(ctx);
    }

    private String visited(Expr.MethodCallerContext ctx){
        if(ctx.methodMember() != null){
            return visitMethodMembers(ctx.methodMember());
        }
        return "";
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

    public String visitMethodMembers(Expr.MethodMemberContext ctx) {
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
                variableForPrint.put(s.parent.getChild(nameGiverCounter).getText(), examineTyp(s.getText()));
                notInit.put(s.parent.getChild(nameGiverCounter).getText(),examineReturnTyp((s.getText()).toLowerCase()));
                if(examineTyp(s.getText()).equals("D")){
                    localCounter +=2;
                }else{
                    localCounter++;
                }
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
        }else if(ctx.returner() == null && ctx.blockStatements() != null && !(ctx.parent.getChild(0).getText().equals("for") ||ctx.parent.getChild(0).getText().equals("if"))){
            return visitBlockStatements(ctx.blockStatements(), true) + "   return\n";
        } else if (ctx.parent.getChild(0).getText().equals("for") ||ctx.parent.getChild(0).getText().equals("if") && ctx.blockStatements() != null) {
            return visitBlockStatements(ctx.blockStatements(), true);
        } else if(ctx.returner() == null && ctx.blockStatements() == null){
            return "   return\n";
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
            inStatement += visitMethodCall(ctx.methodCall(),"");
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


    public String visitIf_and_or_else_expression(Expr.If_and_or_else_expressionContext ctx, boolean a) {
        fId++;
        ifStack.push(fId);
        String iffer = "";
        iffer+= visitExpression(ctx.expression(0),"if") + visitBlock(ctx.block(0),true);
        if(ctx.ELSE_TOKEN() != null){
            iffer+= "   goto LabelELSE\nLabel"+ifStack.peek()+":\n"+ visitBlock(ctx.block(1),true)+"LabelELSE:\n";
            ifStack.pop();
        }else{
            iffer+= "Label"+ifStack.peek()+":\n";
            ifStack.pop();
        }
        return iffer;
    }

    public String visitFor_loop(Expr.For_loopContext ctx, boolean a) {
        forco++;
        forStack.push(forco);
        String loop = "";
        loop+="LabelFOR"+forStack.peek()+":\n" + visitExpression(ctx.expression(0),"for") +" .line "+(ctx.FOR_TOKEN().getSymbol().getLine()+1)+"\n"
        +visitBlock(ctx.block(),true) +"   goto LabelFOR"+forStack.peek()+"\nLabelF"+forStack.peek()+":\n";
        forStack.pop();
        return loop;
    }

    public String visitReturner(Expr.ReturnerContext ctx, boolean ist) {
        String returnString = "";
        //boolean true = iconst_1 false = iconst_0
        if(currentReturnType != null && ctx.expression() != null){
            String examineType = examineReturnTyp(currentReturnType);
            return " .line " +ctx.RETURN().getSymbol().getLine()+ "\n"+visitExpression(ctx.expression(),examineType)+"   "+examineType + "return"+ "\n";
        }else if(ctx.expression() == null){
            return " .line " + ctx.RETURN().getSymbol().getLine()+ "\n"+"   return\n";
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
    public String visitLocalvariableInit(Expr.LocalvariableInitContext ctx, boolean ist) {
        String varInit = "";
        if(ctx.VAR() != null && ctx.ASSERT() != null){
            String examineTyp = examineReturnTyp(ctx.type().getText());
            //Variable init mit Expression
           varInit = visitExpression(ctx.expression(0), examineTyp) +"   "+examineTyp + "store "+localCounter+"\n";
           variablePlace.put(ctx.nameGiver().getText(),localCounter);
           variableTyp.put(ctx.nameGiver().getText(),examineTyp);
            variableForPrint.put(ctx.nameGiver().getText(), examineTyp(ctx.type().getText()));
           if(examineTyp.equals("d")){
               localCounter+=2;
           }else{
               localCounter++;

           }
        }else if(ctx.VAR() != null && ctx.ASSERT() == null){
            //Variable ohne Expression init
            //mappen mit typ und namen
            notInit.put(ctx.nameGiver().getText(),examineReturnTyp(ctx.type().getText()));

        }else{
            //namegiver mit Wert init
            //entweder vorhanden und loaden,storen oder aus temp map holen und storen
            //gucken ob vorhanden
            if(notInit.containsKey(ctx.nameGiver().getText())){
                if(notInit.containsKey(ctx.nameGiver().getText()) && variablePlace.containsKey(ctx.nameGiver().getText())) {
                    varInit = visitExpression(ctx.expression(0), notInit.get(ctx.nameGiver().getText())) + "   " + notInit.get(ctx.nameGiver().getText()) + "store " + variablePlace.get(ctx.nameGiver().getText()) + "\n";
                    variableForPrint.put(ctx.nameGiver().getText(), notInit.get(ctx.nameGiver().getText()));
                }else{
                    varInit = visitExpression(ctx.expression(0), notInit.get(ctx.nameGiver().getText())) + "   " + notInit.get(ctx.nameGiver().getText()) + "store " + localCounter + "\n";
                    variablePlace.put(ctx.nameGiver().getText(), localCounter);
                    variableTyp.put(ctx.nameGiver().getText(), notInit.get(ctx.nameGiver().getText()));
                    variableForPrint.put(ctx.nameGiver().getText(), notInit.get(ctx.nameGiver().getText()));
                }
                if(notInit.get(ctx.nameGiver().getText()).equals("d")){
                    localCounter+=2;
                }else{
                    localCounter++;

                }

                notInit.remove(ctx.nameGiver().getText());
            }else if(variableTyp.containsKey(ctx.nameGiver().getText())){
                varInit = visitExpression(ctx.expression(0),variableTyp.get(ctx.nameGiver().getText())) + "   "+ variableTyp.get(ctx.nameGiver().getText())+ "store "+variablePlace.get(ctx.nameGiver().getText())+"\n";
            }
        }
        return varInit;
    }
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
                String left = visitExpression(ctx.left,"rel");
                String right = visitExpression(ctx.right,"rel");
                if(!s.equals("a")){
                    //hier kommen nur boolean
                    if(s.equals("i") && !typ.equals("if") && !typ.equals("for")) {
                        literal += left + right + "   " + s + "sub \n   ifeq Label" + labelc + "\n";
                        literal += "   iconst_0\n   goto Label"+(labelc+1)+"\n"
                                + labelcalcEquals(labelc);
                        labelc+=2;
                    } else if (s.equals("i") && typ.equals("if")) {
                        literal += left + right + "   " + s + "sub \n   ifne Label" + ifStack.peek() + "\n";
                    } else if (s.equals("i")) {
                        literal += left + right + "   " + s + "sub \n   ifne LabelF" + forStack.peek() + "\n";
                    } //hier sind Zahlenvergleiche
                    else if (s.equals("d") &&!typ.equals("if") && !typ.equals("for")) {
                        literal += left + right + "   " + "dcmpl \n   ifeq Label" + labelc + "\n";
                        literal += "   iconst_0\n   goto Label"+(labelc+1)+"\n"
                                + labelcalcEquals(labelc);
                        labelc+=2;
                    } else if (s.equals("d") && typ.equals("if")) {
                        literal += left + right + "   " + "dcmpl \n   ifne Label" + ifStack.peek() + "\n";
                    } else if (s.equals("d")) {
                        literal += left + right + "   " + "dcmpl \n   ifne LabelF" + forStack.peek() + "\n";
                    }
                }else {
                    literal += left +right + "   " + "invokestatic java/util/Objects/equals(Ljava/lang/Object;Ljava/lang/Object;)Z\n";
                    if(typ.equals("if")){
                        literal +="   ifeq Label"+ifStack.peek()+"\n";
                    }
                }
            }else if(ctx.rel_op.getText().equals("!=")){
                String left = visitExpression(ctx.left,"rel");
                String right = visitExpression(ctx.right,"rel");
                if(!s.equals("a")){
                    if(s.equals("i") && !typ.equals("if") && !typ.equals("for")) {
                        literal += left + right + "   " + s + "sub \n   ifeq Label" + labelc + "\n";
                        literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                                + labelcalcUnary_Not(labelc);
                        labelc+=2;
                    } else if (s.equals("i") && typ.equals("if")) {
                        literal += left + right + "   " + s + "sub \n   ifeq Label" + ifStack.peek() + "\n";
                    } else if (s.equals("i")) {
                        literal += left + right + "   " + s + "sub \n   ifeq LabelF" + forStack.peek() + "\n";
                    } else if (s.equals("d") &&!typ.equals("if") && !typ.equals("for")) {
                        literal += left + right + "   " + "dcmpl \n   ifeq Label" + labelc + "\n";
                        literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                                + labelcalcUnary_Not(labelc);
                        labelc+=2;
                    } else if (s.equals("d") && typ.equals("if")) {
                        literal += left + right + "   " + "dcmpl \n   ifeq Label" + ifStack.peek() + "\n";
                    } else if (s.equals("d")) {
                        literal += left + right + "   " + "dcmpl \n   ifeq LabelF" + forStack.peek() + "\n";
                    }
                        }
                else {
                    literal += left +right + "   " + "invokestatic java/util/Objects/equals(Ljava/lang/Object;Ljava/lang/Object;)Z\n";
                    if(typ.equals("if")){
                        literal +="   ifne Label"+ifStack.peek()+"\n";
                    }else{
                        literal +="   ifne Label" + labelc + "\n";
                        literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                                + labelcalcUnary_Not(labelc);
                        labelc+=2;
                    }
                    labelc+=2;
                }
            }else if(ctx.rel_op.getText().equals("<")){
                String left = visitExpression(ctx.left,"rel");
                String right = visitExpression(ctx.right,"rel");
                //literal+= left+right + "   "+ s+ "sub\n   ifge Label"+labelc+"\n";
                if(s.equals("i") && !typ.equals("if") && !typ.equals("for")) {
                    literal += left + right + "   " + s + "sub \n   ifge Label" + labelc + "\n";
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcUnary_Not(labelc);
                    labelc+=2;
                } else if (s.equals("i") && typ.equals("if")) {
                    literal += left + right + "   " + s + "sub \n   ifge Label" + ifStack.peek() + "\n";
                } else if (s.equals("i")) {
                    literal += left + right + "   " + s + "sub \n   ifge LabelF" + forStack.peek() + "\n";
                } else if (s.equals("d") &&!typ.equals("if") && !typ.equals("for")) {
                    literal += left + right + "   " + "dcmpl \n   ifge Label" + labelc + "\n";
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcUnary_Not(labelc);
                    labelc+=2;
                } else if (s.equals("d") && typ.equals("if")) {
                    literal += left + right + "   " + "dcmpl \n   ifge Label" + ifStack.peek() + "\n";
                } else if (s.equals("d")) {
                    literal += left + right + "   " + "dcmpl \n   ifge LabelF" + forStack.peek() + "\n";
                }

            }else if(ctx.rel_op.getText().equals("<=")){
                String left = visitExpression(ctx.left,"rel");
                String right = visitExpression(ctx.right,"rel");
                // += left+right + "   "+ s+ "sub\n   ifgt Label"+labelc+"\n";
                if(s.equals("i") && !typ.equals("if") && !typ.equals("for")) {
                    literal += left + right + "   " + s + "sub \n   ifgt Label" + labelc + "\n";
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcUnary_Not(labelc);
                    labelc+=2;
                } else if (s.equals("i") && typ.equals("if")) {
                    literal += left + right + "   " + s + "sub \n   ifgt Label" + ifStack.peek() + "\n";
                } else if (s.equals("i")) {
                    literal += left + right + "   " + s + "sub \n   ifgt LabelF" + forStack.peek() + "\n";
                } else if (s.equals("d") &&!typ.equals("if") && !typ.equals("for")) {
                    literal += left + right + "   " + "dcmpl \n   ifgt Label" + labelc + "\n";
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcUnary_Not(labelc);
                    labelc+=2;
                } else if (s.equals("d") && typ.equals("if")) {
                    literal += left + right + "   " + "dcmpl \n   ifgt Label" + ifStack.peek() + "\n";
                } else if (s.equals("d")) {
                    literal += left + right + "   " + "dcmpl \n   ifgt LabelF" + forStack.peek() + "\n";
                }
            }else if(ctx.rel_op.getText().equals(">")){
                String left = visitExpression(ctx.left,"rel");
                String right = visitExpression(ctx.right,"rel");
                //literal += left+right+ "   "+ s+ "sub\n   ifle Label"+labelc+"\n";
                if(s.equals("i") && !typ.equals("if") && !typ.equals("for")) {
                    literal += left + right + "   " + s + "sub \n   ifle Label" + labelc + "\n";
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcUnary_Not(labelc);
                    labelc+=2;
                } else if (s.equals("i") && typ.equals("if")) {
                    literal += left + right + "   " + s + "sub \n   ifle Label" + ifStack.peek() + "\n";
                } else if (s.equals("i")) {
                    literal += left + right + "   " + s + "sub \n   ifle LabelF" + forStack.peek() + "\n";
                } else if (s.equals("d") &&!typ.equals("if") && !typ.equals("for")) {
                    literal += left + right + "   " + "dcmpl \n   ifle Label" + labelc + "\n";
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcUnary_Not(labelc);
                    labelc+=2;
                } else if (s.equals("d") && typ.equals("if")) {
                    literal += left + right + "   " + "dcmpl \n   ifle Label" + ifStack.peek() + "\n";
                } else if (s.equals("d")) {
                    literal += left + right + "   " + "dcmpl \n   ifle LabelF" + forStack.peek() + "\n";
                }
            }else if(ctx.rel_op.getText().equals(">=")){
                String left = visitExpression(ctx.left,"rel");
                String right = visitExpression(ctx.right,"rel");
                //literal += left+right+ "   "+ s+ "sub\n   iflt Label"+labelc+"\n";
                if(s.equals("i") && !typ.equals("if") && !typ.equals("for")) {
                    literal += left + right + "   " + s + "sub \n   iflt Label" + labelc + "\n";
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcUnary_Not(labelc);
                    labelc+=2;
                } else if (s.equals("i") && typ.equals("if")) {
                    literal += left + right + "   " + s + "sub \n   iflt Label" + ifStack.peek() + "\n";
                } else if (s.equals("i")) {
                    literal += left + right + "   " + s + "sub \n   iflt LabelF" + forStack.peek() + "\n";
                } else if (s.equals("d") &&!typ.equals("if") && !typ.equals("for")) {
                    literal += left + right + "   " + "dcmpl \n   iflt Label" + labelc + "\n";
                    literal += "   iconst_1\n   goto Label"+(labelc+1)+"\n"
                            + labelcalcUnary_Not(labelc);
                    labelc+=2;
                } else if (s.equals("d") && typ.equals("if")) {
                    literal += left + right + "   " + "dcmpl \n   iflt Label" + ifStack.peek() + "\n";
                } else if (s.equals("d")) {
                    literal += left + right + "   " + "dcmpl \n   iflt LabelF" + forStack.peek() + "\n";
                }
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
        return "Label"+labelc+":\n   iconst_1\nLabel"+(labelc+1)+":\n";
    }



    public String visitPrimaryExpr(Expr.PrimaryExprContext ctx, String type) {
        //Methodmember
        String finish = "";
        if(ctx.expression() != null){
            finish =visitExpression(ctx.expression(),type);
        }else if(ctx.nameGiver() != null){
            finish = visitNameGiver(ctx.nameGiver(), type);
        }else if(ctx.typeProduction() != null){

            finish = visitTypeProduction(ctx.typeProduction(),type);
        }else if(ctx.methodCall() != null){
            finish = visitMethodCall(ctx.methodCall(),type);
        }
        return finish;
    }


    public String visitPrintCall(Expr.PrintCallContext ctx, boolean a) {
        String pri = "";
        pri +=visitMethodCall(ctx.methodCall(), "");
        return pri;
    }

    public String visitMethodCall(Expr.MethodCallContext ctx, String a) {
        StringBuilder methodCall = new StringBuilder();
        List<String> typs = methodWithTyps.get(ctx.nameGiver().getText());
        if(ctx.nameGiver().getText().equals("Println")){
            methodCall.append("   getstatic java/lang/System/out Ljava/io/PrintStream;\n");
        }
        if(ctx.expression() != null){
            int co = 0;
            if(typs == null) {
                for (Expr.ExpressionContext e : ctx.expression()) {
                    methodCall.append(visitExpression(e, ""));
                }
            }else{
                for (Expr.ExpressionContext e : ctx.expression()) {
                    methodCall.append(visitExpression(e, typs.get(co)));
                    co++;
                }
            }

        }
        if(!ctx.nameGiver().getText().equals("Println")) {
            if(methodWithMembers.get(ctx.nameGiver().getText()) != null && methodsAndReturns.get(ctx.nameGiver().getText()) != null) {
                methodCall.append("   invokestatic ").append(className).append("/").append(ctx.nameGiver().getText()).append("(").append(methodWithMembers.get(ctx.nameGiver().getText())).append(")").append(methodsAndReturns.get(ctx.nameGiver().getText())).append("\n");
                s = methodsAndReturns.get(ctx.nameGiver().getText()).toLowerCase();
            }else if(methodWithMembers.get(ctx.nameGiver().getText()) == null && methodsAndReturns.get(ctx.nameGiver().getText()) != null){
                methodCall.append("   invokestatic ").append(className).append("/").append(ctx.nameGiver().getText()).append("(").append(")").append(methodsAndReturns.get(ctx.nameGiver().getText())).append("\n");
                s = methodsAndReturns.get(ctx.nameGiver().getText()).toLowerCase();
            }else if(methodWithMembers.get(ctx.nameGiver().getText()) == null && methodsAndReturns.get(ctx.nameGiver().getText()) == null){
                methodCall.append("   invokestatic ").append(className).append("/").append(ctx.nameGiver().getText()).append("(").append(")").append("V").append("\n");

            }else if(methodWithMembers.get(ctx.nameGiver().getText()) != null && methodsAndReturns.get(ctx.nameGiver().getText()) == null){
                methodCall.append("   invokestatic ").append(className).append("/").append(ctx.nameGiver().getText()).append("(").append(methodWithMembers.get(ctx.nameGiver().getText())).append(")").append("V").append("\n");
            }
            if(a.equals("d") && methodsAndReturns.get(ctx.nameGiver().getText()).equals("I")){
                methodCall.append("   i2d").append("\n");
            } else if (a.equals("rel")) {
                methodCall.append("   i2d").append("\n");
            }

        }else{
            //in printcall current return noch rein
            methodCall.append("   invokevirtual java/io/PrintStream/println(").append(analyzeExpr(ctx)).append(")V").append("\n");
        }
        return methodCall.toString();
    }

    private String analyzeExpr(Expr.MethodCallContext ctx) {
        if(ctx.expression()!= null){
            return analyzeExprDepper(ctx.expression(0));
        }else{
            return "V";
        }
    }

    private String analyzeExprDepper(Expr.ExpressionContext expression) {
        if(expression.primaryExpr()!= null){
            if(expression.primaryExpr().typeProduction()!= null){
                if(expression.primaryExpr().typeProduction().intliteral() != null){
                    return "I";
                }else if(expression.primaryExpr().typeProduction().floatliteral() != null){
                    return "D";
                }else if(expression.primaryExpr().typeProduction().stringliteral() != null){
                    return "Ljava/lang/String;";
                } else if (expression.primaryExpr().typeProduction().boolliteral() != null) {
                    return "Z";
                }
            } else if (expression.primaryExpr().nameGiver() != null) {
                return variableForPrint.get(expression.primaryExpr().nameGiver().getText());
            } else if (expression.primaryExpr().methodCall() != null) {
                return methodsAndReturns.get(expression.primaryExpr().methodCall().nameGiver().getText());
            }
        } else if (expression.add_op != null || expression.mul_op != null) {
            return analyzeExprDepper(expression.left);
        } else if (expression.rel_op != null || expression.LOGICAL_AND() != null || expression.LOGICAL_OR() != null) {
            return "Z";
        } else if (expression.unary_op != null) {
            if(expression.unary_op.getText().equals("!")){
                return "Z";
            }else{
                return analyzeExprDepper(expression.right);
            }
        }
        return "";
    }


    public String visitNameGiver(Expr.NameGiverContext ctx, String type) {
        s = variableTyp.get(ctx.getText()).toLowerCase();
        if((type.equals("rel") || type.equals("d")) && s.equals("i")){
            s = "d";
            return "   "+variableTyp.get(ctx.getText()).toLowerCase()+"load "+variablePlace.get(ctx.getText()) +"\n   i2d\n";
        }
        return "   "+variableTyp.get(ctx.getText()).toLowerCase()+"load "+variablePlace.get(ctx.getText()) +"\n";
    }

    public String visitTypeProduction(Expr.TypeProductionContext ctx, String typ) {
        if(ctx.intliteral() != null){
            if(typ.equals("rel")){
                s= "d";
                return "   ldc2_w "+ctx.intliteral().getText()+".0\n";
            }
            else if(!typ.equals("d")){
                s= "i";
                return "   ldc "+ctx.intliteral().getText()+ "\n";
            }
            else{
                s="d";
                return "   ldc2_w "+ctx.intliteral().getText()+".0\n";
            }
        }else if(ctx.floatliteral() != null){
            s = "d";
            return "   ldc2_w "+ctx.floatliteral().getText()+ "\n";
        }else if(ctx.stringliteral() != null){
            s= "a";
            return "   ldc "+ctx.stringliteral().getText()+ "\n";
        }else if(ctx.boolliteral() != null){
            s="i";
            if(typ.equals("if") || typ.equals("for")){
                    return "   iconst_"+examineBooleanZeroOrOne(ctx.boolliteral().getText())+"\n   ifeq Label"+ifStack.peek() + "\n";

            }else{
                return "   iconst_" + examineBooleanZeroOrOne(ctx.boolliteral().getText())+ "\n";
            }
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
