package root;

import Parser.ExprBaseListener;
import Parser.ExprLexer;
import Parser.ExprParser;
import exp.AntlrToExpr;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ANTLR_Parser {

    public static void main(String[] args)
        {

            try {
                // Open the input file stream
                String fileName = "C:\\Users\\resul\\Desktop\\all\\antlr4-Projekt\\antlr4-slight-go\\antlr4-Projekt\\src\\Tests\\Test";
                CharStream codePointCharStream = CharStreams.fromFileName(fileName);

                // Create a lexer that feeds off of input CharStream
                ExprLexer lexer = new ExprLexer(codePointCharStream);

                // Create a buffer of tokens pulled from the lexer
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                // Create a parser that feeds off the tokens buffer
                ExprParser parser = new ExprParser(tokens);

                // Begin parsing at rule prog
                ParseTree tree = parser.prog();

                AntlrToExpr e = new AntlrToExpr();
                e.visit(tree);


                // Create a generic parse tree walker that can trigger callbacks
                ParseTreeWalker walker = new ParseTreeWalker();

                // Walk the tree created during the parse, trigger callbacks
                walker.walk(new ExprBaseListener(), tree);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

