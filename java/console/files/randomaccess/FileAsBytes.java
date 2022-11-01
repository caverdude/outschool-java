
import java.io.*;
import java.util.regex.*;

public class FileAsBytes {
    private static String aFileName = "array2.data";

    public static void main(String[] args) {
        System.out.println("Reading or Writing file "+args[0]);
        if(args[0]!=null)
            aFileName=args[0];
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader(aFileName));
            int anInt;
            char aChar;
            
            while ((anInt = br.read()) != -1) {
                System.out.print(" "+(byte)anInt);
            }   
                
           
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
