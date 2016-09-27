package design_pattern.AdapterPattern;

/**
 * Created by zjutK on 16/9/27.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String autoType, String filename) {
        if(autoType.equalsIgnoreCase("mp3")){
            System.out.println("mp3"+filename);
        }else if(autoType.equalsIgnoreCase("vlc")||autoType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(autoType);
            mediaAdapter.play(autoType,filename);
        }else {
            System.out.println("Invalid media");
        }
    }

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","llllllllllllll");
        audioPlayer.play("mp4","444444444");
        audioPlayer.play("vlc","cccccccccccc");
        audioPlayer.play("avi","iiiiiiiiiii");
    }
}
