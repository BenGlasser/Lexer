package mini;
import compiler.*;
import java.io.*;

%%

%class      MiniLexer
%public
%extends    Phase
%implements MiniTokens
%ctorarg    Handler handler
%init{
  super(handler);
%init}

%function   yylex
%int

%eofval{
  return ENDINPUT;
%eofval}

%{
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

%}

Identifier = [:jletter:] [:jletterdigit:]*

Char       = [:jletter:]|"{"|"}"|"["|"]"|"("|")"|","|";"|"/"|"-"|"+"|"*"|"^"|"|"|"~"|"!"|"="|"\""|"%"|":"|"."|"'"|"?"|"@"|"#"
LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f] 
InputCharacter = [^\r\n]

Comment            = {TraditionalComment} | {EndOfLineComment}
TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment   = "//" {InputCharacter}* {LineTerminator}
           
AnyInt             = [0-9]+
MultFour           = ((0|4|8)|([0-9]*(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)))
MaxInt             = ([0-9]{1,9}|1[0-9]{9}|20[0-9]{8}|21[0-3][0-9]{7}|214[0-6][0-9]{6}|2147[0-3][0-9]{5}|21474[0-7][0-9]{4}|214748[0-2][0-9]{3}|2147483[0-5][0-9]{2}|21474836[0-3][0-9]|214748364[0-7])

%%
 /*re-encode html*/
 ">"             { return GT; }
 "<"             { return LT; }
 "&"             { return AMP; }

 /*keywords*/
 "int"           { return KEYWORD; }
 "boolean"       { return KEYWORD; }
 "double"        { return KEYWORD; }
 "void"          { return KEYWORD; }
 "while"         { return KEYWORD; }
 "if"            { return KEYWORD; }
 "else"          { return KEYWORD; }
 "print"         { return KEYWORD; }
 "return"        { return KEYWORD; }
 "new"           { return KEYWORD; }

 /*Integers*/
 {MaxInt}        { return INTLIT ; }
 {MultFour}      { return INTLIT ; }
 {AnyInt}        { return INVLD ; }

 /*everything else*/
 {Identifier}    { return IDENT; }
 {WhiteSpace}    { return WHITESPACE ; }
 {Comment}       { return COMMENT ; }

 {Char}           { return IDENT ; }
.|\n              { return INVLD;}

