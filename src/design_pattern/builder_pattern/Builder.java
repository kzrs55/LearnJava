package design_pattern.builder_pattern;

/**
 * Created by zjutK on 16/7/21.
 */
public abstract class Builder {
    protected Role role = new Role();
    public abstract void buildHead();
    public abstract void buildFace();
    public abstract void buildBody();
    public abstract void buildHp();
    public abstract void buildSp();
    public abstract void buildMp();

    public Role getResult(){
        return role;
    }
}
