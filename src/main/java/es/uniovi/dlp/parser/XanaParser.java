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
		RULE_program = 0, RULE_definitions = 1, RULE_variableDefinition = 2, RULE_functionDefinition = 3, 
		RULE_functionType = 4, RULE_functionParameters = 5, RULE_mainFunction = 6, 
		RULE_functionInvocation = 7, RULE_statement = 8, RULE_conditionalBody = 9, 
		RULE_expression = 10, RULE_type = 11, RULE_recordType = 12, RULE_primitiveType = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "variableDefinition", "functionDefinition", 
			"functionType", "functionParameters", "mainFunction", "functionInvocation", 
			"statement", "conditionalBody", "expression", "type", "recordType", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'::'", "'def'", "'('", "')'", "'do'", "'end'", "'void'", 
			"'main'", "'if'", "'else'", "'while'", "'puts'", "'in'", "'return'", 
			"'='", "'['", "']'", "'.'", "'as'", "'-'", "'!'", "'*'", "'/'", "'%'", 
			"'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'defstruct'", "'int'", "'double'", "'char'"
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
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((ProgramContext)_localctx).d = ((ProgramContext)_localctx).definitions = definitions();
			setState(29);
			((ProgramContext)_localctx).m = mainFunction();
			 ((ProgramContext)_localctx).definitions.ast.add(((ProgramContext)_localctx).m.ast); 
			setState(31);
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
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(40);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(34);
						((DefinitionsContext)_localctx).variableDefinition = variableDefinition();
						 _localctx.ast.addAll(((DefinitionsContext)_localctx).variableDefinition.ast); 
						}
						break;
					case T__2:
						{
						setState(37);
						((DefinitionsContext)_localctx).functionDefinition = functionDefinition();
						 _localctx.ast.add(((DefinitionsContext)_localctx).functionDefinition.ast); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		enterRule(_localctx, 4, RULE_variableDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((VariableDefinitionContext)_localctx).ID = match(ID);
			((VariableDefinitionContext)_localctx).ids.add(((VariableDefinitionContext)_localctx).ID);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(46);
					match(T__0);
					setState(47);
					((VariableDefinitionContext)_localctx).ID = match(ID);
					((VariableDefinitionContext)_localctx).ids.add(((VariableDefinitionContext)_localctx).ID);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(53);
			match(T__1);
			setState(54);
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
		public List<VariableDefinition> varDefs = new ArrayList<VariableDefinition>();
		public List<Statement> statements = new ArrayList<Statement>();
		public Token ID;
		public FunctionParametersContext params;
		public FunctionTypeContext returnType;
		public VariableDefinitionContext var;
		public StatementContext s;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__2);
			setState(58);
			((FunctionDefinitionContext)_localctx).ID = match(ID);
			setState(59);
			match(T__3);
			setState(60);
			((FunctionDefinitionContext)_localctx).params = functionParameters();
			setState(61);
			match(T__4);
			setState(62);
			match(T__1);
			setState(63);
			((FunctionDefinitionContext)_localctx).returnType = functionType();
			setState(64);
			match(T__5);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					((FunctionDefinitionContext)_localctx).var = variableDefinition();
					 _localctx.varDefs.addAll( ((FunctionDefinitionContext)_localctx).var.ast ); 
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(73);
				((FunctionDefinitionContext)_localctx).s = statement();
				 _localctx.statements.addAll( ((FunctionDefinitionContext)_localctx).s.ast); 
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__6);
			 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1,
			                                                                  new FunctionType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((FunctionDefinitionContext)_localctx).params.ast, ((FunctionDefinitionContext)_localctx).returnType.ast),
			                                                    (((FunctionDefinitionContext)_localctx).ID!=null?((FunctionDefinitionContext)_localctx).ID.getText():null), _localctx.varDefs, _localctx.statements );
			                                  
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
		enterRule(_localctx, 8, RULE_functionType);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((FunctionTypeContext)_localctx).t = primitiveType();
				 ((FunctionTypeContext)_localctx).ast =  ((FunctionTypeContext)_localctx).t.ast; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__7);
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<VariableDefinition>();
		public Token ID;
		public TypeContext t;
		public TypeContext t2;
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				 ((FunctionParametersContext)_localctx).ast =  new ArrayList<VariableDefinition>(); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				((FunctionParametersContext)_localctx).ID = match(ID);
				setState(93);
				match(T__1);
				setState(94);
				((FunctionParametersContext)_localctx).t = type();
				 _localctx.ast.add( new VariableDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((FunctionParametersContext)_localctx).t.ast, (((FunctionParametersContext)_localctx).ID!=null?((FunctionParametersContext)_localctx).ID.getText():null)) ); 
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(96);
					match(T__0);
					setState(97);
					((FunctionParametersContext)_localctx).ID = match(ID);
					setState(98);
					match(T__1);
					setState(99);
					((FunctionParametersContext)_localctx).t2 = type();
					 _localctx.ast.add( new VariableDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine()+1, ((FunctionParametersContext)_localctx).t2.ast, (((FunctionParametersContext)_localctx).ID!=null?((FunctionParametersContext)_localctx).ID.getText():null)) ); 
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		public List<VariableDefinition> varDefs = new ArrayList<VariableDefinition>();
		public List<Statement> statements = new ArrayList<Statement>();
		public VariableDefinitionContext var;
		public StatementContext s;
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__2);
			setState(110);
			match(T__8);
			setState(111);
			match(T__3);
			setState(112);
			match(T__4);
			setState(113);
			match(T__5);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					((MainFunctionContext)_localctx).var = variableDefinition();
					 _localctx.varDefs.addAll( ((MainFunctionContext)_localctx).var.ast ); 
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(122);
				((MainFunctionContext)_localctx).s = statement();
				 _localctx.statements.addAll( ((MainFunctionContext)_localctx).s.ast); 
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(T__6);
			 ((MainFunctionContext)_localctx).ast =  new FunctionDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1,
			                                              new FunctionType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), new ArrayList<VariableDefinition>(),
			                                                                new VoidType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine())
			                                              ), "main", _localctx.varDefs, _localctx.statements );
			              
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
		enterRule(_localctx, 14, RULE_functionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((FunctionInvocationContext)_localctx).ID = match(ID);
			setState(134);
			match(T__3);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(135);
				((FunctionInvocationContext)_localctx).e = expression(0);
				_localctx.expressions.add(((FunctionInvocationContext)_localctx).e.ast);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(137);
					match(T__0);
					setState(138);
					((FunctionInvocationContext)_localctx).e2 = expression(0);
					_localctx.expressions.add(((FunctionInvocationContext)_localctx).e.ast);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(148);
			match(T__4);
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
		public List<Statement> elseBody = new ArrayList<Statement>();
		public ExpressionContext condition;
		public ConditionalBodyContext ifStm;
		public ConditionalBodyContext elseStm;
		public ConditionalBodyContext whileStm;
		public ExpressionContext expression;
		public List<ExpressionContext> e = new ArrayList<ExpressionContext>();
		public ExpressionContext left;
		public ExpressionContext right;
		public FunctionInvocationContext functionInvocation;
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__9);
				setState(152);
				((StatementContext)_localctx).condition = expression(0);
				setState(153);
				match(T__5);
				setState(154);
				((StatementContext)_localctx).ifStm = conditionalBody();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(155);
					match(T__10);
					setState(156);
					((StatementContext)_localctx).elseStm = conditionalBody();
					 ((StatementContext)_localctx).elseBody =  ((StatementContext)_localctx).elseStm.ast; 
					}
				}

				setState(161);
				match(T__6);
				 _localctx.ast.add(new If(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).condition.ast, ((StatementContext)_localctx).ifStm.ast, _localctx.elseBody)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(T__11);
				setState(165);
				((StatementContext)_localctx).condition = expression(0);
				setState(166);
				match(T__5);
				setState(167);
				((StatementContext)_localctx).whileStm = conditionalBody();
				setState(168);
				match(T__6);
				 _localctx.ast.add(new While(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).condition.ast, ((StatementContext)_localctx).whileStm.ast)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(T__12);
				setState(172);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).e.add(((StatementContext)_localctx).expression);
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(173);
						match(T__0);
						setState(174);
						((StatementContext)_localctx).expression = expression(0);
						((StatementContext)_localctx).e.add(((StatementContext)_localctx).expression);
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				 for(var exp : ((StatementContext)_localctx).e) { _localctx.ast.add(new Write(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, exp.ast)); } 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(T__13);
				setState(183);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).e.add(((StatementContext)_localctx).expression);
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(184);
						match(T__0);
						setState(185);
						((StatementContext)_localctx).expression = expression(0);
						((StatementContext)_localctx).e.add(((StatementContext)_localctx).expression);
						}
						} 
					}
					setState(190);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				 for(var exp : ((StatementContext)_localctx).e) { _localctx.ast.add(new Read(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, exp.ast)); } 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(T__14);
				setState(194);
				((StatementContext)_localctx).expression = expression(0);
				 _localctx.ast.add(new Return(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).expression.ast)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				((StatementContext)_localctx).left = expression(0);
				setState(198);
				match(T__15);
				setState(199);
				((StatementContext)_localctx).right = expression(0);
				 _localctx.ast.add(new Assignment(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).right.ast)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				((StatementContext)_localctx).functionInvocation = functionInvocation();
				 _localctx.ast.add(((StatementContext)_localctx).functionInvocation.ast); 
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
		enterRule(_localctx, 18, RULE_conditionalBody);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__9:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__20:
			case T__21:
			case ID:
			case REAL_CONSTANT:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((ConditionalBodyContext)_localctx).statement = statement();
				 _localctx.ast.addAll( ((ConditionalBodyContext)_localctx).statement.ast ); 
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
					{
					{
					setState(209);
					((ConditionalBodyContext)_localctx).statement = statement();
					 _localctx.ast.addAll( ((ConditionalBodyContext)_localctx).statement.ast ); 
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__6:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				 ((ConditionalBodyContext)_localctx).ast =  new ArrayList<Statement>(); 
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext arr;
		public ExpressionContext struct;
		public ExpressionContext casted;
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(221);
				match(T__3);
				setState(222);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(223);
				match(T__4);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast; 
				}
				break;
			case 2:
				{
				setState(226);
				match(T__20);
				setState(227);
				((ExpressionContext)_localctx).expression = expression(11);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				{
				setState(230);
				match(T__21);
				setState(231);
				((ExpressionContext)_localctx).expression = expression(10);
				 ((ExpressionContext)_localctx).ast =  new UnaryNegative(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 4:
				{
				setState(234);
				((ExpressionContext)_localctx).functionInvocation = functionInvocation();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).functionInvocation.ast; 
				}
				break;
			case 5:
				{
				setState(237);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(239);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(241);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(243);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(248);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(249);
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
						setState(252);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(253);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__25) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(254);
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
						setState(257);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(258);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
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
						setState(262);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(263);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(264);
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
						setState(267);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(268);
						match(T__16);
						setState(269);
						((ExpressionContext)_localctx).index = ((ExpressionContext)_localctx).expression = expression(0);
						setState(270);
						match(T__17);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).arr.ast, ((ExpressionContext)_localctx).index.ast); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.struct = _prevctx;
						_localctx.struct = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(274);
						match(T__18);
						setState(275);
						((ExpressionContext)_localctx).field = match(ID);
						 ((ExpressionContext)_localctx).ast =  new StructAccess(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).struct.ast, ((ExpressionContext)_localctx).field.getText()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.casted = _prevctx;
						_localctx.casted = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(277);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(278);
						match(T__19);
						setState(279);
						((ExpressionContext)_localctx).toCast = primitiveType();
						 ((ExpressionContext)_localctx).ast =  new Cast(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).toCast.ast, ((ExpressionContext)_localctx).casted.ast); 
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(T__16);
				setState(288);
				((TypeContext)_localctx).i = match(INT_CONSTANT);
				setState(289);
				match(T__1);
				setState(290);
				((TypeContext)_localctx).t = type();
				setState(291);
				match(T__17);
				 ((TypeContext)_localctx).ast =  new ArrayType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((TypeContext)_localctx).t.ast, LexerHelper.lexemeToInt((((TypeContext)_localctx).i!=null?((TypeContext)_localctx).i.getText():null))); 
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(T__34);
				setState(295);
				match(T__5);
				setState(296);
				((TypeContext)_localctx).recordType = recordType();
				setState(297);
				match(T__6);
				 ((TypeContext)_localctx).ast =  (((TypeContext)_localctx).recordType.ast == null) ? new StructType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, new ArrayList<RecordType>())
				                                         : new StructType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((TypeContext)_localctx).recordType.ast); 
				}
				break;
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
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
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(305);
					((RecordTypeContext)_localctx).ID = match(ID);
					((RecordTypeContext)_localctx).ids.add(((RecordTypeContext)_localctx).ID);
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(306);
						match(T__0);
						setState(307);
						((RecordTypeContext)_localctx).ID = match(ID);
						((RecordTypeContext)_localctx).ids.add(((RecordTypeContext)_localctx).ID);
						}
						}
						setState(312);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(313);
					match(T__1);
					setState(314);
					((RecordTypeContext)_localctx).type = type();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(T__35);
				 ((PrimitiveTypeContext)_localctx).ast =  new IntType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(T__36);
				 ((PrimitiveTypeContext)_localctx).ast =  new DoubleType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u014d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\7\4\63\n\4\f\4"+
		"\16\4\66\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\5\7n\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\3\b\3\b\7\b\u0080\n\b\f\b\16\b\u0083"+
		"\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0090\n\t\f\t\16"+
		"\t\u0093\13\t\5\t\u0095\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00a2\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00b2\n\n\f\n\16\n\u00b5\13\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bd"+
		"\n\n\f\n\16\n\u00c0\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00d0\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u00d7\n\13\f\13"+
		"\16\13\u00da\13\13\3\13\5\13\u00dd\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00f8\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u011d\n\f\f\f\16\f\u0120\13\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0132\n\r\3\16\3\16\3\16"+
		"\7\16\u0137\n\16\f\16\16\16\u013a\13\16\3\16\3\16\7\16\u013e\n\16\f\16"+
		"\16\16\u0141\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u014b"+
		"\n\17\3\17\6\64\u00b3\u00be\u013f\3\26\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\6\3\2\31\33\4\2\27\27\34\34\3\2\35\"\3\2#$\2\u0169\2\36\3\2\2"+
		"\2\4,\3\2\2\2\6/\3\2\2\2\b;\3\2\2\2\n[\3\2\2\2\fm\3\2\2\2\16o\3\2\2\2"+
		"\20\u0087\3\2\2\2\22\u00cf\3\2\2\2\24\u00dc\3\2\2\2\26\u00f7\3\2\2\2\30"+
		"\u0131\3\2\2\2\32\u013f\3\2\2\2\34\u014a\3\2\2\2\36\37\5\4\3\2\37 \5\16"+
		"\b\2 !\b\2\1\2!\"\7\2\2\3\"#\b\2\1\2#\3\3\2\2\2$%\5\6\4\2%&\b\3\1\2&+"+
		"\3\2\2\2\'(\5\b\5\2()\b\3\1\2)+\3\2\2\2*$\3\2\2\2*\'\3\2\2\2+.\3\2\2\2"+
		",*\3\2\2\2,-\3\2\2\2-\5\3\2\2\2.,\3\2\2\2/\64\7)\2\2\60\61\7\3\2\2\61"+
		"\63\7)\2\2\62\60\3\2\2\2\63\66\3\2\2\2\64\65\3\2\2\2\64\62\3\2\2\2\65"+
		"\67\3\2\2\2\66\64\3\2\2\2\678\7\4\2\289\5\30\r\29:\b\4\1\2:\7\3\2\2\2"+
		";<\7\5\2\2<=\7)\2\2=>\7\6\2\2>?\5\f\7\2?@\7\7\2\2@A\7\4\2\2AB\5\n\6\2"+
		"BH\7\b\2\2CD\5\6\4\2DE\b\5\1\2EG\3\2\2\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2"+
		"HI\3\2\2\2IP\3\2\2\2JH\3\2\2\2KL\5\22\n\2LM\b\5\1\2MO\3\2\2\2NK\3\2\2"+
		"\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\t\2\2TU\b\5\1"+
		"\2U\t\3\2\2\2VW\5\34\17\2WX\b\6\1\2X\\\3\2\2\2YZ\7\n\2\2Z\\\b\6\1\2[V"+
		"\3\2\2\2[Y\3\2\2\2\\\13\3\2\2\2]n\b\7\1\2^_\7)\2\2_`\7\4\2\2`a\5\30\r"+
		"\2aj\b\7\1\2bc\7\3\2\2cd\7)\2\2de\7\4\2\2ef\5\30\r\2fg\b\7\1\2gi\3\2\2"+
		"\2hb\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2m]\3\2\2"+
		"\2m^\3\2\2\2n\r\3\2\2\2op\7\5\2\2pq\7\13\2\2qr\7\6\2\2rs\7\7\2\2sy\7\b"+
		"\2\2tu\5\6\4\2uv\b\b\1\2vx\3\2\2\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2"+
		"\2\2z\u0081\3\2\2\2{y\3\2\2\2|}\5\22\n\2}~\b\b\1\2~\u0080\3\2\2\2\177"+
		"|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\t\2\2\u0085\u0086\b\b"+
		"\1\2\u0086\17\3\2\2\2\u0087\u0088\7)\2\2\u0088\u0094\7\6\2\2\u0089\u008a"+
		"\5\26\f\2\u008a\u0091\b\t\1\2\u008b\u008c\7\3\2\2\u008c\u008d\5\26\f\2"+
		"\u008d\u008e\b\t\1\2\u008e\u0090\3\2\2\2\u008f\u008b\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0089\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7\7\2\2\u0097\u0098\b\t\1\2\u0098\21\3\2\2\2\u0099\u009a"+
		"\7\f\2\2\u009a\u009b\5\26\f\2\u009b\u009c\7\b\2\2\u009c\u00a1\5\24\13"+
		"\2\u009d\u009e\7\r\2\2\u009e\u009f\5\24\13\2\u009f\u00a0\b\n\1\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\b\n\1\2\u00a5\u00d0\3\2\2\2\u00a6"+
		"\u00a7\7\16\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\5"+
		"\24\13\2\u00aa\u00ab\7\t\2\2\u00ab\u00ac\b\n\1\2\u00ac\u00d0\3\2\2\2\u00ad"+
		"\u00ae\7\17\2\2\u00ae\u00b3\5\26\f\2\u00af\u00b0\7\3\2\2\u00b0\u00b2\5"+
		"\26\f\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\n"+
		"\1\2\u00b7\u00d0\3\2\2\2\u00b8\u00b9\7\20\2\2\u00b9\u00be\5\26\f\2\u00ba"+
		"\u00bb\7\3\2\2\u00bb\u00bd\5\26\f\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\b\n\1\2\u00c2\u00d0\3\2\2\2\u00c3\u00c4\7\21"+
		"\2\2\u00c4\u00c5\5\26\f\2\u00c5\u00c6\b\n\1\2\u00c6\u00d0\3\2\2\2\u00c7"+
		"\u00c8\5\26\f\2\u00c8\u00c9\7\22\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb"+
		"\b\n\1\2\u00cb\u00d0\3\2\2\2\u00cc\u00cd\5\20\t\2\u00cd\u00ce\b\n\1\2"+
		"\u00ce\u00d0\3\2\2\2\u00cf\u0099\3\2\2\2\u00cf\u00a6\3\2\2\2\u00cf\u00ad"+
		"\3\2\2\2\u00cf\u00b8\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf"+
		"\u00cc\3\2\2\2\u00d0\23\3\2\2\2\u00d1\u00d2\5\22\n\2\u00d2\u00d8\b\13"+
		"\1\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\b\13\1\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d3\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00dd\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\b\13\1\2\u00dc"+
		"\u00d1\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\25\3\2\2\2\u00de\u00df\b\f\1"+
		"\2\u00df\u00e0\7\6\2\2\u00e0\u00e1\5\26\f\2\u00e1\u00e2\7\7\2\2\u00e2"+
		"\u00e3\b\f\1\2\u00e3\u00f8\3\2\2\2\u00e4\u00e5\7\27\2\2\u00e5\u00e6\5"+
		"\26\f\r\u00e6\u00e7\b\f\1\2\u00e7\u00f8\3\2\2\2\u00e8\u00e9\7\30\2\2\u00e9"+
		"\u00ea\5\26\f\f\u00ea\u00eb\b\f\1\2\u00eb\u00f8\3\2\2\2\u00ec\u00ed\5"+
		"\20\t\2\u00ed\u00ee\b\f\1\2\u00ee\u00f8\3\2\2\2\u00ef\u00f0\7-\2\2\u00f0"+
		"\u00f8\b\f\1\2\u00f1\u00f2\7,\2\2\u00f2\u00f8\b\f\1\2\u00f3\u00f4\7.\2"+
		"\2\u00f4\u00f8\b\f\1\2\u00f5\u00f6\7)\2\2\u00f6\u00f8\b\f\1\2\u00f7\u00de"+
		"\3\2\2\2\u00f7\u00e4\3\2\2\2\u00f7\u00e8\3\2\2\2\u00f7\u00ec\3\2\2\2\u00f7"+
		"\u00ef\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u011e\3\2\2\2\u00f9\u00fa\f\13\2\2\u00fa\u00fb\t\2\2\2\u00fb"+
		"\u00fc\5\26\f\f\u00fc\u00fd\b\f\1\2\u00fd\u011d\3\2\2\2\u00fe\u00ff\f"+
		"\n\2\2\u00ff\u0100\t\3\2\2\u0100\u0101\5\26\f\13\u0101\u0102\b\f\1\2\u0102"+
		"\u011d\3\2\2\2\u0103\u0104\f\t\2\2\u0104\u0105\t\4\2\2\u0105\u0106\5\26"+
		"\f\n\u0106\u0107\b\f\1\2\u0107\u011d\3\2\2\2\u0108\u0109\f\b\2\2\u0109"+
		"\u010a\t\5\2\2\u010a\u010b\5\26\f\t\u010b\u010c\b\f\1\2\u010c\u011d\3"+
		"\2\2\2\u010d\u010e\f\20\2\2\u010e\u010f\7\23\2\2\u010f\u0110\5\26\f\2"+
		"\u0110\u0111\7\24\2\2\u0111\u0112\b\f\1\2\u0112\u011d\3\2\2\2\u0113\u0114"+
		"\f\17\2\2\u0114\u0115\7\25\2\2\u0115\u0116\7)\2\2\u0116\u011d\b\f\1\2"+
		"\u0117\u0118\f\16\2\2\u0118\u0119\7\26\2\2\u0119\u011a\5\34\17\2\u011a"+
		"\u011b\b\f\1\2\u011b\u011d\3\2\2\2\u011c\u00f9\3\2\2\2\u011c\u00fe\3\2"+
		"\2\2\u011c\u0103\3\2\2\2\u011c\u0108\3\2\2\2\u011c\u010d\3\2\2\2\u011c"+
		"\u0113\3\2\2\2\u011c\u0117\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\27\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122"+
		"\7\23\2\2\u0122\u0123\7-\2\2\u0123\u0124\7\4\2\2\u0124\u0125\5\30\r\2"+
		"\u0125\u0126\7\24\2\2\u0126\u0127\b\r\1\2\u0127\u0132\3\2\2\2\u0128\u0129"+
		"\7%\2\2\u0129\u012a\7\b\2\2\u012a\u012b\5\32\16\2\u012b\u012c\7\t\2\2"+
		"\u012c\u012d\b\r\1\2\u012d\u0132\3\2\2\2\u012e\u012f\5\34\17\2\u012f\u0130"+
		"\b\r\1\2\u0130\u0132\3\2\2\2\u0131\u0121\3\2\2\2\u0131\u0128\3\2\2\2\u0131"+
		"\u012e\3\2\2\2\u0132\31\3\2\2\2\u0133\u0138\7)\2\2\u0134\u0135\7\3\2\2"+
		"\u0135\u0137\7)\2\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7\4\2\2\u013c\u013e\5\30\r\2\u013d\u0133\3\2\2\2\u013e\u0141\3"+
		"\2\2\2\u013f\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0143\b\16\1\2\u0143\33\3\2\2\2\u0144\u0145\7&\2"+
		"\2\u0145\u014b\b\17\1\2\u0146\u0147\7\'\2\2\u0147\u014b\b\17\1\2\u0148"+
		"\u0149\7(\2\2\u0149\u014b\b\17\1\2\u014a\u0144\3\2\2\2\u014a\u0146\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\35\3\2\2\2\33*,\64HP[jmy\u0081\u0091\u0094"+
		"\u00a1\u00b3\u00be\u00cf\u00d8\u00dc\u00f7\u011c\u011e\u0131\u0138\u013f"+
		"\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}