package design_pattern.adapter_pattern;

/**
 * Created by zjutK on 16/7/21.
 */
public class AndroidCharger implements MicroUsbInterface {
    @Override
    public void chargeWithMicroUsb() {
        System.out.println("MicroUsb");
    }
}
