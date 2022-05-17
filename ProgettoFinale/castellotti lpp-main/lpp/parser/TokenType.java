package lpp.parser;

public enum TokenType { 
	// symbols
	ASSIGN, MINUS, PLUS, TIMES, NOT, AND, EQ, NEQ, START_PAIR, END_PAIR, START_RANGE, END_RANGE, RANGE_SEP, STMT_SEP, EXP_SEP, OPEN_PAR, CLOSE_PAR, OPEN_BLOCK, CLOSE_BLOCK,
	// keywords
	PRINT, VAR, BOOL, IF, ELSE, FST, SND, BOUNDS, FOR, IN,
	// non singleton categories
	SKIP, IDENT, NUM,   
	// end-of-file
	EOF, 	
}
