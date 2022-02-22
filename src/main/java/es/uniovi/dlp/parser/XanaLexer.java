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
		ID=1, COMMENT=2, WS=3, BASIC_TYPE=4, REAL_CONSTANT=5, INT_CONSTANT=6, 
		CHAR_CONSTANT=7, EOL=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'"
	};
	public static final String[] ruleNames = {
		"ID", "COMMENT", "WS", "BASIC_TYPE", "REAL_CONSTANT", "INT_CONSTANT", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u0098\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\5\2\25"+
		"\n\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13"+
		"\3\3\3\3\3\5\3&\n\3\3\3\3\3\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3"+
		"\3\3\3\3\6\3\65\n\3\r\3\16\3\66\3\3\3\3\3\4\6\4<\n\4\r\4\16\4=\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\5\6V\n\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\6\3\6\5\6"+
		"b\n\6\3\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\5\6n\n\6\3\6\3\6\3\6"+
		"\3\6\5\6t\n\6\3\7\6\7w\n\7\r\7\16\7x\3\7\3\7\6\7}\n\7\r\7\16\7~\5\7\u0081"+
		"\n\7\3\b\3\b\7\b\u0085\n\b\f\b\16\b\u0088\13\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u0092\n\b\3\t\6\t\u0095\n\t\r\t\16\t\u0096\5 .\u0086\2\n"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5"+
		"\2\13\f\17\17\"\"\4\2GGgg\3\2\62;\4\2\f\f\17\17\u00ae\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\3\24\3\2\2\2\5\64\3\2\2\2\7;\3\2\2\2\tN\3\2\2\2\13s\3\2"+
		"\2\2\r\u0080\3\2\2\2\17\u0091\3\2\2\2\21\u0094\3\2\2\2\23\25\t\2\2\2\24"+
		"\23\3\2\2\2\25\31\3\2\2\2\26\30\t\3\2\2\27\26\3\2\2\2\30\33\3\2\2\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32\4\3\2\2\2\33\31\3\2\2\2\34 \7%\2\2\35\37"+
		"\13\2\2\2\36\35\3\2\2\2\37\"\3\2\2\2 !\3\2\2\2 \36\3\2\2\2!%\3\2\2\2\""+
		" \3\2\2\2#&\5\21\t\2$&\7\2\2\3%#\3\2\2\2%$\3\2\2\2&\65\3\2\2\2\'(\7$\2"+
		"\2()\7$\2\2)*\7$\2\2*.\3\2\2\2+-\13\2\2\2,+\3\2\2\2-\60\3\2\2\2./\3\2"+
		"\2\2.,\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7$\2\2\62\63\7$\2\2\63\65"+
		"\7$\2\2\64\34\3\2\2\2\64\'\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\678\3\2\2\289\b\3\2\29\6\3\2\2\2:<\t\4\2\2;:\3\2\2\2<=\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\b\4\2\2@\b\3\2\2\2AB\7k\2\2BC\7p\2\2"+
		"CO\7v\2\2DE\7f\2\2EF\7q\2\2FG\7w\2\2GH\7d\2\2HI\7n\2\2IO\7g\2\2JK\7e\2"+
		"\2KL\7j\2\2LM\7c\2\2MO\7t\2\2NA\3\2\2\2ND\3\2\2\2NJ\3\2\2\2O\n\3\2\2\2"+
		"PQ\5\r\7\2QR\7\60\2\2RU\5\r\7\2ST\t\5\2\2TV\5\r\7\2US\3\2\2\2UV\3\2\2"+
		"\2Vt\3\2\2\2WY\5\r\7\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2"+
		"\2\2\\Z\3\2\2\2]^\7\60\2\2^a\5\r\7\2_`\t\5\2\2`b\5\r\7\2a_\3\2\2\2ab\3"+
		"\2\2\2bt\3\2\2\2cd\5\r\7\2dh\7\60\2\2eg\5\r\7\2fe\3\2\2\2gj\3\2\2\2hf"+
		"\3\2\2\2hi\3\2\2\2im\3\2\2\2jh\3\2\2\2kl\t\5\2\2ln\5\r\7\2mk\3\2\2\2m"+
		"n\3\2\2\2nt\3\2\2\2op\5\r\7\2pq\t\5\2\2qr\5\r\7\2rt\3\2\2\2sP\3\2\2\2"+
		"sZ\3\2\2\2sc\3\2\2\2so\3\2\2\2t\f\3\2\2\2uw\t\6\2\2vu\3\2\2\2wx\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y\u0081\3\2\2\2z|\7/\2\2{}\t\6\2\2|{\3\2\2\2}~\3"+
		"\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080v\3\2\2\2\u0080z"+
		"\3\2\2\2\u0081\16\3\2\2\2\u0082\u0086\7)\2\2\u0083\u0085\13\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0092\7)\2\2\u008a"+
		"\u008b\7)\2\2\u008b\u008c\7^\2\2\u008c\u008d\7\"\2\2\u008d\u008e\3\2\2"+
		"\2\u008e\u008f\5\r\7\2\u008f\u0090\7)\2\2\u0090\u0092\3\2\2\2\u0091\u0082"+
		"\3\2\2\2\u0091\u008a\3\2\2\2\u0092\20\3\2\2\2\u0093\u0095\t\7\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\22\3\2\2\2\32\2\24\27\31 %.\64\66;=NUZahmsx~\u0080\u0086\u0091"+
		"\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}