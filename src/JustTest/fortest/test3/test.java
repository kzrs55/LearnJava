package JustTest.fortest.test3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by zjutK on 16/9/27.
 */
public class test {
    public static void main(String[] args) {
        HashSet<String> ss = new HashSet();
        ss.add("sssss");
        ss.add("Sssss");
        ss.add("sssss");
        Iterator<String>kk = ss.iterator();
        while (kk.hasNext()){
            System.out.println(kk.next());
        }
        HashMap<String,Integer> tt =new HashMap();
        tt.put("bob",13);
        tt.put("kent",134);
        System.out.println(tt.keySet());
        System.out.println(tt.values());
    }
}
