/* The following code was generated by JFlex 1.4.3 on 10/17/12 8:46 PM */

package mini;
import compiler.*;
import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/17/12 8:46 PM from the specification file
 * <tt>Mini.jflex</tt>
 */
public class MiniLexer extends Phase implements MiniTokens {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\2\1\10\1\7\1\0\1\10\1\6\16\2\4\0\1\10\1\3"+
    "\1\3\1\3\1\1\1\3\1\25\1\3\1\3\1\3\1\5\1\3"+
    "\1\3\1\3\1\3\1\4\1\12\1\15\1\16\1\20\1\13\1\21"+
    "\1\17\1\22\1\14\1\11\1\3\1\3\1\24\1\3\1\23\1\3"+
    "\1\3\32\1\1\3\1\0\1\3\1\3\1\1\1\0\1\35\1\31"+
    "\1\1\1\36\1\34\1\43\1\1\1\42\1\26\2\1\1\33\1\1"+
    "\1\27\1\32\1\45\1\1\1\46\1\44\1\30\1\37\1\40\1\41"+
    "\3\1\1\3\1\3\1\3\1\3\41\2\2\0\4\1\4\0\1\1"+
    "\2\0\1\2\7\0\1\1\4\0\1\1\5\0\27\1\1\0\37\1"+
    "\1\0\u01ca\1\4\0\14\1\16\0\5\1\7\0\1\1\1\0\1\1"+
    "\21\0\160\2\5\1\1\0\2\1\2\0\4\1\10\0\1\1\1\0"+
    "\3\1\1\0\1\1\1\0\24\1\1\0\123\1\1\0\213\1\1\0"+
    "\5\2\2\0\236\1\11\0\46\1\2\0\1\1\7\0\47\1\11\0"+
    "\55\2\1\0\1\2\1\0\2\2\1\0\2\2\1\0\1\2\10\0"+
    "\33\1\5\0\3\1\15\0\4\2\7\0\1\1\4\0\13\2\5\0"+
    "\53\1\37\2\4\0\2\1\1\2\143\1\1\0\1\1\10\2\1\0"+
    "\6\2\2\1\2\2\1\0\4\2\2\1\12\2\3\1\2\0\1\1"+
    "\17\0\1\2\1\1\1\2\36\1\33\2\2\0\131\1\13\2\1\1"+
    "\16\0\12\2\41\1\11\2\2\1\4\0\1\1\5\0\26\1\4\2"+
    "\1\1\11\2\1\1\3\2\1\1\5\2\22\0\31\1\3\2\244\0"+
    "\4\2\66\1\3\2\1\1\22\2\1\1\7\2\12\1\2\2\2\0"+
    "\12\2\1\0\7\1\1\0\7\1\1\0\3\2\1\0\10\1\2\0"+
    "\2\1\2\0\26\1\1\0\7\1\1\0\1\1\3\0\4\1\2\0"+
    "\1\2\1\1\7\2\2\0\2\2\2\0\3\2\1\1\10\0\1\2"+
    "\4\0\2\1\1\0\3\1\2\2\2\0\12\2\4\1\7\0\1\1"+
    "\5\0\3\2\1\0\6\1\4\0\2\1\2\0\26\1\1\0\7\1"+
    "\1\0\2\1\1\0\2\1\1\0\2\1\2\0\1\2\1\0\5\2"+
    "\4\0\2\2\2\0\3\2\3\0\1\2\7\0\4\1\1\0\1\1"+
    "\7\0\14\2\3\1\1\2\13\0\3\2\1\0\11\1\1\0\3\1"+
    "\1\0\26\1\1\0\7\1\1\0\2\1\1\0\5\1\2\0\1\2"+
    "\1\1\10\2\1\0\3\2\1\0\3\2\2\0\1\1\17\0\2\1"+
    "\2\2\2\0\12\2\1\0\1\1\17\0\3\2\1\0\10\1\2\0"+
    "\2\1\2\0\26\1\1\0\7\1\1\0\2\1\1\0\5\1\2\0"+
    "\1\2\1\1\7\2\2\0\2\2\2\0\3\2\10\0\2\2\4\0"+
    "\2\1\1\0\3\1\2\2\2\0\12\2\1\0\1\1\20\0\1\2"+
    "\1\1\1\0\6\1\3\0\3\1\1\0\4\1\3\0\2\1\1\0"+
    "\1\1\1\0\2\1\3\0\2\1\3\0\3\1\3\0\14\1\4\0"+
    "\5\2\3\0\3\2\1\0\4\2\2\0\1\1\6\0\1\2\16\0"+
    "\12\2\11\0\1\1\7\0\3\2\1\0\10\1\1\0\3\1\1\0"+
    "\27\1\1\0\12\1\1\0\5\1\3\0\1\1\7\2\1\0\3\2"+
    "\1\0\4\2\7\0\2\2\1\0\2\1\6\0\2\1\2\2\2\0"+
    "\12\2\22\0\2\2\1\0\10\1\1\0\3\1\1\0\27\1\1\0"+
    "\12\1\1\0\5\1\2\0\1\2\1\1\7\2\1\0\3\2\1\0"+
    "\4\2\7\0\2\2\7\0\1\1\1\0\2\1\2\2\2\0\12\2"+
    "\1\0\2\1\17\0\2\2\1\0\10\1\1\0\3\1\1\0\51\1"+
    "\2\0\1\1\7\2\1\0\3\2\1\0\4\2\1\1\10\0\1\2"+
    "\10\0\2\1\2\2\2\0\12\2\12\0\6\1\2\0\2\2\1\0"+
    "\22\1\3\0\30\1\1\0\11\1\1\0\1\1\2\0\7\1\3\0"+
    "\1\2\4\0\6\2\1\0\1\2\1\0\10\2\22\0\2\2\15\0"+
    "\60\1\1\2\2\1\7\2\4\0\10\1\10\2\1\0\12\2\47\0"+
    "\2\1\1\0\1\1\2\0\2\1\1\0\1\1\2\0\1\1\6\0"+
    "\4\1\1\0\7\1\1\0\3\1\1\0\1\1\1\0\1\1\2\0"+
    "\2\1\1\0\4\1\1\2\2\1\6\2\1\0\2\2\1\1\2\0"+
    "\5\1\1\0\1\1\1\0\6\2\2\0\12\2\2\0\2\1\42\0"+
    "\1\1\27\0\2\2\6\0\12\2\13\0\1\2\1\0\1\2\1\0"+
    "\1\2\4\0\2\2\10\1\1\0\44\1\4\0\24\2\1\0\2\2"+
    "\5\1\13\2\1\0\44\2\11\0\1\2\71\0\53\1\24\2\1\1"+
    "\12\2\6\0\6\1\4\2\4\1\3\2\1\1\3\2\2\1\7\2"+
    "\3\1\4\2\15\1\14\2\1\1\17\2\2\0\46\1\12\0\53\1"+
    "\1\0\1\1\3\0\u0149\1\1\0\4\1\2\0\7\1\1\0\1\1"+
    "\1\0\4\1\2\0\51\1\1\0\4\1\2\0\41\1\1\0\4\1"+
    "\2\0\7\1\1\0\1\1\1\0\4\1\2\0\17\1\1\0\71\1"+
    "\1\0\4\1\2\0\103\1\2\0\3\2\40\0\20\1\20\0\125\1"+
    "\14\0\u026c\1\2\0\21\1\1\0\32\1\5\0\113\1\3\0\3\1"+
    "\17\0\15\1\1\0\4\1\3\2\13\0\22\1\3\2\13\0\22\1"+
    "\2\2\14\0\15\1\1\0\3\1\1\0\2\2\14\0\64\1\40\2"+
    "\3\0\1\1\3\0\2\1\1\2\2\0\12\2\41\0\3\2\2\0"+
    "\12\2\6\0\130\1\10\0\51\1\1\2\1\1\5\0\106\1\12\0"+
    "\35\1\3\0\14\2\4\0\14\2\12\0\12\2\36\1\2\0\5\1"+
    "\13\0\54\1\4\0\21\2\7\1\2\2\6\0\12\2\46\0\27\1"+
    "\5\2\4\0\65\1\12\2\1\0\35\2\2\0\13\2\6\0\12\2"+
    "\15\0\1\1\130\0\5\2\57\1\21\2\7\1\4\0\12\2\21\0"+
    "\11\2\14\0\3\2\36\1\12\2\3\0\2\1\12\2\6\0\46\1"+
    "\16\2\14\0\44\1\24\2\10\0\12\2\3\0\3\1\12\2\44\1"+
    "\122\0\3\2\1\0\25\2\4\1\1\2\4\1\1\2\15\0\300\1"+
    "\47\2\25\0\4\2\u0116\1\2\0\6\1\2\0\46\1\2\0\6\1"+
    "\2\0\10\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0\37\1"+
    "\2\0\65\1\1\0\7\1\1\0\1\1\3\0\3\1\1\0\7\1"+
    "\3\0\4\1\2\0\6\1\4\0\15\1\5\0\3\1\1\0\7\1"+
    "\16\0\5\2\32\0\5\2\20\0\2\1\23\0\1\1\13\0\5\2"+
    "\5\0\6\2\1\0\1\1\15\0\1\1\20\0\15\1\3\0\32\1"+
    "\26\0\15\2\4\0\1\2\3\0\14\2\21\0\1\1\4\0\1\1"+
    "\2\0\12\1\1\0\1\1\3\0\5\1\6\0\1\1\1\0\1\1"+
    "\1\0\1\1\1\0\4\1\1\0\13\1\2\0\4\1\5\0\5\1"+
    "\4\0\1\1\21\0\51\1\u0a77\0\57\1\1\0\57\1\1\0\205\1"+
    "\6\0\4\1\3\2\16\0\46\1\12\0\66\1\11\0\1\1\17\0"+
    "\1\2\27\1\11\0\7\1\1\0\7\1\1\0\7\1\1\0\7\1"+
    "\1\0\7\1\1\0\7\1\1\0\7\1\1\0\7\1\1\0\40\2"+
    "\57\0\1\1\u01d5\0\3\1\31\0\11\1\6\2\1\0\5\1\2\0"+
    "\5\1\4\0\126\1\2\0\2\2\2\0\3\1\1\0\132\1\1\0"+
    "\4\1\5\0\51\1\3\0\136\1\21\0\33\1\65\0\20\1\u0200\0"+
    "\u19b6\1\112\0\u51cc\1\64\0\u048d\1\103\0\56\1\2\0\u010d\1\3\0"+
    "\20\1\12\2\2\1\24\0\57\1\1\2\14\0\2\2\1\0\31\1"+
    "\10\0\120\1\2\2\45\0\11\1\2\0\147\1\2\0\4\1\1\0"+
    "\2\1\16\0\12\1\120\0\10\1\1\2\3\1\1\2\4\1\1\2"+
    "\27\1\5\2\20\0\1\1\7\0\64\1\14\0\2\2\62\1\21\2"+
    "\13\0\12\2\6\0\22\2\6\1\3\0\1\1\4\0\12\2\34\1"+
    "\10\2\2\0\27\1\15\2\14\0\35\1\3\0\4\2\57\1\16\2"+
    "\16\0\1\1\12\2\46\0\51\1\16\2\11\0\3\1\1\2\10\1"+
    "\2\2\2\0\12\2\6\0\27\1\3\0\1\1\1\2\4\0\60\1"+
    "\1\2\1\1\3\2\2\1\2\2\5\1\2\2\1\1\1\2\1\1"+
    "\30\0\3\1\43\0\6\1\2\0\6\1\2\0\6\1\11\0\7\1"+
    "\1\0\7\1\221\0\43\1\10\2\1\0\2\2\2\0\12\2\6\0"+
    "\u2ba4\1\14\0\27\1\4\0\61\1\u2104\0\u012e\1\2\0\76\1\2\0"+
    "\152\1\46\0\7\1\14\0\5\1\5\0\1\1\1\2\12\1\1\0"+
    "\15\1\1\0\5\1\1\0\1\1\1\0\2\1\1\0\2\1\1\0"+
    "\154\1\41\0\u016b\1\22\0\100\1\2\0\66\1\50\0\15\1\3\0"+
    "\20\2\20\0\7\2\14\0\2\1\30\0\3\1\31\0\1\1\6\0"+
    "\5\1\1\0\207\1\2\0\1\2\4\0\1\1\13\0\12\2\7\0"+
    "\32\1\4\0\1\1\1\0\32\1\13\0\131\1\3\0\6\1\2\0"+
    "\6\1\2\0\6\1\2\0\3\1\3\0\2\1\3\0\2\1\22\0"+
    "\3\2\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\2\4\3\5\1\6\1\7"+
    "\1\10\11\2\2\0\2\5\1\2\1\11\10\2\2\12"+
    "\2\0\2\5\7\2\1\0\2\5\2\2\2\5\2\2"+
    "\11\5\2\13";

  private static int [] zzUnpackAction() {
    int [] result = new int[69];
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
    "\0\0\0\47\0\116\0\47\0\165\0\234\0\47\0\303"+
    "\0\352\0\u0111\0\47\0\47\0\47\0\u0138\0\u015f\0\u0186"+
    "\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249\0\u0270\0\u0297\0\u02be"+
    "\0\u02e5\0\u030c\0\u0333\0\116\0\u035a\0\u0381\0\u03a8\0\u03cf"+
    "\0\u03f6\0\u041d\0\u0444\0\u046b\0\u0492\0\47\0\u04b9\0\u04e0"+
    "\0\u0507\0\u052e\0\u0555\0\u057c\0\u05a3\0\u05ca\0\u05f1\0\u0618"+
    "\0\u063f\0\u0666\0\u068d\0\u06b4\0\u06db\0\u0702\0\u0729\0\u0750"+
    "\0\u0777\0\u079e\0\u07c5\0\u07ec\0\u0813\0\u083a\0\u0861\0\u0888"+
    "\0\u08af\0\u08d6\0\u08fd\0\u08af\0\u08d6";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[69];
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
    "\1\2\1\3\1\2\1\4\1\5\1\4\1\6\2\7"+
    "\4\10\1\11\1\12\4\10\1\13\1\14\1\15\1\16"+
    "\1\17\1\3\1\20\2\3\1\21\1\3\1\22\1\3"+
    "\1\23\1\24\3\3\1\25\1\26\50\0\2\3\6\0"+
    "\12\3\3\0\21\3\4\0\1\27\1\30\50\0\1\7"+
    "\50\0\12\31\35\0\12\10\35\0\1\31\1\10\2\31"+
    "\1\32\5\31\25\0\2\3\6\0\12\3\3\0\1\3"+
    "\1\33\13\3\1\34\3\3\1\0\2\3\6\0\12\3"+
    "\3\0\6\3\1\35\12\3\1\0\2\3\6\0\12\3"+
    "\3\0\4\3\1\36\14\3\1\0\2\3\6\0\12\3"+
    "\3\0\5\3\1\37\13\3\1\0\2\3\6\0\12\3"+
    "\3\0\4\3\1\40\14\3\1\0\2\3\6\0\12\3"+
    "\3\0\4\3\1\41\14\3\1\0\2\3\6\0\12\3"+
    "\3\0\14\3\1\42\4\3\1\0\2\3\6\0\12\3"+
    "\3\0\20\3\1\43\1\0\2\3\6\0\12\3\3\0"+
    "\6\3\1\44\12\3\6\27\1\45\1\46\37\27\5\47"+
    "\1\50\41\47\11\0\12\51\35\0\1\51\1\31\1\52"+
    "\1\51\2\31\1\51\1\31\2\51\25\0\2\3\6\0"+
    "\12\3\3\0\2\3\1\34\16\3\1\0\2\3\6\0"+
    "\12\3\3\0\13\3\1\34\5\3\1\0\2\3\6\0"+
    "\12\3\3\0\4\3\1\53\14\3\1\0\2\3\6\0"+
    "\12\3\3\0\16\3\1\54\2\3\1\0\2\3\6\0"+
    "\12\3\3\0\11\3\1\55\7\3\1\0\2\3\6\0"+
    "\12\3\3\0\1\56\20\3\1\0\2\3\6\0\12\3"+
    "\3\0\1\57\20\3\1\0\2\3\6\0\12\3\3\0"+
    "\1\60\20\3\1\0\2\3\6\0\12\3\3\0\2\3"+
    "\1\61\16\3\7\0\1\46\37\0\5\47\1\62\41\47"+
    "\4\0\1\46\1\50\52\0\12\63\35\0\1\63\2\51"+
    "\1\63\5\51\1\64\25\0\2\3\6\0\12\3\3\0"+
    "\5\3\1\65\13\3\1\0\2\3\6\0\12\3\3\0"+
    "\6\3\1\34\12\3\1\0\2\3\6\0\12\3\3\0"+
    "\3\3\1\57\15\3\1\0\2\3\6\0\12\3\3\0"+
    "\10\3\1\34\10\3\1\0\2\3\6\0\12\3\3\0"+
    "\5\3\1\54\13\3\1\0\2\3\6\0\12\3\3\0"+
    "\1\3\1\33\17\3\1\0\2\3\6\0\12\3\3\0"+
    "\11\3\1\66\7\3\4\47\1\46\1\62\41\47\11\0"+
    "\12\67\35\0\1\67\1\63\1\70\1\67\2\63\1\67"+
    "\1\63\2\67\25\0\2\3\6\0\12\3\3\0\6\3"+
    "\1\71\12\3\1\0\2\3\6\0\12\3\3\0\20\3"+
    "\1\72\11\0\12\73\35\0\1\73\2\67\1\74\6\67"+
    "\25\0\2\3\6\0\12\3\3\0\7\3\1\72\11\3"+
    "\1\0\2\3\6\0\12\3\3\0\1\3\1\34\17\3"+
    "\11\0\12\75\35\0\1\75\1\73\2\75\2\73\1\75"+
    "\1\76\2\75\35\0\12\77\35\0\1\77\2\75\1\77"+
    "\2\75\1\100\2\75\1\77\35\0\1\101\3\102\1\101"+
    "\2\102\3\101\35\0\1\101\1\77\1\103\1\102\2\77"+
    "\1\102\1\77\2\101\35\0\1\104\3\105\1\104\2\102"+
    "\3\104\35\0\1\104\3\102\1\104\2\105\3\104\35\0"+
    "\1\104\3\102\1\101\2\102\3\101\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2340];
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
    "\1\0\1\11\1\1\1\11\2\1\1\11\3\1\3\11"+
    "\11\1\2\0\15\1\1\11\2\0\11\1\1\0\23\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[69];
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
  private int  token;

  public int getToken() {
    return token;
  }

  public int nextToken() {
    try {
      token = yylex();
    } catch (java.io.IOException e) {
      System.out.println("IO Exception occurred:\n" + e);
    }
    return token;
  }
    public String getTag() {
      switch (token) {
        case AMP       : return "&amp;";
        case GT        : return "&gt;";
        case LT        : return "&lt;";

        case COMMENT   : return "<span class=\"comment\">"+yytext()+"</span>";
        case KEYWORD   : return "<span class=\"keyword\">"+yytext()+"</span>";
        case INTLIT    : return "<span class=\"literal\">"+yytext()+"</span>";
        case INVLD     : return "<span class=\"invalid\">"+yytext()+"</span>";
        default        : return yytext();
      }
    }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public MiniLexer(java.io.Reader in, Handler handler) {
    super(handler);
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public MiniLexer(java.io.InputStream in, Handler handler) {
    this(new java.io.InputStreamReader(in), handler);
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
    while (i < 2224) {
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
        case 8: 
          { return AMP;
          }
        case 12: break;
        case 2: 
          { return IDENT;
          }
        case 13: break;
        case 9: 
          { return KEYWORD;
          }
        case 14: break;
        case 3: 
          { return IDENT ;
          }
        case 15: break;
        case 5: 
          { return INTLIT ;
          }
        case 16: break;
        case 4: 
          { return WHITESPACE ;
          }
        case 17: break;
        case 10: 
          { return COMMENT ;
          }
        case 18: break;
        case 6: 
          { return GT;
          }
        case 19: break;
        case 11: 
          { return INVLD ;
          }
        case 20: break;
        case 7: 
          { return LT;
          }
        case 21: break;
        case 1: 
          { return INVLD;
          }
        case 22: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {   return ENDINPUT;
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
