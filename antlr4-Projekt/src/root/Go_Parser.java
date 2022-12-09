package root;

import Parser.ExprBaseListener;
import Parser.ExprLexer;
import Parser.ExprParser;
import typechecker.Typechecker;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Go_Parser {

    public static void main(String[] args) {
        String s = args[0];
        if (s.equals("-compile")) {
            try {
                // Open the input file stream
                String fileName = args[1];
                CharStream codePointCharStream = CharStreams.fromFileName(fileName);

                // Create a lexer that feeds off of input CharStream
                ExprLexer lexer = new ExprLexer(codePointCharStream);

                // Create a buffer of tokens pulled from the lexer
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                // Create a parser that feeds off the tokens buffer
                ExprParser parser = new ExprParser(tokens);

                // Begin parsing at rule prog
                ParseTree tree = parser.prog();

                Typechecker e = new Typechecker();
                e.visit(tree);

                List<Exception> exceptions = e.getExceptionList();
                if (!exceptions.isEmpty()) {
                    for (Exception exc : exceptions) {
                        exc.printStackTrace();
                    }
                }


            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    }

