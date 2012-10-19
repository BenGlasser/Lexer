    package mini;
    import java.io.FileWriter;

    public class Four {
        public static void main(String args[]){
            StringBuilder myFour = new StringBuilder();
            int i = 1;
            int mult = 0;
            while(mult < 100000){
                mult = i*4;
                myFour.append(mult + "\n");
                i++;
            }
            try{
                FileWriter writer = new FileWriter("out.txt");
                writer.write(myFour.toString());
                writer.close();
            } catch(Exception e){e.printStackTrace();}
        }
    }
