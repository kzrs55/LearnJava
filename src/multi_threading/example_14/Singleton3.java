package multi_threading.example_14;

/**
 * Created by zjutK on 16/9/21.
 */
public class Singleton3 {
    private static Singleton3 instance;
    private static synchronized Singleton3 getInstance(){
        if(instance==null)
            instance = new Singleton3();
        return instance;
    }


    public static void main(String[] args) {
        Singleton3 s1 = Singleton3.getInstance();
        Singleton3 s2 = Singleton3.getInstance();
        if(s1==s2){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
