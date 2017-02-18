
public class Grammar {

// Undefined tokens
/*
	tNTH_REF()
	tBACK_REF()
	tGVAR()
	%prec
	tLOWEST()
	tIDENTIFIER()
	tCONSTANT()
	tFID()
	keyword_do_LAMBDA()
	tLAMBEG()
	tCHAR()
	tSTRING_BEG()
	tSTRING_END()
	tXSTRING_BEG()
	tREGEXP_BEG
	tREGEXP_END()
	tWORDS_BEG()
	tSYMBOLS_BEG()
	tQWORDS_BEG()
	tQSYMBOLS_BEG()
	tSTRING_DVAR()
	tSTRING_DBEG()
	tSTRING_DEND()
	tSTRING_CONTENT()
	tIVAR()
	tCVAR()
	tSYMBEG()
	tUMINUS_NUM()
	tINTEGER()
	tFLOAT()
	tRATIONAL()
	tIMAGINARY()
	tNTH_REF()
	tBACK_REF()
	tLABEL()
	tFID()
*/
	
/*
   expr_variable := |*
      global_var
      => {
        if    tok =~ /^\$([1-9][0-9]*)$/
          emit(:tNTH_REF, tok(@ts + 1).to_i)
        elsif tok =~ /^\$([&`'+])$/
          emit(:tBACK_REF)
        else
          emit(:tGVAR)
	end
 */

/*
 * 126 defined
 * 42 undefined
 */

TOKEN : 
{ 
	<EXT_lbrace : "{"> 
	| <EXT_rbrace : "}">
	| <EXT_equal : "=">
	| <EXT_lsqbracket : "[">
	| <EXT_rsqbracket : "]">
	| <EXT_exclaime : "!">
	| <EXT_newline : "\n">
	| <EXT_semicolon : ";">
	| <EXT_pipe : "|">
	| <EXT_comma : ",">
	| <EXT_star : "*">
	| <EXT_amper : "&">
	| <EXT_plus : "+">
	| <EXT_minus : "-">
	| <EXT_caret : "^">
	| <EXT_slash : "/">
	| <EXT_langbracket : "<">
	| <EXT_rangbracket : ">">
	| <EXT_percent : "%">
	| <EXT_tilde : "~">
	| <EXT_lparen : "(">
	| <EXT_rparen : ")">
	| <EXT_colon : ":">
	| <EXT_question : "?">
	| <EXT_space : " ">
	| <EXT_dot : ".">
	| <EXT_acute : "`">
	| <keyword_class : "class">
    | <keyword_module : "module">
    | <keyword_def : "def">
    | <keyword_undef : "undef">
    | <keyword_begin : "begin">
    | <keyword_rescue : "rescue">
    | <keyword_ensure : "ensure">
    | <keyword_end : "end">
    | <keyword_if : "if">
    | <keyword_unless : "unless">
    | <keyword_then : "then">
    | <keyword_elsif : "elsif">
    | <keyword_else : "else">
    | <keyword_case : "case">
    | <keyword_when : "when">
    | <keyword_while : "while">
    | <keyword_until : "until">
    | <keyword_for : "for">
    | <keyword_break : "break">
    | <keyword_next : "next">
    | <keyword_redo : "redo">
    | <keyword_retry : "retry">
    | <keyword_in : "in">
    | <keyword_do : "do">
    | <keyword_do_cond : "do">
    | <keyword_do_block : "do">
    | <keyword_return : "return">
    | <keyword_yield : "yield">
    | <keyword_super : "super">
    | <keyword_self : "self">
    | <keyword_nil : "nil">
    | <keyword_true : "true">
    | <keyword_false : "false">
    | <keyword_and : "and">
    | <keyword_or : "or">
    | <keyword_not : "not">
    | <modifier_if : "if">
    | <modifier_unless : "unless">
    | <modifier_while : "while">
    | <modifier_until : "until">
    | <modifier_rescue : "rescue">
    | <keyword_alias : "alias">
    | <keyword_defined : "defined?">
    | <keyword_BEGIN : "BEGIN">
    | <keyword_END : "END">
    | <keyword__LINE__ : "__LINE__">
    | <keyword__FILE__ : "__FILE__">
    | <keyword__ENCODING__ : "__ENCODING__">
    | <tCOLON2 : "::">
    | <tCOLON3 : ":: at EXPR_BEG">
    //| <id> <tOP_ASGN : /* +=, -=  etc. */>
    | <tOP_ASGN : "+=" |"-=" |"*=" |"/=" |"%=" |"**=" |"&=" |"|=" |"^=" |"<<=" |">>=" |"&&=" |"||="> 
    | <tASSOC : "=>"
    | <tLPAREN : "("
    | <tRPAREN : ")">
    | <tLBRACK : "[">
    | <tLBRACE : "{">
    | <tSTAR : "*">
    | <tDSTAR : "**arg">
    | <tAMPER : "&">
    | <tLAMBDA : "->">
    | <tUPLUS : "unary+">
    | <tUMINUS : "unary-">
    | <tPOW : "**">
    | <tCMP : "<=>">
    | <tEQ : "==">
    | <tEQQ : "===">
    | <tNEQ : "!=">
    | <tGEQ : ">=">
    | <tLEQ : "<=">
    | <tANDOP : "&&">
    | <tOROP : "||">
    | <tMATCH : "=~">
    | <tNMATCH : "!~">
    | <tDOT2 : "..">
    | <tDOT3 : "...">
    | <tAREF : "[]">
    | <tASET : "[]=">
    | <tLSHFT : "<<">
    | <tRSHFT : ">>">
    | <tANDDOT : "&.">
}

// Example
/*	void Start() :
	{}
	{
		<NUMBER>
		(
			<PLUS>
			<NUMBER>
		)*
		<EOF>
	}
*/

//	DEFINED
//| <tLBRACE_ARG : "{ arg">
	void tLBRACE_ARG() :
	{}
	{
		<tLBRACE> arg()
	}

//	DEFINED
//| <tLPAREN_ARG : "( arg"
	void tLPAREN_ARG() :
	{}
	{
		<tLPAREN> arg()
	}

//	DEFINED
//	program		: top_compstmt
//	;
	void program() :
	{}
	{
		top_compstmt()
	}

//	DEFINED
//	top_compstmt	: top_stmts opt_terms
//	;
	void top_compstmt()	: 
	{}
	{
		top_stmts() opt_terms()
	}

//	DEFINED
//	top_stmts	: none()
//	| top_stmt
//	| top_stmts terms top_stmt
//	| error top_stmt
//	;
	void top_stmts() : 
	{}
	{
		none()
		| top_stmt()
		| top_stmts() terms() top_stmt()
		| error() top_stmt()
	}
	
// Stub
	void error() : 
	{}
	{
		none()
	}
	
//	DEFINED
//	top_stmt	: stmt
//	| keyword_BEGIN
//	  '{' top_compstmt '}'
//	;
	void top_stmt() : 
	{}
	{
		stmt()
		| <keyword_BEGIN>
		<EXT_lbrace> top_compstmt() <EXT_rbrace>
	}
	
//	DEFINED
//	bodystmt	: compstmt
//			  opt_rescue()
//			  opt_else()
//			  opt_ensure
//			;
	void bodystmt() :
	{}
	{
		compstmt()
		opt_rescue()
		opt_else()
		opt_ensure()
	}

	
//	DEFINED
//	compstmt	: stmts opt_terms
//			;
	void compstmt() : 
	{}
	{
		stmts() 
		opt_terms()
	}

	
//	DEFINED
//	stmts		: none()
//			| stmt_or_begin
//			| stmts terms stmt_or_begin
//			| error stmt
//			;
	void stmts() :
	{}
	{
		none()
		| stmt_or_begin()
		| stmts() terms() stmt_or_begin()
		| error() stmt()
	}
	
//	DEFINED
//	stmt_or_begin	: stmt
//	                | keyword_BEGIN
//			  '{' top_compstmt '}'
	void stmt_or_begin() :
	{}
	{
		stmt()
		| <keyword_BEGIN>
		<EXT_lbrace> top_compstmt() <EXT_rbrace>
	}

	
//	UNDEFINED
//	stmt		: keyword_alias fitem  fitem
//			| keyword_alias tGVAR() tGVAR()
//			| keyword_alias tGVAR() tBACK_REF()
//			| keyword_alias tGVAR() tNTH_REF()
//			| <keyword_def> undef_list
//			| stmt modifier_if expr_value()
//			| stmt modifier_unless expr_value()
//			| stmt modifier_while expr_value()
//			| stmt modifier_until expr_value()
//			| stmt modifier_rescue stmt
//			| keyword_END '{' compstmt '}'
//			| command_asgn()
//			| mlhs '=' command_call()
//			| lhs '=' mrhs
//			| mlhs '=' mrhs_arg
//			| expr
//			;
	void stmt() :
	{}
	{
		<keyword_alias> fitem()  fitem()
		| <keyword_alias> tGVAR() tGVAR() // TODO: tGVAR
		| <keyword_alias> tGVAR() tBACK_REF()
		| <keyword_alias> tGVAR() tNTH_REF()
		| <keyword_def> undef_list()
		| stmt() <modifier_if> expr_value()
		| stmt() <modifier_unless> expr_value()
		| stmt() <modifier_while> expr_value()
		| stmt() <modifier_until> expr_value()
		| stmt() <modifier_rescue> stmt()
		| <keyword_END> <EXT_lbrace> compstmt() <EXT_rbrace>
		| command_asgn()
		| mlhs() <EXT_equal> command_call()
		| lhs() <EXT_equal> mrhs()
		| mlhs() <EXT_equal> mrhs_arg()
		| expr()
	}

	
//	DEFINED
//	command_asgn()	: lhs '=' command_rhs
//			| var_lhs <tOP_ASGN> command_rhs
//			| primary_value '[' opt_call_args rbracket <tOP_ASGN> command_rhs
//			| primary_value call_op tIDENTIFIER <tOP_ASGN> command_rhs
//			| primary_value call_op tCONSTANT <tOP_ASGN> command_rhs
//			| primary_value tCOLON2 tCONSTANT <tOP_ASGN> command_rhs
//			| primary_value tCOLON2 tIDENTIFIER <tOP_ASGN> command_rhs
//			| backref <tOP_ASGN> command_rhs
//			;
	void command_asgn() :
	{}
	{
		lhs() <EXT_equal> command_rhs()
		| var_lhs() <tOP_ASGN> command_rhs()
		| primary_value() <EXT_lsqbracket> opt_call_args() rbracket() <tOP_ASGN> command_rhs()
		| primary_value() call_op() tIDENTIFIER() <tOP_ASGN> command_rhs()
		| primary_value() call_op() tCONSTANT() <tOP_ASGN> command_rhs()
		| primary_value() <tCOLON2> tCONSTANT() <tOP_ASGN> command_rhs()
		| primary_value() <tCOLON2> tIDENTIFIER() <tOP_ASGN> command_rhs()
		| backref() <tOP_ASGN> command_rhs()
	}

	
//	UNDEFINED
//	command_rhs	: command_call()   %prec <tOP_ASGN>
//			| command_call() modifier_rescue stmt
//			| command_asgn()
//			;
	void command_rhs() :
	{}
	{
		command_call()   %prec <tOP_ASGN>  // TODO: %
		| command_call() <modifier_rescue> stmt()
		| command_asgn()
	}

	
//	DEFINED
//	expr		: command_call()
//			| expr <keyword_and> expr
//			| expr <keyword_or> expr
//			| keyword_not opt_nl() expr
//			| '!' command_call()
//			| arg
//			;
	void expr() :
	{}
	{
		command_call()
		| expr() <keyword_and> expr()
		| expr() <keyword_or> expr()
		| <keyword_not> opt_nl() expr()
		| <EXT_exclaime> command_call()
		| arg()
	}

	
//	DEFINED
//	expr_value()	: expr
//			;
	void expr_value() :
	{}
	{
			expr()
	}

	
//	DEFINED
//	command_call()	: command
//			| block_command
//			;
	void command_call() :
	{}
	{
		command()
		| block_command()
	}

	
//	DEFINED
//	block_command	: block_call
//			| block_call call_op2 operation2 command_args
//			;
	void block_command() :
	{}
	{
		block_call()
		| block_call() call_op2() operation2() command_args()
	}

	
//	DEFINED
//	cmd_brace_block	: tLBRACE_ARG
//			  brace_body '}'
//			;
	void cmd_brace_block() :
	{}
	{	
		tLBRACE_ARG()
		brace_body() <EXT_rbrace>
	}

	
//	DEFINED
//	fcall		: operation
//			;
	void fcall() :
	{}
	{
		operation()
	}

	
//	UNDEFINED
//	command		: fcall command_args       %prec tLOWEST()
//			| fcall command_args cmd_brace_block
//			| primary_value call_op operation2 command_args	%prec tLOWEST()
//			| primary_value call_op operation2 command_args cmd_brace_block
//			| primary_value tCOLON2 operation2 command_args	%prec tLOWEST()
//			| primary_value tCOLON2 operation2 command_args cmd_brace_block
//			| keyword_super command_args
//			| keyword_yield command_args
//			| keyword_return call_args
//			| <keyword_break> call_args
//			| <keyword_next> call_args
//			;
	void command() :
	{}
	{
		fcall() command_args()       %prec tLOWEST() // TODO: %
		| fcall() command_args() cmd_brace_block()
		| primary_value() call_op() operation2() command_args()	%prec tLOWEST()  // TODO: %
		| primary_value() call_op() operation2() command_args() cmd_brace_block()
		| primary_value() <tCOLON2> operation2() command_args()	%prec tLOWEST() // TODO: %
		| primary_value() <tCOLON2> operation2() command_args() cmd_brace_block()
		| <keyword_super> command_args()
		| <keyword_yield> command_args()
		| <keyword_return> call_args()
		| <keyword_break> call_args()
		| <keyword_next> call_args()
	}

	
//	DEFINED
//	mlhs		: mlhs_basic()
//			| tLPAREN mlhs_inner rparen
//			;
	void mlhs() :
	{}
	{
		mlhs_basic()
		| <tLPAREN> mlhs_inner() rparen()
	}

	
//	DEFINED
//	mlhs_inner	: mlhs_basic()
//			| tLPAREN mlhs_inner rparen()
//			;
	void mlhs_inner() :
	{}
	{
		mlhs_basic()
		| <tLPAREN> mlhs_inner() rparen()
	}

	
//	DEFINED
//	mlhs_basic()	: mlhs_head()
//			| mlhs_head() mlhs_item()
//			| mlhs_head() tSTAR mlhs_node
//			| mlhs_head() tSTAR mlhs_node ',' mlhs_post
//			| mlhs_head() tSTAR
//			| mlhs_head() tSTAR ',' mlhs_post
//			| tSTAR mlhs_node
//			| tSTAR mlhs_node ',' mlhs_post
//			| tSTAR
//			| tSTAR ',' mlhs_post
//			;
	void mlhs_basic() :
	{}
	{
		mlhs_head()
		| mlhs_head() mlhs_item()
		| mlhs_head() <tSTAR> mlhs_node()
		| mlhs_head() <tSTAR> mlhs_node() <EXT_comma> mlhs_post()
		| mlhs_head() <tSTAR>
		| mlhs_head() <tSTAR> <EXT_comma> mlhs_post()
		| <tSTAR> mlhs_node()
		| <tSTAR> mlhs_node() <EXT_comma> mlhs_post()
		| <tSTAR>
		| <tSTAR> <EXT_comma> mlhs_post()
	}
	
//	DEFINED
//	mlhs_item()	: mlhs_node
//			| tLPAREN mlhs_inner rparen
//			;
	void mlhs_item() :
	{}
	{
		mlhs_node()
		| <tLPAREN> mlhs_inner() rparen()
	}

	
//	DEFINED
//	mlhs_head()	: mlhs_item() ','
//			| mlhs_head() mlhs_item() ','
//			;
	void mlhs_head() :
	{}
	{
		mlhs_item() <EXT_comma>
		| mlhs_head() mlhs_item() <EXT_comma>
	}

	
//	DEFINED
//	mlhs_post	: mlhs_item()
//			| mlhs_post ',' mlhs_item()
//			;
	void mlhs_post() :
	{}
	{
		mlhs_item()
		| mlhs_post() <EXT_comma> mlhs_item()
	}
	
//	UNDEFINED
//	mlhs_node	: user_variable()
//			| keyword_variable()
//			| primary_value '[' opt_call_args rbracket
//			| primary_value call_op tIDENTIFIER
//			| primary_value tCOLON2 tIDENTIFIER
//			| primary_value call_op tCONSTANT
//			| primary_value tCOLON2 tCONSTANT
//			| <tCOLON3> tCONSTANT
//			| backref
//			;
	void mlhs_node() :
	{}
	{
		user_variable()
		| keyword_variable()
		| primary_value() <EXT_lsqbracket> opt_call_args() rbracket()
		| primary_value() call_op() tIDENTIFIER()
		| primary_value() <tCOLON2> tIDENTIFIER()
		| primary_value() call_op() tCONSTANT()
		| primary_value() <tCOLON2> tCONSTANT()
		| <tCOLON3> tCONSTANT()
		| backref()
	}

	
//	UNDEFINED
//	lhs		: user_variable()
//			| keyword_variable()
//			| primary_value '[' opt_call_args rbracket
//			| primary_value call_op tIDENTIFIER
//			| primary_value tCOLON2 tIDENTIFIER
//			| primary_value call_op tCONSTANT
//			| primary_value tCOLON2 tCONSTANT
//			| <tCOLON3> tCONSTANT
//			| backref
//			;
	void lhs() :
	{}
	{
		user_variable()
		| keyword_variable()
		| primary_value() <EXT_lsqbracket> opt_call_args() rbracket()
		| primary_value() call_op() tIDENTIFIER()
		| primary_value() <tCOLON2> tIDENTIFIER()
		| primary_value() call_op() tCONSTANT()
		| primary_value() <tCOLON2> tCONSTANT()
		| <tCOLON3> tCONSTANT()
		| backref()
	}

	
//	UNDEFINED
//	cname		: tIDENTIFIER
//			| tCONSTANT
//			;
	void cname() :
	{}
	{
		tIDENTIFIER()
		| tCONSTANT()
	}

	
//	DEFINED
//	cpath()		: <tCOLON3> cname
//			| cname
//			| primary_value tCOLON2 cname
//			;
	void cpath() :
	{}
	{
		<tCOLON3> cname()
		| cname()
		| primary_value() <tCOLON2> cname()
	}

	
//	UNDEFINED
//	fname()		: tIDENTIFIER
//			| tCONSTANT
//			| tFID
//			| op
//			| reswords
//			;
	void fname() :
	{}
	{
		tIDENTIFIER()
		| tCONSTANT()
		| tFID()
		| op()
		| reswords()
	}

	
//	DEFINED
//	fsym		: fname()
//			| symbol
//			;
	void fsym() :
	{}
	{
		fname()
		| symbol()
	}

	
//	DEFINED
//	fitem		: fsym
//			| dsym()
//			;
	void fitem() :
	{}
	{
		fsym()
		| dsym()
	}

	
//	DEFINED
//	undef_list	: fitem
//			| undef_list ','  fitem
//			;
	void undef_list() :
	{}
	{
		fitem()
		| undef_list() <EXT_comma> fitem()
	}

	
//	DEFINED
//	op		: '|'		
//			| '^'		
//			| '&'		
//			| tCMP		
//			| tEQ		
//			| tEQQ		
//			| tMATCH	
//			| tNMATCH	
//			| '>'		
//			| tGEQ		
//			| '<'		
//			| tLEQ		
//			| tNEQ		
//			| <tLSHFT>	
//			| tRSHFT	
//			| '+'		
//			| '-'		
//			| '*'		
//			| tSTAR		
//			| '/'		
//			| '%'		
//			| <tPOW>		
//			| <tDSTAR>	
//			| '!'		
//			| '~'		
//			| tUPLUS	
//			| tUMINUS	
//			| tAREF		
//			| tASET		
//			| '`'		
//			;


	void op() :
	{}
	{
		<EXT_pipe>		
		| <EXT_caret>		
		| <EXT_amper>		
		| <tCMP>		
		| <tEQ>		
		| <tEQQ>		
		| <tMATCH>	
		| <tNMATCH>	
		| <EXT_rangbracket>		
		| <tGEQ>		
		| <EXT_langbracket>		
		| <tLEQ>		
		| <tNEQ>		
		| <tLSHFT>	
		| <tRSHFT>	
		| <EXT_plus>		
		| <EXT_minus>		
		| <EXT_star>		
		| <tSTAR>		
		| <EXT_slash>		
		| <EXT_percent>		
		| <tPOW>		
		| <tDSTAR>	
		| <EXT_exclaime>		
		| <EXT_tilde>		
		| <tUPLUS>	
		| <tUMINUS>	
		| <tAREF>		
		| <tASET>		
		| <EXT_acute>
	}
	

	
//	DEFINED
//	reswords	: keyword__LINE__ | <keyword__FILE__> | <keyword__ENCODING__>
//			| keyword_BEGIN | keyword_END
//			| keyword_alias | <keyword_and> | keyword_begin
//			| <keyword_break> | <keyword_case> | <keyword_class> | keyword_def
//			| keyword_defined | keyword_do | <keyword_else> | <keyword_elsif>
//			| <keyword_end> | <keyword_ensure> | <keyword_false>
//			| <keyword_for> | <keyword_in> | <keyword_module> | <keyword_next>
//			| <keyword_nil> | keyword_not | <keyword_or> | <keyword_redo>
//			| <keyword_rescue> | keyword_retry | keyword_return | <keyword_self>
//			| keyword_super | keyword_then | <keyword_true> | <keyword_def>
//			| <keyword_when> | keyword_yield | keyword_if | <keyword_unless>
//			| <keyword_while> | <keyword_until>
//			;
	void reswords() :
	{}
	{
		<keyword__LINE__> | <keyword__FILE__> | <keyword__ENCODING__>
		| <keyword_BEGIN> | <keyword_END>
		| <keyword_alias> | <keyword_and> | <keyword_BEGIN> 
		| <keyword_break> | <keyword_case> | <keyword_class> | <keyword_def>
		| <keyword_defined> | <keyword_do> | <keyword_else> | <keyword_elsif>
		| <keyword_end> | <keyword_ensure> | <keyword_false>
		| <keyword_for> | <keyword_in> | <keyword_module> | <keyword_next>
		| <keyword_nil> | <keyword_not> | <keyword_or> | <keyword_redo>
		| <keyword_rescue> | <keyword_retry> | <keyword_return> | <keyword_self>
		| <keyword_super> | <keyword_then> | <keyword_true> | <keyword_def>
		| <keyword_when> | <keyword_yield> | <keyword_if> | <keyword_unless>
		| <keyword_while> | <keyword_until>
	}

	
//	UNDEFINED
//	arg		: lhs '=' arg_rhs()
//			| var_lhs <tOP_ASGN> arg_rhs()
//			| primary_value '[' opt_call_args rbracket <tOP_ASGN> arg_rhs()
//			| primary_value call_op tIDENTIFIER <tOP_ASGN> arg_rhs()
//			| primary_value call_op tCONSTANT <tOP_ASGN> arg_rhs()
//			| primary_value tCOLON2 tIDENTIFIER <tOP_ASGN> arg_rhs()
//			| primary_value tCOLON2 tCONSTANT <tOP_ASGN> arg_rhs()
//			| <tCOLON3> tCONSTANT <tOP_ASGN> arg_rhs()
//			| backref <tOP_ASGN> arg_rhs()
//			| arg tDOT2 arg
//			| arg tDOT3 arg
//			| arg '+' arg
//			| arg '-' arg
//			| arg '*' arg
//			| arg '/' arg
//			| arg '%' arg
//			| arg <tPOW> arg
//			| tUMINUS_NUM() simple_numeric() <tPOW> arg
//			| tUPLUS arg
//			| tUMINUS arg
//			| arg '|' arg
//			| arg '^' arg
//			| arg '&' arg
//			| arg tCMP arg
//			| arg '>' arg
//			| arg tGEQ arg
//			| arg '<' arg
//			| arg tLEQ arg
//			| arg tEQ arg
//			| arg tEQQ arg
//			| arg tNEQ arg
//			| arg tMATCH arg
//			| arg tNMATCH arg
//			| '!' arg
//			| '~' arg
//			| arg <tLSHFT> arg
//			| arg tRSHFT arg
//			| arg tANDOP arg
//			| arg <tOROP> arg
//			| keyword_defined opt_nl()  arg
//			| arg '?' arg opt_nl() ':' arg
//			| primary
//			;
	void arg() :
	{}
	{
		lhs() <EXT_equal> arg_rhs()
		| var_lhs() <tOP_ASGN> arg_rhs()
		| primary_value() <EXT_lsqbracket> opt_call_args() rbracket() <tOP_ASGN> arg_rhs()
		| primary_value() call_op() tIDENTIFIER() <tOP_ASGN> arg_rhs() 	// TODO
		| primary_value() call_op() tCONSTANT() <tOP_ASGN> arg_rhs()	// TODO
		| primary_value() <tCOLON2> tIDENTIFIER() <tOP_ASGN> arg_rhs()	// TODO
		| primary_value() <tCOLON2> tCONSTANT() <tOP_ASGN> arg_rhs()	// TODO
		| <tCOLON3> tCONSTANT() <tOP_ASGN> arg_rhs()	// TODO
		| backref() <tOP_ASGN> arg_rhs()
		| arg() <tDOT2> arg()
		| arg() <tDOT3> arg()
		| arg() <EXT_plus> arg()
		| arg() <EXT_minus> arg()
		| arg() <EXT_star> arg()
		| arg() <EXT_slash> arg()
		| arg() <EXT_percent> arg()
		| arg() <tPOW> arg()
		| tUMINUS_NUM() simple_numeric() <tPOW> arg()
		| <tUPLUS> arg()
		| <tUMINUS> arg()
		| arg() <EXT_pipe> arg()
		| arg() <EXT_caret> arg()
		| arg() <EXT_amper> arg()
		| arg() <tCMP> arg()
		| arg() <EXT_rangbracket> arg()
		| arg() <tGEQ> arg()
		| arg() <EXT_langbracket> arg()
		| arg() <tLEQ> arg()
		| arg() <tEQ> arg()
		| arg() <tEQQ> arg()
		| arg() <tNEQ> arg()
		| arg() <tMATCH> arg()
		| arg() <tNMATCH> arg()
		| <EXT_exclaime> arg()
		| <EXT_tilde> arg()
		| arg() <tLSHFT> arg()
		| arg() <tRSHFT> arg()
		| arg() <tANDOP> arg()
		| arg() <tOROP> arg()
		| <keyword_defined> opt_nl()  arg()
		| arg() <EXT_question> arg() opt_nl() <EXT_colon> arg()
		| primary()
	}

	
//	DEFINED
//	arg_value	: arg
//			;
	void arg_value() :
	{}
	{
		arg()
	}
	
//	DEFINED
//	aref_args	: none()
//			| args trailer
//			| args ',' assocs trailer
//			| assocs trailer
//			;
	void aref_args() :
	{}
	{
		none()
		| args() trailer()
		| args() <EXT_comma> assocs() trailer()
		| assocs() trailer()
	}

	
//	UNDEFINED
//	arg_rhs() 	: arg   %prec <tOP_ASGN>
//			| arg modifier_rescue arg
//			;
	void arg_rhs() :
	{}
	{
		arg()   %prec <tOP_ASGN>  // TODO: %
		| arg() <modifier_rescue> arg()
	}

	
//	DEFINED
//	paren_args	: '(' opt_call_args rparen
//			;
	void paren_args() :
	{}
	{
		<EXT_lparen> opt_call_args() rparen()
	}
	
//	DEFINED
//	opt_paren_args	: none()
//			| paren_args
//			;
	void opt_paren_args() :
	{}
	{
		none()
		| paren_args()
	}

	
//	DEFINED
//	opt_call_args	: none()
//			| call_args
//			| args ','
//			| args ',' assocs ','
//			| assocs ','
//			;
	void opt_call_args() :
	{}
	{
		none()
		| call_args()
		| args() <EXT_comma>
		| args() <EXT_comma> assocs() <EXT_comma>
		| assocs() <EXT_comma>
	}

	
//	DEFINED
//	call_args	: command
//			| args opt_block_arg
//			| assocs opt_block_arg
//			| args ',' assocs opt_block_arg
//			| block_arg
//			;
	void call_args() :
	{}
	{
		command()
		| args() opt_block_arg()
		| assocs() opt_block_arg()
		| args() <EXT_comma> assocs() opt_block_arg()
		| block_arg()
	}
	
//	DEFINED
//	command_args	: call_args
//			;
	void command_args() :
	{}
	{
		call_args()
	}
	
//	DEFINED
//	block_arg	: tAMPER arg_value
//			;
	void block_arg() :
	{}
	{
		<tAMPER> arg_value()
	}
	
//	DEFINED
//	opt_block_arg	: ',' block_arg
//			| none()
//			;
	void opt_block_arg() :
	{}
	{
		<EXT_comma> block_arg()
		| none()
	}

	
//	DEFINED
//	args		: arg_value
//			| tSTAR arg_value
//			| args ',' arg_value
//			| args ',' tSTAR arg_value
//			;
	void args() :
	{}
	{
		arg_value()
		| <tSTAR> arg_value()
		| args() <EXT_comma> arg_value()
		| args() <EXT_comma> <tSTAR> arg_value()
	}
	
//	DEFINED
//	mrhs_arg	: mrhs
//			| arg_value
//			;
	void mrhs_arg() :
	{}
	{
		mrhs()
		| arg_value()
	}

	
//	DEFINED
//	mrhs		: args ',' arg_value
//			| args ',' tSTAR arg_value
//			| tSTAR arg_value
//			;
	void mrhs() :
	{}
	{
		args() <EXT_comma> arg_value()
		| args() <EXT_comma> <tSTAR> arg_value()
		| <tSTAR> arg_value()
	}

	
//	UNDEFINED
//	primary		: literal
//			| strings
//			| xstring
//			| regexp
//			| words
//			| qwords
//			| symbols
//			| qsymbols
//			| var_ref
//			| backref
//			| tFID
//			| k_begin
//			  bodystmt
//			  k_end()
//			| tLPAREN_ARG()  rparen
//			| tLPAREN_ARG()
//			  stmt  rparen
//			| tLPAREN compstmt ')'
//			| primary_value tCOLON2 tCONSTANT
//			| <tCOLON3> tCONSTANT
//			| <tLBRACK> aref_args ']'
//			| tLBRACE assoc_list '}'
//			| keyword_return
//			| keyword_yield '(' call_args rparen
//			| keyword_yield '(' rparen
//			| keyword_yield
//			| keyword_defined opt_nl() '('  expr rparen
//			| keyword_not '(' expr rparen
//			| keyword_not '(' rparen
//			| fcall brace_block
//			| method_call
//			| method_call brace_block
//			| <tLAMBDA> lambda
//			| k_if expr_value() then
//			  compstmt
//			  if_tail()
//			  k_end()
//			| k_unless() expr_value() then
//			  compstmt
//			  opt_else()
//			  k_end()
//			| k_while()  expr_value() do 
//			  compstmt
//			  k_end()
//			| k_until()  expr_value() do 
//			  compstmt
//			  k_end()
//			| k_case() expr_value() opt_terms
//			  case_body()
//			  k_end()
//			| k_case() opt_terms case_body() k_end()
//			| k_for() for_var() <keyword_in>
//			  expr_value() do
//			  compstmt
//			  k_end()
//			| k_class() cpath() superclass()
//			  bodystmt
//			  k_end()
//			| k_class() <tLSHFT> expr
//			  term
//			  bodystmt
//			  k_end()
//			| k_module() cpath()
//			  bodystmt
//			  k_end()
//			| k_def() fname()
//			  f_arglist()
//			  bodystmt
//			  k_end()
//			| k_def() singleton() dot_or_colon()  fname()
//			  f_arglist()
//			  bodystmt
//			  k_end()
//			| <keyword_break>
//			| <keyword_next>
//			| <keyword_redo>
//			| keyword_retry
//			;
	void primary() :
	{}
	{
		literal()
		| strings()
		| xstring()
		| regexp()
		| words()
		| qwords()
		| symbols()
		| qsymbols()
		| var_ref()
		| backref()
		| tFID()	// TODO
		| k_begin()
		  bodystmt()
		  k_end()
		| tLPAREN_ARG()  rparen()
		| tLPAREN_ARG()
		  stmt()  rparen()
		| <tLPAREN> compstmt() <EXT_rparen>
		| primary_value() <tCOLON2> tCONSTANT()	// TODO
		| <tCOLON3> tCONSTANT()	// TODO
		| <tLBRACK> aref_args() <EXT_rsqbracket>
		| <tLBRACE> assoc_list() <EXT_rbrace>
		| <keyword_return>
		| <keyword_yield> <EXT_lparen> call_args() rparen()
		| <keyword_yield> <EXT_lparen> rparen()
		| <keyword_yield>
		| <keyword_defined> opt_nl() <EXT_lparen>  expr() rparen()
		| <keyword_not> <EXT_lparen> expr() rparen()
		| <keyword_not> <EXT_lparen> rparen()
		| fcall() brace_block()
		| method_call()
		| method_call() brace_block()
		| <tLAMBDA> lambda()
		| k_if() expr_value() then()
		  compstmt()
		  if_tail()
		  k_end()
		| k_unless() expr_value() then()
		  compstmt()
		  opt_else()
		  k_end()
		| k_while()  expr_value() do() 
		  compstmt()
		  k_end()
		| k_until()  expr_value() do() 
		  compstmt()
		  k_end()
		| k_case() expr_value() opt_terms()
		  case_body()
		  k_end()
		| k_case() opt_terms() case_body() k_end()
		| k_for() for_var() <keyword_in>
		  expr_value() do()
		  compstmt()
		  k_end()
		| k_class() cpath() superclass()
		  bodystmt()
		  k_end()
		| k_class() <tLSHFT> expr()
		  term()
		  bodystmt()
		  k_end()
		| k_module() cpath()
		  bodystmt()
		  k_end()
		| k_def() fname()
		  f_arglist()
		  bodystmt()
		  k_end()
		| k_def() singleton() dot_or_colon()  fname()
		  f_arglist()
		  bodystmt()
		  k_end()
		| <keyword_break>
		| <keyword_next>
		| <keyword_redo>
		| <keyword_retry>
	}

	
//	DEFINED
//	primary_value	: primary
//			;
	void primary_value() :
	{}
	{
		primary()
	}
	
//	DEFINED
//	k_begin		: keyword_begin
//			;
	void k_begin() :
	{}
	{
		<keyword_BEGIN>
	}
	
//	DEFINED
//	k_if		: keyword_if
//			;
	void k_if() :
	{}
	{
		<keyword_if>
	}
	
//	DEFINED
//	k_unless()	: <keyword_unless>
//			;
	void k_unless() :
	{}
	{
		<keyword_unless>
	}
	
//	DEFINED
//	k_while()		: <keyword_while>
//			;
	void k_while() :
	{}
	{
		<keyword_while>
	}
	
//	DEFINED
//	k_until()		: <keyword_until>
//			;
	void k_until() :
	{}
	{
		<keyword_until>
	}
	
//	DEFINED
//	k_case()		: <keyword_case>
//			;
	void k_case() :
	{}
	{
		<keyword_case>
	}
	
//	DEFINED
//	k_for()		: <keyword_for>
//			;
	void k_for() :
	{}
	{
		<keyword_for>
	}
	
//	DEFINED
//	k_class()		: <keyword_class>
//			;
	void k_class() :
	{}
	{
		<keyword_class>
	}
	
//	DEFINED
//	k_module()	: <keyword_module>
//			;
	void k_module() :
	{}
	{
		<keyword_module>
	}
	
//	DEFINED
//	k_def()		: keyword_def
//			;
	void k_def() :
	{}
	{
		<keyword_def>
	}
	
//	DEFINED
//	k_end()		: <keyword_end>
//			;
	void k_end() :
	{}
	{
		<keyword_end>
	}
	
//	DEFINED
//	then		: term
//			| keyword_then
//			| term keyword_then
//			;
	void then() :
	{}
	{
		term()
		| <keyword_then>
		| term() <keyword_then>
	}

	
//	DEFINED
//	do		: term
//			| keyword_do_cond
//			;
	void do() :
	{}
	{
		term()
		| <keyword_do_cond>
	}

	
//	DEFINED
//	if_tail()		: opt_else()
//			| <keyword_elsif> expr_value() then
//			  compstmt
//			  if_tail()
//			;
	void if_tail() :
	{}
	{
		opt_else()
		| <keyword_elsif> expr_value() then()
		  compstmt()
		  if_tail()
	}

	
//	DEFINED
//	opt_else()	: none()
//			| <keyword_else> compstmt
//			;
	void opt_else() :
	{}
	{
		none()
		| <keyword_else> compstmt()
	}

	
//	DEFINED
//	for_var()		: lhs
//			| mlhs
//			;
	void for_var() :
	{}
	{
		lhs()
		| mlhs()
	}

	
//	DEFINED
//	f_marg		: f_norm_arg
//			| tLPAREN f_margs rparen
//			;
	void f_marg() :
	{}
	{
		f_norm_arg()
		| <tLPAREN> f_margs() rparen()
	}

	
//	DEFINED
//	f_marg_list()	: f_marg
//			| f_marg_list() ',' f_marg
//			;
	void f_marg_list() :
	{}
	{
		f_marg()
		| f_marg_list() <EXT_comma> f_marg()
	}

	
//	DEFINED
//	f_margs		: f_marg_list()
//			| f_marg_list() ',' tSTAR f_norm_arg
//			| f_marg_list() ',' tSTAR f_norm_arg ',' f_marg_list()
//			| f_marg_list() ',' tSTAR
//			| f_marg_list() ',' tSTAR ',' f_marg_list()
//			| tSTAR f_norm_arg
//			| tSTAR f_norm_arg ',' f_marg_list()
//			| tSTAR
//			| tSTAR ',' f_marg_list()
//			;
	void f_margs() :
	{}
	{
		f_marg_list()
		| f_marg_list() <EXT_comma> <tSTAR> f_norm_arg()
		| f_marg_list() <EXT_comma> <tSTAR> f_norm_arg() <EXT_comma> f_marg_list()
		| f_marg_list() <EXT_comma> <tSTAR>
		| f_marg_list() <EXT_comma> <tSTAR> <EXT_comma> f_marg_list()
		| <tSTAR> f_norm_arg()
		| <tSTAR> f_norm_arg() <EXT_comma> f_marg_list()
		| <tSTAR>
		| <tSTAR> <EXT_comma> f_marg_list()
	}

	
//	DEFINED
//	block_args_tail()	: f_block_kwarg ',' f_kwrest() opt_f_block_arg
//			| f_block_kwarg opt_f_block_arg
//			| f_kwrest() opt_f_block_arg
//			| f_block_arg
//			;
	void block_args_tail() :
	{}
	{
		f_block_kwarg() <EXT_comma> f_kwrest() opt_f_block_arg()
		| f_block_kwarg() opt_f_block_arg()
		| f_kwrest() opt_f_block_arg()
		| f_block_arg()
	}

	
//	DEFINED
//	opt_block_args_tail() : ',' block_args_tail()
//			| 
//			;
	void opt_block_args_tail() :
	{}
	{
		<EXT_comma> block_args_tail()
		|
	}

	
//	DEFINED
//	block_param	: f_arg ',' f_block_optarg ',' f_rest_arg opt_block_args_tail()
//			| f_arg ',' f_block_optarg ',' f_rest_arg ',' f_arg opt_block_args_tail()
//			| f_arg ',' f_block_optarg opt_block_args_tail()
//			| f_arg ',' f_block_optarg ',' f_arg opt_block_args_tail()
//	                | f_arg ',' f_rest_arg opt_block_args_tail()
//			| f_arg ','
//			| f_arg ',' f_rest_arg ',' f_arg opt_block_args_tail()
//			| f_arg opt_block_args_tail()
//			| f_block_optarg ',' f_rest_arg opt_block_args_tail()
//			| f_block_optarg ',' f_rest_arg ',' f_arg opt_block_args_tail()
//			| f_block_optarg opt_block_args_tail()
//			| f_block_optarg ',' f_arg opt_block_args_tail()
//			| f_rest_arg opt_block_args_tail()
//			| f_rest_arg ',' f_arg opt_block_args_tail()
//			| block_args_tail()
//			;
	void block_param() :
	{}
	{
		f_arg() <EXT_comma> f_block_optarg() <EXT_comma> f_rest_arg() opt_block_args_tail()
		| f_arg() <EXT_comma> f_block_optarg() <EXT_comma> f_rest_arg() <EXT_comma> f_arg() opt_block_args_tail()
		| f_arg() <EXT_comma> f_block_optarg() opt_block_args_tail()
		| f_arg() <EXT_comma> f_block_optarg() <EXT_comma> f_arg() opt_block_args_tail()
        | f_arg() <EXT_comma> f_rest_arg() opt_block_args_tail()
		| f_arg() <EXT_comma>
		| f_arg() <EXT_comma> f_rest_arg() <EXT_comma> f_arg() opt_block_args_tail()
		| f_arg() opt_block_args_tail()
		| f_block_optarg() <EXT_comma> f_rest_arg() opt_block_args_tail()
		| f_block_optarg() <EXT_comma> f_rest_arg() <EXT_comma> f_arg() opt_block_args_tail()
		| f_block_optarg() opt_block_args_tail()
		| f_block_optarg() <EXT_comma> f_arg() opt_block_args_tail()
		| f_rest_arg() opt_block_args_tail()
		| f_rest_arg() <EXT_comma> f_arg() opt_block_args_tail()
		| block_args_tail()
	}

	
//	DEFINED
//	opt_block_param()	: none()
//			| block_param_def()
//			;
	void opt_block_param() :
	{}
	{
		none()
		| block_param_def()
	}

	
//	DEFINED
//	block_param_def()	: '|' opt_bv_decl() '|'
//			| <tOROP>
//			| '|' block_param opt_bv_decl() '|'
//			;
	void block_param_def() :
	{}
	{
		<EXT_pipe> opt_bv_decl() <EXT_pipe>
		| <tOROP>
		| <EXT_pipe> block_param() opt_bv_decl() <EXT_pipe>
	}

	
//	DEFINED
//	opt_bv_decl()	: opt_nl()
//			| opt_nl() ';' bv_decls opt_nl()
//			;
	void opt_bv_decl() :
	{}
	{
		opt_nl()
		| opt_nl() <EXT_semicolon> bv_decls() opt_nl()
	}

	
//	DEFINED
//	bv_decls	: bvar()
//			| bv_decls ',' bvar()
//			;
	void bv_decls() :
	{}
	{
		bvar()
		| bv_decls() <EXT_comma> bvar()
	}

	
//	UNDEFINED
//	bvar()		: tIDENTIFIER
//			| f_bad_arg
//			;
	void bvar() :
	{}
	{
		tIDENTIFIER()	// TODO
		| f_bad_arg()
	}

	
//	DEFINED
//	lambda		: f_larglist()
//			  lambda_body
//			;
	void lambda() :
	{}
	{
		f_larglist()
		lambda_body()
	}

	
//	DEFINED
//	f_larglist()	: '(' f_args opt_bv_decl() ')'
//			| f_args
//			;
	void f_larglist() :
	{}
	{
		<EXT_lparen> f_args() opt_bv_decl() <EXT_rparen>
		| f_args()
	}

	
//	UNDEFINED
//	lambda_body	: tLAMBEG compstmt '}'
//			    ");
//				$$ = $2;
//			    }
//			| keyword_do_LAMBDA() compstmt k_end()
//			;
	void lambda_body() :
	{}
	{
		tLAMBEG() compstmt() <EXT_rbrace>	// TODO
/*	    ");
		$$ = $2;
	    }*/
		| keyword_do_LAMBDA() compstmt() k_end()	// TODO
	}

	
//	DEFINED
//	do_block()	: <keyword_do_block>
//			  do_body() <keyword_end>
//			;
	void do_block() :
	{}
	{
		<keyword_do_block>
		do_body() <keyword_end>
	}

	
//	DEFINED
//	block_call	: command do_block()
//			| block_call call_op2 operation2 opt_paren_args
//			| block_call call_op2 operation2 opt_paren_args brace_block
//			| block_call call_op2 operation2 command_args do_block()
//			;
	void block_call() :
	{}
	{
		command() do_block()
		| block_call() call_op2() operation2() opt_paren_args()
		| block_call() call_op2() operation2() opt_paren_args() brace_block()
		| block_call() call_op2() operation2() command_args() do_block()
	}

	
//	DEFINED
//	method_call	: fcall paren_args
//			| primary_value call_op operation2
//			  opt_paren_args
//			| primary_value tCOLON2 operation2
//			  paren_args
//			| primary_value tCOLON2 operation3
//			| primary_value call_op
//			  paren_args
//			| primary_value tCOLON2
//			  paren_args
//			| keyword_super paren_args
//			| keyword_super
//			| primary_value '[' opt_call_args rbracket
//			;
	void method_call() :
	{}
	{
		fcall() paren_args()
		| primary_value() call_op() operation2()
		  opt_paren_args()
		| primary_value() <tCOLON2> operation2()
		  paren_args()
		| primary_value() <tCOLON2> operation3()
		| primary_value() call_op()
		  paren_args()
		| primary_value() <tCOLON2>
		  paren_args()
		| <keyword_super> paren_args()
		| <keyword_super>
		| primary_value() <EXT_lsqbracket> opt_call_args() rbracket()
	}
	
//	DEFINED
//	brace_block	: '{'
//			  brace_body '}'
//			| keyword_do
//			  do_body() <keyword_end>
//			;
	void brace_block() :
	{}
	{
		<EXT_lbrace>
		  brace_body() <EXT_rbrace>
		| <keyword_do>
		  do_body() <keyword_end>
	}

	
//	DEFINED
//	brace_body	: opt_block_param() compstmt
//			;
	void brace_body() :
	{}
	{
		opt_block_param() compstmt()
	}
	
//	DEFINED
//	do_body() 	: opt_block_param() compstmt()
//			;
	void do_body() :
	{}
	{
		opt_block_param() compstmt()
	}
	
//	DEFINED
//	case_body()	: <keyword_when> args then
//			  compstmt
//			  cases
//			;
	void case_body() :
	{}
	{
		<keyword_when> args() then()
		compstmt()
		cases()
	}

	
//	DEFINED
//	cases		: opt_else()
//			| case_body()
//			;
	void cases() :
	{}
	{
		opt_else()
		| case_body()
	}

	
//	DEFINED
//	opt_rescue()	: <keyword_rescue> exc_list() exc_var then
//			  compstmt
//			  opt_rescue()
//			| none()
//			;
	void opt_rescue() :
	{}
	{
		<keyword_rescue> exc_list() exc_var() then()
		  compstmt()
		  opt_rescue()
		| none()
	}

	
//	DEFINED
//	exc_list()	: arg_value
//			| mrhs
//			| none()
//			;
	void exc_list() :
	{}
	{
		arg_value()
		| mrhs()
		| none()
	}

	
//	DEFINED
//	exc_var		: <tASSOC> lhs
//			| none()
//			;
	void exc_var() :
	{}
	{
		<tASSOC> lhs()
		| none()
	}

	
//	DEFINED
//	opt_ensure	: <keyword_ensure> compstmt
//			| none()
//			;
	void opt_ensure() :
	{}
	{
		<keyword_ensure> compstmt()
		| none()
	}

	
//	DEFINED
//	literal		: numeric()
//			| symbol
//			| dsym()
//			;
	void literal() :
	{}
	{
		numeric()
		| symbol()
		| dsym()
	}
	
//	DEFINED
//	strings		: string
//			;
	void strings() :
	{}
	{
		string()
	}
	
//	UNDEFINED
//	string		: tCHAR
//			| string1()
//			| string string1()
//			;
	void string() :
	{}
	{
		tCHAR()	// TODO
		| string1()
		| string() string1()
	}

	
//	UNDEFINED
//	string1()		: tSTRING_BEG() string_contents() tSTRING_END
//			;
	void string1() :
	{}
	{
		tSTRING_BEG() string_contents() tSTRING_END()
	}
	
//	UNDEFINED
//	xstring		: tXSTRING_BEG() xstring_contents() tSTRING_END
//			;
	void xstring() :
	{}
	{
		tXSTRING_BEG() xstring_contents() tSTRING_END()
	}
	
//	UNDEFINED
//	regexp		: tREGEXP_BEG regexp_contents tREGEXP_END()
//			;
	void regexp() :
	{}
	{
		tREGEXP_BEG() regexp_contents() tREGEXP_END() // TODO: NF NF
	}
	
//	UNDEFINED
//	words		: tWORDS_BEG() ' ' tSTRING_END
//			| tWORDS_BEG() word_list tSTRING_END
//			;
	void words() :
	{}
	{
		tWORDS_BEG() <EXT_space> tSTRING_END() // TODO: NF NF
		| tWORDS_BEG() word_list() tSTRING_END()  // TODO: NF NF
	}

	
//	DEFINED
//	word_list	: 
//			| word_list word ' '
//			;
	void word_list() :
	{}
	{
		| word_list() word() <EXT_space>
	}

	
//	DEFINED
//	word		: string_content
//			| word string_content
//			;
	void word() :
	{}
	{
		string_content()
		| word() string_content()
	}

	
//	UNDEFINED
//	symbols 	: tSYMBOLS_BEG ' ' tSTRING_END
//			| tSYMBOLS_BEG symbol_list tSTRING_END
//			;
	void symbols() :
	{}
	{
		tSYMBOLS_BEG() <EXT_space> tSTRING_END()
		| tSYMBOLS_BEG() symbol_list() tSTRING_END()
	}

	
//	DEFINED
//	symbol_list	: 
//			| symbol_list word ' '
//			;
	void symbol_list() :
	{}
	{
		| symbol_list() word() <EXT_space>
	}

	
//	UNDEFINED
//	qwords		: tQWORDS_BEG ' ' tSTRING_END
//			| tQWORDS_BEG qword_list tSTRING_END
//			;
	void qwords() :
	{}
	{
		tQWORDS_BEG() <EXT_space> tSTRING_END()
		| tQWORDS_BEG() qword_list() tSTRING_END()
	}

	
//	UNDEFINED
//	qsymbols	: tQSYMBOLS_BEG() ' ' tSTRING_END
//			| tQSYMBOLS_BEG() qsym_list() tSTRING_END
//			;
	void qsymbols() :
	{}
	{
		tQSYMBOLS_BEG() <EXT_space> tSTRING_END() // TODO: NF NF
		| tQSYMBOLS_BEG() qsym_list() tSTRING_END() // TODO: NF NF
	}

	
//	UNDEFINED
//	qword_list	: 
//			| qword_list tSTRING_CONTENT ' '
//			;
	void qword_list() :
	{}
	{
		| qword_list() tSTRING_CONTENT() <EXT_space> // TODO: NF
	}

	
//	UNDEFINED
//	qsym_list()	: 
//			| qsym_list() tSTRING_CONTENT ' '
//			;
	void qsym_list() :
	{}
	{
		| qsym_list() tSTRING_CONTENT() <EXT_space>
	}

	
//	DEFINED
//	string_contents() : 
//			| string_contents() string_content
//			;
	void string_contents() :
	{}
	{
		| string_contents() string_content()
	}

	
//	DEFINED
//	xstring_contents(): 
//			| xstring_contents() string_content
//			;
	void xstring_contents() :
	{}
	{
		| xstring_contents() string_content()
	}

	
//	DEFINED
//	regexp_contents: 
//			| regexp_contents string_content
//			;
	void regexp_contents() :
	{}
	{
		| regexp_contents() string_content()
	}

	
//	UNDEFINED
//	string_content	: tSTRING_CONTENT
//			| tSTRING_DVAR
//			  string_dvar()
//			| tSTRING_DBEG
//			  compstmt tSTRING_DEND
//			;
	void string_content() :
	{}
	{
		tSTRING_CONTENT()
		| tSTRING_DVAR()
		  string_dvar()
		| tSTRING_DBEG()
		  compstmt() tSTRING_DEND()
	}

	
//	UNDEFINED
//	string_dvar()	: tGVAR()
//			| tIVAR()
//			| tCVAR()
//			| backref
//			;
	void string_dvar() :
	{}
	{
		tGVAR()
		| tIVAR()
		| tCVAR()
		| backref()
	}

	
//	UNDEFINED
//	symbol		: tSYMBEG() sym
//			;
	void symbol() :
	{}
	{
		tSYMBEG() sym()
	}
	
//	UNDEFINED
//	sym		: fname()
//			| tIVAR()
//			| tGVAR()
//			| tCVAR()
//			;
	void sym() :
	{}
	{
		fname()
		| tIVAR()
		| tGVAR()
		| tCVAR()
	}

	
//	UNDEFINED
//	dsym()		: tSYMBEG() xstring_contents() tSTRING_END
//			;
	void dsym() :
	{}
	{
		tSYMBEG() xstring_contents() tSTRING_END()
	}
	
//	UNDEFINED
//	numeric() 	: simple_numeric()
//			| tUMINUS_NUM() simple_numeric()   %prec tLOWEST()
//			;
	void numeric() :
	{}
	{
		simple_numeric()
		| tUMINUS_NUM() simple_numeric()   %prec tLOWEST()  // TODO: %
	}

	
//	UNDEFINED
//	simple_numeric()	: tINTEGER
//			| tFLOAT
//			| tRATIONAL
//			| tIMAGINARY
//			;
	void simple_numeric() :
	{}
	{
		tINTEGER()
		| tFLOAT()
		| tRATIONAL()
		| tIMAGINARY()
	}

	
//	UNDEFINED
//	user_variable()	: tIDENTIFIER
//			| tIVAR()
//			| tGVAR()
//			| tCONSTANT
//			| tCVAR()
//			;
	void user_variable() :
	{}
	{
		tIDENTIFIER()
		| tIVAR()
		| tGVAR()
		| tCONSTANT()
		| tCVAR()
	}

	
//	DEFINED
//	keyword_variable(): <keyword_nil> 
//			| <keyword_self> 
//			| <keyword_true> 
//			| <keyword_false> 
//			| <keyword__FILE__> 
//			| keyword__LINE__ 
//			| <keyword__ENCODING__> 
//			;
	void keyword_variable() :
	{}
	{
		<keyword_nil> 
		| <keyword_self> 
		| <keyword_true> 
		| <keyword_false> 
		| <keyword__FILE__> 
		| <keyword__LINE__> 
		| <keyword__ENCODING__>
	}

	
//	DEFINED
//	var_ref		: user_variable()
//			| keyword_variable()
//			;
	void var_ref() :
	{}
	{
		user_variable()
		| keyword_variable()
	}

	
//	DEFINED
//	var_lhs		: user_variable()
//			| keyword_variable()
//			;
	void var_lhs() :
	{}
	{
		user_variable()
		| keyword_variable()
	}

	
//	UNDEFINED
//	backref		: tNTH_REF()
//			| tBACK_REF()
//			;
	void backref() :
	{}
	{
		tNTH_REF()	// TODO
		| tBACK_REF() // TODO
	}

	
//	DEFINED
//	superclass()	: '<'
//			  expr_value() term
//			| 
//			;
	void superclass() :
	{}
	{
		<EXT_langbracket>
		expr_value() term()
		|
	}

	
//	DEFINED
//	f_arglist()	: '(' f_args rparen
//			| f_args term
//			;
	void f_arglist() :
	{}
	{
		<EXT_lparen> f_args() rparen()
		| f_args() term()
	}

	
//	DEFINED
//	args_tail()	: f_kwarg ',' f_kwrest() opt_f_block_arg
//			| f_kwarg opt_f_block_arg
//			| f_kwrest() opt_f_block_arg
//			| f_block_arg
//			;
	void args_tail() :
	{}
	{
		f_kwarg() <EXT_comma> f_kwrest() opt_f_block_arg()
		| f_kwarg() opt_f_block_arg()
		| f_kwrest() opt_f_block_arg()
		| f_block_arg()
	}

	
//	DEFINED
//	opt_args_tail()	: ',' args_tail()
//			| 
//			;
	void opt_args_tail() :
	{}
	{
		<EXT_comma> args_tail()
		|
	}

	
//	DEFINED
//	f_args		: f_arg ',' f_optarg ',' f_rest_arg opt_args_tail()
//			| f_arg ',' f_optarg ',' f_rest_arg ',' f_arg opt_args_tail()
//			| f_arg ',' f_optarg opt_args_tail()
//			| f_arg ',' f_optarg ',' f_arg opt_args_tail()
//			| f_arg ',' f_rest_arg opt_args_tail()
//			| f_arg ',' f_rest_arg ',' f_arg opt_args_tail()
//			| f_arg opt_args_tail()
//			| f_optarg ',' f_rest_arg opt_args_tail()
//			| f_optarg ',' f_rest_arg ',' f_arg opt_args_tail()
//			| f_optarg opt_args_tail()
//			| f_optarg ',' f_arg opt_args_tail()
//			| f_rest_arg opt_args_tail()
//			| f_rest_arg ',' f_arg opt_args_tail()
//			| args_tail()
//			| 
//			;
	void f_args() :
	{}
	{
		f_arg() <EXT_comma> f_optarg() <EXT_comma> f_rest_arg() opt_args_tail()
		| f_arg() <EXT_comma> f_optarg() <EXT_comma> f_rest_arg() <EXT_comma> f_arg() opt_args_tail()
		| f_arg() <EXT_comma> f_optarg() opt_args_tail()
		| f_arg() <EXT_comma> f_optarg() <EXT_comma> f_arg() opt_args_tail()
		| f_arg() <EXT_comma> f_rest_arg() opt_args_tail()
		| f_arg() <EXT_comma> f_rest_arg() <EXT_comma> f_arg() opt_args_tail()
		| f_arg() opt_args_tail()
		| f_optarg() <EXT_comma> f_rest_arg() opt_args_tail()
		| f_optarg() <EXT_comma> f_rest_arg() <EXT_comma> f_arg() opt_args_tail()
		| f_optarg() opt_args_tail()
		| f_optarg() <EXT_comma> f_arg() opt_args_tail()
		| f_rest_arg() opt_args_tail()
		| f_rest_arg() <EXT_comma> f_arg() opt_args_tail()
		| args_tail()
		| 
	}

	
//	UNDEFINED
//	f_bad_arg	: tCONSTANT
//			| tIVAR()
//			| tGVAR()
//			| tCVAR()
//			;
	void f_bad_arg() :
	{}
	{
		tCONSTANT()
		| tIVAR()
		| tGVAR()
		| tCVAR()
	}

	
//	UNDEFINED
//	f_norm_arg	: f_bad_arg
//			| tIDENTIFIER
//			;
	void f_norm_arg() :
	{}
	{
		f_bad_arg()
		| tIDENTIFIER()
	}

	
//	DEFINED
//	f_arg_asgn	: f_norm_arg
//			;
	void f_arg_asgn() :
	{}
	{
		f_norm_arg()
	}

	
//	DEFINED
//	f_arg_item()	: f_arg_asgn
//			| tLPAREN f_margs rparen
//			;
	void f_arg_item() :
	{}
	{
		f_arg_asgn()
		| <tLPAREN> f_margs() rparen()
	}

	
//	DEFINED
//	f_arg		: f_arg_item()
//			| f_arg ',' f_arg_item()
//			;
	void f_arg() :
	{}
	{
		f_arg_item()
		| f_arg() <EXT_comma> f_arg_item()
	}

	
//	UNDEFINED
//	f_label 	: tLABEL
//			;
	void f_label() :
	{}
	{
		tLABEL()
	}

	
//	DEFINED
//	f_kw		: f_label arg_value
//			| f_label
//			;
	void f_kw() :
	{}
	{
		f_label() arg_value()
		| f_label()
	}

	
//	DEFINED
//	f_block_kw	: f_label primary_value
//			| f_label
//			;
	void f_block_kw() :
	{}
	{
		f_label() primary_value()
		| f_label()
	}

	
//	DEFINED
//	f_block_kwarg	: f_block_kw
//			| f_block_kwarg ',' f_block_kw
//			;
	void f_block_kwarg() :
	{}
	{
		f_block_kw()
		| f_block_kwarg() <EXT_comma> f_block_kw()
	}

	
//	DEFINED
//	f_kwarg		: f_kw
//			| f_kwarg ',' f_kw
//			;
	void f_kwarg() :
	{}
	{
		f_kw()
		| f_kwarg() <EXT_comma> f_kw()
	}

	
//	DEFINED
//	kwrest_mark()	: <tPOW>
//			| <tDSTAR>
//			;
	void kwrest_mark() :
	{}
	{
		<tPOW>
		| <tDSTAR>
	}

	
//	UNDEFINED
//	f_kwrest()	: kwrest_mark() tIDENTIFIER
//			| kwrest_mark()
//			;
	void f_kwrest() :
	{}
	{
		kwrest_mark() tIDENTIFIER()
		| kwrest_mark()
	}

	
//	DEFINED
//	f_opt		: f_arg_asgn '=' arg_value
//			;
	void f_opt() :
	{}
	{
		f_arg_asgn() <EXT_equal> arg_value()
	}

	
//	DEFINED
//	f_block_opt	: f_arg_asgn '=' primary_value
//			;
	void f_block_opt() :
	{}
	{
		f_arg_asgn() <EXT_equal> primary_value()
	}

	
//	DEFINED
//	f_block_optarg	: f_block_opt
//			| f_block_optarg ',' f_block_opt
//			;
	void f_block_optarg() :
	{}
	{
		f_block_opt()
		| f_block_optarg() <EXT_comma> f_block_opt()
	}

	
//	DEFINED
//	f_optarg	: f_opt
//			| f_optarg ',' f_opt
//			;
	void f_optarg() :
	{}
	{
		f_opt()
		| f_optarg() <EXT_comma> f_opt()
	}

	
//	DEFINED
//	restarg_mark	: '*'
//			| tSTAR
//			;
	void restarg_mark() :
	{}
	{
		<EXT_star>
		| <tSTAR>
	}

	
//	UNDEFINED
//	f_rest_arg	: restarg_mark tIDENTIFIER
//			| restarg_mark
//			;
	void f_rest_arg() :
	{}
	{
		restarg_mark() tIDENTIFIER()
		| restarg_mark()
	}

	
//	DEFINED
//	blkarg_mark	: '&'
//			| <tAMPER>
//			;
	void blkarg_mark() :
	{}
	{
		<EXT_amper>
		| <tAMPER>
	}

	
//	UNDEFINED
//	f_block_arg	: blkarg_mark tIDENTIFIER
//			;
	void f_block_arg() :
	{}
	{
		blkarg_mark() tIDENTIFIER()
	}

	
//	DEFINED
//	opt_f_block_arg	: ',' f_block_arg
//			| none()
//			;
	void opt_f_block_arg() :
	{}
	{
		<EXT_comma> f_block_arg()
		| none()
	}

	
//	DEFINED
//	singleton()	: var_ref
//			| '('  expr rparen
//			;
	void singleton() :
	{}
	{
		var_ref()
		| <EXT_lparen>  expr() rparen()
	}

	
//	DEFINED
//	assoc_list	: none()
//			| assocs trailer
//			;
	void assoc_list() :
	{}
	{
		none()
		| assocs() trailer()
	}

	
//	DEFINED
//	assocs		: assoc
//			| assocs ',' assoc
//			;
	void assocs() :
	{}
	{
		assoc()
		| assocs() <EXT_comma> assoc()
	}

	
//	UNDEFINED
//	assoc		: arg_value <tASSOC> arg_value
//			| tLABEL arg_value
//			| tSTRING_BEG() string_contents() tLABEL_END arg_value
//			| <tDSTAR> arg_value
//			;
	void assoc() :
	{}
	{
		arg_value() <tASSOC> arg_value()
		| tLABEL() arg_value()
		| tSTRING_BEG() string_contents() tLABEL_END() arg_value()
		| <tDSTAR> arg_value()
	}

	
//	UNDEFINED
//	operation	: tIDENTIFIER
//			| tCONSTANT
//			| tFID
//			;
	void operation() :
	{}
	{
		tIDENTIFIER()
		| tCONSTANT()
		| tFID()
	}

	
//	UNDEFINED
//	operation2	: tIDENTIFIER
//			| tCONSTANT
//			| tFID
//			| op
//			;
	void operation2() :
	{}
	{
		tIDENTIFIER()
		| tCONSTANT()
		| tFID()
		| op()
	}

	
//	UNDEFINED
//	operation3	: tIDENTIFIER
//			| tFID
//			| op
//			;
	void operation3() :
	{}
	{
		tIDENTIFIER()
		| tFID()
		| op()
	}

	
//	DEFINED
//	dot_or_colon()	: '.'
//			| tCOLON2
//			;
	void dot_or_colon() :
	{}
	{
		<EXT_dot>
		| <tCOLON2>
	}

	
//	DEFINED
//	call_op 	: '.'
//			| <tANDDOT>
//			;
	void call_op() :
	{}
	{
		<EXT_dot>
		| <tANDDOT>
	}

	
//	DEFINED
//	call_op2	: call_op
//			| tCOLON2
//			;
	void call_op2() :
	{}
	{
		call_op()
		| <tCOLON2>
	}

	
//	DEFINED
//	opt_terms	: 
//			| terms
//			;
	void opt_terms() :
	{}
	{
		| terms()
	}

	
//	DEFINED
//	opt_nl()		: 
//			| '\n'
//			;
	void opt_nl() :
	{}
	{
		| <EXT_newline>
	}

	
//	DEFINED
//	rparen		: opt_nl() ')'
//			;
	void rparen() :
	{}
	{
		opt_nl() <EXT_rparen>
	}

	
//	DEFINED
//	rbracket	: opt_nl() ']'
//			;
	void rbracket() :
	{}
	{
		opt_nl() <EXT_rsqbracket>
	}

	
//	DEFINED
//	trailer		: 
//			| '\n'
//			| ','
//			;
	void trailer() :
	{}
	{
		| <EXT_newline>
		| <EXT_comma>
	}

	
//	DEFINED
//	term		: ';' 
//			| '\n'
//			;
	void term() :
	{}
	{
		<EXT_semicolon>
		| <EXT_newline>
	}

	
//	DEFINED
//	terms		: term
//			| terms ';' 
//			;
	void terms() :
	{}
	{
		term()
		| terms() <EXT_semicolon>
	}

	
//	UNDEFINED
//	none()		: 
//			;
	void none() :
	{}
	{
	
	}
	
}
