
import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

@SuppressWarnings("deprecation")
public class Images extends JApplet {
    Image img;
    //Called when this applet is loaded into the browser.
    public void init() {
        //Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    try {
                        URL url = new URL(getCodeBase(), "tree.png");
                        img = ImageIO.read(url);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }

     // Overriding paint() method
     @Override
     public void paint(Graphics g)
     {
        g.drawString("Hello World", 20, 20);
        g.drawImage(img, 0, 0, this);
     }
}