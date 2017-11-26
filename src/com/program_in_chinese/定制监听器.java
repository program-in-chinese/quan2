package com.program_in_chinese;

import static com.program_in_chinese.圈2Parser.加Context;
import static com.program_in_chinese.圈2Parser.赋值Context;
import static com.program_in_chinese.圈2Parser.打印Context;

import java.util.HashMap;
import java.util.Map;

public class 定制监听器 extends 圈2BaseListener {

  private Map<String, Integer> 变量表;

  public 定制监听器() {
    变量表 = new HashMap<>();
  }

  @Override
  public void exit赋值(赋值Context 上下文) {
    // 赋值语句分析结束时运行此方法

    String 变量名 = 上下文.T标识符(0).getText();

    // 取变量或数的值
    String 值 = 上下文.T标识符().size() > 1 ? 上下文.T标识符(1).getText() : 上下文.T数().getText();

    // 更新变量值
    if (上下文.T标识符().size() > 1)
      变量表.put(变量名, 变量表.get(值));
    else
      变量表.put(变量名, Integer.parseInt(值));
  }

  @Override
  public void exit加(加Context 上下文) {
    // 加语句分析结束时运行此方法

    String 变量名 = 上下文.T标识符().size() > 1 ? 上下文.T标识符(1).getText() : 上下文.T标识符(0).getText();
    int 值 = 上下文.T标识符().size() > 1 ? 变量表.get(上下文.T标识符(0).getText())
        : Integer.parseInt(上下文.T数().getText());

    变量表.put(变量名, 变量表.get(变量名) + 值);
  }

  @Override
  public void exit打印(打印Context 上下文) {
    // 打印语句分析结束时运行此方法

    String 输出 = 上下文.T标识符() == null ? 上下文.T数().getText() : 变量表.get(上下文.T标识符().getText()).toString();
    System.out.println(输出);
  }

}
