package design_pattern.bridge_pattern2;

/**
 * Created by zjutK on 16/7/25.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Green"+radius+x+y);
    }
}
