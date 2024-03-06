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

%state STRING

%%

<YYINITIAL>"IF" {
    System.out.println("<IF, " + yytext() + ">");
}

<YYINITIAL>"IF" {
    System.out.println("<IF, " + yytext() + ">");
}

<YYINITIAL>{
    ":=" { System.out.println("<asignar, " + yytext() + ">"); }
    "+" { System.out.println("<suma, " + yytext() + ">"); }
    "-" { System.out.println("<menos, " + yytext() + ">"); }
    "*" { System.out.println("<multiplicacion, " + yytext() + ">"); }
    "/" { System.out.println("<division, " + yytext() + ">"); }
    ";" { System.out.println("<fin, " + yytext() + ">"); }
    {espacioBlanco} { /* Ignorar */; }
    [:jletter:][:jletterdigit:]* { System.out.println("<ID, " + yytext() + ">"); }
}

<STRING>{
    [^\n\"\\] { System.out.println("<STRING, " + yytext() + ">"); }
    \n { System.out.println("Una cadena no puede acabar en \\n"); }
    \\(.|\n) { System.out.println("<ESCAPE_SEQUENCE, " + yytext() + ">"); }
    \" { yybegin(YYINITIAL); }
}

.|\n { System.out.println("<ANY, " + yytext() + ">"); }