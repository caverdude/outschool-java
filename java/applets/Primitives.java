import java.awt.Graphics;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JApplet;

@SuppressWarnings("deprecation")
/**
 *   
 */
public class Primitives extends JApplet {
    //int intNum = 23432; // a primitive in example.

    //Called when this applet is loaded into the browser.

    /**  Startup method overrides Applet.init()
     *  Messing around with primitive types and simple graphics.
     * 
     */
    public void init() {
        //Execute a job on the event-dispatching thread; creating this applet's GUI.
        /* 
        try {
             SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {

                    //int intNum = 23432; // a primitive in example.
                    
                    //JLabel lbl = new JLabel("Int Number: "+intNum);
                    //add(lbl);
                }
            }); 
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }*/
    }

    public void paint(Graphics g){  
        byte byteNum = -128;
        short shortNum = +32100;
        int intNum = 234323333; // a primitive in example.
        long longNum = 920837494;

        float floatNum = 23.32f;
        double doubleNum = 234324.33;
        
        byte row = 15;
        short y = (short)(row*10);

        double n = doubleNum;

        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        String doubleNumString = nf.format(n);


        g.drawString("Int Number: "+byteNum, 40,y);
        
        g.drawString("Int Number: "+intNum, 40,y(++row));
        g.drawString("Double Number: "+doubleNumString, 40,y(++row));

        //g.drawString("welcome",150,160);
        //g.drawLine(10,10,490,490);

    }  

    private short y(byte row){
        return (short)(row*10);
    };
}