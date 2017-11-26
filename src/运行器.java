import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.program_in_chinese.MyListener;
import com.program_in_chinese.圈2Lexer;
import com.program_in_chinese.圈2Parser;


public class 运行器 {
  public static void main(String[] args) {
    try {
        ANTLRInputStream input = new ANTLRInputStream(
            new FileInputStream(args[0]));    

        圈2Lexer lexer = new 圈2Lexer(input);
        圈2Parser parser = new 圈2Parser(new CommonTokenStream(lexer));
        parser.addParseListener(new MyListener());

        // Start parsing
        parser.program(); 
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
