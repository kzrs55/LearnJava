package JustTest.final_data;

import java.util.Random;

/**
 * Created by zjutK on 16/7/20.
 */
public class FinalTest {
    private final String final_01 = "chenssy";
    private final String final_02;
    private static Random random = new Random();
    private final int final_03 = random.nextInt(50);

    public final Person final_04 = new Person("chen_say");

    FinalTest(String final_02){
        this.final_02 = final_02;
    }

    public String toString(){
        return "final_01 = " +final_01+"  final_02 = "+final_02
                +"  final_03=  "+final_03 + "   final_04 = "+final_04.getName();
    }

    public static void main(String[] args) {
        FinalTest final1 = new FinalTest("cm");
        System.out.println(final1);
        FinalTest final2 = new FinalTest("zj");
        System.out.println(final2);
        final2.final_04.setName("chenssy");
        System.out.println(final2);
    }

}
