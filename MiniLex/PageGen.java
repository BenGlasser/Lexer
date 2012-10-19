import compiler.Failure;
import compiler.Handler;
import compiler.SimpleHandler;
import mini.MiniLexer;
import mini.MiniTokens;

/**
 * Created with IntelliJ IDEA.
 * User: Ben
 * Date: 10/14/12
 * Time: 3:22 PM
 * To change this template use File | Settings | File Templates.
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import compiler.*;
import mini.*;
public class PageGen {
    private static final String header =
            "<html>\n" +
                    "<head>\n" +
                    "<title>My Syntax Colored Web Page</title>\n" +
                    "<style type=\"text/css\">\n" +
                    "  body     {white-space:pre;\n" +
                    "            background-color:#ffffcc;\n" +
                    "            color:black;\n" +
                    "            font-family:\"Lucida Console\",\"Courier New\",Monotype}\n" +
                    "  .keyword {color:blue}\n" +
                    "  .comment {color:orange}\n" +
                    "  .literal {color:green}\n" +
                    "  .invalid {color:red}\n" +
                    "</style>\n" +
                    "</head>\n" +
                    "<body>";
    private static final String footer = "</body>\n</html>";
    public static void main(String[] args) {
        StringBuilder output = new StringBuilder(header);
        if (args.length!=2) {
            System.out.println("Program requires exactly two arguments");
        } else {

            Handler handler = new SimpleHandler();
            try {
                FileReader reader = new FileReader(args[0]+".mini");
                MiniLexer lexer  = new MiniLexer(reader, handler);

                while (lexer.nextToken() != MiniTokens.ENDINPUT) {
                    output.append(lexer.getTag());
                }
                System.out.println();
                output.append(footer);
                printFile(args[1], output.toString());

            } catch (Exception e) {
                handler.report(new Failure("Exception: " + e));
            }

        }
    }
    public static void printFile(String file, String text){
        try {
            FileWriter writer = new FileWriter(file + ".html");
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
