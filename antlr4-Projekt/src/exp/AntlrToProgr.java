package exp;

import Parser.ExprBaseVisitor;
import Parser.ExprParser;

import java.beans.Expression;

public class AntlrToProgr extends ExprBaseVisitor<Expression> {
    @Override
    public Expression visitCompilationUnit(ExprParser.CompilationUnitContext ctx) {
        return super.visitCompilationUnit(ctx);
    }
}
