
import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
/**
 *  Example of One Dimentional Arrays, or just an Array.
 * Kyle Le
 * I love Java programming for days at a time.
 * Java is a complicated language.
 */
@SuppressWarnings("deprecation")
public class OneDArrays extends JApplet {
    
    String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupitor", "Uranus", "Neptune", "Pluto"};
    
    //Called when this applet is loaded into the browser.
    public void init() {
        System.out.println("test");
        //Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {



                    JLabel lbl = new JLabel("Planet name: " + planets[0]);
                    add(lbl);
                    JLabel lbl2 = new JLabel("Planet name: " + planets[1]);
                    add(lbl2);
                    JLabel lbl3 = new JLabel("Planet name: " + planets[2]);
                    add(lbl3);
                    JLabel lbl4 = new JLabel("Planet name: " + planets[3]);
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