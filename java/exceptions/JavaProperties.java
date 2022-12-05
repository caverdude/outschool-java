import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class JavaProperties {
    private static Properties properties;
    public static void main(String[] args){
        try{
            properties = new Properties();
            // rename this .txt or .prop to see the issues
            properties.load(new FileReader("properties.prop"));

        }//catch(FileNotFoundException fnfe){
            //fnfe.printStackTrace();
        //}
        //}catch(IOException ioe){
        //    ioe.printStackTrace();
        //}
        catch(Exception e){
            e.printStackTrace();
        } // more general exceptions last.

        // try the above by commenting out FileNotFoundExcpetion  and then the IOExeptoin 
        // and see the various output.

        properties.list(System.out);
    }
}
