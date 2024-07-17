package Recursion.Questions;

import java.util.Arrays;

public class StringSort {
    public static void marge (String [] arr, int st, int ed) {
        if  (st >= ed) {
            return;
        }
         int mid =   st + (ed - st) / 2;
        marge(arr, st,  mid);
        marge(arr,  mid + 1, ed);
        sort(arr,  st, mid, ed);
    }

    public static void sort (String [] arr, int  st,  int mid, int ed) {
        int left = mid - st + 1;
        int right = ed - mid;

        String [] leftArr   = new  String[left];
        String [] rightArr   = new  String[right];

        for (int i = 0; i <  left; i++) {
            leftArr[i] = arr[i + st];
        }

        for (int i = 0; i <  right; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int k = st, i =0, j = 0;

      try {
          while (i < left && j < right) {
              if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                  arr[k] = leftArr[i];
                  i++;
              }else {
                  arr[k] = rightArr[j];
                  j++;
              }
              k++;
          }
      } catch (Exception e) {
          System.out.println("Bro check  this ");
      }

        while (i < left) {
            arr[k++] = leftArr[i++];
        }

         while (j < right) {
            arr[k++] = rightArr[j++];
        }

    }
    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury", "venus", "jupiter"};
      marge(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
