import java.util.*;
import java.text.*;

public class DateFormatter {

    public static void main(String args[]){
        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.DATE, 1);
    
        Date date = cal.getTime();             
    
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");          
    
        String inActiveDate = null;
    
        try {
    
            inActiveDate = format1.format(date);
    
            System.out.println(inActiveDate );
    
        } catch (Exception e) {
    
            // TODO Auto-generated catch block
    
            e.printStackTrace();
    
        }
    }
    
}
