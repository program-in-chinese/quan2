// Generated from 圈2.g4 by ANTLR 4.7
package com.program_in_chinese;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link 圈2Parser}.
 */
public interface 圈2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link 圈2Parser#程序}.
	 * @param ctx the parse tree
	 */
	void enter程序(圈2Parser.程序Context ctx);
	/**
	 * Exit a parse tree produced by {@link 圈2Parser#程序}.
	 * @param ctx the parse tree
	 */
	void exit程序(圈2Parser.程序Context ctx);
	/**
	 * Enter a parse tree produced by {@link 圈2Parser#声明}.
	 * @param ctx the parse tree
	 */
	void enter声明(圈2Parser.声明Context ctx);
	/**
	 * Exit a parse tree produced by {@link 圈2Parser#声明}.
	 * @param ctx the parse tree
	 */
	void exit声明(圈2Parser.声明Context ctx);
	/**
	 * Enter a parse tree produced by {@link 圈2Parser#赋值}.
	 * @param ctx the parse tree
	 */
	void enter赋值(圈2Parser.赋值Context ctx);
	/**
	 * Exit a parse tree produced by {@link 圈2Parser#赋值}.
	 * @param ctx the parse tree
	 */
	void exit赋值(圈2Parser.赋值Context ctx);
	/**
	 * Enter a parse tree produced by {@link 圈2Parser#打印}.
	 * @param ctx the parse tree
	 */
	void enter打印(圈2Parser.打印Context ctx);
	/**
	 * Exit a parse tree produced by {@link 圈2Parser#打印}.
	 * @param ctx the parse tree
	 */
	void exit打印(圈2Parser.打印Context ctx);
	/**
	 * Enter a parse tree produced by {@link 圈2Parser#加}.
	 * @param ctx the parse tree
	 */
	void enter加(圈2Parser.加Context ctx);
	/**
	 * Exit a parse tree produced by {@link 圈2Parser#加}.
	 * @param ctx the parse tree
	 */
	void exit加(圈2Parser.加Context ctx);
}