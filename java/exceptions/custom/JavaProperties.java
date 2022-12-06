import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Properties;
import java.util.regex.*;

public class JavaProperties {
    
    private static Properties properties;
    
    public JavaProperties(String filename)throws FileNameExtentionException{
        try{
            String s[]=filename.split(Pattern.quote("."));
            System.out.println("name:"+s[0]+" ext:"+s[1]);
            File aFile = new File(filename);
            if(aFile.exists()){

            }else{

            }
            properties = new Properties();
            // rename this .txt or .prop to see the issues
            if(!(filename.split(Pattern.quote("."))[1]).equals("prop"))
                if(!(filename.split(Pattern.quote("."))[1]).equals("properties"))
                    throw new FileNameExtentionException("File name extention must be 'prop' or 'properties' ");
            properties.load(new FileReader(filename));

        }catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        } 
        // more general exceptions last.

        // try the above by commenting out FileNotFoundExcpetion  and then the IOExeptoin 
        // and see the various output.

        properties.list(System.out);

    }
    public static void main(String[] args){
        try{
            new JavaProperties("properties.prop");
            new JavaProperties("properties.txt");
            new JavaProperties("properties.properties");
        }catch(FileNameExtentionException fnee){
            fnee.printStackTrace();
        }
    }
}
