package ThinkInJava.Five;

/**
 * Created by zjutK on 16/5/23.
 */

class Rock {
    Rock() {
        System.out.println("Rock ");
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
