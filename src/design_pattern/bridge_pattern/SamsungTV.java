package design_pattern.bridge_pattern;

/**
 * Created by zjutK on 16/7/25.
 */
public class SamsungTV implements TV {
    @Override
    public void on() {
        System.out.println("Samsung on");
    }

    @Override
    public void off() {
        System.out.println("Samsung off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Samsung " +channel);
    }
}
