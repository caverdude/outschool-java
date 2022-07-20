
import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

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