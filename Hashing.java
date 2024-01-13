
//Majority Element in The Program
import java.util.*;

public class Hashing {

    public static void main(String args[]) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            for (Integer Key : map.keySet()) {
                if (map.get(Key) > arr.length / 3) {
                    System.out.println(Key);
                }
            }
        }
    }
}

// output:- 1
