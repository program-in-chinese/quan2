grammar 圈2;
程序   : '开始' 声明+ '结束';
          
声明 : 赋值 | 加 | 打印 ;

赋值    : '赋值' 标识符 '成为' (T数 | 标识符) ;
打印     : '打印' (T数 | 标识符) ;
加       : '累加' (T数 | 标识符) '作用' 标识符 ;
标识符    : T标识符字符+ ;

T标识符字符     : 'a' .. 'z' | 'A' .. 'Z' | '\u4E00'..'\u9FA5' | '\uF900'..'\uFA2D' ;
T数 : [0-9]+ ;
T空白     : [ \n\t]+ -> skip;