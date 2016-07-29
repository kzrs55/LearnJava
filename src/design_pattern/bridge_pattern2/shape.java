package design_pattern.bridge_pattern2;

import java.awt.*;

/**
 * Created by zjutK on 16/7/25.
 */
public abstract class shape {
    protected DrawAPI drawAPI;

    protected shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
