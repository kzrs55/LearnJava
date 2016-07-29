package design_pattern.adapter_pattern;

/**
 * Created by zjutK on 16/7/21.
 */
public class GalaxyS7 {
    private MicroUsbInterface microUsbInterface;

    public GalaxyS7(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    public void charge(){
        System.out.println("开始给我的GalaxyS7手机充电...");
        microUsbInterface.chargeWithMicroUsb();
        System.out.println("开始给我的GalaxyS7手机充电...");
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}
