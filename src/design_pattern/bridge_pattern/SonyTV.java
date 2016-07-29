package design_pattern.bridge_pattern;

/**
 * Created by zjutK on 16/7/25.
 */
public class SonyTV implements TV {
    @Override
    public void on() {
        System.out.println("Sony on");
    }

    @Override
    public void off() {
        System.out.println("Sony off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Sony"+channel);
    }
}
