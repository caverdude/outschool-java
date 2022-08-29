

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import java.awt.Label;

import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 * Example of AWT TextField input.
 * 
 */
@SuppressWarnings("deprecation")
public class AppletInput extends JApplet {
    
    // Called when this applet is loaded into the browser.
    public void init() {
        // System.out.println("test");
        // Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                   
                    TextField textField = new TextField();
                    textField.addKeyListener(new KeyAdapter() {
                        public void keyReleased(KeyEvent e) {
                            TextField textField = (TextField) e.getSource();
                            if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                                String text = textField.getText();
                                textField.setText(text.toUpperCase());
                            }
                            
                        }
                    });
                    
                    add(textField);
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
}