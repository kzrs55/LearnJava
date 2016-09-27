package daneimianshi.example_3.test_animal;

import java.util.HashMap;

/**
 * Created by zjutK on 16/9/18.
 */
public class test {
    static int test =100;
//    public static void main(String[] args) {
//        new ss().test();
//        HashMap<String,Integer> ss  =new HashMap();
//        ss.put("bob",44);
//        ss.put("job",645);
//        ss.put("fsd",564);
//        System.out.println(ss.isEmpty());
//        System.out.println(ss.keySet());
//        System.out.println(ss.clone());
//    }

}
class ss {
    void yy(){
        System.out.println("fulei");
    }
    public void test(){
        int s = test.test;
        System.out.println(s);
    }
}

class  dd extends ss{
    @Override
    void yy() {
        System.out.println("zilei");
    }

    public static void main(String[] args) {
        new dd().yy();
    }
}