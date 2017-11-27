// Generated from 圈2.g4 by ANTLR 4.7
package com.program_in_chinese;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class 圈2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T标识符字符=8, T数=9, 
		T空白=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T标识符字符", "T数", 
		"T空白"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u5F00\u59CB'", "'\u7ED3\u675F'", "'\u4F7F'", "'\u4E3A'", "'\u6253\u5370'", 
		"'\u52A0'", "'\u5230'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "T\u0001\u0002\u0003\u0004\u0005", 
		"T\u0001", "T\u0001\u0002"
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


	public 圈2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "圈2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\66\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\6\n,\n\n\r\n\16\n-\3\13\6\13\61\n\13\r\13\16\13\62\3"+
		"\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\5\6\2"+
		"C\\c|\u4e02\u9fa7\uf902\ufa2f\3\2\62;\4\2\13\f\"\"\2\67\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\32\3\2\2\2\7"+
		"\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2\2\r$\3\2\2\2\17&\3\2\2\2\21(\3\2\2"+
		"\2\23+\3\2\2\2\25\60\3\2\2\2\27\30\7\u5f02\2\2\30\31\7\u59cd\2\2\31\4"+
		"\3\2\2\2\32\33\7\u7ed5\2\2\33\34\7\u6761\2\2\34\6\3\2\2\2\35\36\7\u4f81"+
		"\2\2\36\b\3\2\2\2\37 \7\u4e3c\2\2 \n\3\2\2\2!\"\7\u6255\2\2\"#\7\u5372"+
		"\2\2#\f\3\2\2\2$%\7\u52a2\2\2%\16\3\2\2\2&\'\7\u5232\2\2\'\20\3\2\2\2"+
		"()\t\2\2\2)\22\3\2\2\2*,\t\3\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2"+
		"\2.\24\3\2\2\2/\61\t\4\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\64\3\2\2\2\64\65\b\13\2\2\65\26\3\2\2\2\5\2-\62\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}