
grammar MyGramatica;
 calculadora:contenido;
 contenido:INICIO PROGRAMA PA PC LA accion* LC;

 declaracion: type  ID  SEMI             #declaraciones;
 asing: ID IGUAL expr SEMI               #asings;
 asingmasdeclara: type ID '=' expr SEMI  #asigdeclaracion;
 type: ENTERO | FLOAT ;

imprime: 'printf' PA expr*  PC  SEMI;
impr2: 'printf' PA CADENA PC SEMI;

  accion:
              asing
             |  declaracion
             |  asingmasdeclara
             |  condicionif
             |  imprime
             | impr2
              ;



  expr:
               expr   POW  expr                          #potencia
               |expr op=(POR|DIV) expr                   #multDiv
               |expr op=(MAS|MENOS) expr                 #masMenos
               |(INT|FLOTANTE)                           #nums
               |ID                                       #id
               |
               PA expr PC                                #parentesiss
               ;
 unaryExpression
     :
     ('++' |  '--');

contenido_exp:
            expr condicional =(MAYOR|MENOR) expr                            #mayormenor
             |expr condicional =(MAYOR_IGUAL|MENOR_IGUAL)  expr              #mayorigualmenorigual
             |expr condicional =(IGUALIGUAL|DIFERENTE)  expr                #igualdif
              |TRUE     #true
              |FALSE   #false
;

condicion_logical:

expr logic = ANDAND expr #ands
| expr logic= OROR  expr   #ors
;

 condicion: (expr contenido_exp expr  | expr condicion_logical expr);
 //ntenido_llaves  : '{' contenido* '}' ;

 condicionif: IF PA condicion* PC LA  accion* LC c_elseif*? c_else? ;
 c_else: ELSE LA accion*  LC;
 c_elseif: ELSE IF PA condicion*  PC LA accion* LC;


 forCondition
 	:  FOR PA declaracion LA accion*
 ;

 INICIO: 'inicio';
 PROGRAMA: 'programa';
 FLOTANTE: [0-9]+ '.' [0-9]* | '.' [0-9]+;
 MAS 	: '+';
 MENOS  	: '-';
 POR 	: '*';
 DIV 	: '/';
 IGUAL   : '=';
 ENTERO 	:'int';
 FLOAT 	:'float';
 CADENA  : '"' ~["\r\n]* '"';
 POW     : '^'  ;
 PA      :'(';
 PC      :')';
 MAYOR   : '>';
 MENOR   : '<';
 MAYOR_IGUAL: '>=';
 IF		:'if';
 ELSE    :'else';
 //WHILE: 'while';
 MENOR_IGUAL: '<=';
 IGUALIGUAL: '==';
 DIFERENTE: '!=';
 LA         :'{';
 LC          :'}';
 ID 		   :[a-zA-Z]+;
 INT 	   :[0-9]+;
 SEMI       : ';';

 FOR: 'for';
 TRUE: 'true';
 FALSE: 'false';
 SALTO: [ \t\r\n] + -> skip;