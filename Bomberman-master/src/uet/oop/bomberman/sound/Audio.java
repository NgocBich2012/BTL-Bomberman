package uet.oop.bomberman.sound;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import javax.sound.sampled.LineUnavailableException;

public class Audio {

    static Clip hopeyou;
    public static void playGame(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("E:\\Windows 10 TIMT\\Bomberman-master\\res\\sound/hopeyou.wav"));
            hopeyou = AudioSystem.getClip();
            hopeyou.open(in);
            hopeyou.loop (Clip.LOOP_CONTINUOUSLY); 
        }
        catch(Exception e){
                e.printStackTrace();
        }
    }

    public static void stopMenu() {
            if (hopeyou.isRunning ()) {
                    hopeyou.stop ();
            }
    }
    public static void playMenuMove(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("E:\\Windows 10 TIMT\\Bomberman-master\\res\\sound/MenuMove.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void playMenuSelect(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("E:\\Windows 10 TIMT\\Bomberman-master\\res\\sound/MenuSelect.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void playBombDrop(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("E:\\Windows 10 TIMT\\Bomberman-master\\res\\sound/BombDrop.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void playBombExplode(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("E:\\Windows 10 TIMT\\Bomberman-master\\res\\sound/BombExplode.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void playVictory(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("E:\\Windows 10 TIMT\\Bomberman-master\\res\\sound/MusicOpen.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void playGameSong(){
        try{
            //AudioInputStream in = AudioSystem.getAudioInputStream(new File("D:/bomberman-starter/res/sound/MusicOpen.wav"));
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("E:\\Windows 10 TIMT\\Bomberman-master\\res\\sound/hopeyou.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void gameOver(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("E:\\Windows 10 TIMT\\Bomberman-master\\res\\sound/GameOver.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void bomberWalk(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("E:\\Windows 10 TIMT\\Bomberman-master\\res\\sound/walk.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

