package projekpbol;

import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.JOptionPane;

public class Music {

    private static long pausePosition = 0;
    private static Clip clip;
    public static ArrayList<String> path = new ArrayList();
    public static ArrayList<String> name = new ArrayList();
    private static int index = 0;

    public static Clip playMusic(String location) {
        try {
            File musicPath = new File(location);
            
            index = path.indexOf(location)+1;
            
            if (index == path.size()) {
                index = 0;
            }
            
            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                
                return clip;
            } else {
                JOptionPane.showMessageDialog(null, "File tidak exist!", "Error", 0);
                path.remove(location);
                name.remove(location);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
        }
        return null;
    }
    
    public static Clip loopMusic (String location){
        try {
            File musicPath = new File(location);

            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                clip.start();
                return clip;
            } else {
                JOptionPane.showMessageDialog(null, "File tidak exist!", "Error", 0);
                path.remove(location);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
        }
        return null;
    }

    public static Clip pauseMusic(String location) {
        try {
            if (clip != null && clip.isRunning()) {
                pausePosition = clip.getMicrosecondPosition();
                clip.stop();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
        }
        return clip;
    }

    public static Clip resumeMusic(String location) {
        try {
            if (clip != null && !clip.isRunning()) {
                clip.setMicrosecondPosition(pausePosition);
                clip.start();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
        }
        return clip;
    }

    public static Clip stopMusic(String location) {
        try {
            if (clip != null && clip.isRunning()) {
                clip.stop();
                clip.close(); // Menutup klip yang sedang berjalan
                clip = null; // Mengosongkan klip setelah dihentikan
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 0);
        }
        return clip;
    }
    
}
