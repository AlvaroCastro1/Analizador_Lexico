/* The following code was generated by JFlex 1.4.3 on 06/03/24, 11:55 */

package jflexcup.Lexico;

import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 06/03/24, 11:55 from the specification file
 * <tt>C:/Users/Hp245-User/Documents/NetBeansProjects/Analizador_Lexico/src/jflexcup/Lexico/archivo.lex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\16\1\3\1\2\1\0\1\3\1\1\16\16\4\0\1\3\1\0"+
    "\1\17\1\0\1\15\5\0\1\12\1\10\1\0\1\11\1\0\1\13"+
    "\12\16\1\6\1\14\1\0\1\7\3\0\5\15\1\5\2\15\1\4"+
    "\21\15\1\0\1\20\2\0\1\15\1\0\32\15\4\0\41\16\2\0"+
    "\4\15\4\0\1\15\2\0\1\16\7\0\1\15\4\0\1\15\5\0"+
    "\27\15\1\0\37\15\1\0\u01ca\15\4\0\14\15\16\0\5\15\7\0"+
    "\1\15\1\0\1\15\21\0\160\16\5\15\1\0\2\15\2\0\4\15"+
    "\1\0\1\15\6\0\1\15\1\0\3\15\1\0\1\15\1\0\24\15"+
    "\1\0\123\15\1\0\213\15\1\0\5\16\2\0\246\15\1\0\46\15"+
    "\2\0\1\15\6\0\51\15\6\0\1\15\1\0\55\16\1\0\1\16"+
    "\1\0\2\16\1\0\2\16\1\0\1\16\10\0\33\15\4\0\4\15"+
    "\15\0\6\16\5\0\1\15\4\0\13\16\1\0\1\16\3\0\53\15"+
    "\37\16\4\0\2\15\1\16\143\15\1\0\1\15\10\16\1\0\6\16"+
    "\2\15\2\16\1\0\4\16\2\15\12\16\3\15\2\0\1\15\17\0"+
    "\1\16\1\15\1\16\36\15\33\16\2\0\131\15\13\16\1\15\16\0"+
    "\12\16\41\15\11\16\2\15\4\0\1\15\2\0\1\16\30\15\4\16"+
    "\1\15\11\16\1\15\3\16\1\15\5\16\22\0\31\15\3\16\4\0"+
    "\13\15\5\0\30\15\1\0\6\15\1\0\2\16\6\0\10\16\52\15"+
    "\72\16\66\15\3\16\1\15\22\16\1\15\7\16\12\15\2\16\2\0"+
    "\12\16\1\0\20\15\3\16\1\0\10\15\2\0\2\15\2\0\26\15"+
    "\1\0\7\15\1\0\1\15\3\0\4\15\2\0\1\16\1\15\7\16"+
    "\2\0\2\16\2\0\3\16\1\15\10\0\1\16\4\0\2\15\1\0"+
    "\3\15\2\16\2\0\12\16\4\15\7\0\2\15\1\0\1\16\2\0"+
    "\3\16\1\0\6\15\4\0\2\15\2\0\26\15\1\0\7\15\1\0"+
    "\2\15\1\0\2\15\1\0\2\15\2\0\1\16\1\0\5\16\4\0"+
    "\2\16\2\0\3\16\3\0\1\16\7\0\4\15\1\0\1\15\7\0"+
    "\14\16\3\15\1\16\13\0\3\16\1\0\11\15\1\0\3\15\1\0"+
    "\26\15\1\0\7\15\1\0\2\15\1\0\5\15\2\0\1\16\1\15"+
    "\10\16\1\0\3\16\1\0\3\16\2\0\1\15\17\0\2\15\2\16"+
    "\2\0\12\16\1\0\1\15\7\0\1\15\6\16\1\0\3\16\1\0"+
    "\10\15\2\0\2\15\2\0\26\15\1\0\7\15\1\0\2\15\1\0"+
    "\5\15\2\0\1\16\1\15\7\16\2\0\2\16\2\0\3\16\7\0"+
    "\3\16\4\0\2\15\1\0\3\15\2\16\2\0\12\16\1\0\1\15"+
    "\20\0\1\16\1\15\1\0\6\15\3\0\3\15\1\0\4\15\3\0"+
    "\2\15\1\0\1\15\1\0\2\15\3\0\2\15\3\0\3\15\3\0"+
    "\14\15\4\0\5\16\3\0\3\16\1\0\4\16\2\0\1\15\6\0"+
    "\1\16\16\0\12\16\11\0\1\15\6\0\5\16\10\15\1\0\3\15"+
    "\1\0\27\15\1\0\20\15\2\0\1\16\1\15\7\16\1\0\3\16"+
    "\1\0\4\16\7\0\2\16\1\0\3\15\2\0\1\15\2\0\2\15"+
    "\2\16\2\0\12\16\20\0\1\15\3\16\1\0\10\15\1\0\3\15"+
    "\1\0\27\15\1\0\12\15\1\0\5\15\2\0\1\16\1\15\7\16"+
    "\1\0\3\16\1\0\4\16\7\0\2\16\6\0\2\15\1\0\2\15"+
    "\2\16\2\0\12\16\1\0\2\15\15\0\4\16\11\15\1\0\3\15"+
    "\1\0\51\15\2\16\1\15\7\16\1\0\3\16\1\0\4\16\1\15"+
    "\5\0\3\15\1\16\7\0\3\15\2\16\2\0\12\16\12\0\6\15"+
    "\1\0\3\16\1\0\22\15\3\0\30\15\1\0\11\15\1\0\1\15"+
    "\2\0\7\15\3\0\1\16\4\0\6\16\1\0\1\16\1\0\10\16"+
    "\6\0\12\16\2\0\2\16\15\0\60\15\1\16\2\15\7\16\4\0"+
    "\10\15\10\16\1\0\12\16\47\0\2\15\1\0\1\15\1\0\5\15"+
    "\1\0\30\15\1\0\1\15\1\0\12\15\1\16\2\15\11\16\1\15"+
    "\2\0\5\15\1\0\1\15\1\0\6\16\2\0\12\16\2\0\4\15"+
    "\40\0\1\15\27\0\2\16\6\0\12\16\13\0\1\16\1\0\1\16"+
    "\1\0\1\16\4\0\2\16\10\15\1\0\44\15\4\0\24\16\1\0"+
    "\2\16\5\15\13\16\1\0\44\16\11\0\1\16\71\0\53\15\24\16"+
    "\1\15\12\16\6\0\6\15\4\16\4\15\3\16\1\15\3\16\2\15"+
    "\7\16\3\15\4\16\15\15\14\16\1\15\17\16\2\0\46\15\1\0"+
    "\1\15\5\0\1\15\2\0\53\15\1\0\u014d\15\1\0\4\15\2\0"+
    "\7\15\1\0\1\15\1\0\4\15\2\0\51\15\1\0\4\15\2\0"+
    "\41\15\1\0\4\15\2\0\7\15\1\0\1\15\1\0\4\15\2\0"+
    "\17\15\1\0\71\15\1\0\4\15\2\0\103\15\2\0\3\16\40\0"+
    "\20\15\20\0\126\15\2\0\6\15\3\0\u026c\15\2\0\21\15\1\0"+
    "\32\15\5\0\113\15\3\0\13\15\7\0\22\15\4\16\11\0\23\15"+
    "\3\16\13\0\22\15\2\16\14\0\15\15\1\0\3\15\1\0\2\16"+
    "\14\0\64\15\40\16\3\0\1\15\3\0\2\15\1\16\2\0\12\16"+
    "\41\0\17\16\6\0\131\15\7\0\5\15\2\16\42\15\1\16\1\15"+
    "\5\0\106\15\12\0\37\15\1\0\14\16\4\0\14\16\12\0\12\16"+
    "\36\15\2\0\5\15\13\0\54\15\4\0\32\15\6\0\12\16\46\0"+
    "\27\15\5\16\4\0\65\15\12\16\1\0\35\16\2\0\13\16\6\0"+
    "\12\16\15\0\1\15\10\0\16\16\1\0\20\16\61\0\5\16\57\15"+
    "\21\16\10\15\3\0\12\16\21\0\11\16\14\0\3\16\36\15\15\16"+
    "\2\15\12\16\54\15\16\16\14\0\44\15\24\16\10\0\12\16\3\0"+
    "\3\15\12\16\44\15\2\0\11\15\7\0\53\15\2\0\3\15\20\0"+
    "\3\16\1\0\25\16\4\15\1\16\6\15\1\16\2\15\3\16\1\15"+
    "\5\0\300\15\100\16\u0116\15\2\0\6\15\2\0\46\15\2\0\6\15"+
    "\2\0\10\15\1\0\1\15\1\0\1\15\1\0\1\15\1\0\37\15"+
    "\2\0\65\15\1\0\7\15\1\0\1\15\3\0\3\15\1\0\7\15"+
    "\3\0\4\15\2\0\6\15\4\0\15\15\5\0\3\15\1\0\7\15"+
    "\16\0\5\16\32\0\5\16\20\0\2\15\23\0\1\15\13\0\5\16"+
    "\1\0\12\16\1\0\1\15\15\0\1\15\20\0\15\15\3\0\41\15"+
    "\17\0\15\16\4\0\1\16\3\0\14\16\21\0\1\15\4\0\1\15"+
    "\2\0\12\15\1\0\1\15\3\0\5\15\6\0\1\15\1\0\1\15"+
    "\1\0\1\15\1\0\4\15\1\0\13\15\2\0\4\15\5\0\5\15"+
    "\4\0\1\15\21\0\51\15\u0a77\0\345\15\6\0\4\15\3\16\2\15"+
    "\14\0\46\15\1\0\1\15\5\0\1\15\2\0\70\15\7\0\1\15"+
    "\17\0\1\16\27\15\11\0\7\15\1\0\7\15\1\0\7\15\1\0"+
    "\7\15\1\0\7\15\1\0\7\15\1\0\7\15\1\0\7\15\1\0"+
    "\40\16\57\0\1\15\u01d5\0\3\15\31\0\11\15\6\16\1\0\5\15"+
    "\2\0\5\15\4\0\126\15\2\0\2\16\2\0\3\15\1\0\132\15"+
    "\1\0\4\15\5\0\53\15\1\0\136\15\21\0\40\15\60\0\20\15"+
    "\u0200\0\u19c0\15\100\0\u568d\15\103\0\56\15\2\0\u010d\15\3\0\20\15"+
    "\12\16\2\15\24\0\57\15\1\16\4\0\12\16\1\0\37\15\2\16"+
    "\120\15\2\16\45\0\11\15\2\0\147\15\2\0\100\15\5\0\2\15"+
    "\1\0\1\15\1\0\5\15\30\0\20\15\1\16\3\15\1\16\4\15"+
    "\1\16\27\15\5\16\4\0\1\16\13\0\1\15\7\0\64\15\14\0"+
    "\2\16\62\15\22\16\12\0\12\16\6\0\22\16\6\15\3\0\1\15"+
    "\1\0\2\15\13\16\34\15\10\16\2\0\27\15\15\16\14\0\35\15"+
    "\3\0\4\16\57\15\16\16\16\0\1\15\12\16\6\0\5\15\1\16"+
    "\12\15\12\16\5\15\1\0\51\15\16\16\11\0\3\15\1\16\10\15"+
    "\2\16\2\0\12\16\6\0\27\15\3\0\1\15\3\16\62\15\1\16"+
    "\1\15\3\16\2\15\2\16\5\15\2\16\1\15\1\16\1\15\30\0"+
    "\3\15\2\0\13\15\5\16\2\0\3\15\2\16\12\0\6\15\2\0"+
    "\6\15\2\0\6\15\11\0\7\15\1\0\7\15\1\0\53\15\1\0"+
    "\16\15\6\0\163\15\10\16\1\0\2\16\2\0\12\16\6\0\u2ba4\15"+
    "\14\0\27\15\4\0\61\15\u2104\0\u016e\15\2\0\152\15\46\0\7\15"+
    "\14\0\5\15\5\0\1\15\1\16\12\15\1\0\15\15\1\0\5\15"+
    "\1\0\1\15\1\0\2\15\1\0\2\15\1\0\154\15\41\0\u016b\15"+
    "\22\0\100\15\2\0\66\15\50\0\15\15\3\0\20\16\20\0\20\16"+
    "\3\0\2\15\30\0\3\15\31\0\1\15\6\0\5\15\1\0\207\15"+
    "\2\0\1\16\4\0\1\15\13\0\12\16\7\0\32\15\4\0\1\15"+
    "\1\0\32\15\13\0\131\15\3\0\6\15\2\0\6\15\2\0\6\15"+
    "\2\0\3\15\3\0\2\15\3\0\2\15\22\0\3\16\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\2\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\1\1\14\1\15"+
    "\1\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[20];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\21\0\42\0\63\0\42\0\104\0\125\0\146"+
    "\0\42\0\42\0\42\0\42\0\42\0\42\0\42\0\42"+
    "\0\167\0\125\0\42\0\42";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[20];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\3\1\11"+
    "\1\12\1\13\1\14\1\15\1\7\3\3\2\16\1\17"+
    "\14\16\1\20\1\21\23\0\1\5\22\0\1\7\1\22"+
    "\7\0\2\7\6\0\2\7\7\0\2\7\11\0\1\23"+
    "\11\0\21\24";

  private static int [] zzUnpackTrans() {
    int [] result = new int[136];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\3\1\10\11\2\1\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[20];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public static void main(String[] args){
        Yylex analizadorLexico = new Yylex(new InputStreamReader(System.in));
        try {
            analizadorLexico.yylex();
        } catch(IOException x) {
            System.out.println("Error en la línea " + analizadorLexico.yyline +
                               " columna " + analizadorLexico.yycolumn);
        }
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2218) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { System.out.println("<ANY, " + yytext() + ">");
          }
        case 15: break;
        case 7: 
          { System.out.println("<division, " + yytext() + ">");
          }
        case 16: break;
        case 14: 
          { System.out.println("<ESCAPE_SEQUENCE, " + yytext() + ">");
          }
        case 17: break;
        case 10: 
          { System.out.println("Una cadena no puede acabar en \\n");
          }
        case 18: break;
        case 2: 
          { /* Ignorar */;
          }
        case 19: break;
        case 8: 
          { System.out.println("<fin, " + yytext() + ">");
          }
        case 20: break;
        case 9: 
          { System.out.println("<STRING, " + yytext() + ">");
          }
        case 21: break;
        case 5: 
          { System.out.println("<menos, " + yytext() + ">");
          }
        case 22: break;
        case 12: 
          { System.out.println("<IF, " + yytext() + ">");
          }
        case 23: break;
        case 6: 
          { System.out.println("<multiplicacion, " + yytext() + ">");
          }
        case 24: break;
        case 11: 
          { yybegin(YYINITIAL);
          }
        case 25: break;
        case 13: 
          { System.out.println("<asignar, " + yytext() + ">");
          }
        case 26: break;
        case 4: 
          { System.out.println("<suma, " + yytext() + ">");
          }
        case 27: break;
        case 3: 
          { System.out.println("<ID, " + yytext() + ">");
          }
        case 28: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
