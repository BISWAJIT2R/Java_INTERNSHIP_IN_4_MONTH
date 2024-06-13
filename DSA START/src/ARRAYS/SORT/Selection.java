package ARRAYS.SORT;

import java.util.Arrays;

public class Selection {
    public static void Sort (int [] arr) {
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n - 1; i++) {
               int min = i;
           for (int j = i + 1; j < n; j++) {
               if (arr[min] > arr[j]) {
                   min = j;

               }
           }

           int temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
        }
    }

   static int  select(int arr[], int i)

    {
        int min = i;
        // code here such that selectionSort() sorts arr[]
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[min] > arr[j]) {
                min = j;
            }
        }

        return min;
    }

   static void selectionSort(int arr[], int n)
    {
        //code here
        for (int i = 0; i < n -1; i++) {
            int minIndex =  select(arr, i);

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void upadteDesc (int  [] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i +1 ;j < n; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
//        int [] arr = {13,46,24,52,20,9};
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        upadteDesc(arr);
        System.out.println(Arrays.toString(arr));
    }
}
