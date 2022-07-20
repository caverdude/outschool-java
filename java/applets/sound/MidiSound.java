import java.applet.Applet;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

@SuppressWarnings("deprecation")
public class MidiSound extends Applet implements Runnable {

    // vars
    private Synthesizer synth;
    private MidiChannel mchannel;

    private int[] notes = new int[] { 60, 62, 64, 65, 67, 69, 71, 72, 72, 71, 69, 67, 65, 64, 62, 60 };
    Thread runner;

    public void start() {
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void init() {
        try {
            synth = MidiSystem.getSynthesizer();
            synth.open();
            mchannel = synth.getChannels()[0];

        } catch (MidiUnavailableException ex) {
            System.out.println(ex);
        }
    }

    // play sound
    public void run() {
        for (int i = 0; i < notes.length; i++) {
            mchannel.noteOn(notes[i], 50);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                break;
            } finally {
                mchannel.noteOff(notes[i]);
            }
        }
    }
}
