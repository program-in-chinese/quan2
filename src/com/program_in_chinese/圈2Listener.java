// Generated from 圈2.g4 by ANTLR 4.7
package com.program_in_chinese;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link 圈2Parser}.
 */
public interface 圈2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link 圈2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(圈2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link 圈2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(圈2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link 圈2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(圈2Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link 圈2Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(圈2Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link 圈2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(圈2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link 圈2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(圈2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link 圈2Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(圈2Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link 圈2Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(圈2Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link 圈2Parser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(圈2Parser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link 圈2Parser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(圈2Parser.AddContext ctx);
}