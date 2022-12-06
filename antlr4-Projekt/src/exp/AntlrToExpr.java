package exp;


import Parser.ExprBaseVisitor;
import Parser.ExprParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.beans.Expression;
import java.util.*;

public class AntlrToExpr extends ExprBaseVisitor<Expression> {

    private Map<String,String> myMethodsAndReturns = new HashMap<>();

    @Override
    public Expression visitProg(ExprParser.ProgContext ctx) {
        if (ctx.children.size() >3) {
            for (int i = 0; i < ctx.children.size()-3 ; i++) {
                myMethodsAndReturns.put(ctx.methodCaller().get(i).nameGiver().getText(),ctx.methodCaller().get(i).type().getText());
            }
        }
        System.out.println(myMethodsAndReturns);
        return super.visitProg(ctx);
    }

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

    RuleContext blockId = null;
    Map<String,String> initVariables = new HashMap<>();

    @Override
    public Expression visitLocalvariableInit(ExprParser.LocalvariableInitContext ctx) {
        String type = ctx.type().getText();
        String varName = ctx.nameGiver().get(0).getText();
        List<ParseTree> children = ctx.children;

        if(blockId == null || blockId == ctx.parent.parent) {
            blockId = ctx.parent.parent;
            checkVar(type, varName, children);

            }else {
                // new block reset map
                initVariables.clear();
                blockId = ctx.parent.parent;
                checkVar(type, varName, children);
            }


        return super.visitLocalvariableInit(ctx);
    }

    private void checkVar(String type, String varName, List<ParseTree> children) {
        if(!initVariables.containsKey(varName)) {
            switch (type) {
                case "int":
                    boolean is = true;
                    for (int i = 4; i < children.size(); i++) {
                        if (i % 2 == 0) {
                            if (!isIntegerWhileInitWihtoutArithmetics(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("int")) {
                                        is = false;
                                    }
                                } else if(myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))){
                                    if(!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("int")){
                                        is = false;
                                    }

                                } else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        System.out.println("fehler");
                    } else {
                        initVariables.put(varName, type);
                    }
                    break;

                case "float64":
                    is = true;
                    for (int i = 4; i < children.size(); i++) {
                        if (i % 2 == 0) {
                            if (!isFloatWhileInitWihtoutArithmetics(children.get(i).getText()) && !isIntegerWhileInitWihtoutArithmetics(children.get(i).getText())) {
                                if (initVariables.containsKey(children.get(i).getText())) {
                                    if (!initVariables.get(children.get(i).getText()).equals("float64")) {
                                        is = false;
                                    }
                                }else if(myMethodsAndReturns.containsKey(methodCallShortener(children.get(i).getText()))) {
                                    if (!myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("int") && !myMethodsAndReturns.get(methodCallShortener(children.get(i).getText())).equals("float64")) {
                                        is = false;
                                    }
                                }
                                else {
                                    is = false;
                                }
                            }
                        }
                    }
                    if (!is) {
                        System.out.println("fehler");
                    } else {
                        initVariables.put(varName, type);
                    }
                    break;
                case "bool":
                    is = true;
                    // -> on Pause
                    List<Integer> booleans = new ArrayList<>();
                    //booleans 0 , logicals 1, not 2 -> 0 darf nicht nach 0,1 darf nicht nach 1, 2 darf nicht vor 1 und nicht am Ende
                    for (int i = 4; i < children.size(); i++) {
                        if(isBoolean(children.get(i).getText())){
                            booleans.add(0);
                        }
                        if(logicals.contains(children.get(i).getText())){
                            if(children.get(i).getText().equals("!")){
                                booleans.add(2);
                            }else{
                                booleans.add(1);
                            }
                        }
                        if(initVariables.containsKey(children.get(i).getText())){
                            if (initVariables.get(children.get(i).getText()).equals("bool")){
                                booleans.add(0);
                            }
                        }else{
                            is = false;
                        }
                    }
                    if(is){

                    }

                //case "string":
            }
        }else{
            //Fehler
            System.out.println("schon initialisiert");
        }
    }

    List<String> logicals = List.of("!", "||", "&&");

    public static boolean isBoolean(String strB){
        if (strB == null) {
            return false;
        }
        return strB.equals("true") || strB.equals("false");
    }

    public static boolean isIntegerWhileInitWihtoutArithmetics(String strNum) {
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

    public static boolean isFloatWhileInitWihtoutArithmetics(String strNum) {
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

    public static String methodCallShortener(String s){
        int l = s.toCharArray().length;
        char[] ca = new char[l];
        ca = s.toCharArray();
        StringBuilder st = new StringBuilder();
        for (char c : ca){
            if(c == '('){
                break;
            }
            st.append(c);
        }
        return st.toString();
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


}
