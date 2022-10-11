import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class JavaProperties {
    private static Properties properties;
    public static void main(String[] args){
        try{
            properties = new Properties();
            properties.load(new FileReader("properties2.txt"));

        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        properties.list(System.out);
    }
}
