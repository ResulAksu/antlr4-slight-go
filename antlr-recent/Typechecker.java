
import java.beans.Expression;
import java.util.*;


public class Typechecker extends ExprBaseVisitor<Expression> {

    private final Map<String, MethodsWithMember> methodsAndMembers = new HashMap<>();
    private final Map<String,String> methodsAndReturns = new HashMap<>();
    private final List<Exception> exceptionList = new ArrayList<>();
    private final Map<String,String> varAndTyps = new HashMap<>();
    private final Map<String,String> nonInitVars = new HashMap<>();

    @Override
    public Expression visitProg(Expr.ProgContext ctx) {
        methodsAndReturns.put("Println", "null");
        List<String> checkDuplicates = new ArrayList<>();
        for (int i = 0; i < ctx.methodCaller().size(); i++) {
            String name = ctx.methodCaller().get(i).nameGiver().getText();
            if(checkDuplicates.contains(name)){
                exceptionList.add(new Exception("Declared same Method Name multiple Times: " + ctx.methodCaller().get(i).FUNC().getSymbol().getLine()));
                break;
            }else{
                checkDuplicates.add(name);
            }

            if(ctx.methodCaller().get(i).type() == null){
                methodsAndReturns.put(name,"null");
            }else{
                String type = ctx.methodCaller().get(i).type().getText();
                methodsAndReturns.put(name,type);
            }
        }

        //Methoden und Methodenmember
        for (int i = 0; i < ctx.methodCaller().size(); i++){
            String methodName = ctx.methodCaller().get(i).nameGiver().getText();
            MethodsWithMember m = new MethodsWithMember();
            if(ctx.methodCaller().get(i).methodMember() != null){
                if(!ctx.methodCaller().get(i).methodMember().isEmpty()){

                    for (int j = 0; j < ctx.methodCaller().get(i).methodMember().nameGiver().size(); j++) {
                        String type = ctx.methodCaller().get(i).methodMember().type().get(j).getText();
                        String varName = ctx.methodCaller().get(i).methodMember().nameGiver().get(j).getText();
                        m.getM().put(varName, type);
                    }
                }
            methodsAndMembers.put(methodName,m);
        }
            }
        return super.visitProg(ctx);
    }


    private String currentreturnType = "";
    @Override
    public Expression visitMethodCaller(Expr.MethodCallerContext ctx) {
        if(ctx.type() != null) {
            currentreturnType = ctx.type().getText();
        }else{
            currentreturnType = "null";
        }
        try {
            boolean checker = checkReturnsRecursive(ctx.block());
            if(!checker){
                exceptionList.add(new Exception("Missing Return in Block: " +ctx.block().LEFTBRACE().getSymbol().getLine()));
            }
        }catch (RuntimeException r){
            exceptionList.add(new Exception(r.getMessage()));
        }
        varAndTyps.clear();
        return super.visitMethodCaller(ctx);
    }

    private boolean checkReturnsRecursive(Expr.BlockContext ctx) {
        boolean ex = ctx.returner() != null;
        if(ex){
            if(currentreturnType.equals("null") && ctx.returner().expression() != null){
                throw new RuntimeException("Return should be empty but has an Expression in Line: " +ctx.returner().RETURN().getSymbol().getLine());
            }
            return true;
        }else{
            if(!currentreturnType.equals("null")){
                if(ctx.blockStatements() != null) {
                    Expr.StatementsContext lastStatement = ctx.blockStatements().statements(ctx.blockStatements().statements().size() - 1);
                    if (lastStatement.if_and_or_else_expression() != null) {
                        boolean b = checkReturnsRecursive(lastStatement.if_and_or_else_expression().block(0));
                        if (lastStatement.if_and_or_else_expression().ELSE_TOKEN() != null && b) {
                            return checkReturnsRecursive(lastStatement.if_and_or_else_expression().block(1));
                        }
                        return b;
                    } else if (lastStatement.for_loop() != null) {
                        return checkReturnsRecursive(lastStatement.for_loop().block());
                    } else if (lastStatement.block() != null) {
                        return checkReturnsRecursive(lastStatement.block());
                    }
                    return false;
                }else{
                    return false;
                }

            }else{
                return true;
            }
        }
    }

    @Override
    public Expression visitMethodMember(Expr.MethodMemberContext ctx) {
        //Duplikte in Methodenmembern
        String varName = "";
        for (int i = 0; i < ctx.nameGiver().size(); i++) {
            if(!varName.equals(ctx.nameGiver().get(i).getText())){
                varName = ctx.nameGiver().get(i).getText();
            }else{
                exceptionList.add(new Exception("Variable already defined in same Scope at Line: " + ctx.KOMMA().get(0).getSymbol().getLine()));
                break;
            }
        }
        //Member in initliste und hier clearen falls neuer Kopf kommt
        for (int i = 0; i < ctx.nameGiver().size(); i++) {
            varAndTyps.put(ctx.nameGiver().get(i).getText(),ctx.type().get(i).getText());
        }



        return super.visitMethodMember(ctx);
    }

    @Override
    public Expression visitBlock(Expr.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Expression visitBlockStatements(Expr.BlockStatementsContext ctx) {
        return super.visitBlockStatements(ctx);
    }

    @Override
    public Expression visitStatements(Expr.StatementsContext ctx) {

        return super.visitStatements(ctx);
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

    @Override
    public Expression visitReturner(Expr.ReturnerContext ctx) {
        if(ctx.expression() == null){
            if(!currentreturnType.equals("null")){
                exceptionList.add(new Exception("Fehler im Return"));
            }
        }
        return super.visitReturner(ctx);
    }


    String currentVarType = "";
    @Override
    public Expression visitLocalvariableInit(Expr.LocalvariableInitContext ctx) {
        if(ctx.VAR() != null) {
            if(ctx.ASSERT() != null) {
                if (!varAndTyps.containsKey(ctx.nameGiver().getText())) {
                    currentVarType = ctx.type().getText();
                    varAndTyps.put(ctx.nameGiver().getText(), ctx.type().getText());
                } else {
                    exceptionList.add(new Exception("Variable already defined in same Scope at Line: " + ctx.VAR().getSymbol().getLine()));
                }
            }else{
                if(!varAndTyps.containsKey(ctx.nameGiver().getText()) && !nonInitVars.containsKey(ctx.nameGiver().getText())){
                    nonInitVars.put(ctx.nameGiver().getText(),ctx.type().getText());
                }else{
                    exceptionList.add(new Exception("Variable already defined in same Scope at Line: " + ctx.VAR().getSymbol().getLine()));
                }
            }
        }else{
            if(!varAndTyps.containsKey(ctx.nameGiver().getText()) && !nonInitVars.containsKey(ctx.nameGiver().getText())){
                exceptionList.add(new Exception("Variable not defined in at Line: " + ctx.ASSERT().getSymbol().getLine()));
            }else{
                if(varAndTyps.containsKey(ctx.nameGiver().getText())) currentVarType = varAndTyps.get(ctx.nameGiver().getText());
                else if(nonInitVars.containsKey(ctx.nameGiver().getText())){
                    currentVarType = nonInitVars.get(ctx.nameGiver().getText());
                    varAndTyps.put(ctx.nameGiver().getText(), nonInitVars.get(ctx.nameGiver().getText()));
                    nonInitVars.remove(ctx.nameGiver().getText());
                }

            }
        }
        return super.visitLocalvariableInit(ctx);
    }

    int i = 0;
    @Override
    public Expression visitExpression(Expr.ExpressionContext ctx) {
            i++;
            //Return, IF, FOR, Var oder direkter Aufruf, Functioncall
            if (ctx.parent.getChild(0).getText().equals("var")) {
                String currentType = varAndTyps.get(ctx.parent.getChild(1).getText());
                try {
                    String s = calcType(ctx);
                    if(!s.equals(currentType)) {
                        if(!(currentType.equals("float64") && s.equals("int")))
                        exceptionList.add(new Exception("Wrong Expression Type at initializing of Variable"));}

                } catch (RuntimeException e){
                    exceptionList.add(new Exception(e.getMessage()));
                }
            }else if(ctx.parent.getChild(0).getText().equals("if") || ctx.parent.getChild(0).getText().equals("for")){
                String type = "bool";
                try {
                    String s = calcType(ctx);
                    if(!s.equals(type)) exceptionList.add(new Exception("Expression in if or for Statement is not a boolean"));
                } catch (RuntimeException e){
                    exceptionList.add(new Exception(e.getMessage()));
                }
            }else if(ctx.parent.getChild(0).getText().equals("return")){
                String type = currentreturnType;
                try {
                    String s = calcType(ctx);
                    if(!s.equals(type)) {
                        if(!(type.equals("float64") && s.equals("int")))
                        exceptionList.add(new Exception("Wrong type of Expression in Return"));}
                } catch (RuntimeException e){
                    exceptionList.add(new Exception(e.getMessage()));

                }
            }else if (ctx.parent.getChild(0).getText().equals("Println")){
                try {
                    String s = calcType(ctx);
                } catch (RuntimeException e){
                    exceptionList.add(new Exception(e.getMessage()));

                }
            } else{
                if(methodsAndMembers.containsKey(ctx.parent.getChild(0).getText())){

                }else if(varAndTyps.containsKey(ctx.parent.getChild(0).getText())){
                    String currentType = varAndTyps.get(ctx.parent.getChild(0).getText());
                    try{
                        String s = calcType(ctx);
                        if(!s.equals(currentType)) exceptionList.add(new Exception("Wrong Expression Type at initializing of Variable"));
                    } catch (RuntimeException e){
                        exceptionList.add(new Exception(e.getMessage()));
                    }
                }else if(nonInitVars.containsKey(ctx.parent.getChild(0).getText())){
                    String currentType = nonInitVars.get(ctx.parent.getChild(0).getText());
                    try{
                        String s = calcType(ctx);
                        if(!s.equals(currentType)) exceptionList.add(new Exception("Wrong Expression Type at initializing of Variable"));
                    } catch (RuntimeException e){
                        exceptionList.add(new Exception(e.getMessage()));
                    }
                    nonInitVars.remove(ctx.parent.getChild(0).getText());

                }


            }


        return null;
    }




    String  calcType(Expr.ExpressionContext ctx) {
        if(ctx.mul_op != null || ctx.add_op != null) {
            String left = calcType(ctx.left);
            String right = calcType(ctx.right);
            if (!left.equals("int") && !left.equals("float64")) throw new RuntimeException("No Expression other than int or float64 should be work out under this operator");
            if (!right.equals("int") && !right.equals("float64")) throw new RuntimeException("No Expression other than int or float64 should be work out under this operator");
            if (left.equals("float64") || right.equals("float64")) return "float64";
            else return "int";
        }else if(ctx.primaryExpr() != null){
            if(ctx.primaryExpr().typeProduction() != null){
                if(ctx.primaryExpr().typeProduction().boolliteral()!=null){
                    return "bool";
                }else if(ctx.primaryExpr().typeProduction().floatliteral() != null){
                    return "float64";
                }else if(ctx.primaryExpr().typeProduction().stringliteral() != null){
                    return "string";
                }else if(ctx.primaryExpr().typeProduction().intliteral() != null){
                    return "int";
                }
            }else if(ctx.primaryExpr().nameGiver() != null){
                if(varAndTyps.containsKey(ctx.primaryExpr().nameGiver().getText())){
                    return varAndTyps.get(ctx.primaryExpr().nameGiver().getText());
                }else{
                    throw new RuntimeException("Variable is not initialized in Expression");
                }
            }else if(ctx.primaryExpr().methodCall() != null){
                if(methodsAndReturns.containsKey(ctx.primaryExpr().methodCall().nameGiver().getText())){
                    visitMethodCall(ctx.primaryExpr().methodCall());
                    return methodsAndReturns.get(ctx.primaryExpr().methodCall().nameGiver().getText());
                }else{
                    throw new RuntimeException("Method is not initialized in Expression");
                }
            }else if(ctx.primaryExpr().expression() != null){
                return calcType(ctx.primaryExpr().expression());
            }
        }else if(ctx.rel_op != null){
            String left = calcType(ctx.left);
            String right = calcType(ctx.right);
            if(left.equals("string") && right.equals("string"))return "bool";
            else if(left.equals("bool") && right.equals("bool") && (ctx.rel_op.getText().equals("==") || ctx.rel_op.getText().equals("!="))) return "bool";
            else if((left.equals("int") || left.equals("float64")) && (right.equals("int") || right.equals("float64"))) return "bool";
            else throw new RuntimeException("Wrong execution of the relative Operator");
        }else if(ctx.LOGICAL_AND() != null || ctx.LOGICAL_OR() != null){
            String left = calcType(ctx.left);
            String right = calcType(ctx.right);
            if(left.equals("bool") && right.equals("bool")) return "bool";
            else throw new RuntimeException("Wrong execution of the Logical AND|OR Operator");
        }else if(ctx.unary_op != null){
            String right = calcType(ctx.right);
            if(right.equals("int") && (ctx.unary_op.getText().equals("+") || ctx.unary_op.getText().equals("*")||ctx.unary_op.getText().equals("-"))) return "int";
            else if(right.equals("float64") && (ctx.unary_op.getText().equals("+") || ctx.unary_op.getText().equals("*")||ctx.unary_op.getText().equals("-"))) return "float64";
            else if(right.equals("bool") && ctx.unary_op.getText().equals("!")) return "bool";
            else throw new RuntimeException("Wrong usage of unary Operator");
        }

        return "";
    }



    @Override
    public Expression visitPrimaryExpr(Expr.PrimaryExprContext ctx) {
        return super.visitPrimaryExpr(ctx);
    }


    @Override
    public Expression visitPrintCall(Expr.PrintCallContext ctx) {
        return super.visitPrintCall(ctx);
    }

    @Override
    public Expression visitMethodCall(Expr.MethodCallContext ctx) {
        checkMethodCall(ctx);
        return super.visitMethodCall(ctx);
    }

    private void checkMethodCall(Expr.MethodCallContext ctx) {
        if(methodsAndReturns.containsKey(ctx.nameGiver().getText())) {
            if(!ctx.nameGiver().getText().equals("Println")) {
                if (!ctx.expression().isEmpty()) {
                    if (ctx.nameGiver() != null) {
                        String name = ctx.nameGiver().getText();
                        List<String> typs = new LinkedList<>();
                        List<String> fromMembers = new LinkedList<>();
                        if (methodsAndMembers.containsKey(name)) {
                            MethodsWithMember m = methodsAndMembers.get(name);
                            fromMembers = m.getM().values().stream().toList();
                        }
                        for (int i = 0; i < ctx.expression().size(); i++) {
                            try {
                                String argu = calcType(ctx.expression(i));
                                typs.add(argu);
                            } catch (RuntimeException e) {
                                exceptionList.add(new Exception(e.getMessage()));
                            }
                        }
                        if (typs.size() != fromMembers.size()) {
                            exceptionList.add(new Exception("Arguments were taken incorrectly in Methodcall"));
                        } else {
                            for (int i = 0; i < typs.size(); i++) {
                                if (!typs.get(i).equals(fromMembers.get(i))) {
                                    if( !(typs.get(i).equals("int") && fromMembers.get(i).equals("float64")) ) {
                                        exceptionList.add(new Exception("Not same type of Arguments in Methodcall as in Method Parameterlist in Method: " + ctx.nameGiver().getText()));
                                        break;
                                    }
                                }
                            }
                        }

                    }
                } else {
                    String name = ctx.nameGiver().getText();
                    List<String> fromMembers = new LinkedList<>();
                    if (methodsAndMembers.containsKey(name)) {
                        MethodsWithMember m = methodsAndMembers.get(name);
                        fromMembers = m.getM().values().stream().toList();
                    }
                    if (!fromMembers.isEmpty()) exceptionList.add(new Exception("Arguments were taken incorrectly in Methodcall"));
                    for (int i = 0; i < ctx.expression().size(); i++) {
                        try {
                            String argu = calcType(ctx.expression(i));

                        } catch (RuntimeException e) {
                            exceptionList.add(new Exception(e.getMessage()));
                        }
                    }
                }
            }
        }else{
            exceptionList.add(new Exception("Method not initialized: "+ ctx.nameGiver().getText()));
        }
    }

    @Override
    public Expression visitType(Expr.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Expression visitTypeProduction(Expr.TypeProductionContext ctx) {
        return super.visitTypeProduction(ctx);
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
    public Expression visitNameGiver(Expr.NameGiverContext ctx) {
        return super.visitNameGiver(ctx);
    }

    @Override
    public Expression visitEof(Expr.EofContext ctx) {
        if(!nonInitVars.isEmpty()){
            exceptionList.add(new Exception("Non initialized Variables"));
        }
        return super.visitEof(ctx);
    }

    public List<Exception> getExceptionList() {
        return exceptionList;
    }
}
