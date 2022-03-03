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
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(XanaParser.EOF, 0); }
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
					definitions();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(36);
			mainFunction();
			setState(37);
			match(EOF);
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
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
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
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				functionDefinition();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				variableDefinition();
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
			setState(43);
			match(T__0);
			setState(44);
			match(T__1);
			setState(45);
			match(T__2);
			setState(46);
			match(T__3);
			setState(47);
			match(T__4);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					variableDefinition();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					statement();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(60);
					variableDefinition();
					}
					break;
				case 2:
					{
					setState(61);
					statement();
					}
					break;
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
		public VariableDefinition ast;
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(69);
			match(ID);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(70);
					match(T__6);
					setState(71);
					match(ID);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(77);
			match(T__7);
			setState(78);
			type();
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
			setState(80);
			match(T__0);
			setState(81);
			match(ID);
			setState(82);
			match(T__2);
			setState(83);
			functionParameters();
			setState(84);
			match(T__3);
			setState(85);
			match(T__7);
			setState(86);
			functionType();
			setState(87);
			match(T__4);
			setState(88);
			functionBody();
			setState(89);
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(91);
				match(ID);
				setState(92);
				match(T__7);
				setState(93);
				type();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(94);
					match(T__6);
					setState(95);
					match(ID);
					setState(96);
					match(T__7);
					setState(97);
					type();
					}
					}
					setState(102);
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
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					variableDefinition();
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(111);
				statement();
				}
				}
				setState(116);
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
			setState(117);
			((FunctionInvocationContext)_localctx).ID = match(ID);
			setState(118);
			match(T__2);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				setState(119);
				((FunctionInvocationContext)_localctx).e = expression(0);
				_localctx.expressions.add(((FunctionInvocationContext)_localctx).e.ast);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(121);
					match(T__6);
					setState(122);
					((FunctionInvocationContext)_localctx).e2 = expression(0);
					_localctx.expressions.add(((FunctionInvocationContext)_localctx).e.ast);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(132);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__8);
				setState(136);
				expression(0);
				setState(137);
				match(T__4);
				setState(138);
				conditionalBody();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(139);
					match(T__9);
					setState(140);
					conditionalBody();
					}
				}

				setState(143);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__10);
				setState(146);
				expression(0);
				setState(147);
				match(T__4);
				setState(148);
				conditionalBody();
				setState(149);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(T__11);
				setState(152);
				expression(0);
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(153);
						match(T__6);
						setState(154);
						expression(0);
						}
						} 
					}
					setState(159);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(T__12);
				setState(161);
				expression(0);
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(162);
						match(T__6);
						setState(163);
						expression(0);
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(T__13);
				setState(170);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				expression(0);
				setState(172);
				match(T__14);
				setState(173);
				expression(0);
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
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << T__20) | (1L << ID) | (1L << REAL_CONSTANT) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(178);
				statement();
				}
				}
				setState(183);
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
		public FunctionInvocationContext functionInvocation;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
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
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(185);
				match(T__2);
				setState(186);
				expression(0);
				setState(187);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(189);
				match(T__19);
				setState(190);
				expression(12);
				}
				break;
			case 3:
				{
				setState(191);
				match(T__20);
				setState(192);
				expression(11);
				}
				break;
			case 4:
				{
				setState(193);
				((ExpressionContext)_localctx).functionInvocation = functionInvocation();
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).functionInvocation.ast; 
				}
				break;
			case 5:
				{
				setState(196);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 6:
				{
				setState(198);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(200);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(202);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(207);
						match(T__17);
						setState(208);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(210);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(211);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(213);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(216);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(219);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(222);
						match(T__14);
						setState(223);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(225);
						match(T__15);
						setState(226);
						expression(0);
						setState(227);
						match(T__16);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(230);
						match(T__18);
						setState(231);
						primitiveType();
						}
						break;
					}
					} 
				}
				setState(236);
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
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((FunctionTypeContext)_localctx).primitiveType = primitiveType();
				 ((FunctionTypeContext)_localctx).ast =  ((FunctionTypeContext)_localctx).primitiveType.ast; 
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
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
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__15);
				setState(245);
				((TypeContext)_localctx).i = match(INT_CONSTANT);
				setState(246);
				match(T__7);
				setState(247);
				((TypeContext)_localctx).t = type();
				setState(248);
				match(T__16);
				 ((TypeContext)_localctx).ast =  new ArrayType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, ((TypeContext)_localctx).t.ast, LexerHelper.lexemeToInt((((TypeContext)_localctx).i!=null?((TypeContext)_localctx).i.getText():null))); 
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__34);
				setState(252);
				match(T__4);
				setState(253);
				((TypeContext)_localctx).recordType = recordType();
				setState(254);
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
				setState(257);
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
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(262);
					((RecordTypeContext)_localctx).ID = match(ID);
					((RecordTypeContext)_localctx).ids.add(((RecordTypeContext)_localctx).ID);
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(263);
						match(T__6);
						setState(264);
						((RecordTypeContext)_localctx).ID = match(ID);
						((RecordTypeContext)_localctx).ids.add(((RecordTypeContext)_localctx).ID);
						}
						}
						setState(269);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(270);
					match(T__7);
					setState(271);
					((RecordTypeContext)_localctx).type = type();
					}
					} 
				}
				setState(276);
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
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__35);
				 ((PrimitiveTypeContext)_localctx).ast =  new IntType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__36);
				 ((PrimitiveTypeContext)_localctx).ast =  new DoubleType(_localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1); 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
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
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\3\2\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64\n"+
		"\4\f\4\16\4\67\13\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\7\4A\n\4\f\4\16"+
		"\4D\13\4\3\4\3\4\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"e\n\7\f\7\16\7h\13\7\5\7j\n\7\3\b\7\bm\n\b\f\b\16\bp\13\b\3\b\7\bs\n\b"+
		"\f\b\16\bv\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f\t\16\t"+
		"\u0083\13\t\5\t\u0085\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0090"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009e\n\n\f\n"+
		"\16\n\u00a1\13\n\3\n\3\n\3\n\3\n\7\n\u00a7\n\n\f\n\16\n\u00aa\13\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b3\n\n\3\13\7\13\u00b6\n\13\f\13\16\13"+
		"\u00b9\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cf\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00eb\n\f\f\f\16\f\u00ee\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u00f5\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0107\n\16\3\17\3\17\3\17\7\17\u010c\n\17\f\17\16\17\u010f"+
		"\13\17\3\17\3\17\7\17\u0113\n\17\f\17\16\17\u0116\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0120\n\20\3\20\6L\u009f\u00a8\u0114\3"+
		"\26\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6\3\2\30\32\4\2\26\26"+
		"\33\33\3\2\34!\3\2\"#\2\u013f\2#\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\bG\3\2"+
		"\2\2\nR\3\2\2\2\fi\3\2\2\2\16n\3\2\2\2\20w\3\2\2\2\22\u00b2\3\2\2\2\24"+
		"\u00b7\3\2\2\2\26\u00ce\3\2\2\2\30\u00f4\3\2\2\2\32\u0106\3\2\2\2\34\u0114"+
		"\3\2\2\2\36\u011f\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$"+
		"\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\5\6\4\2\'(\7\2\2\3(\3\3\2\2\2),\5\n\6"+
		"\2*,\5\b\5\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\7\3\2\2./\7\4\2\2/\60\7"+
		"\5\2\2\60\61\7\6\2\2\61\65\7\7\2\2\62\64\5\b\5\2\63\62\3\2\2\2\64\67\3"+
		"\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66;\3\2\2\2\67\65\3\2\2\28:\5\22\n"+
		"\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<B\3\2\2\2=;\3\2\2\2>A\5\b\5"+
		"\2?A\5\22\n\2@>\3\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2"+
		"\2\2DB\3\2\2\2EF\7\b\2\2F\7\3\2\2\2GL\7)\2\2HI\7\t\2\2IK\7)\2\2JH\3\2"+
		"\2\2KN\3\2\2\2LM\3\2\2\2LJ\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\n\2\2PQ\5\32"+
		"\16\2Q\t\3\2\2\2RS\7\3\2\2ST\7)\2\2TU\7\5\2\2UV\5\f\7\2VW\7\6\2\2WX\7"+
		"\n\2\2XY\5\30\r\2YZ\7\7\2\2Z[\5\16\b\2[\\\7\b\2\2\\\13\3\2\2\2]^\7)\2"+
		"\2^_\7\n\2\2_f\5\32\16\2`a\7\t\2\2ab\7)\2\2bc\7\n\2\2ce\5\32\16\2d`\3"+
		"\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2i]\3\2\2\2ij\3"+
		"\2\2\2j\r\3\2\2\2km\5\b\5\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ot"+
		"\3\2\2\2pn\3\2\2\2qs\5\22\n\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2"+
		"u\17\3\2\2\2vt\3\2\2\2wx\7)\2\2x\u0084\7\5\2\2yz\5\26\f\2z\u0081\b\t\1"+
		"\2{|\7\t\2\2|}\5\26\f\2}~\b\t\1\2~\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084y\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0087\7\6\2\2\u0087\u0088\b\t\1\2\u0088\21\3\2\2\2\u0089\u008a"+
		"\7\13\2\2\u008a\u008b\5\26\f\2\u008b\u008c\7\7\2\2\u008c\u008f\5\24\13"+
		"\2\u008d\u008e\7\f\2\2\u008e\u0090\5\24\13\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\b\2\2\u0092\u00b3\3\2"+
		"\2\2\u0093\u0094\7\r\2\2\u0094\u0095\5\26\f\2\u0095\u0096\7\7\2\2\u0096"+
		"\u0097\5\24\13\2\u0097\u0098\7\b\2\2\u0098\u00b3\3\2\2\2\u0099\u009a\7"+
		"\16\2\2\u009a\u009f\5\26\f\2\u009b\u009c\7\t\2\2\u009c\u009e\5\26\f\2"+
		"\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00b3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\17\2\2"+
		"\u00a3\u00a8\5\26\f\2\u00a4\u00a5\7\t\2\2\u00a5\u00a7\5\26\f\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00b3\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\20\2\2\u00ac\u00b3\5"+
		"\26\f\2\u00ad\u00ae\5\26\f\2\u00ae\u00af\7\21\2\2\u00af\u00b0\5\26\f\2"+
		"\u00b0\u00b3\3\2\2\2\u00b1\u00b3\5\20\t\2\u00b2\u0089\3\2\2\2\u00b2\u0093"+
		"\3\2\2\2\u00b2\u0099\3\2\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2"+
		"\u00ad\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b6\5\22\n"+
		"\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\25\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\b\f\1\2\u00bb"+
		"\u00bc\7\5\2\2\u00bc\u00bd\5\26\f\2\u00bd\u00be\7\6\2\2\u00be\u00cf\3"+
		"\2\2\2\u00bf\u00c0\7\26\2\2\u00c0\u00cf\5\26\f\16\u00c1\u00c2\7\27\2\2"+
		"\u00c2\u00cf\5\26\f\r\u00c3\u00c4\5\20\t\2\u00c4\u00c5\b\f\1\2\u00c5\u00cf"+
		"\3\2\2\2\u00c6\u00c7\7-\2\2\u00c7\u00cf\b\f\1\2\u00c8\u00c9\7,\2\2\u00c9"+
		"\u00cf\b\f\1\2\u00ca\u00cb\7.\2\2\u00cb\u00cf\b\f\1\2\u00cc\u00cd\7)\2"+
		"\2\u00cd\u00cf\b\f\1\2\u00ce\u00ba\3\2\2\2\u00ce\u00bf\3\2\2\2\u00ce\u00c1"+
		"\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce"+
		"\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00ec\3\2\2\2\u00d0\u00d1\f\20"+
		"\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00eb\5\26\f\21\u00d3\u00d4\f\f\2\2\u00d4"+
		"\u00d5\t\2\2\2\u00d5\u00eb\5\26\f\r\u00d6\u00d7\f\13\2\2\u00d7\u00d8\t"+
		"\3\2\2\u00d8\u00eb\5\26\f\f\u00d9\u00da\f\n\2\2\u00da\u00db\t\4\2\2\u00db"+
		"\u00eb\5\26\f\13\u00dc\u00dd\f\t\2\2\u00dd\u00de\t\5\2\2\u00de\u00eb\5"+
		"\26\f\n\u00df\u00e0\f\b\2\2\u00e0\u00e1\7\21\2\2\u00e1\u00eb\5\26\f\t"+
		"\u00e2\u00e3\f\21\2\2\u00e3\u00e4\7\22\2\2\u00e4\u00e5\5\26\f\2\u00e5"+
		"\u00e6\7\23\2\2\u00e6\u00eb\3\2\2\2\u00e7\u00e8\f\17\2\2\u00e8\u00e9\7"+
		"\25\2\2\u00e9\u00eb\5\36\20\2\u00ea\u00d0\3\2\2\2\u00ea\u00d3\3\2\2\2"+
		"\u00ea\u00d6\3\2\2\2\u00ea\u00d9\3\2\2\2\u00ea\u00dc\3\2\2\2\u00ea\u00df"+
		"\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\27\3\2\2\2\u00ee\u00ec\3\2\2"+
		"\2\u00ef\u00f0\5\36\20\2\u00f0\u00f1\b\r\1\2\u00f1\u00f5\3\2\2\2\u00f2"+
		"\u00f3\7$\2\2\u00f3\u00f5\b\r\1\2\u00f4\u00ef\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f5\31\3\2\2\2\u00f6\u00f7\7\22\2\2\u00f7\u00f8\7-\2\2\u00f8\u00f9"+
		"\7\n\2\2\u00f9\u00fa\5\32\16\2\u00fa\u00fb\7\23\2\2\u00fb\u00fc\b\16\1"+
		"\2\u00fc\u0107\3\2\2\2\u00fd\u00fe\7%\2\2\u00fe\u00ff\7\7\2\2\u00ff\u0100"+
		"\5\34\17\2\u0100\u0101\7\b\2\2\u0101\u0102\b\16\1\2\u0102\u0107\3\2\2"+
		"\2\u0103\u0104\5\36\20\2\u0104\u0105\b\16\1\2\u0105\u0107\3\2\2\2\u0106"+
		"\u00f6\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u0103\3\2\2\2\u0107\33\3\2\2"+
		"\2\u0108\u010d\7)\2\2\u0109\u010a\7\t\2\2\u010a\u010c\7)\2\2\u010b\u0109"+
		"\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\n\2\2\u0111\u0113\5\32"+
		"\16\2\u0112\u0108\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0115\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\b\17"+
		"\1\2\u0118\35\3\2\2\2\u0119\u011a\7&\2\2\u011a\u0120\b\20\1\2\u011b\u011c"+
		"\7\'\2\2\u011c\u0120\b\20\1\2\u011d\u011e\7(\2\2\u011e\u0120\b\20\1\2"+
		"\u011f\u0119\3\2\2\2\u011f\u011b\3\2\2\2\u011f\u011d\3\2\2\2\u0120\37"+
		"\3\2\2\2\34#+\65;@BLfint\u0081\u0084\u008f\u009f\u00a8\u00b2\u00b7\u00ce"+
		"\u00ea\u00ec\u00f4\u0106\u010d\u0114\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}