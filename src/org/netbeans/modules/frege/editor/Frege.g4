/**
 * Frege grammar for ANTLR v4 
 * 
 * Frege is a pure functional programming language for the JVM in the spirit of Haskell.
 * 
 */
grammar Frege;



NEWLINE :   '\r'? '\n' ;

CONSTRUCTOR_ID : UPPER_CASE	( LETTER
							| DIGIT
							| '\'' )* ;
							
VARIABLE_ID : LOWER_CASE	( LETTER
							| DIGIT
							| '\'' )* ;
							
							
LETTER : UPPER_CASE | LOWER_CASE;

INTEGER
	:	DECIMAL 
	|	'0o' OCTAL | '0O' OCTAL
	|	'0x' HEXADECIMAL | '0X' HEXADECIMAL
	;

HEXADECIMAL : (HEXIT)+ ;

OCTAL : (OCTIT)+ ;

DECIMAL : (DIGIT)+ ;

DIGIT : '0'..'9';

HEXIT : DIGIT | 'A'..'F' | 'a'..'f' ;

OCTIT : '0'..'7' ;

LEFT_CURLY : '{' ;

RIGHT_CURLY : '}' ;

SEMICOLON : ';' ;

LEFT_PAREN : '(' ;

RIGHT_PAREN : ')' ;

LEFT_BRACKET : '[' ;

RIGHT_BRACKET : ']' ;

COMMA : ',' ;

INFIX_QUOTE : '`' ;

VARSYM : SYMBOL (SYMBOL | ':' )* ;

CONSYM : ':' (SYMBOL | ':' )* ;
							

LOWER_CASE : ('a'..'z'|'_');
UPPER_CASE : 'A'..'Z';

SYMBOL : '!' | '#' | '$' | '%' | '&' | '*' | '+' | '.' | '/' | '<' | '='
       | '>' | '?' | '@' | '\\' | '^' | '-' | '~' | '|'
       ;

UNANTICIPATED_SYMBOL : ~('a'..'z' | 'A'..'Z' | '0'..'9') ;

/*
 * Keyword
 */
AS : 'as' ;
CASE: 'case';
CLASS : 'class' ;
DATA : 'data' ;
DEFAULT : 'default' ;
DERIVING : 'deriving' ;
DO : 'do' ;
ELSE: 'else';
HIDING : 'hiding' ;
FOREIGN: 'foreign';
IF: 'if';
IMPORT : 'import' ;
IN: 'in';
INFIX : 'infix' ;
INFIXL : 'infixl' ;
INFIXR : 'infixr' ;
INSTANCE : 'instance' ;
LET : 'let' ;
MODULE : 'module' ;
NEWTYPE : 'newtype' ;
OF : 'of' ;
QUALIFIED : 'qualified' ;
THEN: 'then';
TYPE : 'type' ;
WHERE : 'where' ;




CONTEXT_ARROW : '=>' ;
EQUALS : '=' ;
ALT : '|' ;
OFTYPE : '::' ;



WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines


COMMENT : LINE_COMMENT | BLOCK_COMMENT ;


LINE_COMMENT : '--' (~'\n')* ;


BLOCK_COMMENT : '{-' .*? '-}' ;
