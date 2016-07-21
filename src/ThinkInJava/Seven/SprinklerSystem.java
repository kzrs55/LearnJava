package ThinkInJava.Seven;

/**
 * Created by zjutK on 16/6/28.
 */

class WaterSource{
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s="Constructed";
    }
    public String toString(){
        return s;
    }
}
public class SprinklerSystem {
    private String value1,value2,value3,value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString(){
        return "value1 = " + value1+" "+
                "value2 = " + value2+" "+
                "value3 = " + value3+" "+
                "value4 = " + value4+" ";

    }

    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
