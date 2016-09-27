package design_pattern.AdapterPattern;

/**
 * Created by zjutK on 16/9/27.
 */
public class vlcPlayer implements AdvancedAutoPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("paly vlc"+filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
