package design_pattern.AdapterPattern;

/**
 * Created by zjutK on 16/9/27.
 */
public class Mp4Player implements AdvancedAutoPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("play mp4 "+filename);
    }
}
