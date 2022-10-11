import java.io.*;


public class FixedWidthReader {
    private static String aFileName = "fixedWidthData.csv";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(aFileName))) {
            char[] fName=new char[12];
            char[] lName=new char[11];
            char[] phone=new char[15];
            char[] city=new char[12];
            char[] state=new char[15];
            char[] zip=new char[10];
            int status=0;
            char[] eol=new char[2];
            while ( status != -1) {
                status = br.read(fName,0,12);
                if(status==-1) continue;
                status = br.read(lName,0,11);
                status = br.read(phone,0,15);
                status = br.read(city,0,12);
                status = br.read(state,0,15);
                status = br.read(zip,0,10);
                status = br.read(eol,0,2); 
                System.out.println(new String(fName));
                System.out.println(new String(lName));
                System.out.println(new String(phone));
                System.out.println(new String(city));
                System.out.println(new String(state));
                System.out.println(new String(zip));
                System.out.println("-------------------------------");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}