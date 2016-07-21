package ThinkInJava.Six;

/**
 * Created by zjutK on 16/6/28.
 */
class Soup1{
    private Soup1(){
        System.out.println("hello");
    }
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}
class Soup2{
    private Soup2(){}
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access(){
        return ps1;
    }
}
public class Lunch {
    void testPrivate(){
//        Soup1 soup = new Soup1();
    }
    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton(){
        Soup2.access();
    }
}
