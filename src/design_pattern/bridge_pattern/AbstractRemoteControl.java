package design_pattern.bridge_pattern;

/**
 * Created by zjutK on 16/7/25.
 */
public abstract class AbstractRemoteControl {
    private TV tv;

    public AbstractRemoteControl(TV tv) {
        this.tv = tv;
    }

    public void turnOn(){
        tv.on();
    }
    public void turnOff(){
        tv.off();
    }

    public void setChannel(int channel){
        tv.switchChannel(channel);
    }
}
