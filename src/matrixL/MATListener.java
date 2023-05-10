package matrixL;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MATParser}.
 */
public interface MATListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MATParser#programDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProgramDeclaration(MATParser.ProgramDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#programDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProgramDeclaration(MATParser.ProgramDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(MATParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(MATParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(MATParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(MATParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MATParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MATParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_list(MATParser.Variable_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#variable_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_list(MATParser.Variable_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(MATParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(MATParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MATParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MATParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#var_operations}.
	 * @param ctx the parse tree
	 */
	void enterVar_operations(MATParser.Var_operationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#var_operations}.
	 * @param ctx the parse tree
	 */
	void exitVar_operations(MATParser.Var_operationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MATParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MATParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void enterSubexpression(MATParser.SubexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#subexpression}.
	 * @param ctx the parse tree
	 */
	void exitSubexpression(MATParser.SubexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(MATParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(MATParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#matrix_constructor}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_constructor(MATParser.Matrix_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#matrix_constructor}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_constructor(MATParser.Matrix_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#matrix_values}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_values(MATParser.Matrix_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#matrix_values}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_values(MATParser.Matrix_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#matrix_numbers}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_numbers(MATParser.Matrix_numbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#matrix_numbers}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_numbers(MATParser.Matrix_numbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_main}.
	 * @param ctx the parse tree
	 */
	void enterTk_main(MATParser.Tk_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_main}.
	 * @param ctx the parse tree
	 */
	void exitTk_main(MATParser.Tk_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterTk_semicolon(MATParser.Tk_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitTk_semicolon(MATParser.Tk_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_comma}.
	 * @param ctx the parse tree
	 */
	void enterTk_comma(MATParser.Tk_commaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_comma}.
	 * @param ctx the parse tree
	 */
	void exitTk_comma(MATParser.Tk_commaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_assign}.
	 * @param ctx the parse tree
	 */
	void enterTk_assign(MATParser.Tk_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_assign}.
	 * @param ctx the parse tree
	 */
	void exitTk_assign(MATParser.Tk_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_id}.
	 * @param ctx the parse tree
	 */
	void enterTk_id(MATParser.Tk_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_id}.
	 * @param ctx the parse tree
	 */
	void exitTk_id(MATParser.Tk_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_number}.
	 * @param ctx the parse tree
	 */
	void enterTk_number(MATParser.Tk_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_number}.
	 * @param ctx the parse tree
	 */
	void exitTk_number(MATParser.Tk_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_type_int}.
	 * @param ctx the parse tree
	 */
	void enterTk_type_int(MATParser.Tk_type_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_type_int}.
	 * @param ctx the parse tree
	 */
	void exitTk_type_int(MATParser.Tk_type_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_type_matrix}.
	 * @param ctx the parse tree
	 */
	void enterTk_type_matrix(MATParser.Tk_type_matrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_type_matrix}.
	 * @param ctx the parse tree
	 */
	void exitTk_type_matrix(MATParser.Tk_type_matrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_write}.
	 * @param ctx the parse tree
	 */
	void enterTk_write(MATParser.Tk_writeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_write}.
	 * @param ctx the parse tree
	 */
	void exitTk_write(MATParser.Tk_writeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_plus}.
	 * @param ctx the parse tree
	 */
	void enterTk_plus(MATParser.Tk_plusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_plus}.
	 * @param ctx the parse tree
	 */
	void exitTk_plus(MATParser.Tk_plusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_minus}.
	 * @param ctx the parse tree
	 */
	void enterTk_minus(MATParser.Tk_minusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_minus}.
	 * @param ctx the parse tree
	 */
	void exitTk_minus(MATParser.Tk_minusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_mult}.
	 * @param ctx the parse tree
	 */
	void enterTk_mult(MATParser.Tk_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_mult}.
	 * @param ctx the parse tree
	 */
	void exitTk_mult(MATParser.Tk_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_div}.
	 * @param ctx the parse tree
	 */
	void enterTk_div(MATParser.Tk_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_div}.
	 * @param ctx the parse tree
	 */
	void exitTk_div(MATParser.Tk_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_transpos}.
	 * @param ctx the parse tree
	 */
	void enterTk_transpos(MATParser.Tk_transposContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_transpos}.
	 * @param ctx the parse tree
	 */
	void exitTk_transpos(MATParser.Tk_transposContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_par_open}.
	 * @param ctx the parse tree
	 */
	void enterTk_par_open(MATParser.Tk_par_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_par_open}.
	 * @param ctx the parse tree
	 */
	void exitTk_par_open(MATParser.Tk_par_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_par_close}.
	 * @param ctx the parse tree
	 */
	void enterTk_par_close(MATParser.Tk_par_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_par_close}.
	 * @param ctx the parse tree
	 */
	void exitTk_par_close(MATParser.Tk_par_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_bracket_open}.
	 * @param ctx the parse tree
	 */
	void enterTk_bracket_open(MATParser.Tk_bracket_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_bracket_open}.
	 * @param ctx the parse tree
	 */
	void exitTk_bracket_open(MATParser.Tk_bracket_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_bracket_close}.
	 * @param ctx the parse tree
	 */
	void enterTk_bracket_close(MATParser.Tk_bracket_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_bracket_close}.
	 * @param ctx the parse tree
	 */
	void exitTk_bracket_close(MATParser.Tk_bracket_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_brace_open}.
	 * @param ctx the parse tree
	 */
	void enterTk_brace_open(MATParser.Tk_brace_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_brace_open}.
	 * @param ctx the parse tree
	 */
	void exitTk_brace_open(MATParser.Tk_brace_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATParser#tk_brace_close}.
	 * @param ctx the parse tree
	 */
	void enterTk_brace_close(MATParser.Tk_brace_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATParser#tk_brace_close}.
	 * @param ctx the parse tree
	 */
	void exitTk_brace_close(MATParser.Tk_brace_closeContext ctx);
}