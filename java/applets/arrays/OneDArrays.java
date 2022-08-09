
import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.awt.*;
/**
 *  Example of One Dimentional Arrays, or just an Array.
 * Kyle Le
 * I love Java programming for days at a time.
 * Java is a complicated language.
 */
@SuppressWarnings("deprecation")
public class OneDArrays extends JApplet {
    final int MERCURY=0;
    final int VENUS=1;
    final int EARTH=2;
    final int MARS=3;
    final int JUPITOR=4;
    final int URANUS=5;
    final int NEPTUNE=6;
    final int PLUTO=7;

    String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupitor", "Uranus", "Neptune", "Pluto"};
    
    //Called when this applet is loaded into the browser.
    public void init() {
        System.out.println("test");
        //Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    setLayout(new GridLayout(8,1));
                    JLabel lbl = new JLabel("Planet name: " + planets[MERCURY]);
                    add(lbl);
                    JLabel lbl2 = new JLabel("Planet name: " + planets[VENUS]);
                    add(lbl2);
                    JLabel lbl3 = new JLabel("Planet name: " + planets[EARTH]);
                    add(lbl3);
                    JLabel lbl4 = new JLabel("Planet name: " + planets[MARS]);
                    add(lbl4);
                    JLabel lbl5 = new JLabel("Planet name: " + planets[4]);
                    add(lbl5);
                    JLabel lbl6 = new JLabel("Planet name: " + planets[5]);
                    add(lbl6);
                    JLabel lbl7 = new JLabel("Planet name: " + planets[6]);
                    add(lbl7);
                    JLabel lbl8 = new JLabel("Planet name: " + planets[7]);
                    add(lbl8);
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
}