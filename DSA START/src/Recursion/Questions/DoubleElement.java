package Recursion.Questions;

import java.util.HashMap;
import java.util.Iterator;

public class DoubleElement {
    public static  int maxElement  (int [] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        for (int key : mp.keySet()) {
            if (mp.get(key) > arr.length / 2) {
                return key;
            }
        }
        return -1;
    }

    public static int RangeOfElement (int [] arr, int st, int num, int ed){
        int count = 0;
        for (int i = st; i <= ed; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int FoundElement (int [] arr, int st, int ed) {

        if (st == ed) {
            return arr[st];
        }

        int mid = st + (ed -  st) / 2;

        int left = FoundElement(arr, st, mid);
        int right = FoundElement(arr, mid+1, ed);

        if (left == right) {
            return left;
        }

        int leftCount = RangeOfElement(arr, st, left, ed);
        int rihgtCount = RangeOfElement(arr, st, right, ed);

        return  leftCount > rihgtCount ? left : right;
    }


    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,2,1};
        System.out.println(FoundElement(arr, 0, arr.length - 1));
    }
}
