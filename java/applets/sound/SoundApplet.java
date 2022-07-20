import java.awt.*;

import java.applet.*;

@SuppressWarnings("deprecation")
public class SoundApplet extends Applet implements Runnable {

    AudioClip bgSound;

    AudioClip beep;

    Thread runner;

    
    public void start() {
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }

    }

    public void stop()

    {

        if (runner != null) {

            if (bgSound != null)

                bgSound.stop();

            runner = null;

        }

    }
    
    public void init() {

        bgSound = getAudioClip(getCodeBase(), "pond1.wav");

        beep = getAudioClip(getCodeBase(), "walking1.wav");

    }

    public void run() {

        if (bgSound != null)

            bgSound.loop();

        Thread thisThread = Thread.currentThread();

        while (runner == thisThread) {

            try {

                Thread.sleep(5000);

            } catch (InterruptedException e) {
            }

            if (beep != null)

                beep.play();

        }

    }

    public void paint(Graphics screen) {

        screen.drawString("Playing Sounds ...", 10, 10);

    }

}
