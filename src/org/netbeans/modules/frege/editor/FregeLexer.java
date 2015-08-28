package org.netbeans.modules.frege.editor;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.netbeans.spi.lexer.LexerRestartInfo;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FregeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, CONSTRUCTOR_ID=2, VARIABLE_ID=3, LETTER=4, INTEGER=5, HEXADECIMAL=6, 
		OCTAL=7, DECIMAL=8, DIGIT=9, HEXIT=10, OCTIT=11, LEFT_CURLY=12, RIGHT_CURLY=13, 
		SEMICOLON=14, LEFT_PAREN=15, RIGHT_PAREN=16, LEFT_BRACKET=17, RIGHT_BRACKET=18, 
		COMMA=19, INFIX_QUOTE=20, VARSYM=21, CONSYM=22, LOWER_CASE=23, UPPER_CASE=24, 
		SYMBOL=25, UNANTICIPATED_SYMBOL=26, AS=27, CASE=28, CLASS=29, DATA=30, 
		DEFAULT=31, DERIVING=32, DO=33, ELSE=34, HIDING=35, FOREIGN=36, IF=37, 
		IMPORT=38, IN=39, INFIX=40, INFIXL=41, INFIXR=42, INSTANCE=43, LET=44, 
		MODULE=45, NEWTYPE=46, OF=47, QUALIFIED=48, THEN=49, TYPE=50, WHERE=51, 
		CONTEXT_ARROW=52, EQUALS=53, ALT=54, OFTYPE=55, WS=56, COMMENT=57, LINE_COMMENT=58, 
		BLOCK_COMMENT=59;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NEWLINE", "CONSTRUCTOR_ID", "VARIABLE_ID", "LETTER", "INTEGER", "HEXADECIMAL", 
		"OCTAL", "DECIMAL", "DIGIT", "HEXIT", "OCTIT", "LEFT_CURLY", "RIGHT_CURLY", 
		"SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"COMMA", "INFIX_QUOTE", "VARSYM", "CONSYM", "LOWER_CASE", "UPPER_CASE", 
		"SYMBOL", "UNANTICIPATED_SYMBOL", "AS", "CASE", "CLASS", "DATA", "DEFAULT", 
		"DERIVING", "DO", "ELSE", "HIDING", "FOREIGN", "IF", "IMPORT", "IN", "INFIX", 
		"INFIXL", "INFIXR", "INSTANCE", "LET", "MODULE", "NEWTYPE", "OF", "QUALIFIED", 
		"THEN", "TYPE", "WHERE", "CONTEXT_ARROW", "EQUALS", "ALT", "OFTYPE", "WS", 
		"COMMENT", "LINE_COMMENT", "BLOCK_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'{'", "'}'", "';'", "'('", "')'", "'['", "']'", "','", "'`'", null, null, 
		null, null, null, null, "'as'", "'case'", "'class'", "'data'", "'default'", 
		"'deriving'", "'do'", "'else'", "'hiding'", "'foreign'", "'if'", "'import'", 
		"'in'", "'infix'", "'infixl'", "'infixr'", "'instance'", "'let'", "'module'", 
		"'newtype'", "'of'", "'qualified'", "'then'", "'type'", "'where'", "'=>'", 
		"'='", "'|'", "'::'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "CONSTRUCTOR_ID", "VARIABLE_ID", "LETTER", "INTEGER", 
		"HEXADECIMAL", "OCTAL", "DECIMAL", "DIGIT", "HEXIT", "OCTIT", "LEFT_CURLY", 
		"RIGHT_CURLY", "SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "COMMA", "INFIX_QUOTE", "VARSYM", "CONSYM", "LOWER_CASE", 
		"UPPER_CASE", "SYMBOL", "UNANTICIPATED_SYMBOL", "AS", "CASE", "CLASS", 
		"DATA", "DEFAULT", "DERIVING", "DO", "ELSE", "HIDING", "FOREIGN", "IF", 
		"IMPORT", "IN", "INFIX", "INFIXL", "INFIXR", "INSTANCE", "LET", "MODULE", 
		"NEWTYPE", "OF", "QUALIFIED", "THEN", "TYPE", "WHERE", "CONTEXT_ARROW", 
		"EQUALS", "ALT", "OFTYPE", "WS", "COMMENT", "LINE_COMMENT", "BLOCK_COMMENT"
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

    public FregeLexer(LexerRestartInfo<FregeTokenId> info) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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


	public FregeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Frege.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u01a7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\5"+
		"\2{\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13\3\3\4"+
		"\3\4\3\4\3\4\7\4\u008c\n\4\f\4\16\4\u008f\13\4\3\5\3\5\5\5\u0093\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u00a6\n\6\3\7\6\7\u00a9\n\7\r\7\16\7\u00aa\3\b\6\b\u00ae\n\b\r\b\16\b"+
		"\u00af\3\t\6\t\u00b3\n\t\r\t\16\t\u00b4\3\n\3\n\3\13\3\13\5\13\u00bb\n"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u00d4\n\26\f\26\16"+
		"\26\u00d7\13\26\3\27\3\27\3\27\7\27\u00dc\n\27\f\27\16\27\u00df\13\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\38\39\69\u0189\n9\r9\169\u018a\39\39\3:\3:\5:\u0191\n:\3;\3;\3"+
		";\3;\7;\u0197\n;\f;\16;\u019a\13;\3<\3<\3<\3<\7<\u01a0\n<\f<\16<\u01a3"+
		"\13<\3<\3<\3<\3\u01a1\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=\3\2\b\4\2CHch\4\2aac|\13\2##%(,-/\61"+
		">B^^``~~\u0080\u0080\5\2\62;C\\c|\5\2\13\f\17\17\"\"\3\2\f\f\u01be\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3z\3\2\2\2\5~\3"+
		"\2\2\2\7\u0087\3\2\2\2\t\u0092\3\2\2\2\13\u00a5\3\2\2\2\r\u00a8\3\2\2"+
		"\2\17\u00ad\3\2\2\2\21\u00b2\3\2\2\2\23\u00b6\3\2\2\2\25\u00ba\3\2\2\2"+
		"\27\u00bc\3\2\2\2\31\u00be\3\2\2\2\33\u00c0\3\2\2\2\35\u00c2\3\2\2\2\37"+
		"\u00c4\3\2\2\2!\u00c6\3\2\2\2#\u00c8\3\2\2\2%\u00ca\3\2\2\2\'\u00cc\3"+
		"\2\2\2)\u00ce\3\2\2\2+\u00d0\3\2\2\2-\u00d8\3\2\2\2/\u00e0\3\2\2\2\61"+
		"\u00e2\3\2\2\2\63\u00e4\3\2\2\2\65\u00e6\3\2\2\2\67\u00e8\3\2\2\29\u00eb"+
		"\3\2\2\2;\u00f0\3\2\2\2=\u00f6\3\2\2\2?\u00fb\3\2\2\2A\u0103\3\2\2\2C"+
		"\u010c\3\2\2\2E\u010f\3\2\2\2G\u0114\3\2\2\2I\u011b\3\2\2\2K\u0123\3\2"+
		"\2\2M\u0126\3\2\2\2O\u012d\3\2\2\2Q\u0130\3\2\2\2S\u0136\3\2\2\2U\u013d"+
		"\3\2\2\2W\u0144\3\2\2\2Y\u014d\3\2\2\2[\u0151\3\2\2\2]\u0158\3\2\2\2_"+
		"\u0160\3\2\2\2a\u0163\3\2\2\2c\u016d\3\2\2\2e\u0172\3\2\2\2g\u0177\3\2"+
		"\2\2i\u017d\3\2\2\2k\u0180\3\2\2\2m\u0182\3\2\2\2o\u0184\3\2\2\2q\u0188"+
		"\3\2\2\2s\u0190\3\2\2\2u\u0192\3\2\2\2w\u019b\3\2\2\2y{\7\17\2\2zy\3\2"+
		"\2\2z{\3\2\2\2{|\3\2\2\2|}\7\f\2\2}\4\3\2\2\2~\u0084\5\61\31\2\177\u0083"+
		"\5\t\5\2\u0080\u0083\5\23\n\2\u0081\u0083\7)\2\2\u0082\177\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\6\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008d"+
		"\5/\30\2\u0088\u008c\5\t\5\2\u0089\u008c\5\23\n\2\u008a\u008c\7)\2\2\u008b"+
		"\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\b\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0093\5\61\31\2\u0091\u0093\5/\30\2\u0092\u0090\3\2\2\2"+
		"\u0092\u0091\3\2\2\2\u0093\n\3\2\2\2\u0094\u00a6\5\21\t\2\u0095\u0096"+
		"\7\62\2\2\u0096\u0097\7q\2\2\u0097\u0098\3\2\2\2\u0098\u00a6\5\17\b\2"+
		"\u0099\u009a\7\62\2\2\u009a\u009b\7Q\2\2\u009b\u009c\3\2\2\2\u009c\u00a6"+
		"\5\17\b\2\u009d\u009e\7\62\2\2\u009e\u009f\7z\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u00a6\5\r\7\2\u00a1\u00a2\7\62\2\2\u00a2\u00a3\7Z\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a6\5\r\7\2\u00a5\u0094\3\2\2\2\u00a5\u0095\3\2\2\2\u00a5"+
		"\u0099\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\f\3\2\2\2"+
		"\u00a7\u00a9\5\25\13\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\16\3\2\2\2\u00ac\u00ae\5\27\f\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\20\3\2\2\2\u00b1\u00b3\5\23\n\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\22\3\2\2\2\u00b6"+
		"\u00b7\4\62;\2\u00b7\24\3\2\2\2\u00b8\u00bb\5\23\n\2\u00b9\u00bb\t\2\2"+
		"\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\26\3\2\2\2\u00bc\u00bd"+
		"\4\629\2\u00bd\30\3\2\2\2\u00be\u00bf\7}\2\2\u00bf\32\3\2\2\2\u00c0\u00c1"+
		"\7\177\2\2\u00c1\34\3\2\2\2\u00c2\u00c3\7=\2\2\u00c3\36\3\2\2\2\u00c4"+
		"\u00c5\7*\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7+\2\2\u00c7\"\3\2\2\2\u00c8"+
		"\u00c9\7]\2\2\u00c9$\3\2\2\2\u00ca\u00cb\7_\2\2\u00cb&\3\2\2\2\u00cc\u00cd"+
		"\7.\2\2\u00cd(\3\2\2\2\u00ce\u00cf\7b\2\2\u00cf*\3\2\2\2\u00d0\u00d5\5"+
		"\63\32\2\u00d1\u00d4\5\63\32\2\u00d2\u00d4\7<\2\2\u00d3\u00d1\3\2\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6,\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00dd\7<\2\2\u00d9\u00dc"+
		"\5\63\32\2\u00da\u00dc\7<\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2"+
		"\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de.\3"+
		"\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\t\3\2\2\u00e1\60\3\2\2\2\u00e2"+
		"\u00e3\4C\\\2\u00e3\62\3\2\2\2\u00e4\u00e5\t\4\2\2\u00e5\64\3\2\2\2\u00e6"+
		"\u00e7\n\5\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7u\2\2"+
		"\u00ea8\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7u\2"+
		"\2\u00ee\u00ef\7g\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7"+
		"n\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7u\2\2\u00f5<"+
		"\3\2\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7v\2\2\u00f9"+
		"\u00fa\7c\2\2\u00fa>\3\2\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7g\2\2\u00fd"+
		"\u00fe\7h\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7w\2\2\u0100\u0101\7n\2\2"+
		"\u0101\u0102\7v\2\2\u0102@\3\2\2\2\u0103\u0104\7f\2\2\u0104\u0105\7g\2"+
		"\2\u0105\u0106\7t\2\2\u0106\u0107\7k\2\2\u0107\u0108\7x\2\2\u0108\u0109"+
		"\7k\2\2\u0109\u010a\7p\2\2\u010a\u010b\7i\2\2\u010bB\3\2\2\2\u010c\u010d"+
		"\7f\2\2\u010d\u010e\7q\2\2\u010eD\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111"+
		"\7n\2\2\u0111\u0112\7u\2\2\u0112\u0113\7g\2\2\u0113F\3\2\2\2\u0114\u0115"+
		"\7j\2\2\u0115\u0116\7k\2\2\u0116\u0117\7f\2\2\u0117\u0118\7k\2\2\u0118"+
		"\u0119\7p\2\2\u0119\u011a\7i\2\2\u011aH\3\2\2\2\u011b\u011c\7h\2\2\u011c"+
		"\u011d\7q\2\2\u011d\u011e\7t\2\2\u011e\u011f\7g\2\2\u011f\u0120\7k\2\2"+
		"\u0120\u0121\7i\2\2\u0121\u0122\7p\2\2\u0122J\3\2\2\2\u0123\u0124\7k\2"+
		"\2\u0124\u0125\7h\2\2\u0125L\3\2\2\2\u0126\u0127\7k\2\2\u0127\u0128\7"+
		"o\2\2\u0128\u0129\7r\2\2\u0129\u012a\7q\2\2\u012a\u012b\7t\2\2\u012b\u012c"+
		"\7v\2\2\u012cN\3\2\2\2\u012d\u012e\7k\2\2\u012e\u012f\7p\2\2\u012fP\3"+
		"\2\2\2\u0130\u0131\7k\2\2\u0131\u0132\7p\2\2\u0132\u0133\7h\2\2\u0133"+
		"\u0134\7k\2\2\u0134\u0135\7z\2\2\u0135R\3\2\2\2\u0136\u0137\7k\2\2\u0137"+
		"\u0138\7p\2\2\u0138\u0139\7h\2\2\u0139\u013a\7k\2\2\u013a\u013b\7z\2\2"+
		"\u013b\u013c\7n\2\2\u013cT\3\2\2\2\u013d\u013e\7k\2\2\u013e\u013f\7p\2"+
		"\2\u013f\u0140\7h\2\2\u0140\u0141\7k\2\2\u0141\u0142\7z\2\2\u0142\u0143"+
		"\7t\2\2\u0143V\3\2\2\2\u0144\u0145\7k\2\2\u0145\u0146\7p\2\2\u0146\u0147"+
		"\7u\2\2\u0147\u0148\7v\2\2\u0148\u0149\7c\2\2\u0149\u014a\7p\2\2\u014a"+
		"\u014b\7e\2\2\u014b\u014c\7g\2\2\u014cX\3\2\2\2\u014d\u014e\7n\2\2\u014e"+
		"\u014f\7g\2\2\u014f\u0150\7v\2\2\u0150Z\3\2\2\2\u0151\u0152\7o\2\2\u0152"+
		"\u0153\7q\2\2\u0153\u0154\7f\2\2\u0154\u0155\7w\2\2\u0155\u0156\7n\2\2"+
		"\u0156\u0157\7g\2\2\u0157\\\3\2\2\2\u0158\u0159\7p\2\2\u0159\u015a\7g"+
		"\2\2\u015a\u015b\7y\2\2\u015b\u015c\7v\2\2\u015c\u015d\7{\2\2\u015d\u015e"+
		"\7r\2\2\u015e\u015f\7g\2\2\u015f^\3\2\2\2\u0160\u0161\7q\2\2\u0161\u0162"+
		"\7h\2\2\u0162`\3\2\2\2\u0163\u0164\7s\2\2\u0164\u0165\7w\2\2\u0165\u0166"+
		"\7c\2\2\u0166\u0167\7n\2\2\u0167\u0168\7k\2\2\u0168\u0169\7h\2\2\u0169"+
		"\u016a\7k\2\2\u016a\u016b\7g\2\2\u016b\u016c\7f\2\2\u016cb\3\2\2\2\u016d"+
		"\u016e\7v\2\2\u016e\u016f\7j\2\2\u016f\u0170\7g\2\2\u0170\u0171\7p\2\2"+
		"\u0171d\3\2\2\2\u0172\u0173\7v\2\2\u0173\u0174\7{\2\2\u0174\u0175\7r\2"+
		"\2\u0175\u0176\7g\2\2\u0176f\3\2\2\2\u0177\u0178\7y\2\2\u0178\u0179\7"+
		"j\2\2\u0179\u017a\7g\2\2\u017a\u017b\7t\2\2\u017b\u017c\7g\2\2\u017ch"+
		"\3\2\2\2\u017d\u017e\7?\2\2\u017e\u017f\7@\2\2\u017fj\3\2\2\2\u0180\u0181"+
		"\7?\2\2\u0181l\3\2\2\2\u0182\u0183\7~\2\2\u0183n\3\2\2\2\u0184\u0185\7"+
		"<\2\2\u0185\u0186\7<\2\2\u0186p\3\2\2\2\u0187\u0189\t\6\2\2\u0188\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\b9\2\2\u018dr\3\2\2\2\u018e\u0191\5u;\2\u018f"+
		"\u0191\5w<\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191t\3\2\2\2\u0192"+
		"\u0193\7/\2\2\u0193\u0194\7/\2\2\u0194\u0198\3\2\2\2\u0195\u0197\n\7\2"+
		"\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199v\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7}\2\2\u019c\u019d"+
		"\7/\2\2\u019d\u01a1\3\2\2\2\u019e\u01a0\13\2\2\2\u019f\u019e\3\2\2\2\u01a0"+
		"\u01a3\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a4\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7/\2\2\u01a5\u01a6\7\177\2\2\u01a6"+
		"x\3\2\2\2\26\2z\u0082\u0084\u008b\u008d\u0092\u00a5\u00aa\u00af\u00b4"+
		"\u00ba\u00d3\u00d5\u00db\u00dd\u018a\u0190\u0198\u01a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}