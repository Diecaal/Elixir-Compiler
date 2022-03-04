// Generated from Xana.g4 by ANTLR 4.9.3

    package es.uniovi.dlp.parser;

    import es.uniovi.dlp.ast.statements.sub.*;
    import es.uniovi.dlp.ast.statements.*;
    import es.uniovi.dlp.ast.definitions.sub.*;
    import es.uniovi.dlp.ast.definitions.*;
    import es.uniovi.dlp.ast.expressions.sub.*;
    import es.uniovi.dlp.ast.expressions.*;
    import es.uniovi.dlp.ast.types.sub.*;
    import es.uniovi.dlp.ast.types.*;
    import es.uniovi.dlp.ast.Program;
    import es.uniovi.dlp.parser.LexerHelper;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		ID=39, COMMENT=40, WS=41, REAL_CONSTANT=42, INT_CONSTANT=43, CHAR_CONSTANT=44, 
		EOL=45;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_mainFunction = 2, RULE_variableDefinition = 3, 
		RULE_functionDefinition = 4, RULE_functionParameters = 5, RULE_functionInvocation = 6, 
		RULE_statement = 7, RULE_conditionalBody = 8, RULE_expression = 9, RULE_functionType = 10, 
		RULE_type = 11, RULE_recordType = 12, RULE_primitiveType = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "mainFunction", "variableDefinition", "functionDefinition", 
			"functionParameters", "functionInvocation", "statement", "conditionalBody", 
			"expression", "functionType", "type", "recordType", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "'do'", "'end'", "','", "'::'", 
			"'if'", "'else'", "'while'", "'puts'", "'in'", "'return'", "'='", "'['", 
			"']'", "'.'", "'as'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", 
			"'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", "'void'", "'defstruct'", 
			"'int'", "'double'", "'char'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "COMMENT", "WS", "REAL_CONSTANT", "INT_CONSTANT", 
			"CHAR_CONSTANT", "EOL"
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
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public DefinitionsContext d;
		public DefinitionsContext definitions;
		public MainFunctionContext m;
		public TerminalNode EOF() { return getToken(XanaParser.EOF, 0); }
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public List<DefinitionsContext> definitions() {
			return getRuleContexts(DefinitionsContext.class);
		}
		public DefinitionsContext definitions(int i) {
			return getRuleContext(DefinitionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					((ProgramContext)_localctx).d = ((ProgramContext)_localctx).definitions = definitions();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(34);
			((ProgramContext)_localctx).m = mainFunction();
			 ((ProgramContext)_localctx).definitions.ast.add(((ProgramContext)_localctx).m.ast); 
			setState(36);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program(0,0,((ProgramContext)_localctx).d.ast); 
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

	public static class DefinitionsContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public VariableDefinitionContext variableDefinition;
		public FunctionDefinitionContext functionDefinition;
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((DefinitionsContext)_localctx).variableDefinition = variableDefinition();
				 _localctx.ast.addAll(((DefinitionsContext)_localctx).variableDefinition.ast); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				((DefinitionsContext)_localctx).functionDefinition = functionDefinition();
				 _localctx.ast.add(((DefinitionsContext)_localctx).functionDefinition.ast); 
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

	public static class MainFunctionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public VariableDefinitionContext varDefs;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			match(T__1);
			setState(49);
			match(T__2);
			setState(50);
			match(T__3);
			setState(51);
			match(T__4);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					((MainFunctionContext)_localctx).varDefs = variableDefinition();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(58);
				((MainFunctionContext)_localctx).statement = statement();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(T__5);
			 ((MainFunctionContext)_localctx).ast =  new FunctionDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, new FunctionType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), new ArrayList<VariableDefinition>(), new VoidType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine())), "main", ((MainFunctionContext)_localctx).varDefs.ast, ((MainFunctionContext)_localctx).statement.ast ); 
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

	public static class VariableDefinitionContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<>();
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((VariableDefinitionContext)_localctx).ID = match(ID);
			((VariableDefinitionContext)_localctx).ids.add(((VariableDefinitionContext)_localctx).ID);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(68);
					match(T__6);
					setState(69);
					((VariableDefinitionContext)_localctx).ID = match(ID);
					((VariableDefinitionContext)_localctx).ids.add(((VariableDefinitionContext)_localctx).ID);
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(75);
			match(T__7);
			setState(76);
			((VariableDefinitionContext)_localctx).type = type();
			 for(var variable : ((VariableDefinitionContext)_localctx).ids) { _localctx.ast.add( new VariableDefinition(variable.getLine(), variable.getCharPositionInLine() + 1, ((VariableDefinitionContext)_localctx).type.ast, variable.getText())); } 
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token ID;
		public FunctionParametersContext params;
		public FunctionTypeContext returnType;
		public VariableDefinitionContext varDefs;
		public StatementContext statement;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			setState(80);
			((FunctionDefinitionContext)_localctx).ID = match(ID);
			setState(81);
			match(T__2);
			setState(82);
			((FunctionDefinitionContext)_localctx).params = functionParameters();
			setState(83);
			match(T__3);
			setState(84);
			match(T__7);
			setState(85);
			((FunctionDefinitionContext)_localctx).returnType = functionType();
			setState(86);
			match(T__4);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					((FunctionDefinitionContext)_localctx).varDefs = variableDefinition();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(93);
				((FunctionDefinitionContext)_localctx).statement = statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__5);
			 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, new FunctionType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((FunctionDefinitionContext)_localctx).params.ast, ((FunctionDefinitionContext)_localctx).returnType.ast), (((FunctionDefinitionContext)_localctx).ID!=null?((FunctionDefinitionContext)_localctx).ID.getText():null), ((FunctionDefinitionContext)_localctx).varDefs.ast, ((FunctionDefinitionContext)_localctx).statement.ast); 
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<VariableDefinition>();
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(102);
				match(ID);
				setState(103);
				match(T__7);
				setState(104);
				type();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(105);
					match(T__6);
					setState(106);
					match(ID);
					setState(107);
					match(T__7);
					setState(108);
					type();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class FunctionInvocationContext extends ParserRuleContext {
		public FunctionInvocation ast;
		public List<Expression> expressions = new ArrayList<Expression>();
		public Token ID;
		public ExpressionContext e;
		public ExpressionContext e2;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((FunctionInvocationContext)_localctx).ID = match(ID);
			setState(117);
			match(T__2);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(118);
				((FunctionInvocationContext)_localctx).e = expression(0);
				_localctx.expressions.add(((FunctionInvocationContext)_localctx).e.ast);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(120);
					match(T__6);
					setState(121);
					((FunctionInvocationContext)_localctx).e2 = expression(0);
					_localctx.expressions.add(((FunctionInvocationContext)_localctx).e.ast);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(131);
			match(T__3);
			 ((FunctionInvocationContext)_localctx).ast =  new FunctionInvocation(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, new Variable(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, (((FunctionInvocationContext)_localctx).ID!=null?((FunctionInvocationContext)_localctx).ID.getText():null)), _localctx.expressions); 
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

	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ConditionalBodyContext> conditionalBody() {
			return getRuleContexts(ConditionalBodyContext.class);
		}
		public ConditionalBodyContext conditionalBody(int i) {
			return getRuleContext(ConditionalBodyContext.class,i);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__8);
				setState(135);
				expression(0);
				setState(136);
				match(T__4);
				setState(137);
				conditionalBody();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(138);
					match(T__9);
					setState(139);
					conditionalBody();
					}
				}

				setState(142);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__10);
				setState(145);
				expression(0);
				setState(146);
				match(T__4);
				setState(147);
				conditionalBody();
				setState(148);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(T__11);
				setState(151);
				expression(0);
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(152);
						match(T__6);
						setState(153);
						expression(0);
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(T__12);
				setState(160);
				expression(0);
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(161);
						match(T__6);
						setState(162);
						expression(0);
						}
						} 
					}
					setState(167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(T__13);
				setState(169);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				((StatementContext)_localctx).left = expression(0);
				setState(171);
				match(T__14);
				setState(172);
				((StatementContext)_localctx).right = expression(0);
				 _localctx.ast.add(new Assignment(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).right.ast)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				functionInvocation();
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

	public static class ConditionalBodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionalBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBody; }
	}

	public final ConditionalBodyContext conditionalBody() throws RecognitionException {
		ConditionalBodyContext _localctx = new ConditionalBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(178);
				((ConditionalBodyContext)_localctx).statement = statement();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.ast.addAll( ((ConditionalBodyContext)_localctx).statement.ast ); 
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
		public Expression ast;
		public ExpressionContext arr;
		public ExpressionContext struct;
		public ExpressionContext left;
		public ExpressionContext expression;
		public FunctionInvocationContext functionInvocation;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public Token op;
		public ExpressionContext right;
		public ExpressionContext index;
		public Token field;
		public PrimitiveTypeContext toCast;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(XanaParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(XanaParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(187);
				match(T__2);
				setState(188);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(189);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast; 
				}
				break;
			case 2:
				{
				setState(192);
				match(T__19);
				setState(193);
				((ExpressionContext)_localctx).expression = expression(11);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				{
				setState(196);
				match(T__20);
				setState(197);
				((ExpressionContext)_localctx).expression = expression(10);
				 ((ExpressionContext)_localctx).ast =  new UnaryNegative(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 4:
				{
				setState(200);
				((ExpressionContext)_localctx).functionInvocation = functionInvocation();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).functionInvocation.ast; 
				}
				break;
			case 5:
				{
				setState(203);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(205);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(207);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(209);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(214);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(10);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(219);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(224);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(225);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Relational(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(229);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Logical(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.arr = _prevctx;
						_localctx.arr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(234);
						match(T__15);
						setState(235);
						((ExpressionContext)_localctx).index = ((ExpressionContext)_localctx).expression = expression(0);
						setState(236);
						match(T__16);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).arr.ast, ((ExpressionContext)_localctx).index.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.struct = _prevctx;
						_localctx.struct = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(240);
						match(T__17);
						setState(241);
						((ExpressionContext)_localctx).field = match(ID);
						 ((ExpressionContext)_localctx).ast =  new StructAccess(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).struct.ast, ((ExpressionContext)_localctx).field.getText()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(244);
						match(T__18);
						setState(245);
						((ExpressionContext)_localctx).toCast = primitiveType();
						 ((ExpressionContext)_localctx).ast =  new Cast(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).toCast.ast, ((ExpressionContext)_localctx).expression.ast); 
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public Type ast;
		public PrimitiveTypeContext t;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionType);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				((FunctionTypeContext)_localctx).t = primitiveType();
				 ((FunctionTypeContext)_localctx).ast =  ((FunctionTypeContext)_localctx).t.ast; 
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__33);
				 ((FunctionTypeContext)_localctx).ast =  new VoidType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
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

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Token i;
		public TypeContext t;
		public RecordTypeContext recordType;
		public PrimitiveTypeContext primitiveType;
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__15);
				setState(261);
				((TypeContext)_localctx).i = match(INT_CONSTANT);
				setState(262);
				match(T__7);
				setState(263);
				((TypeContext)_localctx).t = type();
				setState(264);
				match(T__16);
				 ((TypeContext)_localctx).ast =  new ArrayType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((TypeContext)_localctx).t.ast, LexerHelper.lexemeToInt((((TypeContext)_localctx).i!=null?((TypeContext)_localctx).i.getText():null))); 
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__34);
				setState(268);
				match(T__4);
				setState(269);
				((TypeContext)_localctx).recordType = recordType();
				setState(270);
				match(T__5);
				 ((TypeContext)_localctx).ast =  (((TypeContext)_localctx).recordType.ast == null) ? new StructType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, new ArrayList<RecordType>())
				                                         : new StructType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((TypeContext)_localctx).recordType.ast); 
				}
				break;
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				((TypeContext)_localctx).primitiveType = primitiveType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).primitiveType.ast; 
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

	public static class RecordTypeContext extends ParserRuleContext {
		public List<RecordType> ast = new ArrayList<>();
		public Token ID;
		public List<Token> ids = new ArrayList<Token>();
		public TypeContext type;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recordType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(278);
					((RecordTypeContext)_localctx).ID = match(ID);
					((RecordTypeContext)_localctx).ids.add(((RecordTypeContext)_localctx).ID);
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(279);
						match(T__6);
						setState(280);
						((RecordTypeContext)_localctx).ID = match(ID);
						((RecordTypeContext)_localctx).ids.add(((RecordTypeContext)_localctx).ID);
						}
						}
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(286);
					match(T__7);
					setState(287);
					((RecordTypeContext)_localctx).type = type();
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			 for(var id : ((RecordTypeContext)_localctx).ids) { _localctx.ast.add(new RecordType(id.getLine(), id.getCharPositionInLine() + 1, ((RecordTypeContext)_localctx).type.ast, id.getText())); } 
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type ast;
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitiveType);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__35);
				 ((PrimitiveTypeContext)_localctx).ast =  new IntType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__36);
				 ((PrimitiveTypeContext)_localctx).ast =  new DoubleType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(T__37);
				 ((PrimitiveTypeContext)_localctx).ast =  new CharType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0132\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\7\6a\n\6\f\6\16\6d\13"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13\7\5\7"+
		"u\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082\13\b"+
		"\5\b\u0084\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009d\n\t\f\t\16\t\u00a0"+
		"\13\t\3\t\3\t\3\t\3\t\7\t\u00a6\n\t\f\t\16\t\u00a9\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\n\7\n\u00b6\n\n\f\n\16\n\u00b9\13\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d6"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00fb\n\13\f\13\16\13\u00fe"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\5\f\u0105\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0117\n\r\3\16\3\16\3\16\7\16\u011c"+
		"\n\16\f\16\16\16\u011f\13\16\3\16\3\16\7\16\u0123\n\16\f\16\16\16\u0126"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0130\n\17\3\17\6"+
		"J\u009e\u00a7\u0124\3\24\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\6\3"+
		"\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\2\u014d\2!\3\2\2\2\4/\3\2\2\2"+
		"\6\61\3\2\2\2\bE\3\2\2\2\nQ\3\2\2\2\ft\3\2\2\2\16v\3\2\2\2\20\u00b2\3"+
		"\2\2\2\22\u00b7\3\2\2\2\24\u00d5\3\2\2\2\26\u0104\3\2\2\2\30\u0116\3\2"+
		"\2\2\32\u0124\3\2\2\2\34\u012f\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2"+
		"\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\5\6\4\2%&\b\2\1\2&"+
		"\'\7\2\2\3\'(\b\2\1\2(\3\3\2\2\2)*\5\b\5\2*+\b\3\1\2+\60\3\2\2\2,-\5\n"+
		"\6\2-.\b\3\1\2.\60\3\2\2\2/)\3\2\2\2/,\3\2\2\2\60\5\3\2\2\2\61\62\7\3"+
		"\2\2\62\63\7\4\2\2\63\64\7\5\2\2\64\65\7\6\2\2\659\7\7\2\2\668\5\b\5\2"+
		"\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:?\3\2\2\2;9\3\2\2\2<>\5"+
		"\20\t\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC"+
		"\7\b\2\2CD\b\4\1\2D\7\3\2\2\2EJ\7)\2\2FG\7\t\2\2GI\7)\2\2HF\3\2\2\2IL"+
		"\3\2\2\2JK\3\2\2\2JH\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\n\2\2NO\5\30\r\2"+
		"OP\b\5\1\2P\t\3\2\2\2QR\7\3\2\2RS\7)\2\2ST\7\5\2\2TU\5\f\7\2UV\7\6\2\2"+
		"VW\7\n\2\2WX\5\26\f\2X\\\7\7\2\2Y[\5\b\5\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]b\3\2\2\2^\\\3\2\2\2_a\5\20\t\2`_\3\2\2\2ad\3\2\2\2b`"+
		"\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\b\2\2fg\b\6\1\2g\13\3\2\2\2"+
		"hi\7)\2\2ij\7\n\2\2jq\5\30\r\2kl\7\t\2\2lm\7)\2\2mn\7\n\2\2np\5\30\r\2"+
		"ok\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2th\3\2\2\2"+
		"tu\3\2\2\2u\r\3\2\2\2vw\7)\2\2w\u0083\7\5\2\2xy\5\24\13\2y\u0080\b\b\1"+
		"\2z{\7\t\2\2{|\5\24\13\2|}\b\b\1\2}\177\3\2\2\2~z\3\2\2\2\177\u0082\3"+
		"\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083x\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\7\6\2\2\u0086\u0087\b\b\1\2\u0087\17\3\2\2\2\u0088\u0089\7\13\2"+
		"\2\u0089\u008a\5\24\13\2\u008a\u008b\7\7\2\2\u008b\u008e\5\22\n\2\u008c"+
		"\u008d\7\f\2\2\u008d\u008f\5\22\n\2\u008e\u008c\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\b\2\2\u0091\u00b3\3\2\2\2\u0092"+
		"\u0093\7\r\2\2\u0093\u0094\5\24\13\2\u0094\u0095\7\7\2\2\u0095\u0096\5"+
		"\22\n\2\u0096\u0097\7\b\2\2\u0097\u00b3\3\2\2\2\u0098\u0099\7\16\2\2\u0099"+
		"\u009e\5\24\13\2\u009a\u009b\7\t\2\2\u009b\u009d\5\24\13\2\u009c\u009a"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00b3\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a7\5"+
		"\24\13\2\u00a3\u00a4\7\t\2\2\u00a4\u00a6\5\24\13\2\u00a5\u00a3\3\2\2\2"+
		"\u00a6\u00a9\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00b3"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00b3\5\24\13"+
		"\2\u00ac\u00ad\5\24\13\2\u00ad\u00ae\7\21\2\2\u00ae\u00af\5\24\13\2\u00af"+
		"\u00b0\b\t\1\2\u00b0\u00b3\3\2\2\2\u00b1\u00b3\5\16\b\2\u00b2\u0088\3"+
		"\2\2\2\u00b2\u0092\3\2\2\2\u00b2\u0098\3\2\2\2\u00b2\u00a1\3\2\2\2\u00b2"+
		"\u00aa\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\21\3\2\2"+
		"\2\u00b4\u00b6\5\20\t\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bb\b\n\1\2\u00bb\23\3\2\2\2\u00bc\u00bd\b\13\1\2\u00bd\u00be"+
		"\7\5\2\2\u00be\u00bf\5\24\13\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\b\13\1"+
		"\2\u00c1\u00d6\3\2\2\2\u00c2\u00c3\7\26\2\2\u00c3\u00c4\5\24\13\r\u00c4"+
		"\u00c5\b\13\1\2\u00c5\u00d6\3\2\2\2\u00c6\u00c7\7\27\2\2\u00c7\u00c8\5"+
		"\24\13\f\u00c8\u00c9\b\13\1\2\u00c9\u00d6\3\2\2\2\u00ca\u00cb\5\16\b\2"+
		"\u00cb\u00cc\b\13\1\2\u00cc\u00d6\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce\u00d6"+
		"\b\13\1\2\u00cf\u00d0\7,\2\2\u00d0\u00d6\b\13\1\2\u00d1\u00d2\7.\2\2\u00d2"+
		"\u00d6\b\13\1\2\u00d3\u00d4\7)\2\2\u00d4\u00d6\b\13\1\2\u00d5\u00bc\3"+
		"\2\2\2\u00d5\u00c2\3\2\2\2\u00d5\u00c6\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5"+
		"\u00cd\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00fc\3\2\2\2\u00d7\u00d8\f\13\2\2\u00d8\u00d9\t\2\2\2\u00d9"+
		"\u00da\5\24\13\f\u00da\u00db\b\13\1\2\u00db\u00fb\3\2\2\2\u00dc\u00dd"+
		"\f\n\2\2\u00dd\u00de\t\3\2\2\u00de\u00df\5\24\13\13\u00df\u00e0\b\13\1"+
		"\2\u00e0\u00fb\3\2\2\2\u00e1\u00e2\f\t\2\2\u00e2\u00e3\t\4\2\2\u00e3\u00e4"+
		"\5\24\13\n\u00e4\u00e5\b\13\1\2\u00e5\u00fb\3\2\2\2\u00e6\u00e7\f\b\2"+
		"\2\u00e7\u00e8\t\5\2\2\u00e8\u00e9\5\24\13\t\u00e9\u00ea\b\13\1\2\u00ea"+
		"\u00fb\3\2\2\2\u00eb\u00ec\f\20\2\2\u00ec\u00ed\7\22\2\2\u00ed\u00ee\5"+
		"\24\13\2\u00ee\u00ef\7\23\2\2\u00ef\u00f0\b\13\1\2\u00f0\u00fb\3\2\2\2"+
		"\u00f1\u00f2\f\17\2\2\u00f2\u00f3\7\24\2\2\u00f3\u00f4\7)\2\2\u00f4\u00fb"+
		"\b\13\1\2\u00f5\u00f6\f\16\2\2\u00f6\u00f7\7\25\2\2\u00f7\u00f8\5\34\17"+
		"\2\u00f8\u00f9\b\13\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00d7\3\2\2\2\u00fa"+
		"\u00dc\3\2\2\2\u00fa\u00e1\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa\u00eb\3\2"+
		"\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\25\3\2\2\2\u00fe\u00fc\3\2\2"+
		"\2\u00ff\u0100\5\34\17\2\u0100\u0101\b\f\1\2\u0101\u0105\3\2\2\2\u0102"+
		"\u0103\7$\2\2\u0103\u0105\b\f\1\2\u0104\u00ff\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\27\3\2\2\2\u0106\u0107\7\22\2\2\u0107\u0108\7-\2\2\u0108\u0109"+
		"\7\n\2\2\u0109\u010a\5\30\r\2\u010a\u010b\7\23\2\2\u010b\u010c\b\r\1\2"+
		"\u010c\u0117\3\2\2\2\u010d\u010e\7%\2\2\u010e\u010f\7\7\2\2\u010f\u0110"+
		"\5\32\16\2\u0110\u0111\7\b\2\2\u0111\u0112\b\r\1\2\u0112\u0117\3\2\2\2"+
		"\u0113\u0114\5\34\17\2\u0114\u0115\b\r\1\2\u0115\u0117\3\2\2\2\u0116\u0106"+
		"\3\2\2\2\u0116\u010d\3\2\2\2\u0116\u0113\3\2\2\2\u0117\31\3\2\2\2\u0118"+
		"\u011d\7)\2\2\u0119\u011a\7\t\2\2\u011a\u011c\7)\2\2\u011b\u0119\3\2\2"+
		"\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\n\2\2\u0121\u0123\5\30\r\2"+
		"\u0122\u0118\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0125\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\b\16\1\2"+
		"\u0128\33\3\2\2\2\u0129\u012a\7&\2\2\u012a\u0130\b\17\1\2\u012b\u012c"+
		"\7\'\2\2\u012c\u0130\b\17\1\2\u012d\u012e\7(\2\2\u012e\u0130\b\17\1\2"+
		"\u012f\u0129\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012d\3\2\2\2\u0130\35"+
		"\3\2\2\2\32!/9?J\\bqt\u0080\u0083\u008e\u009e\u00a7\u00b2\u00b7\u00d5"+
		"\u00fa\u00fc\u0104\u0116\u011d\u0124\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}