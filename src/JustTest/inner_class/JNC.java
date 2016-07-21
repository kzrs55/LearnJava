package JustTest.inner_class;

/**
 * Created by zjutK on 16/7/19.
 */
public class JNC extends Wine{
    public void fun1(String a){
        System.out.println("JNC 1");
        fun2();
    }

    public void fun2(){
        System.out.println("JNC 2");
    }

}
