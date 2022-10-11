
import java.util.regex.*;
import java.io.*;

public class PropertiesReader {
    private static String aFileName = "properties1.txt";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(aFileName))) {
            String aLine;
            while ((aLine = br.readLine()) != null) {
                String[] dataRecord = aLine.split(Pattern.quote("="));
                System.out.println("------ Property ------");
                for (int i = 0; i < dataRecord.length; i++)
                    System.out.println(dataRecord[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
