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
		RULE_functionDefinition = 4, RULE_functionParameters = 5, RULE_functionBody = 6, 
		RULE_functionInvocation = 7, RULE_statement = 8, RULE_conditionalBody = 9, 
		RULE_expression = 10, RULE_functionType = 11, RULE_type = 12, RULE_recordType = 13, 
		RULE_primitiveType = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "mainFunction", "variableDefinition", "functionDefinition", 
			"functionParameters", "functionBody", "functionInvocation", "statement", 
			"conditionalBody", "expression", "functionType", "type", "recordType", 
			"primitiveType"
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
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((ProgramContext)_localctx).d = ((ProgramContext)_localctx).definitions = definitions();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(36);
			((ProgramContext)_localctx).m = mainFunction();
			 ((ProgramContext)_localctx).definitions.ast.add(((ProgramContext)_localctx).m.ast); 
			setState(38);
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
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((DefinitionsContext)_localctx).variableDefinition = variableDefinition();
				 _localctx.ast.addAll(((DefinitionsContext)_localctx).variableDefinition.ast); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((DefinitionsContext)_localctx).functionDefinition = functionDefinition();
				 _localctx.ast.addAll(((DefinitionsContext)_localctx).functionDefinition.ast); 
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
		enterRule(_localctx, 4, RULE_mainFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__0);
			setState(50);
			match(T__1);
			setState(51);
			match(T__2);
			setState(52);
			match(T__3);
			setState(53);
			match(T__4);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					variableDefinition();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					statement();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(66);
					variableDefinition();
					}
					break;
				case 2:
					{
					setState(67);
					statement();
					}
					break;
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
			setState(75);
			((VariableDefinitionContext)_localctx).ID = match(ID);
			((VariableDefinitionContext)_localctx).ids.add(((VariableDefinitionContext)_localctx).ID);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(76);
					match(T__6);
					setState(77);
					((VariableDefinitionContext)_localctx).ID = match(ID);
					((VariableDefinitionContext)_localctx).ids.add(((VariableDefinitionContext)_localctx).ID);
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(83);
			match(T__7);
			setState(84);
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
		public FunctionTypeContext funcType;
		public FunctionBodyContext funcBody;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__0);
			setState(88);
			((FunctionDefinitionContext)_localctx).ID = match(ID);
			setState(89);
			match(T__2);
			setState(90);
			functionParameters();
			setState(91);
			match(T__3);
			setState(92);
			match(T__7);
			setState(93);
			((FunctionDefinitionContext)_localctx).funcType = functionType();
			setState(94);
			match(T__4);
			setState(95);
			((FunctionDefinitionContext)_localctx).funcBody = functionBody();
			setState(96);
			match(T__5);
			 ((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((FunctionDefinitionContext)_localctx).funcType.ast, (((FunctionDefinitionContext)_localctx).ID!=null?((FunctionDefinitionContext)_localctx).ID.getText():null), ((FunctionDefinitionContext)_localctx).funcBody.ast); 
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(99);
				match(ID);
				setState(100);
				match(T__7);
				setState(101);
				type();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(102);
					match(T__6);
					setState(103);
					match(ID);
					setState(104);
					match(T__7);
					setState(105);
					type();
					}
					}
					setState(110);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public Statement ast;
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
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					variableDefinition();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(119);
				statement();
				}
				}
				setState(124);
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
			setState(125);
			((FunctionInvocationContext)_localctx).ID = match(ID);
			setState(126);
			match(T__2);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(127);
				((FunctionInvocationContext)_localctx).e = expression(0);
				_localctx.expressions.add(((FunctionInvocationContext)_localctx).e.ast);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(129);
					match(T__6);
					setState(130);
					((FunctionInvocationContext)_localctx).e2 = expression(0);
					_localctx.expressions.add(((FunctionInvocationContext)_localctx).e.ast);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(140);
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
		public Statement ast;
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__8);
				setState(144);
				expression(0);
				setState(145);
				match(T__4);
				setState(146);
				conditionalBody();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(147);
					match(T__9);
					setState(148);
					conditionalBody();
					}
				}

				setState(151);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(T__10);
				setState(154);
				expression(0);
				setState(155);
				match(T__4);
				setState(156);
				conditionalBody();
				setState(157);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__11);
				setState(160);
				expression(0);
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(T__12);
				setState(169);
				expression(0);
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(170);
						match(T__6);
						setState(171);
						expression(0);
						}
						} 
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(T__13);
				setState(178);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				((StatementContext)_localctx).left = expression(0);
				setState(180);
				match(T__14);
				setState(181);
				((StatementContext)_localctx).right = expression(0);
				 ((StatementContext)_localctx).ast =  new Assignment(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).right.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(187);
				statement();
				}
				}
				setState(192);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(194);
				match(T__2);
				setState(195);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(196);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast; 
				}
				break;
			case 2:
				{
				setState(199);
				match(T__19);
				setState(200);
				((ExpressionContext)_localctx).expression = expression(11);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 3:
				{
				setState(203);
				match(T__20);
				setState(204);
				((ExpressionContext)_localctx).expression = expression(10);
				 ((ExpressionContext)_localctx).ast =  new UnaryNegative(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).expression.ast); 
				}
				break;
			case 4:
				{
				setState(207);
				((ExpressionContext)_localctx).functionInvocation = functionInvocation();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).functionInvocation.ast; 
				}
				break;
			case 5:
				{
				setState(210);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(212);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(214);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(216);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(221);
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
						setState(222);
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
						setState(225);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(226);
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
						setState(227);
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
						setState(230);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(231);
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
						setState(232);
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
						setState(235);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(236);
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
						setState(237);
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
						setState(240);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(241);
						match(T__15);
						setState(242);
						((ExpressionContext)_localctx).index = ((ExpressionContext)_localctx).expression = expression(0);
						setState(243);
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
						setState(246);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(247);
						match(T__17);
						setState(248);
						((ExpressionContext)_localctx).field = match(ID);
						 ((ExpressionContext)_localctx).ast =  new StructAccess(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).struct.ast, ((ExpressionContext)_localctx).field.getText()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(251);
						match(T__18);
						setState(252);
						((ExpressionContext)_localctx).toCast = primitiveType();
						 ((ExpressionContext)_localctx).ast =  new Cast(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((ExpressionContext)_localctx).toCast.ast, ((ExpressionContext)_localctx).expression.ast); 
						}
						break;
					}
					} 
				}
				setState(259);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public Type ast;
		public PrimitiveTypeContext primitiveType;
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
		enterRule(_localctx, 22, RULE_functionType);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((FunctionTypeContext)_localctx).primitiveType = primitiveType();
				 ((FunctionTypeContext)_localctx).ast =  ((FunctionTypeContext)_localctx).primitiveType.ast; 
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
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
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__15);
				setState(268);
				((TypeContext)_localctx).i = match(INT_CONSTANT);
				setState(269);
				match(T__7);
				setState(270);
				((TypeContext)_localctx).t = type();
				setState(271);
				match(T__16);
				 ((TypeContext)_localctx).ast =  new ArrayType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((TypeContext)_localctx).t.ast, LexerHelper.lexemeToInt((((TypeContext)_localctx).i!=null?((TypeContext)_localctx).i.getText():null))); 
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__34);
				setState(275);
				match(T__4);
				setState(276);
				((TypeContext)_localctx).recordType = recordType();
				setState(277);
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
				setState(280);
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
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(285);
					((RecordTypeContext)_localctx).ID = match(ID);
					((RecordTypeContext)_localctx).ids.add(((RecordTypeContext)_localctx).ID);
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(286);
						match(T__6);
						setState(287);
						((RecordTypeContext)_localctx).ID = match(ID);
						((RecordTypeContext)_localctx).ids.add(((RecordTypeContext)_localctx).ID);
						}
						}
						setState(292);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(293);
					match(T__7);
					setState(294);
					((RecordTypeContext)_localctx).type = type();
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 28, RULE_primitiveType);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__35);
				 ((PrimitiveTypeContext)_localctx).ast =  new IntType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__36);
				 ((PrimitiveTypeContext)_localctx).ast =  new DoubleType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0139\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\7\4@\n\4\f\4\16\4C\13\4"+
		"\3\4\3\4\7\4G\n\4\f\4\16\4J\13\4\3\4\3\4\3\5\3\5\3\5\7\5Q\n\5\f\5\16\5"+
		"T\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\5\7r\n\7\3\b\7\b"+
		"u\n\b\f\b\16\bx\13\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u0088\n\t\f\t\16\t\u008b\13\t\5\t\u008d\n\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0098\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00af\n\n\f\n\16\n\u00b2\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bc"+
		"\n\n\3\13\7\13\u00bf\n\13\f\13\16\13\u00c2\13\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00dd\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u0102\n\f\f\f\16\f\u0105\13\f\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u010c\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u011e\n\16\3\17\3\17\3\17\7\17\u0123"+
		"\n\17\f\17\16\17\u0126\13\17\3\17\3\17\7\17\u012a\n\17\f\17\16\17\u012d"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0137\n\20\3\20\6"+
		"R\u00a7\u00b0\u012b\3\26\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6"+
		"\3\2\30\32\4\2\26\26\33\33\3\2\34!\3\2\"#\2\u0155\2#\3\2\2\2\4\61\3\2"+
		"\2\2\6\63\3\2\2\2\bM\3\2\2\2\nY\3\2\2\2\fq\3\2\2\2\16v\3\2\2\2\20\177"+
		"\3\2\2\2\22\u00bb\3\2\2\2\24\u00c0\3\2\2\2\26\u00dc\3\2\2\2\30\u010b\3"+
		"\2\2\2\32\u011d\3\2\2\2\34\u012b\3\2\2\2\36\u0136\3\2\2\2 \"\5\4\3\2!"+
		" \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\5\6\4"+
		"\2\'(\b\2\1\2()\7\2\2\3)*\b\2\1\2*\3\3\2\2\2+,\5\b\5\2,-\b\3\1\2-\62\3"+
		"\2\2\2./\5\n\6\2/\60\b\3\1\2\60\62\3\2\2\2\61+\3\2\2\2\61.\3\2\2\2\62"+
		"\5\3\2\2\2\63\64\7\3\2\2\64\65\7\4\2\2\65\66\7\5\2\2\66\67\7\6\2\2\67"+
		";\7\7\2\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2"+
		"=;\3\2\2\2>@\5\22\n\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BH\3\2\2"+
		"\2CA\3\2\2\2DG\5\b\5\2EG\5\22\n\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\b\2\2L\7\3\2\2\2MR\7)\2\2NO\7\t"+
		"\2\2OQ\7)\2\2PN\3\2\2\2QT\3\2\2\2RS\3\2\2\2RP\3\2\2\2SU\3\2\2\2TR\3\2"+
		"\2\2UV\7\n\2\2VW\5\32\16\2WX\b\5\1\2X\t\3\2\2\2YZ\7\3\2\2Z[\7)\2\2[\\"+
		"\7\5\2\2\\]\5\f\7\2]^\7\6\2\2^_\7\n\2\2_`\5\30\r\2`a\7\7\2\2ab\5\16\b"+
		"\2bc\7\b\2\2cd\b\6\1\2d\13\3\2\2\2ef\7)\2\2fg\7\n\2\2gn\5\32\16\2hi\7"+
		"\t\2\2ij\7)\2\2jk\7\n\2\2km\5\32\16\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2\2no"+
		"\3\2\2\2or\3\2\2\2pn\3\2\2\2qe\3\2\2\2qr\3\2\2\2r\r\3\2\2\2su\5\b\5\2"+
		"ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w|\3\2\2\2xv\3\2\2\2y{\5\22\n"+
		"\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7)\2\2\u0080\u008c\7\5\2\2\u0081\u0082\5\26\f\2\u0082\u0089\b\t\1\2\u0083"+
		"\u0084\7\t\2\2\u0084\u0085\5\26\f\2\u0085\u0086\b\t\1\2\u0086\u0088\3"+
		"\2\2\2\u0087\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0081\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\6\2\2\u008f"+
		"\u0090\b\t\1\2\u0090\21\3\2\2\2\u0091\u0092\7\13\2\2\u0092\u0093\5\26"+
		"\f\2\u0093\u0094\7\7\2\2\u0094\u0097\5\24\13\2\u0095\u0096\7\f\2\2\u0096"+
		"\u0098\5\24\13\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u009a\7\b\2\2\u009a\u00bc\3\2\2\2\u009b\u009c\7\r\2\2\u009c"+
		"\u009d\5\26\f\2\u009d\u009e\7\7\2\2\u009e\u009f\5\24\13\2\u009f\u00a0"+
		"\7\b\2\2\u00a0\u00bc\3\2\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a7\5\26\f\2"+
		"\u00a3\u00a4\7\t\2\2\u00a4\u00a6\5\26\f\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00bc\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00b0\5\26\f\2\u00ac\u00ad\7"+
		"\t\2\2\u00ad\u00af\5\26\f\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00bc\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00bc\5\26\f\2\u00b5\u00b6\5\26\f\2\u00b6"+
		"\u00b7\7\21\2\2\u00b7\u00b8\5\26\f\2\u00b8\u00b9\b\n\1\2\u00b9\u00bc\3"+
		"\2\2\2\u00ba\u00bc\5\20\t\2\u00bb\u0091\3\2\2\2\u00bb\u009b\3\2\2\2\u00bb"+
		"\u00a1\3\2\2\2\u00bb\u00aa\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b5\3\2"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\23\3\2\2\2\u00bd\u00bf\5\22\n\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\25\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\b\f\1\2\u00c4\u00c5\7\5\2"+
		"\2\u00c5\u00c6\5\26\f\2\u00c6\u00c7\7\6\2\2\u00c7\u00c8\b\f\1\2\u00c8"+
		"\u00dd\3\2\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\5\26\f\r\u00cb\u00cc\b"+
		"\f\1\2\u00cc\u00dd\3\2\2\2\u00cd\u00ce\7\27\2\2\u00ce\u00cf\5\26\f\f\u00cf"+
		"\u00d0\b\f\1\2\u00d0\u00dd\3\2\2\2\u00d1\u00d2\5\20\t\2\u00d2\u00d3\b"+
		"\f\1\2\u00d3\u00dd\3\2\2\2\u00d4\u00d5\7-\2\2\u00d5\u00dd\b\f\1\2\u00d6"+
		"\u00d7\7,\2\2\u00d7\u00dd\b\f\1\2\u00d8\u00d9\7.\2\2\u00d9\u00dd\b\f\1"+
		"\2\u00da\u00db\7)\2\2\u00db\u00dd\b\f\1\2\u00dc\u00c3\3\2\2\2\u00dc\u00c9"+
		"\3\2\2\2\u00dc\u00cd\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc"+
		"\u00d6\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u0103\3\2"+
		"\2\2\u00de\u00df\f\13\2\2\u00df\u00e0\t\2\2\2\u00e0\u00e1\5\26\f\f\u00e1"+
		"\u00e2\b\f\1\2\u00e2\u0102\3\2\2\2\u00e3\u00e4\f\n\2\2\u00e4\u00e5\t\3"+
		"\2\2\u00e5\u00e6\5\26\f\13\u00e6\u00e7\b\f\1\2\u00e7\u0102\3\2\2\2\u00e8"+
		"\u00e9\f\t\2\2\u00e9\u00ea\t\4\2\2\u00ea\u00eb\5\26\f\n\u00eb\u00ec\b"+
		"\f\1\2\u00ec\u0102\3\2\2\2\u00ed\u00ee\f\b\2\2\u00ee\u00ef\t\5\2\2\u00ef"+
		"\u00f0\5\26\f\t\u00f0\u00f1\b\f\1\2\u00f1\u0102\3\2\2\2\u00f2\u00f3\f"+
		"\20\2\2\u00f3\u00f4\7\22\2\2\u00f4\u00f5\5\26\f\2\u00f5\u00f6\7\23\2\2"+
		"\u00f6\u00f7\b\f\1\2\u00f7\u0102\3\2\2\2\u00f8\u00f9\f\17\2\2\u00f9\u00fa"+
		"\7\24\2\2\u00fa\u00fb\7)\2\2\u00fb\u0102\b\f\1\2\u00fc\u00fd\f\16\2\2"+
		"\u00fd\u00fe\7\25\2\2\u00fe\u00ff\5\36\20\2\u00ff\u0100\b\f\1\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00de\3\2\2\2\u0101\u00e3\3\2\2\2\u0101\u00e8\3\2"+
		"\2\2\u0101\u00ed\3\2\2\2\u0101\u00f2\3\2\2\2\u0101\u00f8\3\2\2\2\u0101"+
		"\u00fc\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\27\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\5\36\20\2\u0107"+
		"\u0108\b\r\1\2\u0108\u010c\3\2\2\2\u0109\u010a\7$\2\2\u010a\u010c\b\r"+
		"\1\2\u010b\u0106\3\2\2\2\u010b\u0109\3\2\2\2\u010c\31\3\2\2\2\u010d\u010e"+
		"\7\22\2\2\u010e\u010f\7-\2\2\u010f\u0110\7\n\2\2\u0110\u0111\5\32\16\2"+
		"\u0111\u0112\7\23\2\2\u0112\u0113\b\16\1\2\u0113\u011e\3\2\2\2\u0114\u0115"+
		"\7%\2\2\u0115\u0116\7\7\2\2\u0116\u0117\5\34\17\2\u0117\u0118\7\b\2\2"+
		"\u0118\u0119\b\16\1\2\u0119\u011e\3\2\2\2\u011a\u011b\5\36\20\2\u011b"+
		"\u011c\b\16\1\2\u011c\u011e\3\2\2\2\u011d\u010d\3\2\2\2\u011d\u0114\3"+
		"\2\2\2\u011d\u011a\3\2\2\2\u011e\33\3\2\2\2\u011f\u0124\7)\2\2\u0120\u0121"+
		"\7\t\2\2\u0121\u0123\7)\2\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0128\7\n\2\2\u0128\u012a\5\32\16\2\u0129\u011f\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012e\u012f\b\17\1\2\u012f\35\3\2\2\2\u0130\u0131"+
		"\7&\2\2\u0131\u0137\b\20\1\2\u0132\u0133\7\'\2\2\u0133\u0137\b\20\1\2"+
		"\u0134\u0135\7(\2\2\u0135\u0137\b\20\1\2\u0136\u0130\3\2\2\2\u0136\u0132"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0137\37\3\2\2\2\34#\61;AFHRnqv|\u0089\u008c"+
		"\u0097\u00a7\u00b0\u00bb\u00c0\u00dc\u0101\u0103\u010b\u011d\u0124\u012b"+
		"\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}