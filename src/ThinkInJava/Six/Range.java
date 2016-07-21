package ThinkInJava.Six;

/**
 * Created by zjutK on 16/6/28.
 */
public class Range {
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    public static int[] range(int start, int end) {
        int sz = end - start;
        int[] result = new int[sz];
        for (int i = start; i < sz; i++) {
            result[i] = i;
        }
        return result;
    }

    public static int[] range(int start, int end, int step) {
        int sz = (end - start) / step;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++) {
            result[i] = start+i*step;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(range(10));
        System.out.println(range(3,10));
        System.out.println(range(1,15,3));
    }
}


