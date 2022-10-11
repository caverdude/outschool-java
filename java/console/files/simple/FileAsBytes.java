
import java.io.*;
import java.util.regex.*;

public class FileAsBytes {
    private static String aFileName = "textfile1.txt";

    public static void main(String[] args) {
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader(aFileName));
            int anInt;
            char aChar;
            
            while ((anInt = br.read()) != -1) {
                System.out.print(" "+anInt);
            }   
                
           
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
