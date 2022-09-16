// This java applet program will show 
// the bouncing balls

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MoveBall extends Applet implements Runnable {
  // x,y coordinates and radius of the circle.
  int x = 150, y = 50, r = 20;
  int dx = 11, dy = 7;

  // create thread.
  Thread t;
  boolean stopFlag;

  LinkedList<KeyEvent> keys = new LinkedList<KeyEvent>();

  /**
   * We add key listener that puts keys on a stack.
   */
  public void init() {

    this.addKeyListener(new KeyAdapter() {
      public void keyTyped(KeyEvent ke) {
        keys.offer(ke);
        System.out.println("Adding Key...");
      }
    });
  }

  // Function to start thread.
  public void start() {
    t = new Thread(this);
    stopFlag = false;
    t.start();
  }

  // Draw cicle from its present position.
  public void paint(Graphics g) {
    g.setColor(Color.red);
    g.fillOval(x - r, y - r, r * 2, r * 2);
  }

  char key=' ';
  KeyEvent keyEvent=null;

  // function to move the image.
  public void run() {
    while (true) {
      if (stopFlag)
        break; // good use of break to exit loop if loop needs to stop.
      // Bounce if we've hit an edge.
      if ((x - r + dx < 0)){
        dx = -dx;
        move();
      }
      if((x + r + dx > bounds().width)){
        dx = -dx;
        move();
      }
      if ((y - r + dy < 0)){
        dy = -dy;
        move();
      }
      if((y + r + dy > bounds().height)){
        dy = -dy;
        move();
      }

      keyEvent=keys.poll();
      if(keyEvent!=null) {
        System.out.println("Key was pressed...");
        key = keyEvent.getKeyChar();
      }
      

      System.out.println("Key="+key);
      switch (key) {
        case 'w':
          System.out.println("Move up.");
          dy=-10;dx=0;
          move();
          break;
        case 's':
          System.out.println("Move down.");
          dy=+10;dx=0;
          move();
          break;
        case 'a':
          System.out.println("Move left.");
          dx=-10;dy=0;
          move();
          break;
        case 'd':
          System.out.println("Move right.");
          dx=+10;dy=0;
          move();
          break;
        default:
      }
      key=' ';

      try {
        Thread.sleep(100);
      } catch (Exception e) {
        System.out.println(e);
      };
      // print circle again n again.
      repaint();
    }
  }

  private void move(){
    System.out.println("Moving the Ball...");
    // Move the circle only if key is pressed
    x += dx;
    y += dy;
  }

  // function to stop printing.
  public void stop() {
    stopFlag = true;
    t = null;
  }
}
