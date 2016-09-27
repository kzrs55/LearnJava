package design_pattern.AdapterPattern;

/**
 * Created by zjutK on 16/9/27.
 */
public class MediaAdapter implements MediaPlayer{
    AdvancedAutoPlayer advancedAutoPlayer;

    public MediaAdapter(String autotype) {
        if(autotype.equalsIgnoreCase("vlc")){
            advancedAutoPlayer = new vlcPlayer();
        }else if(autotype.equalsIgnoreCase("mp4")){
            advancedAutoPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String autoType,String filename) {
        if (autoType.equalsIgnoreCase("vlc")){
            advancedAutoPlayer.playVlc(filename);
        }else if(autoType.equalsIgnoreCase("mp4")){
            advancedAutoPlayer.playMp4(filename);
        }

    }
}
