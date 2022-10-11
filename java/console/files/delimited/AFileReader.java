import java.io.*;
import java.util.regex.*;

public class AFileReader {
    private static String aFileName = "textfile1.txt";

    public static void main(String[] args) {
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader(aFileName));
            String aLine;
            System.out.println(Pattern.quote("|"));
            while ((aLine = br.readLine()) != null) {
                String[] dataRecord = aLine.split(Pattern.quote("|"));
                for (int i = 0; i < dataRecord.length; i++)
                    System.out.println(dataRecord[i]);
                    System.out.println();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
