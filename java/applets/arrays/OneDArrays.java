
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.awt.*;

/**
 * Example of One Dimentional Arrays, or just an Array.
 * Kyle Le
 * I love Java programming for days at a time.
 * Java is a complicated language.
 */
@SuppressWarnings("deprecation")
public class OneDArrays extends JApplet {
    final int MERCURY = 0;
    final int VENUS = 1;
    final int EARTH = 2;
    final int MARS = 3;
    final int JUPITOR = 4;
    final int SATURN = 5;
    final int URANUS = 6;
    final int NEPTUNE = 7;
    final int PLUTO = 8;
    final int ICON_SIZE = 115;
    String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupitor", "Saturn", "Uranus", "Neptune", "Pluto" };

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

    // Called when this applet is loaded into the browser.
    public void init() {
        // System.out.println("test");
        // Execute a job on the event-dispatching thread; creating this applet's GUI.
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    // Import ImageIcon
                    // ImageIcon iconLogo = new ImageIcon("Images/YourCompanyLogo.png");
                    // In init() method write this code
                    // jLabelYourCompanyLogo.setIcon(iconLogo);
                    /*TODO: Make image icons for all 9 planets */
                    /*TODO: Add Image Icons to Labels and add to grid in 2nd column */
                    /*TODO: Make all 9 image files from earth.png */
                    /*TODO: Make images smaller or resizable when frame of applet is stretched */
                    
                    ImageIcon mercuryIcon  = createImageIcon("mercury.png",    "Planet Mercury");
                    mercuryIcon = new ImageIcon(mercuryIcon.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE, Image.SCALE_DEFAULT));
                    ImageIcon venusIcon  = createImageIcon("venus.png",    "Planet Venus");
                    venusIcon = new ImageIcon(venusIcon.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE, Image.SCALE_DEFAULT));
                    ImageIcon earthIcon  = createImageIcon("earth.png",    "Planet Earth");
                    earthIcon = new ImageIcon(earthIcon.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE, Image.SCALE_DEFAULT));
                    ImageIcon marsIcon  = createImageIcon("mars.png",    "Planet Mars");
                    marsIcon = new ImageIcon(marsIcon.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE, Image.SCALE_DEFAULT));
                    ImageIcon jupiterIcon  = createImageIcon("jupiter.jpg",    "Planet Jupiter");
                    jupiterIcon = new ImageIcon(jupiterIcon.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE, Image.SCALE_DEFAULT));
                    ImageIcon saturnIcon  = createImageIcon("saturn.jpg",    "Planet Saturn");
                    saturnIcon = new ImageIcon(saturnIcon.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE, Image.SCALE_DEFAULT));
                    ImageIcon uranusIcon  = createImageIcon("uranus.jpg",    "Planet Uranus");
                    uranusIcon = new ImageIcon(uranusIcon.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE, Image.SCALE_DEFAULT));
                    ImageIcon neptuneIcon  = createImageIcon("neptune.jpg",    "Planet Neptune");
                    neptuneIcon = new ImageIcon(neptuneIcon.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE, Image.SCALE_DEFAULT));
                    ImageIcon plutoIcon  = createImageIcon("pluto.jpg",    "Planet Pluto");
                    plutoIcon = new ImageIcon(plutoIcon.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE, Image.SCALE_DEFAULT));
                    JLabel imageLabel1 = new JLabel();
                    imageLabel1.setIcon(mercuryIcon);
                    JLabel imageLabel2 = new JLabel();
                    imageLabel2.setIcon(venusIcon);
                    JLabel imageLabel3 = new JLabel();
                    imageLabel3.setIcon(earthIcon);
                    JLabel imageLabel4 = new JLabel();
                    imageLabel4.setIcon(marsIcon);
                    JLabel imageLabel5 = new JLabel();
                    imageLabel5.setIcon(jupiterIcon);
                    JLabel imageLabel6 = new JLabel();
                    imageLabel6.setIcon(saturnIcon);
                    JLabel imageLabel7 = new JLabel();
                    imageLabel7.setIcon(uranusIcon);
                    JLabel imageLabel8 = new JLabel();
                    imageLabel8.setIcon(neptuneIcon);
                    JLabel imageLabel9 = new JLabel();
                    imageLabel9.setIcon(plutoIcon);
                    setLayout(new GridLayout(9, 2));
                    JLabel lbl = new JLabel("Planet name: " + planets[MERCURY]);
                    setEalignement(lbl);
                    add(lbl);
                    add(imageLabel1);
                    JLabel lbl2 = new JLabel("Planet name: " + planets[VENUS]);
                    add(lbl2);
                    add(imageLabel2);
                    JLabel lbl3 = new JLabel("Planet name: " + planets[EARTH]);
                    add(lbl3);
                    add(imageLabel3);
                    JLabel lbl4 = new JLabel("Planet name: " + planets[MARS]);
                    add(lbl4);
                    add(imageLabel4);
                    JLabel lbl5 = new JLabel("Planet name: " + planets[JUPITOR]);
                    add(lbl5);
                    add(imageLabel5);
                    JLabel lbl6 = new JLabel("Planet name: " + planets[SATURN]);
                    add(lbl6);
                    add(imageLabel6);
                    JLabel lbl7 = new JLabel("Planet name: " + planets[URANUS]);
                    add(lbl7);
                    add(imageLabel7);
                    JLabel lbl8 = new JLabel("Planet name: " + planets[NEPTUNE]);
                    add(lbl8);
                    add(imageLabel8);
                    JLabel lbl9 = new JLabel("Planet name: " + planets[PLUTO]);
                    add(lbl9);
                    add(imageLabel9);
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
}