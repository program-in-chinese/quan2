介绍文章: [编程语言试验之Antlr4+Java实现"圈2"](https://zhuanlan.zhihu.com/p/31429800)

代码源自: http://progur.com/2016/09/how-to-create-language-using-antlr4.html

为Eclipse项目. 如有问题请提issue.

经测试的[演示代码](https://github.com/program-in-chinese/quan2/blob/master/%E6%B5%8B%E8%AF%95/%E5%9F%BA%E6%9C%AC.%E5%9C%882):
```
开始
    使 甲 为 5
    使 乙 为 10
    加 3 到 乙
    加 乙 到 甲
    加 甲 到 乙
    打印 乙
    打印 3
结束
```

修改`圈2.g4`后, 需重新生成词法语法分析器(Lexer, Parser):
在`src/com/program_in_chinese`下运行:
```
java -cp "../../../lib/antlr-4.7-complete.jar:$CLASSPATH" org.antlr.v4.Tool -package com.program_in_chinese 圈2.g4
```
