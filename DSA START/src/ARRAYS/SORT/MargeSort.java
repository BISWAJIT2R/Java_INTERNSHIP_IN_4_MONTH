package ARRAYS.SORT;

import java.util.Arrays;

public class MargeSort {
    public static void divied (int [] arr,  int l,  int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            divied(arr, l , mid);
            divied(arr, mid+ 1, r);

            conqure(arr, l, mid, r);
        }
    }

    public static void conqure (int [] arr, int l, int m, int r) {
//        calculate the size
        int n1 = m - l + 1;
        int n2 = r - m;

        int [] lA = new int[n1];
        int [] rA = new int[n2];

        for (int i = 0; i < lA.length; i++) {
            lA[i] = arr[i + l];
        }

        for (int i = 0; i < rA.length; i++) {
            rA[i] = arr[m + 1 + i];
        }

        int k = l;

        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (lA[i]  < rA[j]) {
                arr[k] = lA[i];
                i++;
            }else {
                arr[k] = rA[j];
                j++;
            }

            k++;
        }

//        remain part

        while (i < n1) {
            arr[k] = lA[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rA[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args) {
        int [] arr = {5,3,4,2,1};
        divied(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
