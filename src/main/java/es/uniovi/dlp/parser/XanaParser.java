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
		T__38=39, COMMENT=40, WS=41, REAL_CONSTANT=42, INT_CONSTANT=43, BOOL_CONSTANT=44, 
		CHAR_CONSTANT=45, EOL=46, ID=47;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_variableDefinition = 2, RULE_functionDefinition = 3, 
		RULE_functionBlock = 4, RULE_functionType = 5, RULE_functionParameters = 6, 
		RULE_mainFunction = 7, RULE_functionInvocation = 8, RULE_statement = 9, 
		RULE_conditionalBody = 10, RULE_expression = 11, RULE_type = 12, RULE_recordType = 13, 
		RULE_primitiveType = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "variableDefinition", "functionDefinition", 
			"functionBlock", "functionType", "functionParameters", "mainFunction", 
			"functionInvocation", "statement", "conditionalBody", "expression", "type", 
			"recordType", "primitiveType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'::'", "'def'", "'('", "')'", "'do'", "'end'", "'void'", 
			"'main'", "'if'", "'else'", "'while'", "'puts'", "'in'", "'return'", 
			"'='", "'['", "']'", "'.'", "'as'", "'-'", "'!'", "'*'", "'/'", "'%'", 
			"'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'defstruct'", "'int'", "'double'", "'char'", "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "COMMENT", "WS", "REAL_CONSTANT", "INT_CONSTANT", 
			"BOOL_CONSTANT", "CHAR_CONSTANT", "EOL", "ID"
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
			setState(30);
			((ProgramContext)_localctx).d = ((ProgramContext)_localctx).definitions = definitions();
			setState(31);
			((ProgramContext)_localctx).m = mainFunction();
			 ((ProgramContext)_localctx).definitions.ast.add(((ProgramContext)_localctx).m.ast); 
			setState(33);
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
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(42);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(36);
						((DefinitionsContext)_localctx).variableDefinition = variableDefinition();
						 _localctx.ast.addAll(((DefinitionsContext)_localctx).variableDefinition.ast); 
						}
						break;
					case T__2:
						{
						setState(39);
						((DefinitionsContext)_localctx).functionDefinition = functionDefinition();
						 _localctx.ast.add(((DefinitionsContext)_localctx).functionDefinition.ast); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(46);
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
			setState(47);
			((VariableDefinitionContext)_localctx).ID = match(ID);
			((VariableDefinitionContext)_localctx).ids.add(((VariableDefinitionContext)_localctx).ID);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(48);
					match(T__0);
					setState(49);
					((VariableDefinitionContext)_localctx).ID = match(ID);
					((VariableDefinitionContext)_localctx).ids.add(((VariableDefinitionContext)_localctx).ID);
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(55);
			match(T__1);
			setState(56);
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
		public FunctionBlockContext block;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__2);
			setState(60);
			((FunctionDefinitionContext)_localctx).ID = match(ID);
			setState(61);
			match(T__3);
			setState(62);
			((FunctionDefinitionContext)_localctx).params = functionParameters();
			setState(63);
			match(T__4);
			setState(64);
			match(T__1);
			setState(65);
			((FunctionDefinitionContext)_localctx).returnType = functionType();
			setState(66);
			match(T__5);
			setState(67);
			((FunctionDefinitionContext)_localctx).block = functionBlock();
			setState(68);
			match(T__6);
			 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1,
			                                                                  new FunctionType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine(), ((FunctionDefinitionContext)_localctx).params.ast, ((FunctionDefinitionContext)_localctx).returnType.ast),
			                                                    (((FunctionDefinitionContext)_localctx).ID!=null?((FunctionDefinitionContext)_localctx).ID.getText():null), ((FunctionDefinitionContext)_localctx).block.varDefs, ((FunctionDefinitionContext)_localctx).block.statements );
			                                  
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

	public static class FunctionBlockContext extends ParserRuleContext {
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
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					((FunctionBlockContext)_localctx).var = variableDefinition();
					 _localctx.varDefs.addAll( ((FunctionBlockContext)_localctx).var.ast ); 
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__20) | (1L << T__21) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << BOOL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				{
				setState(79);
				((FunctionBlockContext)_localctx).s = statement();
				 _localctx.statements.addAll( ((FunctionBlockContext)_localctx).s.ast); 
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 10, RULE_functionType);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				((FunctionTypeContext)_localctx).t = primitiveType();
				 ((FunctionTypeContext)_localctx).ast =  ((FunctionTypeContext)_localctx).t.ast; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
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
		enterRule(_localctx, 12, RULE_functionParameters);
		int _la;
		try {
			setState(110);
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
				setState(95);
				((FunctionParametersContext)_localctx).ID = match(ID);
				setState(96);
				match(T__1);
				setState(97);
				((FunctionParametersContext)_localctx).t = type();
				 _localctx.ast.add( new VariableDefinition(((FunctionParametersContext)_localctx).ID.getLine(), ((FunctionParametersContext)_localctx).ID.getCharPositionInLine()+1, ((FunctionParametersContext)_localctx).t.ast, (((FunctionParametersContext)_localctx).ID!=null?((FunctionParametersContext)_localctx).ID.getText():null)) ); 
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(99);
					match(T__0);
					setState(100);
					((FunctionParametersContext)_localctx).ID = match(ID);
					setState(101);
					match(T__1);
					setState(102);
					((FunctionParametersContext)_localctx).t2 = type();
					 _localctx.ast.add( new VariableDefinition(((FunctionParametersContext)_localctx).ID.getLine(), ((FunctionParametersContext)_localctx).ID.getCharPositionInLine()+1, ((FunctionParametersContext)_localctx).t2.ast, (((FunctionParametersContext)_localctx).ID!=null?((FunctionParametersContext)_localctx).ID.getText():null)) ); 
					}
					}
					setState(109);
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
		enterRule(_localctx, 14, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__2);
			setState(113);
			match(T__8);
			setState(114);
			match(T__3);
			setState(115);
			match(T__4);
			setState(116);
			match(T__5);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__20) | (1L << T__21) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << BOOL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(117);
					((MainFunctionContext)_localctx).var = variableDefinition();
					 _localctx.varDefs.addAll( ((MainFunctionContext)_localctx).var.ast ); 
					}
					break;
				case 2:
					{
					setState(120);
					((MainFunctionContext)_localctx).s = statement();
					 _localctx.statements.addAll( ((MainFunctionContext)_localctx).s.ast); 
					}
					break;
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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
		enterRule(_localctx, 16, RULE_functionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((FunctionInvocationContext)_localctx).ID = match(ID);
			setState(132);
			match(T__3);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__20) | (1L << T__21) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << BOOL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
				{
				setState(133);
				((FunctionInvocationContext)_localctx).e = expression(0);
				_localctx.expressions.add(((FunctionInvocationContext)_localctx).e.ast);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(135);
					match(T__0);
					setState(136);
					((FunctionInvocationContext)_localctx).e2 = expression(0);
					_localctx.expressions.add(((FunctionInvocationContext)_localctx).e2.ast);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(146);
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
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__9);
				setState(150);
				((StatementContext)_localctx).condition = expression(0);
				setState(151);
				match(T__5);
				setState(152);
				((StatementContext)_localctx).ifStm = conditionalBody();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(153);
					match(T__10);
					setState(154);
					((StatementContext)_localctx).elseStm = conditionalBody();
					 ((StatementContext)_localctx).elseBody =  ((StatementContext)_localctx).elseStm.ast; 
					}
				}

				setState(159);
				match(T__6);
				 _localctx.ast.add(new If(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).condition.ast, ((StatementContext)_localctx).ifStm.ast, _localctx.elseBody)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__11);
				setState(163);
				((StatementContext)_localctx).condition = expression(0);
				setState(164);
				match(T__5);
				setState(165);
				((StatementContext)_localctx).whileStm = conditionalBody();
				setState(166);
				match(T__6);
				 _localctx.ast.add(new While(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).condition.ast, ((StatementContext)_localctx).whileStm.ast)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__12);
				setState(170);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).e.add(((StatementContext)_localctx).expression);
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(171);
						match(T__0);
						setState(172);
						((StatementContext)_localctx).expression = expression(0);
						((StatementContext)_localctx).e.add(((StatementContext)_localctx).expression);
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				 for(var exp : ((StatementContext)_localctx).e) { _localctx.ast.add(new Write(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, exp.ast)); } 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(T__13);
				setState(181);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).e.add(((StatementContext)_localctx).expression);
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(182);
						match(T__0);
						setState(183);
						((StatementContext)_localctx).expression = expression(0);
						((StatementContext)_localctx).e.add(((StatementContext)_localctx).expression);
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				 for(var exp : ((StatementContext)_localctx).e) { _localctx.ast.add(new Read(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, exp.ast)); } 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(T__14);
				setState(192);
				((StatementContext)_localctx).expression = expression(0);
				 _localctx.ast.add(new Return(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).expression.ast)); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				((StatementContext)_localctx).left = expression(0);
				setState(196);
				match(T__15);
				setState(197);
				((StatementContext)_localctx).right = expression(0);
				 _localctx.ast.add(new Assignment(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).right.ast)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
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
		enterRule(_localctx, 20, RULE_conditionalBody);
		int _la;
		try {
			setState(216);
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
			case REAL_CONSTANT:
			case INT_CONSTANT:
			case BOOL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((ConditionalBodyContext)_localctx).statement = statement();
				 _localctx.ast.addAll( ((ConditionalBodyContext)_localctx).statement.ast ); 
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__20) | (1L << T__21) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << BOOL_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << ID))) != 0)) {
					{
					{
					setState(207);
					((ConditionalBodyContext)_localctx).statement = statement();
					 _localctx.ast.addAll( ((ConditionalBodyContext)_localctx).statement.ast ); 
					}
					}
					setState(214);
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
		public Token BOOL_CONSTANT;
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
		public TerminalNode BOOL_CONSTANT() { return getToken(XanaParser.BOOL_CONSTANT, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
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
				setState(219);
				match(T__3);
				setState(220);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(221);
				match(T__4);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast; 
				}
				break;
			case 2:
				{
				setState(224);
				match(T__20);
				setState(225);
				((ExpressionContext)_localctx).expression = expression(12);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				{
				setState(228);
				match(T__21);
				setState(229);
				((ExpressionContext)_localctx).expression = expression(11);
				 ((ExpressionContext)_localctx).ast =  new UnaryNegative(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 4:
				{
				setState(232);
				((ExpressionContext)_localctx).functionInvocation = functionInvocation();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).functionInvocation.ast; 
				}
				break;
			case 5:
				{
				setState(235);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(237);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(239);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(241);
				((ExpressionContext)_localctx).BOOL_CONSTANT = match(BOOL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new BoolLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToBool((((ExpressionContext)_localctx).BOOL_CONSTANT!=null?((ExpressionContext)_localctx).BOOL_CONSTANT.getText():null))); 
				}
				break;
			case 9:
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
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
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
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(11);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
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
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(10);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
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
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Relational(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(262);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
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
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Logical(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).left.ast, ((ExpressionContext)_localctx).op.getText(), ((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).right.ast); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.arr = _prevctx;
						_localctx.arr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(267);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
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
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
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
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
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
		enterRule(_localctx, 24, RULE_type);
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
				 ((TypeContext)_localctx).ast =  new StructType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((TypeContext)_localctx).recordType.ast); 
				}
				break;
			case T__35:
			case T__36:
			case T__37:
			case T__38:
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
		enterRule(_localctx, 26, RULE_recordType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
					 for(var id : ((RecordTypeContext)_localctx).ids) { _localctx.ast.add(new RecordType(id.getLine(), id.getCharPositionInLine() + 1, ((RecordTypeContext)_localctx).type.ast, id.getText())); }
					             ((RecordTypeContext)_localctx).ids.clear(); 
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type ast;
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primitiveType);
		try {
			setState(330);
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
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(T__38);
				 ((PrimitiveTypeContext)_localctx).ast =  new BoolType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
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
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u014f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\4\3\4\3\4\7"+
		"\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6\3\6\7\6"+
		"U\n\6\f\6\16\6X\13\6\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\5\bq\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008e\n\n\f\n\16\n\u0091\13\n"+
		"\5\n\u0093\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00a0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3\13\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00bb\n\13\f\13\16\13\u00be\13\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ce\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00d5\n\f\f\f\16\f\u00d8\13\f\3\f\5\f\u00db\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f8\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u011d\n\r\f\r\16"+
		"\r\u0120\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0132\n\16\3\17\3\17\3\17\7\17\u0137\n\17"+
		"\f\17\16\17\u013a\13\17\3\17\3\17\3\17\3\17\7\17\u0140\n\17\f\17\16\17"+
		"\u0143\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u014d\n\20\3"+
		"\20\6\66\u00b1\u00bc\u0141\3\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\6\3\2\31\33\4\2\27\27\34\34\3\2\35\"\3\2#$\2\u016c\2 \3\2\2\2\4"+
		".\3\2\2\2\6\61\3\2\2\2\b=\3\2\2\2\nN\3\2\2\2\f^\3\2\2\2\16p\3\2\2\2\20"+
		"r\3\2\2\2\22\u0085\3\2\2\2\24\u00cd\3\2\2\2\26\u00da\3\2\2\2\30\u00f7"+
		"\3\2\2\2\32\u0131\3\2\2\2\34\u0141\3\2\2\2\36\u014c\3\2\2\2 !\5\4\3\2"+
		"!\"\5\20\t\2\"#\b\2\1\2#$\7\2\2\3$%\b\2\1\2%\3\3\2\2\2&\'\5\6\4\2\'(\b"+
		"\3\1\2(-\3\2\2\2)*\5\b\5\2*+\b\3\1\2+-\3\2\2\2,&\3\2\2\2,)\3\2\2\2-\60"+
		"\3\2\2\2.,\3\2\2\2./\3\2\2\2/\5\3\2\2\2\60.\3\2\2\2\61\66\7\61\2\2\62"+
		"\63\7\3\2\2\63\65\7\61\2\2\64\62\3\2\2\2\658\3\2\2\2\66\67\3\2\2\2\66"+
		"\64\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\4\2\2:;\5\32\16\2;<\b\4\1\2<\7"+
		"\3\2\2\2=>\7\5\2\2>?\7\61\2\2?@\7\6\2\2@A\5\16\b\2AB\7\7\2\2BC\7\4\2\2"+
		"CD\5\f\7\2DE\7\b\2\2EF\5\n\6\2FG\7\t\2\2GH\b\5\1\2H\t\3\2\2\2IJ\5\6\4"+
		"\2JK\b\6\1\2KM\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OV\3\2\2"+
		"\2PN\3\2\2\2QR\5\24\13\2RS\b\6\1\2SU\3\2\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2\2YZ\5\36\20\2Z[\b\7\1\2[_\3\2\2\2\\"+
		"]\7\n\2\2]_\b\7\1\2^Y\3\2\2\2^\\\3\2\2\2_\r\3\2\2\2`q\b\b\1\2ab\7\61\2"+
		"\2bc\7\4\2\2cd\5\32\16\2dm\b\b\1\2ef\7\3\2\2fg\7\61\2\2gh\7\4\2\2hi\5"+
		"\32\16\2ij\b\b\1\2jl\3\2\2\2ke\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n"+
		"q\3\2\2\2om\3\2\2\2p`\3\2\2\2pa\3\2\2\2q\17\3\2\2\2rs\7\5\2\2st\7\13\2"+
		"\2tu\7\6\2\2uv\7\7\2\2v\177\7\b\2\2wx\5\6\4\2xy\b\t\1\2y~\3\2\2\2z{\5"+
		"\24\13\2{|\b\t\1\2|~\3\2\2\2}w\3\2\2\2}z\3\2\2\2~\u0081\3\2\2\2\177}\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083"+
		"\7\t\2\2\u0083\u0084\b\t\1\2\u0084\21\3\2\2\2\u0085\u0086\7\61\2\2\u0086"+
		"\u0092\7\6\2\2\u0087\u0088\5\30\r\2\u0088\u008f\b\n\1\2\u0089\u008a\7"+
		"\3\2\2\u008a\u008b\5\30\r\2\u008b\u008c\b\n\1\2\u008c\u008e\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0087\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\7\2\2\u0095\u0096\b\n"+
		"\1\2\u0096\23\3\2\2\2\u0097\u0098\7\f\2\2\u0098\u0099\5\30\r\2\u0099\u009a"+
		"\7\b\2\2\u009a\u009f\5\26\f\2\u009b\u009c\7\r\2\2\u009c\u009d\5\26\f\2"+
		"\u009d\u009e\b\13\1\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\b\13\1\2"+
		"\u00a3\u00ce\3\2\2\2\u00a4\u00a5\7\16\2\2\u00a5\u00a6\5\30\r\2\u00a6\u00a7"+
		"\7\b\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa\b\13\1\2"+
		"\u00aa\u00ce\3\2\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00b1\5\30\r\2\u00ad\u00ae"+
		"\7\3\2\2\u00ae\u00b0\5\30\r\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b5\b\13\1\2\u00b5\u00ce\3\2\2\2\u00b6\u00b7\7\20\2\2"+
		"\u00b7\u00bc\5\30\r\2\u00b8\u00b9\7\3\2\2\u00b9\u00bb\5\30\r\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\b\13\1\2\u00c0\u00ce\3"+
		"\2\2\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\5\30\r\2\u00c3\u00c4\b\13\1\2"+
		"\u00c4\u00ce\3\2\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\7\22\2\2\u00c7\u00c8"+
		"\5\30\r\2\u00c8\u00c9\b\13\1\2\u00c9\u00ce\3\2\2\2\u00ca\u00cb\5\22\n"+
		"\2\u00cb\u00cc\b\13\1\2\u00cc\u00ce\3\2\2\2\u00cd\u0097\3\2\2\2\u00cd"+
		"\u00a4\3\2\2\2\u00cd\u00ab\3\2\2\2\u00cd\u00b6\3\2\2\2\u00cd\u00c1\3\2"+
		"\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\25\3\2\2\2\u00cf\u00d0"+
		"\5\24\13\2\u00d0\u00d6\b\f\1\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\b\f\1"+
		"\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00db\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00db\b\f\1\2\u00da\u00cf\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\27\3\2\2"+
		"\2\u00dc\u00dd\b\r\1\2\u00dd\u00de\7\6\2\2\u00de\u00df\5\30\r\2\u00df"+
		"\u00e0\7\7\2\2\u00e0\u00e1\b\r\1\2\u00e1\u00f8\3\2\2\2\u00e2\u00e3\7\27"+
		"\2\2\u00e3\u00e4\5\30\r\16\u00e4\u00e5\b\r\1\2\u00e5\u00f8\3\2\2\2\u00e6"+
		"\u00e7\7\30\2\2\u00e7\u00e8\5\30\r\r\u00e8\u00e9\b\r\1\2\u00e9\u00f8\3"+
		"\2\2\2\u00ea\u00eb\5\22\n\2\u00eb\u00ec\b\r\1\2\u00ec\u00f8\3\2\2\2\u00ed"+
		"\u00ee\7-\2\2\u00ee\u00f8\b\r\1\2\u00ef\u00f0\7,\2\2\u00f0\u00f8\b\r\1"+
		"\2\u00f1\u00f2\7/\2\2\u00f2\u00f8\b\r\1\2\u00f3\u00f4\7.\2\2\u00f4\u00f8"+
		"\b\r\1\2\u00f5\u00f6\7\61\2\2\u00f6\u00f8\b\r\1\2\u00f7\u00dc\3\2\2\2"+
		"\u00f7\u00e2\3\2\2\2\u00f7\u00e6\3\2\2\2\u00f7\u00ea\3\2\2\2\u00f7\u00ed"+
		"\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u011e\3\2\2\2\u00f9\u00fa\f\f\2\2\u00fa\u00fb\t\2"+
		"\2\2\u00fb\u00fc\5\30\r\r\u00fc\u00fd\b\r\1\2\u00fd\u011d\3\2\2\2\u00fe"+
		"\u00ff\f\13\2\2\u00ff\u0100\t\3\2\2\u0100\u0101\5\30\r\f\u0101\u0102\b"+
		"\r\1\2\u0102\u011d\3\2\2\2\u0103\u0104\f\n\2\2\u0104\u0105\t\4\2\2\u0105"+
		"\u0106\5\30\r\13\u0106\u0107\b\r\1\2\u0107\u011d\3\2\2\2\u0108\u0109\f"+
		"\t\2\2\u0109\u010a\t\5\2\2\u010a\u010b\5\30\r\n\u010b\u010c\b\r\1\2\u010c"+
		"\u011d\3\2\2\2\u010d\u010e\f\21\2\2\u010e\u010f\7\23\2\2\u010f\u0110\5"+
		"\30\r\2\u0110\u0111\7\24\2\2\u0111\u0112\b\r\1\2\u0112\u011d\3\2\2\2\u0113"+
		"\u0114\f\20\2\2\u0114\u0115\7\25\2\2\u0115\u0116\7\61\2\2\u0116\u011d"+
		"\b\r\1\2\u0117\u0118\f\17\2\2\u0118\u0119\7\26\2\2\u0119\u011a\5\36\20"+
		"\2\u011a\u011b\b\r\1\2\u011b\u011d\3\2\2\2\u011c\u00f9\3\2\2\2\u011c\u00fe"+
		"\3\2\2\2\u011c\u0103\3\2\2\2\u011c\u0108\3\2\2\2\u011c\u010d\3\2\2\2\u011c"+
		"\u0113\3\2\2\2\u011c\u0117\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\31\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122"+
		"\7\23\2\2\u0122\u0123\7-\2\2\u0123\u0124\7\4\2\2\u0124\u0125\5\32\16\2"+
		"\u0125\u0126\7\24\2\2\u0126\u0127\b\16\1\2\u0127\u0132\3\2\2\2\u0128\u0129"+
		"\7%\2\2\u0129\u012a\7\b\2\2\u012a\u012b\5\34\17\2\u012b\u012c\7\t\2\2"+
		"\u012c\u012d\b\16\1\2\u012d\u0132\3\2\2\2\u012e\u012f\5\36\20\2\u012f"+
		"\u0130\b\16\1\2\u0130\u0132\3\2\2\2\u0131\u0121\3\2\2\2\u0131\u0128\3"+
		"\2\2\2\u0131\u012e\3\2\2\2\u0132\33\3\2\2\2\u0133\u0138\7\61\2\2\u0134"+
		"\u0135\7\3\2\2\u0135\u0137\7\61\2\2\u0136\u0134\3\2\2\2\u0137\u013a\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013c\7\4\2\2\u013c\u013d\5\32\16\2\u013d\u013e\b"+
		"\17\1\2\u013e\u0140\3\2\2\2\u013f\u0133\3\2\2\2\u0140\u0143\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\35\3\2\2\2\u0143\u0141\3\2\2"+
		"\2\u0144\u0145\7&\2\2\u0145\u014d\b\20\1\2\u0146\u0147\7\'\2\2\u0147\u014d"+
		"\b\20\1\2\u0148\u0149\7(\2\2\u0149\u014d\b\20\1\2\u014a\u014b\7)\2\2\u014b"+
		"\u014d\b\20\1\2\u014c\u0144\3\2\2\2\u014c\u0146\3\2\2\2\u014c\u0148\3"+
		"\2\2\2\u014c\u014a\3\2\2\2\u014d\37\3\2\2\2\33,.\66NV^mp}\177\u008f\u0092"+
		"\u009f\u00b1\u00bc\u00cd\u00d6\u00da\u00f7\u011c\u011e\u0131\u0138\u0141"+
		"\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}