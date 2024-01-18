
import java.util.*;

public class Hashmap {

    public static void main(String args[]) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 13 };
        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum, idx)
        int sum = 0;
        int len = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println("argest sub array with as => " + len);
    }
}

/*
 * output:- argest sub array with as => 5
 * output:- 15, 13, 10, 7, 2, 1
 * length:-0, 1, 2, 3, 4, 8
 */