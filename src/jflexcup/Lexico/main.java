package jflexcup.Lexico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alvaro
 */
public class main {

    public static void main(String[] args) {
        System.out.println("Comprobando herramientas de programación");
        generarLexer("C:\\Users\\Hp245-User\\Documents\\NetBeansProjects\\practica1_analizadorLexico\\src\\jflexcup\\Lexico\\archivo.lex");
        //probarLexer_teclado();
        probarLexerFile_archivo("C:\\Users\\Hp245-User\\Documents\\NetBeansProjects\\practica1_analizadorLexico\\src\\jflexcup\\Lexico\\ejemplo.py");
    }
    
    //Este genera la clase Yylex.java, que es el resultado de nuestras
    //expresiones regulares.

    public static void generarLexer(String file) {
        JFlex.Main.generate(new File(file));
    }
    
    //prueba con la entrada estandar del sistema
    public static void probarLexer_teclado() {
        Yylex lex = new Yylex(System.in);
        try {
            while (lex.yylex() != lex.YYEOF) {
                //Hasta que encuentre el ENTER
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //prueba y la entrada esta en el archivo file
    public static void probarLexerFile_archivo(String file) {
        try {
            Yylex lex = new Yylex(new FileReader(file));
            while (lex.yylex() != lex.YYEOF) {
                //Hasta que encuentra el fin de archivo
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
