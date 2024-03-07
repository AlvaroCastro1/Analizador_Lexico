package jflexcup.Lexico;

import java.io.*;

%%
// %class Lexer
%int
%unicode
// %cup
%line
%column

%{
    public static void main(String[] args){
        Yylex analizadorLexico = new Yylex(new InputStreamReader(System.in));
        try {
            analizadorLexico.yylex();
        } catch(IOException x) {
            System.out.println("Error en la línea " + analizadorLexico.yyline +
                               " columna " + analizadorLexico.yycolumn);
        }
    }
%}

terminadorLinea = \r|\n|\r\n
espacioBlanco = {terminadorLinea} | [ \t\f]
tipo = "int" | "char" | "float" | "double" | "void" | "long" | "short" 
ASIGNACION_COMPUESTA = "+=" | "-=" | "*=" | "/=" | "%=" | "&=" | "|=" | "^=" | "<<="
identificador = [:jletter:][:jletterdigit:]*

%state STRING

%%

<YYINITIAL>"IF" {
    System.out.println("<IF, " + yytext() + ">");
}

<YYINITIAL>{
    [0-9]+(\.[0-9]+)? { System.out.println("<NUMERO, " + yytext() + ">"); }
    "printf(" { System.out.println("<SALIDA, " + yytext() + ">"); }
    "read(" { System.out.println("<ENTRADA, " + yytext() + ">"); }
    {identificador}\( { System.out.println("<Funcion, " + yytext() + ">"); }
    {ASIGNACION_COMPUESTA} { System.out.println("<ASIGNACION_COMPUESTA, " + yytext() + ">"); }
    "?" { System.out.println("<EXPRESION_CONDICIONAL, " + yytext() + ">"); }
    "=" { System.out.println("<ASIGNACION_SIMPLE, " + yytext() + ">"); }
    "+" { System.out.println("<suma, " + yytext() + ">"); }
    "-" { System.out.println("<menos, " + yytext() + ">"); }
    "*" { System.out.println("<multiplicacion, " + yytext() + ">"); }
    "/" { System.out.println("<division, " + yytext() + ">"); }
    "%" { System.out.println("<modulo, " + yytext() + ">"); }
    ";" { System.out.println("<fin, " + yytext() + ">"); }
    "==" { System.out.println("<IGUALDAD, " + yytext() + ">"); }
    "!=" { System.out.println("<DISTINTO, " + yytext() + ">"); }
    "<" { System.out.println("<MENOR_QUE, " + yytext() + ">"); }
    ">" { System.out.println("<MAYOR_QUE, " + yytext() + ">"); }
    "<=" { System.out.println("<MENOR_O_IGUAL_QUE, " + yytext() + ">"); }
    ">=" { System.out.println("<MAYOR_O_IGUAL_QUE, " + yytext() + ">"); }
    "&&" { System.out.println("<Y_LOGICO, " + yytext() + ">"); }
    "||" { System.out.println("<O_LOGICO, " + yytext() + ">"); }
    "!" { System.out.println("<NEGACION, " + yytext() + ">"); }

    "if" { System.out.println("<IF, " + yytext() + ">"); }
    "else" { System.out.println("<ELSE, " + yytext() + ">"); }

    "switch" { System.out.println("<SWITCH, " + yytext() + ">"); }
    "case" { System.out.println("<CASE, " + yytext() + ">"); }
    "default" { System.out.println("<DEFAULT, " + yytext() + ">"); }

    "while" { System.out.println("<WHILE, " + yytext() + ">"); }

    "do" { System.out.println("<DO, " + yytext() + ">"); }
    "while" { System.out.println("<WHILE, " + yytext() + ">"); }

    "++" { System.out.println("<AUTO_INCREMENTO, " + yytext() + ">"); }
    "--" { System.out.println("<AUTO_DECREMENTO, " + yytext() + ">"); }


    // Regla para Sentencia repetitiva (for)
    "for" { System.out.println("<FOR, " + yytext() + ">"); }
    {identificador}"[" { System.out.println("<VECTOR, " + yytext() + ">"); }
    \"[^\"]*\" { System.out.println("<CADENA, " + yytext() + ">"); }
    {espacioBlanco} { /* Ignorar */; }
    {tipo} { System.out.println("<TIPO, " + yytext() + ">"); }
    {identificador} { System.out.println("<ID, " + yytext() + ">"); }
    "//".* { /* Ignorar comentarios de una línea */; }
    "/*".*"*/" { /* Ignorar comentarios de varias líneas */; }
    "/*"([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+"/" { /* Ignorar comentarios de varias líneas */; }
    \"[^\"\n]*\" { System.out.println("<CADENA_doble, " + yytext() + ">"); }
    [\"']([^\"'\n])*[\"'] { System.out.println("<CADENA_simple, " + yytext() + ">"); }
    "[" { System.out.println("<CORCHETE_ABRE, " + yytext() + ">"); }
    "]" { System.out.println("<CORCHETE_CIERRA, " + yytext() + ">"); }
    "{" { System.out.println("<LLAVE_ABRE, " + yytext() + ">"); }
    "}" { System.out.println("<LLAVE_CIERRA, " + yytext() + ">"); }
    "(" { System.out.println("<PARENTESIS_ABRE, " + yytext() + ">"); }
    ")" { System.out.println("<PARENTESIS_CIERRA, " + yytext() + ">"); }

}


.|\n { System.out.println("<ANY, " + yytext() + ">"); }