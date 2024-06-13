package LIVESESSION;

import java.util.HashMap;

public class MaxValue {
    public  static  void MaxNum (int [] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
    }
    public static void main(String[] args) {
        int [] arr = {7,7,4,5,3,2,2,2,4,9};
    }
}
