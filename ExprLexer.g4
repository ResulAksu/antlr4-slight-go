lexer grammar ExprLexer;
ANNO: ['];
PACKAGE: 'package';
IMPORT: 'import';
NOTATIONS: '"';
FMTD: 'fmt';
FUNC: 'func';
LEFTPAR: '(';
RIGHTPAR: ')' -> mode(DUHS);
LEFTBRACE: '{';
RIGHTBRACE: '}'-> mode(DUHS);
ASSERT: '=';
SEMICOLON: ';' -> channel(HIDDEN);
KOMMA: ',';
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

fragment LETTER: [a-z] | [A-Z];
fragment CHAR: LETTER | DIGIT;


//LITERALS
INT_LIT: (NON_ZERO_DIGIT DIGIT*|'0')-> mode(DUHS);
FLOAT_LIT: DIGIT+ DOT DIGIT+-> mode(DUHS);
STRING_LIT: '"' ~["]* '"'-> mode(DUHS);
SOMEDIGIT: DIGIT;

fragment NON_ZERO_DIGIT
          : [1-9]
          ;
fragment DIGIT
 : [0-9]
 ;

DOT: '.';
TRUE: 'true'-> mode(DUHS);
FALSE: 'false'-> mode(DUHS);

//PRINT_LN: 'Println';

//arithmetics
ADD: '+';
SUB: '-';
MUL:'*';
DIV: '/';

RETURN: 'return'-> mode(DUHS);

INT: 'int' ->mode(DUHS);
FLOAT64: 'float64'->mode(DUHS);
BOOLEAN: 'bool'->mode(DUHS);
STRING: 'string'->mode(DUHS);
ID: LETTER (LETTER | DIGIT)*->mode(DUHS);

WS: [ \t]+ ->channel(HIDDEN);
EOL:              [\r\n;] -> channel(HIDDEN);
COMMENT: '/*' .*? '*/'-> channel(HIDDEN);
LINE_COMMENT : '//' ~[\r\n]*-> channel(HIDDEN);
mode DUHS;
WS_: [ \t]+-> channel(HIDDEN);
COMMENT_: '/*' .*? '*/'-> channel(HIDDEN);
LINE_COMMENT_ : '//' ~[\r\n]*-> channel(HIDDEN);
EOS:              [\r\n;] -> mode(DEFAULT_MODE);
OTHER: ->  mode(DEFAULT_MODE),channel(HIDDEN);