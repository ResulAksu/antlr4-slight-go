# antlr4-slight-go
Compiler Desing project for an slight Version of GO.
<hr/>
ANTLR is used to build the grammar.
<hr/>
Jasmin is used to form the parsed language into java byte code, to create a .class-File. 


<hr/>
<p>Use Instructions</p>

<p>-To build the grammar and within the visitor: </p>
<p>java -jar antlr-4.11.1-complete.jar -visitor Expr.g4 ExprLexer.g4</p>
<hr/>
<p>-To compole:</p>
<p>javac -cp antlr-4.11.1-complete.jar *.java</p>
<hr/>
<p>-To check if an Input can Compile (Parse,Typecheck)</p>
<p>java -cp "./antlr-4.11.1-complete.jar;" Main.java -compile File.go</p>
<p>-To see the liveness analyses</p>
<p>java -cp "./antlr-4.11.1-complete.jar;" Main.java -liveness File.go</p>
