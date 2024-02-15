package projekpbol;

import java.util.Calendar;
import javax.sound.sampled.Clip;

public class Engine  extends Thread{
    
    PlayList play;
    int index;
    
    public Engine(PlayList p, int index){
        play = p;
        this.index = index;
        
    }
    
    public void run(){
        for (int i = index; i < Music.path.size(); i++) {
            System.out.println(i);
            System.out.println(Music.name.get(i));
            play.setJLabel5(Music.name.get(i));
            Clip clip = Music.playMusic(Music.path.get(i));
            while (clip.getMicrosecondLength() != clip.getMicrosecondPosition()) {}
            clip.close();
            clip.stop();
        }
        for (String path : Music.path) {
            Music.stopMusic(path);
        }
    }
}
