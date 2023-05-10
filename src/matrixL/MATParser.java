package matrixL;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MATParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Identifier=19, Number=20, WS=21;
	public static final int
		RULE_programDeclaration = 0, RULE_instructions = 1, RULE_declaration_list = 2, 
		RULE_declaration = 3, RULE_variable_list = 4, RULE_dataType = 5, RULE_print = 6, 
		RULE_var_operations = 7, RULE_expression = 8, RULE_subexpression = 9, 
		RULE_sign = 10, RULE_matrix_constructor = 11, RULE_matrix_values = 12, 
		RULE_matrix_numbers = 13, RULE_tk_main = 14, RULE_tk_semicolon = 15, RULE_tk_comma = 16, 
		RULE_tk_assign = 17, RULE_tk_id = 18, RULE_tk_number = 19, RULE_tk_type_int = 20, 
		RULE_tk_type_matrix = 21, RULE_tk_write = 22, RULE_tk_plus = 23, RULE_tk_minus = 24, 
		RULE_tk_mult = 25, RULE_tk_div = 26, RULE_tk_transpos = 27, RULE_tk_par_open = 28, 
		RULE_tk_par_close = 29, RULE_tk_bracket_open = 30, RULE_tk_bracket_close = 31, 
		RULE_tk_brace_open = 32, RULE_tk_brace_close = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"programDeclaration", "instructions", "declaration_list", "declaration", 
			"variable_list", "dataType", "print", "var_operations", "expression", 
			"subexpression", "sign", "matrix_constructor", "matrix_values", "matrix_numbers", 
			"tk_main", "tk_semicolon", "tk_comma", "tk_assign", "tk_id", "tk_number", 
			"tk_type_int", "tk_type_matrix", "tk_write", "tk_plus", "tk_minus", "tk_mult", 
			"tk_div", "tk_transpos", "tk_par_open", "tk_par_close", "tk_bracket_open", 
			"tk_bracket_close", "tk_brace_open", "tk_brace_close"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "';'", "','", "'='", "'int'", "'matrix'", "'write'", 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Identifier", "Number", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MAT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MATParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramDeclarationContext extends ParserRuleContext {
		public Tk_mainContext tk_main() {
			return getRuleContext(Tk_mainContext.class,0);
		}
		public Tk_brace_openContext tk_brace_open() {
			return getRuleContext(Tk_brace_openContext.class,0);
		}
		public Tk_brace_closeContext tk_brace_close() {
			return getRuleContext(Tk_brace_closeContext.class,0);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public ProgramDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterProgramDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitProgramDeclaration(this);
		}
	}

	public final ProgramDeclarationContext programDeclaration() throws RecognitionException {
		ProgramDeclarationContext _localctx = new ProgramDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			tk_main();
			setState(69);
			tk_brace_open();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << Identifier))) != 0)) {
				{
				{
				setState(70);
				instructions();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			tk_brace_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Var_operationsContext var_operations() {
			return getRuleContext(Var_operationsContext.class,0);
		}
		public Matrix_constructorContext matrix_constructor() {
			return getRuleContext(Matrix_constructorContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructions);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				declaration_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				var_operations();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				matrix_constructor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_listContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterDeclaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitDeclaration_list(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration_list);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				declaration();
				setState(85);
				tk_semicolon();
				setState(86);
				declaration_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				declaration();
				setState(89);
				tk_semicolon();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			dataType();
			setState(94);
			variable_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_listContext extends ParserRuleContext {
		public Tk_idContext tk_id() {
			return getRuleContext(Tk_idContext.class,0);
		}
		public Tk_commaContext tk_comma() {
			return getRuleContext(Tk_commaContext.class,0);
		}
		public Variable_listContext variable_list() {
			return getRuleContext(Variable_listContext.class,0);
		}
		public Variable_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterVariable_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitVariable_list(this);
		}
	}

	public final Variable_listContext variable_list() throws RecognitionException {
		Variable_listContext _localctx = new Variable_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_list);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				tk_id();
				setState(97);
				tk_comma();
				setState(98);
				variable_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				tk_id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public Tk_type_intContext tk_type_int() {
			return getRuleContext(Tk_type_intContext.class,0);
		}
		public Tk_type_matrixContext tk_type_matrix() {
			return getRuleContext(Tk_type_matrixContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dataType);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				tk_type_int();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				tk_type_matrix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public Tk_writeContext tk_write() {
			return getRuleContext(Tk_writeContext.class,0);
		}
		public Tk_idContext tk_id() {
			return getRuleContext(Tk_idContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			tk_write();
			setState(108);
			tk_id();
			setState(109);
			tk_semicolon();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_operationsContext extends ParserRuleContext {
		public Tk_idContext tk_id() {
			return getRuleContext(Tk_idContext.class,0);
		}
		public Tk_assignContext tk_assign() {
			return getRuleContext(Tk_assignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public Var_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterVar_operations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitVar_operations(this);
		}
	}

	public final Var_operationsContext var_operations() throws RecognitionException {
		Var_operationsContext _localctx = new Var_operationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			tk_id();
			setState(112);
			tk_assign();
			setState(113);
			expression();
			setState(114);
			tk_semicolon();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public SubexpressionContext subexpression() {
			return getRuleContext(SubexpressionContext.class,0);
		}
		public Tk_plusContext tk_plus() {
			return getRuleContext(Tk_plusContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tk_minusContext tk_minus() {
			return getRuleContext(Tk_minusContext.class,0);
		}
		public Tk_multContext tk_mult() {
			return getRuleContext(Tk_multContext.class,0);
		}
		public Tk_transposContext tk_transpos() {
			return getRuleContext(Tk_transposContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				subexpression();
				setState(117);
				tk_plus();
				setState(118);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				subexpression();
				setState(121);
				tk_minus();
				setState(122);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				subexpression();
				setState(125);
				tk_mult();
				setState(126);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				subexpression();
				setState(129);
				tk_transpos();
				setState(130);
				sign();
				setState(131);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				subexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubexpressionContext extends ParserRuleContext {
		public Tk_idContext tk_id() {
			return getRuleContext(Tk_idContext.class,0);
		}
		public Tk_numberContext tk_number() {
			return getRuleContext(Tk_numberContext.class,0);
		}
		public Tk_par_openContext tk_par_open() {
			return getRuleContext(Tk_par_openContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tk_par_closeContext tk_par_close() {
			return getRuleContext(Tk_par_closeContext.class,0);
		}
		public SubexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterSubexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitSubexpression(this);
		}
	}

	public final SubexpressionContext subexpression() throws RecognitionException {
		SubexpressionContext _localctx = new SubexpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subexpression);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				tk_id();
				}
				break;
			case T__8:
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				tk_number();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				tk_par_open();
				setState(139);
				expression();
				setState(140);
				tk_par_close();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public Tk_plusContext tk_plus() {
			return getRuleContext(Tk_plusContext.class,0);
		}
		public Tk_minusContext tk_minus() {
			return getRuleContext(Tk_minusContext.class,0);
		}
		public Tk_multContext tk_mult() {
			return getRuleContext(Tk_multContext.class,0);
		}
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sign);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				tk_plus();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				tk_minus();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				tk_mult();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matrix_constructorContext extends ParserRuleContext {
		public Tk_idContext tk_id() {
			return getRuleContext(Tk_idContext.class,0);
		}
		public Tk_assignContext tk_assign() {
			return getRuleContext(Tk_assignContext.class,0);
		}
		public Matrix_valuesContext matrix_values() {
			return getRuleContext(Matrix_valuesContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public Matrix_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterMatrix_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitMatrix_constructor(this);
		}
	}

	public final Matrix_constructorContext matrix_constructor() throws RecognitionException {
		Matrix_constructorContext _localctx = new Matrix_constructorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matrix_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			tk_id();
			setState(150);
			tk_assign();
			setState(151);
			matrix_values();
			setState(152);
			tk_semicolon();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matrix_valuesContext extends ParserRuleContext {
		public Tk_bracket_openContext tk_bracket_open() {
			return getRuleContext(Tk_bracket_openContext.class,0);
		}
		public Tk_bracket_closeContext tk_bracket_close() {
			return getRuleContext(Tk_bracket_closeContext.class,0);
		}
		public List<Matrix_numbersContext> matrix_numbers() {
			return getRuleContexts(Matrix_numbersContext.class);
		}
		public Matrix_numbersContext matrix_numbers(int i) {
			return getRuleContext(Matrix_numbersContext.class,i);
		}
		public Matrix_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterMatrix_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitMatrix_values(this);
		}
	}

	public final Matrix_valuesContext matrix_values() throws RecognitionException {
		Matrix_valuesContext _localctx = new Matrix_valuesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_matrix_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			tk_bracket_open();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Number) {
				{
				{
				setState(155);
				matrix_numbers();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			tk_bracket_close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matrix_numbersContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(MATParser.Number, 0); }
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public Tk_commaContext tk_comma() {
			return getRuleContext(Tk_commaContext.class,0);
		}
		public Matrix_numbersContext matrix_numbers() {
			return getRuleContext(Matrix_numbersContext.class,0);
		}
		public Matrix_numbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_numbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterMatrix_numbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitMatrix_numbers(this);
		}
	}

	public final Matrix_numbersContext matrix_numbers() throws RecognitionException {
		Matrix_numbersContext _localctx = new Matrix_numbersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_matrix_numbers);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(Number);
				setState(165);
				tk_semicolon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(Number);
				setState(167);
				tk_comma();
				setState(168);
				matrix_numbers();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_mainContext extends ParserRuleContext {
		public Tk_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_main(this);
		}
	}

	public final Tk_mainContext tk_main() throws RecognitionException {
		Tk_mainContext _localctx = new Tk_mainContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tk_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_semicolonContext extends ParserRuleContext {
		public Tk_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_semicolon(this);
		}
	}

	public final Tk_semicolonContext tk_semicolon() throws RecognitionException {
		Tk_semicolonContext _localctx = new Tk_semicolonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tk_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_commaContext extends ParserRuleContext {
		public Tk_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_comma(this);
		}
	}

	public final Tk_commaContext tk_comma() throws RecognitionException {
		Tk_commaContext _localctx = new Tk_commaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tk_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_assignContext extends ParserRuleContext {
		public Tk_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_assign(this);
		}
	}

	public final Tk_assignContext tk_assign() throws RecognitionException {
		Tk_assignContext _localctx = new Tk_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tk_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_idContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MATParser.Identifier, 0); }
		public Tk_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_id(this);
		}
	}

	public final Tk_idContext tk_id() throws RecognitionException {
		Tk_idContext _localctx = new Tk_idContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tk_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_numberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(MATParser.Number, 0); }
		public Tk_minusContext tk_minus() {
			return getRuleContext(Tk_minusContext.class,0);
		}
		public Tk_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_number(this);
		}
	}

	public final Tk_numberContext tk_number() throws RecognitionException {
		Tk_numberContext _localctx = new Tk_numberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tk_number);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(Number);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				tk_minus();
				setState(184);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_type_intContext extends ParserRuleContext {
		public Tk_type_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_type_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_type_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_type_int(this);
		}
	}

	public final Tk_type_intContext tk_type_int() throws RecognitionException {
		Tk_type_intContext _localctx = new Tk_type_intContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tk_type_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_type_matrixContext extends ParserRuleContext {
		public Tk_type_matrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_type_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_type_matrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_type_matrix(this);
		}
	}

	public final Tk_type_matrixContext tk_type_matrix() throws RecognitionException {
		Tk_type_matrixContext _localctx = new Tk_type_matrixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tk_type_matrix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_writeContext extends ParserRuleContext {
		public Tk_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_write(this);
		}
	}

	public final Tk_writeContext tk_write() throws RecognitionException {
		Tk_writeContext _localctx = new Tk_writeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tk_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_plusContext extends ParserRuleContext {
		public Tk_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_plus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_plus(this);
		}
	}

	public final Tk_plusContext tk_plus() throws RecognitionException {
		Tk_plusContext _localctx = new Tk_plusContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tk_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_minusContext extends ParserRuleContext {
		public Tk_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_minus(this);
		}
	}

	public final Tk_minusContext tk_minus() throws RecognitionException {
		Tk_minusContext _localctx = new Tk_minusContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tk_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_multContext extends ParserRuleContext {
		public Tk_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_mult(this);
		}
	}

	public final Tk_multContext tk_mult() throws RecognitionException {
		Tk_multContext _localctx = new Tk_multContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tk_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_divContext extends ParserRuleContext {
		public Tk_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_div(this);
		}
	}

	public final Tk_divContext tk_div() throws RecognitionException {
		Tk_divContext _localctx = new Tk_divContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tk_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_transposContext extends ParserRuleContext {
		public Tk_transposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_transpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_transpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_transpos(this);
		}
	}

	public final Tk_transposContext tk_transpos() throws RecognitionException {
		Tk_transposContext _localctx = new Tk_transposContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tk_transpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_par_openContext extends ParserRuleContext {
		public Tk_par_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_par_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_par_open(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_par_open(this);
		}
	}

	public final Tk_par_openContext tk_par_open() throws RecognitionException {
		Tk_par_openContext _localctx = new Tk_par_openContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tk_par_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_par_closeContext extends ParserRuleContext {
		public Tk_par_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_par_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_par_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_par_close(this);
		}
	}

	public final Tk_par_closeContext tk_par_close() throws RecognitionException {
		Tk_par_closeContext _localctx = new Tk_par_closeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tk_par_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_bracket_openContext extends ParserRuleContext {
		public Tk_bracket_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_bracket_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_bracket_open(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_bracket_open(this);
		}
	}

	public final Tk_bracket_openContext tk_bracket_open() throws RecognitionException {
		Tk_bracket_openContext _localctx = new Tk_bracket_openContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tk_bracket_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_bracket_closeContext extends ParserRuleContext {
		public Tk_bracket_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_bracket_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_bracket_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_bracket_close(this);
		}
	}

	public final Tk_bracket_closeContext tk_bracket_close() throws RecognitionException {
		Tk_bracket_closeContext _localctx = new Tk_bracket_closeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tk_bracket_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_brace_openContext extends ParserRuleContext {
		public Tk_brace_openContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_brace_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_brace_open(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_brace_open(this);
		}
	}

	public final Tk_brace_openContext tk_brace_open() throws RecognitionException {
		Tk_brace_openContext _localctx = new Tk_brace_openContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tk_brace_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tk_brace_closeContext extends ParserRuleContext {
		public Tk_brace_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_brace_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).enterTk_brace_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MATListener ) ((MATListener)listener).exitTk_brace_close(this);
		}
	}

	public final Tk_brace_closeContext tk_brace_close() throws RecognitionException {
		Tk_brace_closeContext _localctx = new Tk_brace_closeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tk_brace_close);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\5\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0089\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0091\n\13"+
		"\3\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16\u009f\n"+
		"\16\f\16\16\16\u00a2\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00ad\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\5\25\u00bd\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BD\2\2\2\u00cb\2F\3\2\2\2\4T\3\2\2\2\6]\3\2\2\2\b"+
		"_\3\2\2\2\ng\3\2\2\2\fk\3\2\2\2\16m\3\2\2\2\20q\3\2\2\2\22\u0088\3\2\2"+
		"\2\24\u0090\3\2\2\2\26\u0095\3\2\2\2\30\u0097\3\2\2\2\32\u009c\3\2\2\2"+
		"\34\u00ac\3\2\2\2\36\u00ae\3\2\2\2 \u00b0\3\2\2\2\"\u00b2\3\2\2\2$\u00b4"+
		"\3\2\2\2&\u00b6\3\2\2\2(\u00bc\3\2\2\2*\u00be\3\2\2\2,\u00c0\3\2\2\2."+
		"\u00c2\3\2\2\2\60\u00c4\3\2\2\2\62\u00c6\3\2\2\2\64\u00c8\3\2\2\2\66\u00ca"+
		"\3\2\2\28\u00cc\3\2\2\2:\u00ce\3\2\2\2<\u00d0\3\2\2\2>\u00d2\3\2\2\2@"+
		"\u00d4\3\2\2\2B\u00d6\3\2\2\2D\u00d8\3\2\2\2FG\5\36\20\2GK\5B\"\2HJ\5"+
		"\4\3\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\5"+
		"D#\2O\3\3\2\2\2PU\5\6\4\2QU\5\16\b\2RU\5\20\t\2SU\5\30\r\2TP\3\2\2\2T"+
		"Q\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2\2VW\5\b\5\2WX\5 \21\2XY\5\6\4\2"+
		"Y^\3\2\2\2Z[\5\b\5\2[\\\5 \21\2\\^\3\2\2\2]V\3\2\2\2]Z\3\2\2\2^\7\3\2"+
		"\2\2_`\5\f\7\2`a\5\n\6\2a\t\3\2\2\2bc\5&\24\2cd\5\"\22\2de\5\n\6\2eh\3"+
		"\2\2\2fh\5&\24\2gb\3\2\2\2gf\3\2\2\2h\13\3\2\2\2il\5*\26\2jl\5,\27\2k"+
		"i\3\2\2\2kj\3\2\2\2l\r\3\2\2\2mn\5.\30\2no\5&\24\2op\5 \21\2p\17\3\2\2"+
		"\2qr\5&\24\2rs\5$\23\2st\5\22\n\2tu\5 \21\2u\21\3\2\2\2vw\5\24\13\2wx"+
		"\5\60\31\2xy\5\22\n\2y\u0089\3\2\2\2z{\5\24\13\2{|\5\62\32\2|}\5\22\n"+
		"\2}\u0089\3\2\2\2~\177\5\24\13\2\177\u0080\5\64\33\2\u0080\u0081\5\22"+
		"\n\2\u0081\u0089\3\2\2\2\u0082\u0083\5\24\13\2\u0083\u0084\58\35\2\u0084"+
		"\u0085\5\26\f\2\u0085\u0086\5\22\n\2\u0086\u0089\3\2\2\2\u0087\u0089\5"+
		"\24\13\2\u0088v\3\2\2\2\u0088z\3\2\2\2\u0088~\3\2\2\2\u0088\u0082\3\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\23\3\2\2\2\u008a\u0091\5&\24\2\u008b\u0091"+
		"\5(\25\2\u008c\u008d\5:\36\2\u008d\u008e\5\22\n\2\u008e\u008f\5<\37\2"+
		"\u008f\u0091\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c"+
		"\3\2\2\2\u0091\25\3\2\2\2\u0092\u0096\5\60\31\2\u0093\u0096\5\62\32\2"+
		"\u0094\u0096\5\64\33\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\27\3\2\2\2\u0097\u0098\5&\24\2\u0098\u0099\5$\23\2\u0099"+
		"\u009a\5\32\16\2\u009a\u009b\5 \21\2\u009b\31\3\2\2\2\u009c\u00a0\5> "+
		"\2\u009d\u009f\5\34\17\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\5@!\2\u00a4\33\3\2\2\2\u00a5\u00ad\7\26\2\2\u00a6\u00a7"+
		"\7\26\2\2\u00a7\u00ad\5 \21\2\u00a8\u00a9\7\26\2\2\u00a9\u00aa\5\"\22"+
		"\2\u00aa\u00ab\5\34\17\2\u00ab\u00ad\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac"+
		"\u00a6\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad\35\3\2\2\2\u00ae\u00af\7\3\2"+
		"\2\u00af\37\3\2\2\2\u00b0\u00b1\7\4\2\2\u00b1!\3\2\2\2\u00b2\u00b3\7\5"+
		"\2\2\u00b3#\3\2\2\2\u00b4\u00b5\7\6\2\2\u00b5%\3\2\2\2\u00b6\u00b7\7\25"+
		"\2\2\u00b7\'\3\2\2\2\u00b8\u00bd\7\26\2\2\u00b9\u00ba\5\62\32\2\u00ba"+
		"\u00bb\7\26\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3"+
		"\2\2\2\u00bd)\3\2\2\2\u00be\u00bf\7\7\2\2\u00bf+\3\2\2\2\u00c0\u00c1\7"+
		"\b\2\2\u00c1-\3\2\2\2\u00c2\u00c3\7\t\2\2\u00c3/\3\2\2\2\u00c4\u00c5\7"+
		"\n\2\2\u00c5\61\3\2\2\2\u00c6\u00c7\7\13\2\2\u00c7\63\3\2\2\2\u00c8\u00c9"+
		"\7\f\2\2\u00c9\65\3\2\2\2\u00ca\u00cb\7\r\2\2\u00cb\67\3\2\2\2\u00cc\u00cd"+
		"\7\16\2\2\u00cd9\3\2\2\2\u00ce\u00cf\7\17\2\2\u00cf;\3\2\2\2\u00d0\u00d1"+
		"\7\20\2\2\u00d1=\3\2\2\2\u00d2\u00d3\7\21\2\2\u00d3?\3\2\2\2\u00d4\u00d5"+
		"\7\22\2\2\u00d5A\3\2\2\2\u00d6\u00d7\7\23\2\2\u00d7C\3\2\2\2\u00d8\u00d9"+
		"\7\24\2\2\u00d9E\3\2\2\2\rKT]gk\u0088\u0090\u0095\u00a0\u00ac\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}