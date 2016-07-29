package design_pattern.builder_pattern;

/**
 * Created by zjutK on 16/7/21.
 */
public class CommonRoleBuilder extends Builder {
    private Role role = new Role();

    @Override
    public void buildHead() {
        role.setHead("common head");
    }

    @Override
    public void buildFace() {
        role.setFace("common face");

    }

    @Override
    public void buildBody() {
        role.setBody("conmon body");
    }

    @Override
    public void buildHp() {
        role.setHp(100d);
    }

    @Override
    public void buildSp() {
        role.setSp(100d);
    }

    @Override
    public void buildMp() {
        role.setMp(100d);
    }

    @Override
    public Role getResult() {
        return role;
    }
}
