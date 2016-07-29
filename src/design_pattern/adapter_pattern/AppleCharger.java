package design_pattern.adapter_pattern;

/**
 * Created by zjutK on 16/7/21.
 */
public class AppleCharger implements LightningInterface {
    @Override
    public void chargeWithLightning() {
        System.out.println("Lightning");
    }
}
