package design_pattern.bridge_pattern;

/**
 * Created by zjutK on 16/7/25.
 */
public class LogitechRemoteControl extends AbstractRemoteControl {
    public LogitechRemoteControl(TV tv) {
        super(tv);
    }
    public void setChannelKeyBoard(int channel){
        setChannel(channel);
        System.out.println("=======================");
    }
}

