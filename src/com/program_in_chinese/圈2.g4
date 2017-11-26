grammar 圈2;
程序   : '开始' 声明+ '结束';
          
声明 : 赋值 | 加 | 打印 ;

赋值    : '使' ID '为' (NUMBER | ID) ;
打印     : '打印' (NUMBER | ID) ;
加       : '加' (NUMBER | ID) '到' ID ;

ID     : [a-z]+ ;
NUMBER : [0-9]+ ;
WS     : [ \n\t]+ -> skip;