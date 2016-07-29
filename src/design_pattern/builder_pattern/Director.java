package design_pattern.builder_pattern;

/**
 * Created by zjutK on 16/7/21.
 */
public class Director {
    public void construct(Builder builder){
        builder.buildBody();
        builder.buildFace();
        builder.buildHead();
        builder.buildHp();
        builder.buildMp();
        builder.buildSp();
    }
}
