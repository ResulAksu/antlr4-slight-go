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

//arithmetics
ADD: '+';
SUB: '-';
MUL:'*';
DIV: '/';
MODUL: '%';

//comp


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
    : localvariableCaller;

localvariableCaller
    : VAR nameGiver type ASSERT typeProduction
    | nameGiver ASSERT (typeProduction | nameGiver) (arithmetics typeProduction | arithmetics nameGiver | arithmetics methodCall)*
    | nameGiver ASSERT methodCall (arithmetics typeProduction | arithmetics nameGiver | arithmetics methodCall)*
    ;

methodCall:
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
    | boolliteral;

intliteral
    : DIGITINCL+ (arithmetics DIGITINCL | arithmetics nameGiver )*
    ;

floatliteral
    : DIGITINCL+ DOT DIGITINCL+ (arithmetics DIGITINCL+ DOT DIGITINCL+)*
    ;

boolliteral
    : (TRUE | FALSE)
    ;
packageProdcution
    : PACKAGE MAIN
    ;

importProduction
    : IMPORT NOTATIONS FMT NOTATIONS
    ;

nameGiver
    : identifier+;


identifier
    : (LETTER | DIGITINCL)
    ;

arithmetics
    : ADD | SUB | MUL | DIV |MODUL
    ;