grammar Expr;

WS: [ \r\t\n]+ -> skip;
PACKAGE: 'package';
MAIN: 'main';
IMPORT: 'import';
NOTATIONS: '"';
FMT: 'fmt';
FUNC: 'func';
LEFTPAR: '(';
RIGHTPAR: ')';
LEFTBRACE: '{';
RIGHTBRACE: '}';
ASSERT: '=';

//boolean
MODULO:'%';
EQUALS:'==';
SMALLER:'<';
SMALLER_OR_EQUAL:'<=';
GREATER:'>';
GREATER_OR_EQUAL:'>=';
NOT_EQUAL: '!=';

//logicals
LOGICAL_AND: '&&';
LOGICAL_OR: '||';
LOGICAL_NOT: '!';

IF_TOKEN: 'if';
ELSE_TOKEN: 'else';
FOR_TOKEN: 'for';

VAR: 'var';
LETTER: [a-z] | [A-Z];
DIGITINCL: [0-9];

INT: 'int';
FLOAT64: 'float64';
BOOLEAN: 'bool';
STRING: 'string';
DOT: '.';
TRUE: 'true';
FALSE: 'false';

PRINT_LN: 'Println';

//arithmetics
ADD: '+';
SUB: '-';
MUL:'*';
DIV: '/';

RETURN: 'return';


compilationUnit
    : packageProdcution importProduction  methodCaller+
    ;

methodCaller
    : FUNC MAIN LEFTPAR RIGHTPAR block
    | FUNC nameGiver LEFTPAR methodMember* RIGHTPAR type block
    ;

methodMember
    : nameGiver type (',' nameGiver type)*
    ;

block
    : LEFTBRACE blockStatements* RIGHTBRACE
    ;

blockStatements
    : localvariableCaller |if_and_or_else_expression |for_loop | printCall | methodCall | returner;

//Hier weiter machen
if_and_or_else_expression
    : IF_TOKEN bool_statement (logicals bool_statement)* block (ELSE_TOKEN block)*;

for_loop
    :  FOR_TOKEN bool_statement block;

bool_statement
    : (nameGiver | typeProduction) booleans (nameGiver | typeProduction);

returner
    : RETURN (methodCall| nameGiver | typeProduction | arithmetics)+;

localvariableCaller
    : VAR nameGiver type ASSERT (typeProduction|nameGiver) (arithmetics (nameGiver|typeProduction))*
    | nameGiver ASSERT methodCall (arithmetics typeProduction | arithmetics nameGiver | arithmetics methodCall)*
    | nameGiver ASSERT (typeProduction | nameGiver) (arithmetics typeProduction | arithmetics nameGiver | arithmetics methodCall)*

    ;

printCall:
    FMT DOT PRINT_LN LEFTPAR (methodCall | stringliteral | nameGiver)  RIGHTPAR;

methodCall:
    nameGiver LEFTPAR (nameGiver | typeProduction) (arithmetics | nameGiver | typeProduction)* (',' (nameGiver | typeProduction))* RIGHTPAR
    ;

type
    : INT
    | FLOAT64
    | BOOLEAN
    | STRING
    ;

typeProduction
    : intliteral
    | floatliteral
    | boolliteral
    | stringliteral;

stringliteral
    : '"' (nameGiver|arithmetics|booleans)* '"';

intliteral
    : DIGITINCL+ (arithmetics DIGITINCL | arithmetics nameGiver )*
    ;

floatliteral
    : DIGITINCL+ DOT DIGITINCL+ (arithmetics DIGITINCL+ DOT DIGITINCL+)*
    ;

boolliteral
    : (TRUE | FALSE) logicals* (TRUE|FALSE)*
    ;
packageProdcution
    : PACKAGE MAIN
    ;

importProduction
    : IMPORT NOTATIONS FMT NOTATIONS
    ;

nameGiver
    : (LETTER | DIGITINCL)+;



arithmetics
    : ADD | SUB | MUL | DIV |MODULO
    ;

booleans:
MODULO | EQUALS | SMALLER | SMALLER_OR_EQUAL| GREATER | GREATER_OR_EQUAL | NOT_EQUAL ;

logicals:
LOGICAL_AND  | LOGICAL_OR  | LOGICAL_NOT ;




