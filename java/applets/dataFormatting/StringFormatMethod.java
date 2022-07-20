import java.util.Calendar;


public class StringFormatMethod {
    public static void main(String args[]){
        String str = "Java";

        // format string 
        String formatStr = String.format("Language: %s", str);
    
        System.out.println(formatStr);

        String name="sonoo";  
        String sf1=String.format("name is %s",name);  
        String sf2=String.format("value is %f",32.33434);  
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
        
        System.out.println(sf1);  
        System.out.println(sf2);  
        System.out.println(sf3);  

        String str1 = String.format("%d", 101);          // Integer value  
        String str2 = String.format("%s", "Amar Singh"); // String value  
        String str3 = String.format("%f", 101.00);       // Float value  
        String str4 = String.format("%x", 101);          // Hexadecimal value  
        String str5 = String.format("%c", 'c');          // Char value  
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5);  

        double a = 35.55845;
        double b = 40.1245414;

        System.out.printf("a = %.2f b = %.4f", a, b);

        String formattedString = String.format("Local time: %tT", Calendar.getInstance());

        System.out.println(formattedString);

        String heading1 = "Exam_Name";
        String heading2 = "Exam_Grade";

        System.out.printf( "%-15s %15s %n", heading1, heading2);
        System.out.printf( "%-15s %15s %n", "Kyle Le", "A+");
        System.out.printf( "%-15s %15s %n", "Larry Gray", "B-");
        

        System.out.println(String.format("%6.3e",223.45654543434));
    }
    
}
