import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.Image;
import java.awt.Color;
import java.awt.image.*;
import java.awt.GridLayout;
import java.awt.Toolkit;

/*
 *  Example for use of two D arrays. Two Dimensioanl Arrays.
 *  
 *  - Lookup Tables for all dimentions of arrays.
 *  - Matrix Math i.e. rotation things in space on a plane and more.
 *  - Maps like game maps, top or side views for either actual graphics or descriptive data.
 *  - Spread Sheet like storage for single page Columns and Rows.
 *  - Multi Columns of display table data.
 *  - Kinds of Graphics work.
 *  - And More
 * 
 *  I will use a chess board in this example.
 *  
 *  First we display a chess board at the console.
 *  Second we make a chess board on the applet.
 *  Third we load chess pieces and display them on the board in a starting 
 *  position.
 *  
 *  
 */
@SuppressWarnings("deprecation")
/**
 * 
 */
public class TwoDArrays extends JApplet {
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected ImageIcon createImageIcon(String path,
            String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /*
     * "bqr","bqk","bqb","bq","bk","bkb","bkk","bkr"
     * "bp","bp","bp","bp","bp","bp","bp","bp"
     * " "," "," "," "," "," "," "," "
     * 
     */

    // Called when this applet is loaded into the browser.
    public void init() {
        // System.out.println("test"); Showing how to ouput debug info to console
        // Execute a job on the event-dispatching thread; creating this applet's GUI.

        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    setLayout(new GridLayout(8, 8));
                    ImageIcon wKingIcon = createImageIcon("chess/bwset/white/wking.png", "White King");
                    ImageIcon darkStoneIcon = createImageIcon("chess/boards/stoneDark1_60.png", "Dark Stone 60");
                    ImageIcon lightStoneIcon = createImageIcon("chess/boards/stoneLight1_60.png", "Light Stone 60");
                    for (int col = 0; col < 8; col++) {
                        for (int row = 0; row < 8; row++) {
                            
                            // mercuryIcon = new
                            // ImageIcon(mercuryIcon.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE,
                            // Image.SCALE_DEFAULT));
                            JLabel wKing = new JLabel();
                            wKing.setIcon(wKingIcon);
                            // TODO:cut out the rest of the chess pieces
                            add(wKing);
                        }
                    }

                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }

    public static Image makeColorTransparent(Image im, final Color color) {
        ImageFilter filter = new RGBImageFilter() {
            public int markerRGB = color.getRGB() | 0xff000000;

            public final int filterRGB(int x, int y, int rgb) {
                if ((rgb | 0xff000000) == markerRGB) {
                    return 0x00FFFFFF & rgb;
                } else {
                    return rgb;
                }
            }
        };
        ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
        return Toolkit.getDefaultToolkit().createImage(ip);
    }

}
