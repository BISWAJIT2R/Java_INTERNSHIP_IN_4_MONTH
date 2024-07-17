package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void Quick (int [] arr, int st, int ed) {
//        Base case
        if (st >= ed) {
            System.out.println("Base Case HIT !!");
            return;
        }

        int pivotid = Sort(arr, st, ed);

        System.out.println(pivotid);
        Quick(arr, st, pivotid - 1);
        Quick(arr, pivotid+1, ed);
    }

    public static int Sort (int [] arr, int st, int ed) {
        int pivot = arr[ed];
        int i = st - 1;

        for (int j = st; j < ed; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swap = arr[j];
                arr[j] = arr[i];
                arr[i] = swap;
            }
        }

        i++;
        int swap = pivot;
        arr[ed] = arr[i];
        arr[i] = swap;

        return i;
    }
    public static void main(String[] args) {
        int [] arr = {6,3,9,5,2,8};

        Quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}