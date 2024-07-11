package Recursion;

import java.util.Arrays;

public class MargeSort {
    public static void Divide(int[] arr, int st, int ed) {
        if (st < ed) {
            int mid = st + (ed - st) / 2;
            Divide(arr, st, mid);
            Divide(arr, mid + 1, ed);
            Conquer(arr, st, ed, mid);
        }
    }

    public static void Conquer(int[] arr, int st, int ed, int mid) {
        int left = mid - st + 1;
        int right = ed - mid;
        int[] leftArray = new int[left];
        int[] rightArray = new int[right];

        for (int i = 0; i < left; i++) {
            leftArray[i] = arr[i + st];
        }

        for (int i = 0; i < right; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        int k = st, i = 0, j = 0;

        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) { // Changed from < to <= to maintain stability
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < left) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < right) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 2, 5, 8};
        Divide(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr)); // Expecting [2, 3, 5, 6, 8, 9]
    }
}
