import javax.swing.JApplet;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import javafx.event.ActionEvent;

import java.awt.*;
import java.net.CookieHandler;
import java.net.URI;
import java.util.*;
import java.util.List;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CookieTest extends JApplet {

    private JTextArea textArea;

    @Override
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override public void run() {
                    setLayout(new BorderLayout());

                    JButton button = new JButton("Test");
                    ActionListener anActionListener = new ActionListener(){
                        public void  actionPerformed(ActionEvent e) {
                                
                            test();
                        }
                    };
                    button.addActionListener(new ActionListener() {
                        public void  actionPerformed(ActionEvent e) {
                            
                            test();
                        }
                    });
                   
                    add(button, BorderLayout.NORTH);

                    textArea = new JTextArea();
                    add(textArea, BorderLayout.CENTER);
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }

    private void test() {
        try {
            CookieHandler handler = CookieHandler.getDefault();

            URI uri = new URI("https://www.google.com/accounts/ServiceLogin");
            
            Map<String, List<String>> headers =
                    new HashMap<String, List<String>>();
            headers.put("Set-Cookie", Arrays.asList(
                    "FOO=BAR;HTTPOnly","ABC=XYZ"));
            
            handler.put(uri, headers);
            textArea.append("put: " + headers + "\n");

            headers = handler.get(uri, new HashMap<String, List<String>>());
            textArea.append("got: " + headers + "\n");
        } catch (Exception ex) {
            textArea.setText("Error, consult Java console for more info");
            ex.printStackTrace(System.err);
        }
    }
} 