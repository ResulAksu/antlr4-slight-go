package typechecker;


import Parser.ExprBaseVisitor;
import Parser.ExprParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.beans.Expression;
import java.util.*;

public class Typechecker extends ExprBaseVisitor<Expression> {

    private final Map<String, String> myMethodsAndReturns = new HashMap<>();
    private final Map<String, MethodsWithMember> x = new HashMap<>();
    private final Map<String,String> currentMethodAndReturn = new HashMap<>();
    private final List<Exception> exceptionList = new ArrayList<>();

    public List<Exception> getExceptionList() {
        return exceptionList;
    }

    @Override
    public Expression visitProg(ExprParser.ProgContext ctx)  {
        x.put("Println", new MethodsWithMember());
        if (ctx.children.size() > 3) {
            for (int i = 0; i < ctx.children.size() - 3; i++) {
                myMethodsAndReturns.put(ctx.methodCaller().get(i).nameGiver().getText(), ctx.methodCaller().get(i).second_type().getText());
            }
        }

        if (!methodDuplicate(ctx.methodCaller())) {
            for (int i = 0; i < ctx.methodCaller().size(); i++) {
                MethodsWithMember m = new MethodsWithMember();
                if(ctx.methodCaller().get(i).methodMember().size() >=1){
                for (int j = 0; j < ctx.methodCaller().get(i).methodMember().get(0).second_type().size(); j++) {
                    m.getM().put(ctx.methodCaller().get(i).methodMember().get(0).nameGiver().get(j).getText(), ctx.methodCaller().get(i).methodMember().get(0).second_type().get(j).getText());

                }}

                x.put(ctx.methodCaller().get(i).nameGiver().getText(), m);
            }
        } else {
            exceptionList.add(new Exception("Declared same Method Name multiple Times: " + ctx.methodCaller().get(ctx.methodCaller().size()-1).FUNC().getSymbol().getLine()));
        }

        return super.visitProg(ctx);
    }

    private boolean methodDuplicate(List<ExprParser.MethodCallerContext> methodCaller) {
        String s = "";
        for (ExprParser.MethodCallerContext methodCallerContext : methodCaller) {
            if (s.equals(methodCallerContext.nameGiver().getText())) {
                return true;
            } else {
                s = methodCallerContext.nameGiver().getText();
            }
        }
        return false;
    }

    @Override
    public Expression visitMethodCaller(ExprParser.MethodCallerContext ctx) {
        return super.visitMethodCaller(ctx);
    }

    private final Map<String, String> myMethodsAndVarMember = new HashMap<>();
    String s = "";

    @Override
    public Expression visitMethodMember(ExprParser.MethodMemberContext ctx) {
        if (s.isEmpty() || s.equals(ctx.parent.getChild(1).getText())) {
            s = ctx.parent.getChild(1).getText();
            for (int i = 0; i < ctx.second_type().size(); i++) {
                if(!myMethodsAndVarMember.containsKey(ctx.nameGiver().get(i).getText())) {
                    myMethodsAndVarMember.put(ctx.nameGiver().get(i).getText(), ctx.second_type().get(i).getText());
                    currentMethodAndReturn.put(ctx.parent.getChild(1).getText(),ctx.parent.getChild(5).getText());
                }else{
                    exceptionList.add(new Exception("Variable already defined in same Scope at Line: " + ctx.KOMMA().get(0).getSymbol().getLine()));

                    break;
                }

            }
        } else {
            myMethodsAndVarMember.clear();
            currentMethodAndReturn.clear();
            s = ctx.parent.getChild(1).getText();

            for (int i = 0; i < ctx.second_type().size(); i++) {
                if(!myMethodsAndVarMember.containsKey(ctx.nameGiver().get(i).getText())) {
                    myMethodsAndVarMember.put(ctx.nameGiver().get(i).getText(), ctx.second_type().get(i).getText());
                    currentMethodAndReturn.put(ctx.parent.getChild(1).getText(),ctx.parent.getChild(5).getText());
                }else{
                    exceptionList.add(new Exception("Variable already defined in same Scope at Line: " + ctx.KOMMA().get(0).getSymbol().getLine()));
                    break;
                }
            }
        }
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
    public Expression visitReturner(ExprParser.ReturnerContext ctx) {
        //methodcaller name holen von dort die Value aus Map und gleiche Abgleich checkVar2,3
        List<String> types = currentMethodAndReturn.values().stream().toList();
        List<ParseTree> children = ctx.children;
        String type = types.get(0);

        if(ctx.boolCollector().isEmpty()) {
            checkVar3(type, children, 1);
        }

        return super.visitReturner(ctx);
    }

    @Override
    public Expression visitMainCaller(ExprParser.MainCallerContext ctx) {
        return super.visitMainCaller(ctx);
    }

    RuleContext blockId = null;
    Map<String, String> initVariables = new HashMap<>();

    @Override
    public Expression visitLocalvariableInit(ExprParser.LocalvariableInitContext ctx) {
        if (ctx.type() != null) {
            String type = ctx.type().getText();
            String varName = ctx.nameGiver().get(0).getText();
            List<ParseTree> children = ctx.children;
            int line = ctx.ASSERT().getSymbol().getLine();
            if (blockId == null || blockId == ctx.parent.parent) {
                blockId = ctx.parent.parent;
                checkVar(type, varName, children, 4 ,line);
            } else {
                initVariables.clear();
                blockId = ctx.parent.parent;
                checkVar(type, varName, children, 4, line);
            }

        }
        return super.visitLocalvariableInit(ctx);
    }

    private void checkVar(String type, String varName, List<ParseTree> children, int i, int line) {
        if (!initVariables.containsKey(varName) && !myMethodsAndVarMember.containsKey(varName)) {
            switch (type) {
                case "int":
                    boolean is = true;
                    for (; i < children.size(); i++) {
                        if (i % 2 == 0) {
                            if (!isInteger(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("int")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("int")) {
                                        is = false;
                                    }

                                } else if (myMethodsAndVarMember.containsKey(children.get(i).getText())) {
                                    if (!myMethodsAndVarMember.get(children.get(i).getText()).equals("int")) {
                                        is = false;
                                    }
                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        exceptionList.add(new Exception("Variable is not the same type : " +line));
                    } else {
                        initVariables.put(varName, type);
                    }
                    break;

                case "float64":
                    is = true;
                    for (; i < children.size(); i++) {
                        if (i % 2 == 0) {
                            if (!isFloat(children.get(i).getText()) && !isInteger(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("float64")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("int") && !myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("float64")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndVarMember.containsKey(children.get(i).getText())) {
                                    if (!myMethodsAndVarMember.get(children.get(i).getText()).equals("int") && !myMethodsAndVarMember.get(children.get(i).getText()).equals("float64")) {
                                        is = false;
                                    }
                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        exceptionList.add(new Exception("Variable is not the same type : " +line));
                    } else {
                        initVariables.put(varName, type);
                    }
                    break;

                case "string":
                    is = true;
                    for (; i < children.size(); i++) {
                        if (i % 2 == 0) {
                            if (!isString(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("string")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("string")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndVarMember.containsKey(children.get(i).getText())) {
                                    if (!myMethodsAndVarMember.get(children.get(i).getText()).equals("string")) {
                                        is = false;
                                    }
                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        exceptionList.add(new Exception("Variable is not the same type : " +line));
                    } else {
                        initVariables.put(varName, type);
                    }
                    break;

            }
        } else {
            //Fehler
            exceptionList.add(new Exception("Already initialized in same Scope"));
        }
    }

    public static boolean isString(String str){
        if(str == null){
            return false;
        }
        char[] ca = str.toCharArray();
        return  ca[0] == '"' && ca[ca.length-1] == '"';
    }
    public static boolean isBoolean(String strB) {
        if (strB == null) {
            return false;
        }
        return strB.equals("true") || strB.equals("false");
    }

    public static boolean isInteger(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isFloat(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            float i = Float.parseFloat(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String methodCallShortener(String s) {
        char[] ca = s.toCharArray();
        StringBuilder st = new StringBuilder();
        for (char c : ca) {
            if (c == '(') {
                break;
            }
            st.append(c);
        }
        return st.toString();
    }

    @Override
    public Expression visitVariableVis(ExprParser.VariableVisContext ctx) {
        String varName = ctx.children.get(0).getText();
        String typeVarName = "";
        //Init des Typs, wenn es die Variable nicht gab, gab es auch keine Typ-Init
        if(initVariables.containsKey(varName)){
            typeVarName = initVariables.get(varName);
        }else if(myMethodsAndVarMember.containsKey(varName)){
            typeVarName = myMethodsAndVarMember.get(varName);
        }

        if(!typeVarName.equals("")){
            List<ParseTree> children = ctx.children;
            checkVar2(typeVarName,varName,children,2);
        }else{
            exceptionList.add(new Exception("Variable not initialized"));
        }

        return super.visitVariableVis(ctx);
    }

    @Override
    public Expression visitPrintCall(ExprParser.PrintCallContext ctx) {
        return super.visitPrintCall(ctx);
    }

    private boolean isAllVar(List<ParseTree> children, int size) {
        int counter = 0;
        for (int i = 2; i < children.size() - 1; i++) {
            if (children.get(i).getText().equals(","))
                counter++;
        }
        counter++;
        if (!children.stream().map(ParseTree::getText).toList().contains(",")) counter =0;

        return counter == size;
    }

    @Override
    public Expression visitMethodCall(ExprParser.MethodCallContext ctx) {
        // ist leer weil der vorher geleert wird
        if(ctx.PRINT_LN() == null) {
            if (!x.containsKey(ctx.nameGiver().get(0).getText())) {
                exceptionList.add(new Exception("No such Method found: " + ctx.nameGiver().get(0).getText()));
            } else if (!isAllVar(ctx.children, x.get(ctx.nameGiver().get(0).getText()).getM().values().stream().toList().size())) {
                exceptionList.add(new Exception("Variables missing in method-call in Line: " + ctx.LEFTPAR().getSymbol().getLine()));
            } else {


                List<String> typs = x.get(ctx.nameGiver().get(0).getText()).getM().values().stream().toList();
                int j = 2;
                //check if more var to init than called

                for (int i = 0; i < typs.size(); i++) {
                    String typ = typs.get(i);
                    for (; j < ctx.children.size() - 1; j++) {
                        String chc = ctx.children.get(j).getText();
                        if (chc.equals(",")) {
                            j = j + 1;
                            break;
                        }
                        if (j % 2 == 0) {
                            switch (typ) {

                                case "int":
                                    boolean is = true;
                                    if (!isInteger(chc)) {
                                        if (initVariables.containsKey(chc)) {
                                            if (!initVariables.get(chc).equals("int")) {
                                                is = false;
                                            }
                                        } else if (myMethodsAndReturns.containsKey(methodCallShortener(chc))) {
                                            if (!myMethodsAndReturns.get(methodCallShortener(chc)).equals("int")) {
                                                is = false;
                                            }

                                        } else if (myMethodsAndVarMember.containsKey(chc)) {
                                            if (!myMethodsAndVarMember.get(chc).equals("int")) {
                                                is = false;
                                            }

                                        } else {
                                            is = false;
                                        }

                                    }
                                    if (!is) {
                                        exceptionList.add(new Exception("Wrong type : " + ctx.LEFTPAR().getSymbol().getLine()));
                                    } else {
                                        //richtig

                                    }

                                    break;
                                case "float64":
                                    is = true;
                                    if (!isFloat(chc) && !isInteger(chc)) {
                                        if (initVariables.containsKey(chc)) {
                                            if (!initVariables.get(chc).equals("float64")) {
                                                is = false;
                                            }
                                        } else if (myMethodsAndReturns.containsKey(methodCallShortener(chc))) {
                                            if (!myMethodsAndReturns.get(methodCallShortener(chc)).equals("int") && !myMethodsAndReturns.get(methodCallShortener(chc)).equals("float64")) {
                                                is = false;
                                            }
                                        } else if (myMethodsAndVarMember.containsKey(chc)) {
                                            if (!myMethodsAndVarMember.get(chc).equals("int") && !myMethodsAndVarMember.get(chc).equals("float64")) {
                                                is = false;
                                            }
                                        } else {
                                            is = false;
                                        }


                                        if (!is) {
                                            exceptionList.add(new Exception("Wrong type : " + ctx.LEFTPAR().getSymbol().getLine()));
                                        } else {
                                            //richtig
                                        }
                                    }
                                case "bool":
                                    is = true;
                                    if (!isBoolean(chc)) {
                                        if (initVariables.containsKey(chc)) {
                                            if (!initVariables.get(chc).equals("bool")) {
                                                is = false;
                                            }
                                        } else if (myMethodsAndReturns.containsKey(methodCallShortener(chc))) {
                                            if (!myMethodsAndReturns.get(methodCallShortener(chc)).equals("bool")) {
                                                is = false;
                                            }
                                        } else if (myMethodsAndVarMember.containsKey(chc)) {
                                            if (!myMethodsAndVarMember.get(chc).equals("bool")) {
                                                is = false;
                                            }
                                        } else {
                                            is = false;
                                        }


                                        if (!is) {
                                            exceptionList.add(new Exception("Wrong type : " + ctx.LEFTPAR().getSymbol().getLine()));
                                        } else {
                                            //richtig
                                        }
                                    }
                                case "string":
                                    is = true;

                                    if (!isString(chc)) {
                                    if (initVariables.containsKey(chc)) {
                                        if (!initVariables.get(chc).equals("string")) {
                                            is = false;
                                        }
                                    } else if (myMethodsAndReturns.containsKey(methodCallShortener(chc))) {
                                        if (!myMethodsAndReturns.get(methodCallShortener(chc)).equals("string") ){
                                            is = false;
                                        }
                                    } else if (myMethodsAndVarMember.containsKey(chc)) {
                                        if (!myMethodsAndVarMember.get(chc).equals("string")) {
                                            is = false;
                                        }
                                    } else {
                                        is = false;
                                    }
                                }
                        if (!is) {
                            exceptionList.add(new Exception("Wrong type : " + ctx.LEFTPAR().getSymbol().getLine()));
                        } else {
                            //richtig
                        }
                        break;
                            }


                        }


                    }
                }
            }
        }else{
            List<String> v =ctx.nameGiver().stream().map(RuleContext::getText).filter(a -> !isString(a) && !isArithmetic(a) && !isInteger(a) && !isBoolean(a) && !isFloat(a)).filter(a -> !initVariables.containsKey(a) && !myMethodsAndVarMember.containsKey(a) && !myMethodsAndReturns.containsKey(a)).toList();
            if (!v.isEmpty()){

                exceptionList.add(new Exception("Non initialized Variable in print-call: " + ctx.LEFTPAR().getSymbol().getLine()));
            }
        }


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
        return super.visitIntliteral(ctx);
    }

    @Override
    public Expression visitFloatliteral(ExprParser.FloatliteralContext ctx) {

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

    @Override
    public Expression visitBoolExpr(ExprParser.BoolExprContext ctx) {
        String chc = "";
        if (ctx.boolStat() == null && (!ctx.parent.getChild(0).getText().equals("for") && !ctx.parent.getChild(0).getText().equals("if")) && ctx.parent.parent.getChild(0).getText().equals("var")) {
            if (ctx.children == null) {
                exceptionList.add(new Exception("Not initialized"));
            } else if (ctx.children.size() > 1) {
                chc = ctx.children.get(ctx.children.size() - 1).getText();
            } else {
                chc = ctx.children.get(0).getText();
            }
            boolean is = true;
            if (!initVariables.containsKey(ctx.parent.parent.getChild(1).getText()) && !myMethodsAndVarMember.containsKey(ctx.parent.parent.getChild(1).getText())) {
                if (!isBoolean(chc)) {
                    if (initVariables.containsKey(chc)) {
                        if (!initVariables.get(chc).equals("bool")) {
                            is = false;
                        }
                    } else if (myMethodsAndReturns.containsKey(methodCallShortener(chc))) {
                        if (!myMethodsAndReturns.get(methodCallShortener(chc)).equals("bool")) {
                            is = false;
                        }
                    } else if (myMethodsAndVarMember.containsKey(chc)) {
                        if (!myMethodsAndVarMember.get(chc).equals("bool")) {
                            is = false;
                        }
                    } else {
                        is = false;
                    }}

                    if (!is) {
                        exceptionList.add(new Exception("Not a boolean"));
                    } else {
                        initVariables.put(ctx.parent.parent.getChild(1).getText(), "bool");
                    }

            } else {
                exceptionList.add(new Exception("Wrong initialized"));
            }
        } else if (ctx.boolStat() == null && (ctx.parent.getChild(0).getText().equals("for") || ctx.parent.getChild(0).getText().equals("if"))) {
            if (ctx.children.size() > 1) {
                chc = ctx.children.get(ctx.children.size() - 1).getText();
            } else {
                chc = ctx.children.get(0).getText();
            }
            boolean is = true;
            if (!isBoolean(chc)) {
                if (initVariables.containsKey(chc)) {
                    if (!initVariables.get(chc).equals("bool")) {
                        is = false;
                    }
                } else if (myMethodsAndReturns.containsKey(methodCallShortener(chc))) {
                    if (!myMethodsAndReturns.get(methodCallShortener(chc)).equals("bool")) {
                        is = false;
                    }
                } else if (myMethodsAndVarMember.containsKey(chc)) {
                    if (!myMethodsAndVarMember.get(chc).equals("bool")) {
                        is = false;
                    }
                } else {
                    is = false;
                }


                if (!is) {
                    exceptionList.add(new Exception("Not a boolean in for/if"));
                } else {
                    //richtig
                }
            }
        }else if(ctx.parent.parent.getChild(0).getText().equals("return")){
            if (ctx.children.size() > 1) {
                chc = ctx.children.get(ctx.children.size() - 1).getText();
            } else {
                chc = ctx.children.get(0).getText();
            }
            boolean is = true;
            if (!isBoolean(chc)) {
                if (initVariables.containsKey(chc)) {
                    if (!initVariables.get(chc).equals("bool")) {
                        is = false;
                    }
                } else if (myMethodsAndReturns.containsKey(methodCallShortener(chc))) {
                    if (!myMethodsAndReturns.get(methodCallShortener(chc)).equals("bool")) {
                        is = false;
                    }
                } else if (myMethodsAndVarMember.containsKey(chc)) {
                    if (!myMethodsAndVarMember.get(chc).equals("bool")) {
                        is = false;
                    }
                } else {
                    is = false;
                }


                if (!is) {
                    exceptionList.add(new Exception("Wrong Return Variable"));
                } else {
                    //richtig
                }
            }
        }
        return super.visitBoolExpr(ctx);
    }

    @Override
    public Expression visitBoolStat(ExprParser.BoolStatContext ctx) {
        String typ_index0 = "";
        int i = 0;
        for (int j = 0; j < ctx.children.size(); j++) {
            if (ctx.children.get(j).getText().equals("!")) i++;
            else {
                break;
            }
        }
        String child_one = ctx.children.get(i).getText();
        if (isBoolean(child_one)) typ_index0 = "bool";
        else if (isInteger(child_one)) typ_index0 = "int";
        else if (isFloat(child_one)) typ_index0 = "float64";
        else if (initVariables.containsKey(child_one)) typ_index0 = initVariables.get(child_one);
        else if (myMethodsAndReturns.containsKey(methodCallShortener(child_one)))
            typ_index0 = myMethodsAndReturns.get(methodCallShortener(child_one));
        else if (myMethodsAndVarMember.containsKey(child_one)) typ_index0 = myMethodsAndVarMember.get(child_one);

        int k = i + 2;
        for (int j = k; j < ctx.children.size(); j++) {
            if (ctx.children.get(j).getText().equals("!")) k++;
            else {
                break;
            }
        }
        String typ_index2 = "";
        String child_three = ctx.children.get(k).getText();
        if (isBoolean(child_three)) typ_index2 = "bool";
        else if (isInteger(child_three)) typ_index2 = "int";
        else if (isFloat(child_three)) typ_index2 = "float64";
        else if (initVariables.containsKey(child_three)) typ_index2 = initVariables.get(child_three);
        else if (myMethodsAndReturns.containsKey(methodCallShortener(child_three)))
            typ_index2 = myMethodsAndReturns.get(methodCallShortener(child_three));
        else if (myMethodsAndVarMember.containsKey(child_three)) typ_index2 = myMethodsAndVarMember.get(child_three);

        String child_two = ctx.children.get(i + 1).getText();
        if (isArithmetic(child_two)) {
            if (typ_index0.equals("bool") || typ_index2.equals("bool")) {
                exceptionList.add(new Exception("Can't compare with arithmetics"));
            }
        }
        if (!typ_index0.equals(typ_index2)) exceptionList.add(new Exception("Can't compare with two different types"));
        return super.visitBoolStat(ctx);
    }

    private boolean isArithmetic(String s) {
        return s.equals("<") || s.equals(">") || s.equals(">=") || s.equals("<=");
    }


    @Override
    public Expression visitOnlyName(ExprParser.OnlyNameContext ctx) {
        return super.visitOnlyName(ctx);
    }

    @Override
    public Expression visitBoolCollector(ExprParser.BoolCollectorContext ctx) {
        return super.visitBoolCollector(ctx);
    }

    private String shortenerBoolean(String s) {
        char[] ca = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : ca) {
            if (c != '!')
                stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private void checkVar2(String type, String varName, List<ParseTree> children, int i) {
        if (initVariables.containsKey(varName) || myMethodsAndVarMember.containsKey(varName)) {
            switch (type) {
                case "int":
                    boolean is = true;
                    for (; i < children.size(); i++) {
                        if (i % 2 == 0) {
                            if (!isInteger(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("int")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("int")) {
                                        is = false;
                                    }

                                } else if (myMethodsAndVarMember.containsKey(children.get(i).getText())) {
                                    if (!myMethodsAndVarMember.get(children.get(i).getText()).equals("int")) {
                                        is = false;
                                    }
                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        exceptionList.add(new Exception("Wrong type while initializing Variable"));
                    } else {
                        //richtig
                    }
                    break;

                case "float64":
                    is = true;
                    for (; i < children.size(); i++) {
                        if (i % 2 == 0) {
                            if (!isFloat(children.get(i).getText()) && !isInteger(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("float64")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("int") && !myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("float64")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndVarMember.containsKey(children.get(i).getText())) {
                                    if (!myMethodsAndVarMember.get(children.get(i).getText()).equals("int") && !myMethodsAndVarMember.get(children.get(i).getText()).equals("float64")) {
                                        is = false;
                                    }
                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        exceptionList.add(new Exception("Wrong type while initializing Variable"));
                    } else {
                        //richtig
                    }
                    break;

                case "string":
                    is = true;
                    for (; i < children.size(); i++) {
                        if (i % 2 == 0) {
                            if (!isString(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("string")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("string")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndVarMember.containsKey(children.get(i).getText())) {
                                    if (!myMethodsAndVarMember.get(children.get(i).getText()).equals("string")) {
                                        is = false;
                                    }
                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        exceptionList.add(new Exception("Wrong type while initializing Variable"));
                    } else {
                        //richtig

                    }
                    break;

            }
        }
    }

    private void checkVar3(String type, List<ParseTree> children, int i) {

            switch (type) {
                case "int":
                    boolean is = true;
                    for (; i < children.size(); i++) {
                        if (i % 2 != 0) {
                            if (!isInteger(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("int")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("int")) {
                                        is = false;
                                    }

                                } else if (myMethodsAndVarMember.containsKey(children.get(i).getText())) {
                                    if (!myMethodsAndVarMember.get(children.get(i).getText()).equals("int")) {
                                        is = false;
                                    }
                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        exceptionList.add(new Exception("Wrong Return type"));
                    } else {
                        //richtig
                    }
                    break;

                case "float64":
                    is = true;
                    for (; i < children.size(); i++) {
                        if (i % 2 != 0) {
                            if (!isFloat(children.get(i).getText()) && !isInteger(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("float64")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("int") && !myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("float64")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndVarMember.containsKey(children.get(i).getText())) {
                                    if (!myMethodsAndVarMember.get(children.get(i).getText()).equals("int") && !myMethodsAndVarMember.get(children.get(i).getText()).equals("float64")) {
                                        is = false;
                                    }
                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        exceptionList.add(new Exception("Wrong Return type"));
                    } else {
                        //richtig
                    }
                    break;

                case "string":
                    is = true;
                    for (; i < children.size(); i++) {
                        if (i % 2 != 0) {
                            if (!isString(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("string")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("string")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndVarMember.containsKey(children.get(i).getText())) {
                                    if (!myMethodsAndVarMember.get(children.get(i).getText()).equals("string")) {
                                        is = false;
                                    }
                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                case "bool":
                    is = true;
                    for (; i < children.size(); i++) {
                        if (i % 2 != 0) {
                            if (!isBoolean(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("bool")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("bool")) {
                                        is = false;
                                    }
                                } else if (myMethodsAndVarMember.containsKey(children.get(i).getText())) {
                                    if (!myMethodsAndVarMember.get(children.get(i).getText()).equals("bool")) {
                                        is = false;
                                    }
                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        exceptionList.add(new Exception("Wrong Return type"));
                    } else {
                        //richtig

                    }
                    break;

            }
        }
    }

