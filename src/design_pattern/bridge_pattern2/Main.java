package design_pattern.bridge_pattern2;

/**
 * Created by zjutK on 16/7/25.
 */
public class Main {
    public static void main(String[] args) {
        shape redCircle = new Circle(new RedCircle(),100,100,10);
        shape greenCircle = new Circle(new GreenCircle(),100,100,10);
        redCircle.draw();
        greenCircle.draw();

    }
}
