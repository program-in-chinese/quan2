// Generated from 圈2.g4 by ANTLR 4.7
package com.program_in_chinese;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class 圈2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, NUMBER=9, 
		WS=10;
	public static final int
		RULE_程序 = 0, RULE_声明 = 1, RULE_赋值 = 2, RULE_打印 = 3, RULE_加 = 4;
	public static final String[] ruleNames = {
		"程序", "声明", "赋值", "打印", "加"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u5F00\u59CB'", "'\u7ED3\u675F'", "'\u4F7F'", "'\u4E3A'", "'\u6253\u5370'", 
		"'\u52A0'", "'\u5230'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ID", "NUMBER", "WS"
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

	@Override
	public String getGrammarFileName() { return "圈2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public 圈2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class 程序Context extends ParserRuleContext {
		public List<声明Context> 声明() {
			return getRuleContexts(声明Context.class);
		}
		public 声明Context 声明(int i) {
			return getRuleContext(声明Context.class,i);
		}
		public 程序Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_程序; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof 圈2Listener ) ((圈2Listener)listener).enter程序(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof 圈2Listener ) ((圈2Listener)listener).exit程序(this);
		}
	}

	public final 程序Context 程序() throws RecognitionException {
		程序Context _localctx = new 程序Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_程序);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11);
				声明();
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5))) != 0) );
			setState(16);
			match(T__1);
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

	public static class 声明Context extends ParserRuleContext {
		public 赋值Context 赋值() {
			return getRuleContext(赋值Context.class,0);
		}
		public 加Context 加() {
			return getRuleContext(加Context.class,0);
		}
		public 打印Context 打印() {
			return getRuleContext(打印Context.class,0);
		}
		public 声明Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_声明; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof 圈2Listener ) ((圈2Listener)listener).enter声明(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof 圈2Listener ) ((圈2Listener)listener).exit声明(this);
		}
	}

	public final 声明Context 声明() throws RecognitionException {
		声明Context _localctx = new 声明Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_声明);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				赋值();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				加();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				打印();
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

	public static class 赋值Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(圈2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(圈2Parser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(圈2Parser.NUMBER, 0); }
		public 赋值Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_赋值; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof 圈2Listener ) ((圈2Listener)listener).enter赋值(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof 圈2Listener ) ((圈2Listener)listener).exit赋值(this);
		}
	}

	public final 赋值Context 赋值() throws RecognitionException {
		赋值Context _localctx = new 赋值Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_赋值);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__2);
			setState(24);
			match(ID);
			setState(25);
			match(T__3);
			setState(26);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class 打印Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(圈2Parser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(圈2Parser.ID, 0); }
		public 打印Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_打印; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof 圈2Listener ) ((圈2Listener)listener).enter打印(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof 圈2Listener ) ((圈2Listener)listener).exit打印(this);
		}
	}

	public final 打印Context 打印() throws RecognitionException {
		打印Context _localctx = new 打印Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_打印);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__4);
			setState(29);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class 加Context extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(圈2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(圈2Parser.ID, i);
		}
		public TerminalNode NUMBER() { return getToken(圈2Parser.NUMBER, 0); }
		public 加Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_加; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof 圈2Listener ) ((圈2Listener)listener).enter加(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof 圈2Listener ) ((圈2Listener)listener).exit加(this);
		}
	}

	public final 加Context 加() throws RecognitionException {
		加Context _localctx = new 加Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_加);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__5);
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(33);
			match(T__6);
			setState(34);
			match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\'\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\3\3"+
		"\3\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\n\13\2$\2\f\3\2\2\2\4\27\3\2\2\2\6\31\3"+
		"\2\2\2\b\36\3\2\2\2\n!\3\2\2\2\f\16\7\3\2\2\r\17\5\4\3\2\16\r\3\2\2\2"+
		"\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\22\3\2\2\2\22\23\7\4\2\2"+
		"\23\3\3\2\2\2\24\30\5\6\4\2\25\30\5\n\6\2\26\30\5\b\5\2\27\24\3\2\2\2"+
		"\27\25\3\2\2\2\27\26\3\2\2\2\30\5\3\2\2\2\31\32\7\5\2\2\32\33\7\n\2\2"+
		"\33\34\7\6\2\2\34\35\t\2\2\2\35\7\3\2\2\2\36\37\7\7\2\2\37 \t\2\2\2 \t"+
		"\3\2\2\2!\"\7\b\2\2\"#\t\2\2\2#$\7\t\2\2$%\7\n\2\2%\13\3\2\2\2\4\20\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}