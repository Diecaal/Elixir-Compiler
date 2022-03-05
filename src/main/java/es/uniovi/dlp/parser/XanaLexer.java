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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XanaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "ID", "COMMENT", "WS", "REAL_CONSTANT", 
			"INT_CONSTANT", "CHAR_CONSTANT", "EOL"
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


	public XanaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u016e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"(\5(\u00e1\n(\3(\7(\u00e4\n(\f(\16(\u00e7\13(\3)\3)\7)\u00eb\n)\f)\16"+
		")\u00ee\13)\3)\3)\5)\u00f2\n)\3)\3)\3)\3)\3)\7)\u00f9\n)\f)\16)\u00fc"+
		"\13)\3)\3)\3)\6)\u0101\n)\r)\16)\u0102\3)\3)\3*\6*\u0108\n*\r*\16*\u0109"+
		"\3*\3*\3+\5+\u010f\n+\3+\3+\3+\5+\u0114\n+\3+\3+\3+\5+\u0119\n+\3+\5+"+
		"\u011c\n+\3+\5+\u011f\n+\3+\7+\u0122\n+\f+\16+\u0125\13+\3+\3+\5+\u0129"+
		"\n+\3+\3+\3+\5+\u012e\n+\3+\5+\u0131\n+\3+\5+\u0134\n+\3+\3+\3+\5+\u0139"+
		"\n+\3+\7+\u013c\n+\f+\16+\u013f\13+\3+\3+\5+\u0143\n+\3+\5+\u0146\n+\3"+
		"+\5+\u0149\n+\3+\3+\3+\5+\u014e\n+\3+\3+\5+\u0152\n+\3,\6,\u0155\n,\r"+
		",\16,\u0156\3-\3-\7-\u015b\n-\f-\16-\u015e\13-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\5-\u0168\n-\3.\6.\u016b\n.\r.\16.\u016c\5\u00ec\u00fa\u015c\2/\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\4\2GGgg\3\2\62;\4\2\f\f\17\17\2\u018b\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7b\3\2\2\2\tf\3\2\2\2\13h\3"+
		"\2\2\2\rj\3\2\2\2\17m\3\2\2\2\21q\3\2\2\2\23v\3\2\2\2\25{\3\2\2\2\27~"+
		"\3\2\2\2\31\u0083\3\2\2\2\33\u0089\3\2\2\2\35\u008e\3\2\2\2\37\u0091\3"+
		"\2\2\2!\u0098\3\2\2\2#\u009a\3\2\2\2%\u009c\3\2\2\2\'\u009e\3\2\2\2)\u00a0"+
		"\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61\u00a9\3\2\2\2"+
		"\63\u00ab\3\2\2\2\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b1\3\2\2\2;\u00b4"+
		"\3\2\2\2=\u00b6\3\2\2\2?\u00b9\3\2\2\2A\u00bc\3\2\2\2C\u00bf\3\2\2\2E"+
		"\u00c2\3\2\2\2G\u00c5\3\2\2\2I\u00cf\3\2\2\2K\u00d3\3\2\2\2M\u00da\3\2"+
		"\2\2O\u00e0\3\2\2\2Q\u0100\3\2\2\2S\u0107\3\2\2\2U\u0151\3\2\2\2W\u0154"+
		"\3\2\2\2Y\u0167\3\2\2\2[\u016a\3\2\2\2]^\7.\2\2^\4\3\2\2\2_`\7<\2\2`a"+
		"\7<\2\2a\6\3\2\2\2bc\7f\2\2cd\7g\2\2de\7h\2\2e\b\3\2\2\2fg\7*\2\2g\n\3"+
		"\2\2\2hi\7+\2\2i\f\3\2\2\2jk\7f\2\2kl\7q\2\2l\16\3\2\2\2mn\7g\2\2no\7"+
		"p\2\2op\7f\2\2p\20\3\2\2\2qr\7x\2\2rs\7q\2\2st\7k\2\2tu\7f\2\2u\22\3\2"+
		"\2\2vw\7o\2\2wx\7c\2\2xy\7k\2\2yz\7p\2\2z\24\3\2\2\2{|\7k\2\2|}\7h\2\2"+
		"}\26\3\2\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082"+
		"\7g\2\2\u0082\30\3\2\2\2\u0083\u0084\7y\2\2\u0084\u0085\7j\2\2\u0085\u0086"+
		"\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\32\3\2\2\2\u0089\u008a"+
		"\7r\2\2\u008a\u008b\7w\2\2\u008b\u008c\7v\2\2\u008c\u008d\7u\2\2\u008d"+
		"\34\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\36\3\2\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093\u0094\7v\2\2\u0094\u0095\7w\2\2"+
		"\u0095\u0096\7t\2\2\u0096\u0097\7p\2\2\u0097 \3\2\2\2\u0098\u0099\7?\2"+
		"\2\u0099\"\3\2\2\2\u009a\u009b\7]\2\2\u009b$\3\2\2\2\u009c\u009d\7_\2"+
		"\2\u009d&\3\2\2\2\u009e\u009f\7\60\2\2\u009f(\3\2\2\2\u00a0\u00a1\7c\2"+
		"\2\u00a1\u00a2\7u\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4,\3\2\2\2"+
		"\u00a5\u00a6\7#\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8\60\3\2\2\2"+
		"\u00a9\u00aa\7\61\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac\64\3"+
		"\2\2\2\u00ad\u00ae\7-\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7@\2\2\u00b08\3"+
		"\2\2\2\u00b1\u00b2\7@\2\2\u00b2\u00b3\7?\2\2\u00b3:\3\2\2\2\u00b4\u00b5"+
		"\7>\2\2\u00b5<\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8\7?\2\2\u00b8>\3"+
		"\2\2\2\u00b9\u00ba\7#\2\2\u00ba\u00bb\7?\2\2\u00bb@\3\2\2\2\u00bc\u00bd"+
		"\7?\2\2\u00bd\u00be\7?\2\2\u00beB\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0\u00c1"+
		"\7(\2\2\u00c1D\3\2\2\2\u00c2\u00c3\7~\2\2\u00c3\u00c4\7~\2\2\u00c4F\3"+
		"\2\2\2\u00c5\u00c6\7f\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7h\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7w\2\2"+
		"\u00cc\u00cd\7e\2\2\u00cd\u00ce\7v\2\2\u00ceH\3\2\2\2\u00cf\u00d0\7k\2"+
		"\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7v\2\2\u00d2J\3\2\2\2\u00d3\u00d4\7"+
		"f\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7d\2\2\u00d7\u00d8"+
		"\7n\2\2\u00d8\u00d9\7g\2\2\u00d9L\3\2\2\2\u00da\u00db\7e\2\2\u00db\u00dc"+
		"\7j\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7t\2\2\u00deN\3\2\2\2\u00df\u00e1"+
		"\t\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e4\t\3\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6P\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ec\7%\2\2\u00e9\u00eb"+
		"\13\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2"+
		"\5[.\2\u00f0\u00f2\7\2\2\3\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u0101\3\2\2\2\u00f3\u00f4\7$\2\2\u00f4\u00f5\7$\2\2\u00f5\u00f6\7$\2"+
		"\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7$\2\2\u00fe\u00ff\7$\2\2\u00ff\u0101"+
		"\7$\2\2\u0100\u00e8\3\2\2\2\u0100\u00f3\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b)"+
		"\2\2\u0105R\3\2\2\2\u0106\u0108\t\4\2\2\u0107\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\b*\2\2\u010cT\3\2\2\2\u010d\u010f\7/\2\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5W,\2\u0111\u0113\7\60"+
		"\2\2\u0112\u0114\7/\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u011b\5W,\2\u0116\u0118\t\5\2\2\u0117\u0119\7/\2"+
		"\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c"+
		"\5W,\2\u011b\u0116\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0152\3\2\2\2\u011d"+
		"\u011f\7/\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0123\3\2"+
		"\2\2\u0120\u0122\5W,\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0128\7\60\2\2\u0127\u0129\7/\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u0130\5W,\2\u012b\u012d\t\5\2\2\u012c\u012e"+
		"\7/\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\5W,\2\u0130\u012b\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0152\3\2\2"+
		"\2\u0132\u0134\7/\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0136\5W,\2\u0136\u0138\7\60\2\2\u0137\u0139\7/\2\2\u0138"+
		"\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013d\3\2\2\2\u013a\u013c\5W"+
		",\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0145\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\t\5"+
		"\2\2\u0141\u0143\7/\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0146\5W,\2\u0145\u0140\3\2\2\2\u0145\u0146\3\2\2"+
		"\2\u0146\u0152\3\2\2\2\u0147\u0149\7/\2\2\u0148\u0147\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\5W,\2\u014b\u014d\t\5\2\2\u014c"+
		"\u014e\7/\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0150\5W,\2\u0150\u0152\3\2\2\2\u0151\u010e\3\2\2\2\u0151\u011e"+
		"\3\2\2\2\u0151\u0133\3\2\2\2\u0151\u0148\3\2\2\2\u0152V\3\2\2\2\u0153"+
		"\u0155\t\6\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157X\3\2\2\2\u0158\u015c\7)\2\2\u0159\u015b"+
		"\13\2\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015d\3\2\2\2"+
		"\u015c\u015a\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0168"+
		"\7)\2\2\u0160\u0161\7)\2\2\u0161\u0162\7^\2\2\u0162\u0163\7\"\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\5W,\2\u0165\u0166\7)\2\2\u0166\u0168\3\2\2"+
		"\2\u0167\u0158\3\2\2\2\u0167\u0160\3\2\2\2\u0168Z\3\2\2\2\u0169\u016b"+
		"\t\7\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\\\3\2\2\2\"\2\u00e0\u00e3\u00e5\u00ec\u00f1\u00fa"+
		"\u0100\u0102\u0107\u0109\u010e\u0113\u0118\u011b\u011e\u0123\u0128\u012d"+
		"\u0130\u0133\u0138\u013d\u0142\u0145\u0148\u014d\u0151\u0156\u015c\u0167"+
		"\u016c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}