package Recursion.Backtracking;

import java.util.Arrays;

public class Basic {
    public static void Insert(int [] arr, int st, int count) {
       if (st == arr.length) {
           return;
       }
       arr[st] = count;
       Insert(arr,  st+1, count+1);
       arr[st] = arr[st]  - 2;
    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        Insert(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
