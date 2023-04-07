parser grammar Expr;
options{

    tokenVocab = ExprLexer;

}
prog
    : packageProdcution  importProduction* methodCaller* eof
    ;

methodCaller
    : FUNC nameGiver LEFTPAR methodMember? RIGHTPAR type? block EOS

    ;

methodMember
    :
     nameGiver type (KOMMA nameGiver type)*
    ;

block
    : LEFTBRACE blockStatements? returner? RIGHTBRACE
    ;

blockStatements
    :   (statements EOS)+ ;

statements:
    localvariableInit | if_and_or_else_expression | for_loop | printCall | methodCall | block ;

stringliteral
    : STRING_LIT;
    

if_and_or_else_expression
    : IF_TOKEN (expression+| EOS expression) block (ELSE_TOKEN block)?;

for_loop
    :  FOR_TOKEN expression+ block;


returner
    : RETURN expression? EOS;

localvariableInit
      ://VAR nameGiver BOOLEAN ASSERT boolCollector
      nameGiver ASSERT expression+ | VAR nameGiver type (ASSERT expression+)?
    ;
expression:
	primaryExpr
	| unary_op = (
		ADD
		| SUB
		| LOGICAL_NOT
	) right =expression
	| left =expression mul_op = (
		MUL
		| DIV
		| MODULO
	) right = expression
	| left= expression add_op = (ADD | SUB) right =expression
	| left= expression rel_op = (
		EQUALS
		| NOT_EQUAL
		| SMALLER
		| SMALLER_OR_EQUAL
		| GREATER
		| GREATER_OR_EQUAL
	) right =expression
	| left=expression LOGICAL_AND right = expression
	| left=expression LOGICAL_OR right =expression      ;

primaryExpr:
	methodCall| typeProduction | nameGiver | LEFTPAR expression RIGHTPAR
	;



printCall:
    FMTD DOT methodCall;


methodCall:
    (nameGiver)  LEFTPAR expression? (KOMMA expression)* RIGHTPAR
    ;


type
    : INT
        | FLOAT64
        | STRING
        | BOOLEAN
        ;

nameGiver
    : ID+;


typeProduction
    : intliteral
    | floatliteral
    | stringliteral
    | boolliteral;


intliteral
    : INT_LIT
    ;

floatliteral
    : FLOAT_LIT
    ;

boolliteral
    : TRUE | FALSE
    ;
packageProdcution
    : PACKAGE nameGiver EOS
    ;

importProduction
    : IMPORT STRING_LIT EOS
    ;

eof
    : EOF;