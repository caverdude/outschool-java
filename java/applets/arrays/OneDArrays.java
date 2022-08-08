
import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
/**
 *  Example of One Dimentional Arrays, or just an Array.
 * Kyle Le
 * I love Java programming for days at a time.
 */
@SuppressWarnings("deprecation")
public class OneDArrays extends JApplet {
    
    String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupitor", "Uranus", "Neptune", "Pluto"};
    
    //Called when this applet is loaded into the browser.
    public void init() {
        //Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {



                    JLabel lbl = new JLabel("Hello World");
                    add(lbl);
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
}