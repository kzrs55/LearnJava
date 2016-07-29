package design_pattern.bridge_pattern;

/**
 * Created by zjutK on 16/7/25.
 */
public class Main {
    public static void main(String[] args) {
        TV tv = new SonyTV();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.setChannelKeyBoard(100);
    }
}
