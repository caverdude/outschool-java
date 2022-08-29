

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import java.awt.Label;

import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.GridLayout;


/**
 * Example of AWT TextField input.
 * 
 */
@SuppressWarnings("deprecation")
public class AppletInput2 extends JApplet {

    int num1;
    int num2;
    Label calcLabel = new Label("Calc:0");
    
    // Called when this applet is loaded into the browser.
    public void init() {
        setLayout(new GridLayout(5, 1));
        // System.out.println("test");
        // Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    
                    TextField num1Field = new TextField();
                    num1Field.addKeyListener(new KeyAdapter() {
                        public void keyReleased(KeyEvent e) {
                            TextField textField = (TextField) e.getSource();
                            if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                                String text = textField.getText();
                                num1 = Integer.valueOf(text);
                                calcLabel.setText("Calc: "+num1+" x "+num2+" = "+(num1*num2));
                            }
                            
                        }
                    });
                    TextField num2Field = new TextField();
                    num2Field.addKeyListener(new KeyAdapter() {
                        public void keyReleased(KeyEvent e) {
                            TextField textField = (TextField) e.getSource();
                            if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                                String text = textField.getText();
                                num2 = Integer.valueOf(text);
                                calcLabel.setText("Calc: "+num1+" x "+num2+" = "+(num1*num2));
                            }
                            
                        }
                    });

                    Label num1Label = new Label("Enter 1st Number");
                    Label num2Label = new Label("Enter 2nd Number");
                    
                    add(num1Label);
                    add(num1Field);
                    add(num2Label);
                    add(num2Field);
                    add(calcLabel);

                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
}