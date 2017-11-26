grammar 圈2;
程序   : 'begin' 声明+ 'end';
          
声明 : 赋值 | 加 | 打印 ;

赋值    : 'let' ID 'be' (NUMBER | ID) ;
打印     : 'print' (NUMBER | ID) ;
加       : 'add' (NUMBER | ID) 'to' ID ;

ID     : [a-z]+ ;
NUMBER : [0-9]+ ;
WS     : [ \n\t]+ -> skip;