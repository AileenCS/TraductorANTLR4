grammar Calculadora;

inicio:contenido;
contenido: '#include <stdio.h>' VOID MAIN PA PC LA accion*;

declaracion: type  ID  SEMI             #declaraciones;
asing: ID IGUAL expr SEMI               #asings;
asingmasdeclara: type ID '=' expr SEMI  #asigdeclaracion;
type: ENTERO | FLOAT  ;

imprime: 'printf' PA expr*  PC  SEMI;
impr2: 'printf' PA CADENA PC SEMI;

 accion:
             asing
            |  declaracion
            |  asingmasdeclara
            |  condicionif
            |  c_else
            |  c_elseif
            |  imprime
            | impr2
             ;


 expr:
                expr   POW  expr                          #potencia
                |expr op=(POR|DIV) expr                   #multDiv
                |expr op=(MAS|MENOS) expr                 #masMenos
                |(INT|FLOTANTE)                           #nums
        //      | (TRUE | FALSE)                          #booleanAtom
                |ID                                       #id
                |
                PA expr PC                                #parentesiss
                ;

contenido_exp:
            expr condicional =(MAYOR|MENOR) expr                            #mayormenor
             |expr condicional =(MAYOR_IGUAL|MENOR_IGUAL)  expr              #mayorigualmenorigual
             |expr condicional =(IGUALIGUAL|DIFERENTE)  expr                #igualdif

          ;


condition_block
 : expr stat_block
 ;

stat_block
 : PA contenido PC
 |  accion;


 condicion: ( contenido_exp   |  condicion_logical );
 //ntenido_llaves  : '{' contenido* '}' ;

condicionif: IF PA  condicion* PC  LA  accion* LC c_elseif* c_else? ;
 c_else: ELSE LA accion*  LC;
 c_elseif: ELSE IF PA  condicion* PC LA accion* LC;


 condicion_logical:
              TRUE                                                           #true
             |FALSE                                                          #false
             ;

 //| // condicion_logical );

//if_stat
// : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 //

forCondition
	:  FOR PA asingmasdeclara LA accion*
;
TRUE: 'true';
FALSE: 'false';
VOID: 'void';
MAIN: 'main';


MAS 	: '+';
MENOS  	: '-';
POR 	: '*';
DIV 	: '/';
IGUAL   : '=';



AND: '&';
OR : '|';
ANDAND : '&&';
OROR : '||';
MAYOR   : '>';
MENOR   : '<';
MAYOR_IGUAL: '>=';
MENOR_IGUAL: '<=';


ENTERO 	:'int';
FLOTANTE: [0-9]+ '.' [0-9]* | '.' [0-9]+;
FLOAT 	:'float';
FLOATANTE: [0-9]+ '.' [0-9]*  | '.' [0-9]+;
POW     : '^'  ;

IF		:'if';
PA      :'(';
PC      :')';
LA      :'{';
LC      :'}';
SEMI       : ';';

ELSE    :'else';
FOR: 'for';
//WHILE: 'while';
ID 		   :[a-zA-Z]+;
INT 	   :[0-9]+;
CADENA  : '"' ~["\r\n]* '"';
IGUALIGUAL: '==';
DIFERENTE: '!=';

 SALTO: [ \t\r\n] + -> skip;