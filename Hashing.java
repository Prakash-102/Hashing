
//Sliding window Maximum
import java.util.*;

public class Hashing {

    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        // Insert -O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);
        System.out.println(hm);

        // Size:-
        System.out.println(hm.size());
        // It Empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}

/*
 * Output:-{China=150, Us=50, India=100}
 * 3
 * true
 */
