import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ReadFile {

    public static void main(String args[]) throws FileNotFoundException {
        boolean utf8 = false;
        //System.out.println("args length:"+args.length);
        if(args.length==2)
            if(args[1].equals("utf8")) utf8=true;
        //creating File instance to reference text file in Java
        File text = new File(args[0]);
        //Creating Scanner instance to read File in Java
        Scanner sc=null;
        if(utf8){
            Locale loc = new Locale("es", "ES");
            sc = new Scanner(new FileInputStream(text), "UTF-8");
            sc.useLocale(loc);
        }else{
            sc = new Scanner(text);
        }
        
        
        System.out.println("scnr is create...");

        //Reading each line of the file using Scanner class
        int lineNumber = 1;
        //System.out.println("has next:"+sc.hasNext());
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }      
   
    }  
 
}

