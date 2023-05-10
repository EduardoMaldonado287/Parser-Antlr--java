grammar MAT;

/*
 * Parser Rules
 */

programDeclaration
	: tk_main tk_brace_open
	instructions *
	tk_brace_close
	;

instructions
    : declaration_list | print | var_operations | matrix_constructor
    ;

declaration_list
	: declaration tk_semicolon declaration_list
	| declaration tk_semicolon
	;

declaration
	: dataType variable_list
	;

variable_list
	: tk_id tk_comma variable_list
	| tk_id
	;

dataType
	: tk_type_int
	| tk_type_matrix
	;

print
    : tk_write tk_id tk_semicolon;

var_operations
    : tk_id tk_assign expression tk_semicolon
    ;

expression
    : subexpression tk_plus expression
    | subexpression tk_minus expression
    | subexpression tk_mult expression
    | subexpression tk_transpos sign expression
    | subexpression
    ;

subexpression
    : tk_id | tk_number | tk_par_open expression tk_par_close;

sign
    :tk_plus
    |tk_minus
    |tk_mult
    ;

matrix_constructor
    : tk_id tk_assign matrix_values tk_semicolon
    ;

matrix_values
    : tk_bracket_open matrix_numbers* tk_bracket_close
    ;

matrix_numbers
    : Number
    | Number tk_semicolon
    | Number tk_comma matrix_numbers
    ;

/*
 * Tokens
 */

tk_main
	: 'main'
	;

tk_semicolon
	: ';'
	;

tk_comma
	: ','
	;

tk_assign
    : '='
    ;

tk_id
	: Identifier
	;

tk_number
    : Number | tk_minus Number
    ;

tk_type_int
	: 'int'
	;

tk_type_matrix
	: 'matrix'
	;

tk_write
    : 'write'
    ;

tk_plus
    : '+';

tk_minus
    : '-';

tk_mult
    : '*';

tk_div
    : '/';

tk_transpos
    : '^';

tk_par_open
    : '(';

tk_par_close
    : ')';

tk_bracket_open
    : '[';

tk_bracket_close
    : ']';

tk_brace_open
    : '{';

tk_brace_close
    : '}';

/*
 * Lexer Rules
 */

Identifier
	: [a-zA-Z] | [a-zA-Z_$] [a-zA-Z0-9]+
	;

Number
    : [0-9]+
    ;

WS	: [ \t\n]+ -> skip
	;

