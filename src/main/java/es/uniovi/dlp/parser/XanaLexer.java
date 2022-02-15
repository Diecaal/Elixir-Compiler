// Generated from Xana.g4 by ANTLR 4.3

package es.uniovi.dlp.parser;

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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, COMMENT=2, WS=3, BASIC_TYPE=4, INT_CONSTANT=5, REAL_CONSTANT=6, 
		CHAR_CONSTANT=7, EOL=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'"
	};
	public static final String[] ruleNames = {
		"ID", "COMMENT", "WS", "BASIC_TYPE", "INT_CONSTANT", "REAL_CONSTANT", 
		"CHAR_CONSTANT", "EOL"
	};


	public XanaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u0085\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3#\n\3\f\3"+
		"\16\3&\13\3\3\3\3\3\5\3*\n\3\3\3\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64"+
		"\13\3\3\3\3\3\3\3\6\39\n\3\r\3\16\3:\3\3\3\3\3\4\6\4@\n\4\r\4\16\4A\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5S\n\5\3"+
		"\6\6\6V\n\6\r\6\16\6W\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\7\7\7b\n\7\f\7\16"+
		"\7e\13\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13\7"+
		"\3\7\3\7\5\7w\n\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\t\6\t\u0082\n\t\r"+
		"\t\16\t\u0083\4$\62\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\7\5\2\13"+
		"\f\17\17\"\"\3\2\62;\4\2GGgg\4\2C\\c|\4\2\f\f\17\17\u0097\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\3\23\3\2\2\2\58\3\2\2\2\7?\3\2\2\2\tR\3\2\2\2\13U\3"+
		"\2\2\2\r|\3\2\2\2\17~\3\2\2\2\21\u0081\3\2\2\2\23\30\5\17\b\2\24\25\7"+
		".\2\2\25\27\5\17\b\2\26\24\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3"+
		"\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7<\2\2\34\35\7<\2\2\35\36\3\2"+
		"\2\2\36\37\5\t\5\2\37\4\3\2\2\2 $\7%\2\2!#\13\2\2\2\"!\3\2\2\2#&\3\2\2"+
		"\2$%\3\2\2\2$\"\3\2\2\2%)\3\2\2\2&$\3\2\2\2\'*\5\21\t\2(*\7\2\2\3)\'\3"+
		"\2\2\2)(\3\2\2\2*9\3\2\2\2+,\7$\2\2,-\7$\2\2-.\7$\2\2.\62\3\2\2\2/\61"+
		"\13\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\63\3\2\2\2\62\60\3\2\2\2\63\65"+
		"\3\2\2\2\64\62\3\2\2\2\65\66\7$\2\2\66\67\7$\2\2\679\7$\2\28 \3\2\2\2"+
		"8+\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\b\3\2\2=\6\3\2\2"+
		"\2>@\t\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\b\4\2"+
		"\2D\b\3\2\2\2EF\7k\2\2FG\7p\2\2GS\7v\2\2HI\7f\2\2IJ\7q\2\2JK\7w\2\2KL"+
		"\7d\2\2LM\7n\2\2MS\7g\2\2NO\7e\2\2OP\7j\2\2PQ\7c\2\2QS\7t\2\2RE\3\2\2"+
		"\2RH\3\2\2\2RN\3\2\2\2S\n\3\2\2\2TV\t\3\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2"+
		"\2\2WX\3\2\2\2X\f\3\2\2\2YZ\5\13\6\2Z[\7\60\2\2[^\5\13\6\2\\]\t\4\2\2"+
		"]_\5\13\6\2^\\\3\2\2\2^_\3\2\2\2_}\3\2\2\2`b\5\13\6\2a`\3\2\2\2be\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\60\2\2gj\5\13\6\2hi\t"+
		"\4\2\2ik\5\13\6\2jh\3\2\2\2jk\3\2\2\2k}\3\2\2\2lm\5\13\6\2mq\7\60\2\2"+
		"np\5\13\6\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rv\3\2\2\2sq\3\2\2"+
		"\2tu\t\4\2\2uw\5\13\6\2vt\3\2\2\2vw\3\2\2\2w}\3\2\2\2xy\5\13\6\2yz\t\4"+
		"\2\2z{\5\13\6\2{}\3\2\2\2|Y\3\2\2\2|c\3\2\2\2|l\3\2\2\2|x\3\2\2\2}\16"+
		"\3\2\2\2~\177\t\5\2\2\177\20\3\2\2\2\u0080\u0082\t\6\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\22\3\2\2\2\24\2\30$)\628:?ARW^cjqv|\u0083\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}