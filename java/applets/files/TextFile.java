import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TextFile extends Applet {
    String fileToRead = "flatfile.txt";
    StringBuffer strBuff;
    TextArea txtArea;
    Graphics g;

    public void init() {
        txtArea = new TextArea(100, 100);
        txtArea.setEditable(false);
        add(txtArea, "center");
        String prHtml = this.getParameter("fileToRead");
        if (prHtml != null)
            fileToRead = new String(prHtml);
        readFile();
    }
    /*
     * public void paint(Graphics g) {
     * 
     * int a=150,b=150,c=10,d=10;
     * 
     * g.setColor(Color.red);
     * for(int i=0;i<15;i++)
     * {
     * try{
     * Thread.sleep(1000);
     * }catch(InterruptedException ex){
     * ex.printStackTrace();;
     * }
     * 
     * g.drawOval(a, b, c, d);
     * a-=10;
     * b-=10;
     * c+=8;
     * d+=8;
     * }
     * }
     */

    public void readFile() {
        String line;
        URL url = null;
        try {
            url = new URL(getCodeBase(), fileToRead);
        } catch (MalformedURLException e) {
        }
        try {
            InputStream in = url.openStream();
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            strBuff = new StringBuffer();
            while ((line = bf.readLine()) != null) {
                strBuff.append(line + "\n");
            }
            txtArea.append("File Name : " + fileToRead + "\n");
            txtArea.append(strBuff.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
