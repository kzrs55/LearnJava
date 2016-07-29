package design_pattern.builder_pattern;

/**
 * Created by zjutK on 16/7/21.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder commonBuilder = new CommonRoleBuilder();
        director.construct(commonBuilder);
        Role commonRole = commonBuilder.getResult();
        System.out.println(commonRole.getBody());
    }
}
