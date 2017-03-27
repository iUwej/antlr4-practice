// Generated from XMLLexer.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, COMMENT=2, EntityRef=3, TEXT=4, CLOSE=5, SLASH_CLOSE=6, EQUALS=7, 
		STRING=8, SlashName=9, Name=10;
	public static final int INSIDE = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	public static final String[] ruleNames = {
		"OPEN", "COMMENT", "EntityRef", "TEXT", "CLOSE", "SLASH_CLOSE", "EQUALS", 
		"STRING", "SlashName", "Name", "ALPHA", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", null, null, null, "'>'", "'/>'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN", "COMMENT", "EntityRef", "TEXT", "CLOSE", "SLASH_CLOSE", 
		"EQUALS", "STRING", "SlashName", "Name"
	};
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


	public XMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XMLLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fa\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\'\n"+
		"\3\f\3\16\3*\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4\64\n\4\r\4\16\4"+
		"\65\3\4\3\4\3\5\6\5;\n\5\r\5\16\5<\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\7\13Y\n\13\f\13\16\13\\\13\13\3\f\3\f\3\r\3\r\4(M\2\16\4\3\6\4\b"+
		"\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\2\32\2\4\2\3\6\3\2c|\4\2((>>\4"+
		"\2C\\c|\3\2\62;c\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\3\f\3"+
		"\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2"+
		"\2\4\34\3\2\2\2\6 \3\2\2\2\b\61\3\2\2\2\n:\3\2\2\2\f>\3\2\2\2\16B\3\2"+
		"\2\2\20G\3\2\2\2\22I\3\2\2\2\24R\3\2\2\2\26U\3\2\2\2\30]\3\2\2\2\32_\3"+
		"\2\2\2\34\35\7>\2\2\35\36\3\2\2\2\36\37\b\2\2\2\37\5\3\2\2\2 !\7>\2\2"+
		"!\"\7#\2\2\"#\7/\2\2#$\7/\2\2$(\3\2\2\2%\'\13\2\2\2&%\3\2\2\2\'*\3\2\2"+
		"\2()\3\2\2\2(&\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7/\2\2,-\7/\2\2-.\7@\2\2"+
		"./\3\2\2\2/\60\b\3\3\2\60\7\3\2\2\2\61\63\7(\2\2\62\64\t\2\2\2\63\62\3"+
		"\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7="+
		"\2\28\t\3\2\2\29;\n\3\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\13"+
		"\3\2\2\2>?\7@\2\2?@\3\2\2\2@A\b\6\4\2A\r\3\2\2\2BC\7\61\2\2CD\7@\2\2D"+
		"E\3\2\2\2EF\b\7\4\2F\17\3\2\2\2GH\7?\2\2H\21\3\2\2\2IM\7$\2\2JL\13\2\2"+
		"\2KJ\3\2\2\2LO\3\2\2\2MN\3\2\2\2MK\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7$\2"+
		"\2Q\23\3\2\2\2RS\7\61\2\2ST\5\26\13\2T\25\3\2\2\2UZ\5\30\f\2VY\5\30\f"+
		"\2WY\5\32\r\2XV\3\2\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\27\3"+
		"\2\2\2\\Z\3\2\2\2]^\t\4\2\2^\31\3\2\2\2_`\t\5\2\2`\33\3\2\2\2\n\2\3(\65"+
		"<MXZ\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}