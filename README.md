代码源自: http://progur.com/2016/09/how-to-create-language-using-antlr4.html

为Eclipse项目. 如有问题请提issue.

修改`圈2.g4`后, 需重新生成词法语法分析器(Lexer, Parser):
在`src/com/program_in_chinese`下运行:
```
java -cp "../../../lib/antlr-4.7-complete.jar:$CLASSPATH" org.antlr.v4.Tool -package com.program_in_chinese 圈2.g4
```
