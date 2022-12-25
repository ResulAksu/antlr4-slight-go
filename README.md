# antlr4-slight-go
Compilerbau Projekt für eine schwache Version von GO

Typechecking done. 
Working on CodeGenerator:
<p>Java.class to Jasmin Bytecode jar inkludiert ausführen mit:</p>
<p>javac file.java</p>
<p>java -jar jasmin.jar file.class</p>

<hr/>
<p>how to compile:</p>

<p>-To build Visitor from Grammar: </p>
<p>java -jar antlr-4.11.1-complete.jar -visitor Expr.g4 ExprLexer.g4</p>
<p>-To compile all files:</p>
<p>javac -cp antlr-4.11.1-complete.jar *.java</p>
<p>-To check if an Input can Compile (Parse,Typecheck)</p>
<p>java -cp "./antlr-4.11.1-complete.jar;" Main.java -compile input.txt</p>

