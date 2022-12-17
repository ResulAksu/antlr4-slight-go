# antlr4-slight-go
Compilerbau Projekt für eine schwache Version von GO

Typechecking done:

how to compile:

-To build Visitor from Grammar:
java -jar antlr-4.11.1-complete.jar -visitor Expr.g4 ExprLexer.g4
-To compile all files:
javac -cp antlr-4.11.1-complete.jar *.java
-To check if an Input can Compile (Parse,Typecheck)
java -cp "./antlr-4.11.1-complete.jar;" Main.java -compile input.txt

