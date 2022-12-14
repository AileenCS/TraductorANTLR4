// Generated from MyGramatica.g4 by ANTLR 4.7.2
package aileen.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INICIO=4, PROGRAMA=5, FLOTANTE=6, MAS=7, MENOS=8, 
		POR=9, DIV=10, IGUAL=11, ENTERO=12, FLOAT=13, CADENA=14, POW=15, PA=16, 
		PC=17, MAYOR=18, MENOR=19, MAYOR_IGUAL=20, IF=21, ELSE=22, MENOR_IGUAL=23, 
		IGUALIGUAL=24, DIFERENTE=25, LA=26, LC=27, ID=28, INT=29, SEMI=30, FLOATANTE=31, 
		FOR=32, TRUE=33, FALSE=34, SALTO=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "INICIO", "PROGRAMA", "FLOTANTE", "MAS", "MENOS", 
			"POR", "DIV", "IGUAL", "ENTERO", "FLOAT", "CADENA", "POW", "PA", "PC", 
			"MAYOR", "MENOR", "MAYOR_IGUAL", "IF", "ELSE", "MENOR_IGUAL", "IGUALIGUAL", 
			"DIFERENTE", "LA", "LC", "ID", "INT", "SEMI", "FLOATANTE", "FOR", "TRUE", 
			"FALSE", "SALTO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'printf'", "'++'", "'--'", "'inicio'", "'programa'", null, "'+'", 
			"'-'", "'*'", "'/'", "'='", "'int'", "'float'", null, "'^'", "'('", "')'", 
			"'>'", "'<'", "'>='", "'if'", "'else'", "'<='", "'=='", "'!='", "'{'", 
			"'}'", null, null, "';'", null, "'for'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INICIO", "PROGRAMA", "FLOTANTE", "MAS", "MENOS", 
			"POR", "DIV", "IGUAL", "ENTERO", "FLOAT", "CADENA", "POW", "PA", "PC", 
			"MAYOR", "MENOR", "MAYOR_IGUAL", "IF", "ELSE", "MENOR_IGUAL", "IGUALIGUAL", 
			"DIFERENTE", "LA", "LC", "ID", "INT", "SEMI", "FLOATANTE", "FOR", "TRUE", 
			"FALSE", "SALTO"
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


	public MyGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00ef\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\6\7h\n\7\r\7\16\7i\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3\7\3\7\6\7u\n"+
		"\7\r\7\16\7v\5\7y\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17\u0091\n\17\f\17"+
		"\16\17\u0094\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u00bb"+
		"\n\35\r\35\16\35\u00bc\3\36\6\36\u00c0\n\36\r\36\16\36\u00c1\3\37\3\37"+
		"\3 \6 \u00c7\n \r \16 \u00c8\3 \3 \7 \u00cd\n \f \16 \u00d0\13 \3 \3 "+
		"\6 \u00d4\n \r \16 \u00d5\5 \u00d8\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3$\6$\u00ea\n$\r$\16$\u00eb\3$\3$\2\2%\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%\3\2\6\3\2\62;\5\2\f\f\17\17$$\4\2C\\c|\5\2\13\f\17\17\"\"\2\u00fa\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\3I\3\2\2\2\5P\3\2\2\2\7S\3\2\2\2\tV\3\2\2\2\13]\3\2\2\2\rx\3\2\2\2\17"+
		"z\3\2\2\2\21|\3\2\2\2\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3\2\2\2\31"+
		"\u0084\3\2\2\2\33\u0088\3\2\2\2\35\u008e\3\2\2\2\37\u0097\3\2\2\2!\u0099"+
		"\3\2\2\2#\u009b\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2"+
		"+\u00a4\3\2\2\2-\u00a7\3\2\2\2/\u00ac\3\2\2\2\61\u00af\3\2\2\2\63\u00b2"+
		"\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00ba\3\2\2\2;\u00bf\3\2\2"+
		"\2=\u00c3\3\2\2\2?\u00d7\3\2\2\2A\u00d9\3\2\2\2C\u00dd\3\2\2\2E\u00e2"+
		"\3\2\2\2G\u00e9\3\2\2\2IJ\7r\2\2JK\7t\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2N"+
		"O\7h\2\2O\4\3\2\2\2PQ\7-\2\2QR\7-\2\2R\6\3\2\2\2ST\7/\2\2TU\7/\2\2U\b"+
		"\3\2\2\2VW\7k\2\2WX\7p\2\2XY\7k\2\2YZ\7e\2\2Z[\7k\2\2[\\\7q\2\2\\\n\3"+
		"\2\2\2]^\7r\2\2^_\7t\2\2_`\7q\2\2`a\7i\2\2ab\7t\2\2bc\7c\2\2cd\7o\2\2"+
		"de\7c\2\2e\f\3\2\2\2fh\t\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"jk\3\2\2\2ko\7\60\2\2ln\t\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2py\3\2\2\2qo\3\2\2\2rt\7\60\2\2su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wy\3\2\2\2xg\3\2\2\2xr\3\2\2\2y\16\3\2\2\2z{\7-\2\2{\20"+
		"\3\2\2\2|}\7/\2\2}\22\3\2\2\2~\177\7,\2\2\177\24\3\2\2\2\u0080\u0081\7"+
		"\61\2\2\u0081\26\3\2\2\2\u0082\u0083\7?\2\2\u0083\30\3\2\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087\7v\2\2\u0087\32\3\2\2\2\u0088\u0089"+
		"\7h\2\2\u0089\u008a\7n\2\2\u008a\u008b\7q\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7v\2\2\u008d\34\3\2\2\2\u008e\u0092\7$\2\2\u008f\u0091\n\3\2\2"+
		"\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7$\2\2\u0096"+
		"\36\3\2\2\2\u0097\u0098\7`\2\2\u0098 \3\2\2\2\u0099\u009a\7*\2\2\u009a"+
		"\"\3\2\2\2\u009b\u009c\7+\2\2\u009c$\3\2\2\2\u009d\u009e\7@\2\2\u009e"+
		"&\3\2\2\2\u009f\u00a0\7>\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2\u00a3"+
		"\7?\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7h\2\2\u00a6,\3"+
		"\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7?\2\2\u00ae"+
		"\60\3\2\2\2\u00af\u00b0\7?\2\2\u00b0\u00b1\7?\2\2\u00b1\62\3\2\2\2\u00b2"+
		"\u00b3\7#\2\2\u00b3\u00b4\7?\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7}\2\2\u00b6"+
		"\66\3\2\2\2\u00b7\u00b8\7\177\2\2\u00b88\3\2\2\2\u00b9\u00bb\t\4\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd:\3\2\2\2\u00be\u00c0\t\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2<\3\2\2\2\u00c3"+
		"\u00c4\7=\2\2\u00c4>\3\2\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00ce\7\60\2\2\u00cb\u00cd\t\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d8\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\7\60\2\2\u00d2\u00d4\t\2\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00c6\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d8"+
		"@\3\2\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7t\2\2\u00dc"+
		"B\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7w\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7c\2\2\u00e4"+
		"\u00e5\7n\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7F\3\2\2\2\u00e8"+
		"\u00ea\t\5\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b$\2\2\u00ee"+
		"H\3\2\2\2\17\2iovx\u0092\u00bc\u00c1\u00c8\u00ce\u00d5\u00d7\u00eb\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}