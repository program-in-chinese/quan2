import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.program_in_chinese.定制监听器;
import com.program_in_chinese.圈2Lexer;
import com.program_in_chinese.圈2Parser;

public class 运行器 {
  public static void main(String[] 参数) {
    try {
      ANTLRInputStream 输入 = new ANTLRInputStream(new FileInputStream(参数[0]));

      圈2Lexer 词法分析器 = new 圈2Lexer(输入);
      圈2Parser 语法分析器 = new 圈2Parser(new CommonTokenStream(词法分析器));
      语法分析器.addParseListener(new 定制监听器());

      // 开始分析
      语法分析器.程序();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
