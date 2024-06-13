package ARRAYS.SORT;

public class CountSort {
    public static void updateArr(int [] arr) {
        int max = 0;
        for (int i : arr) {
            max = Math.max(i, max);
        }

        int [] count = new int[max + 1];

        for (int i : arr) {
            count[i]++;
        }


        int index = 0;
        for (int i = 0; i <= max; i++) {
            while(count[i] > 0) {
                arr[index] = i;
                index++;
                 count[i]--;
            }
        }
    }

    public static  void ContDesc (int [] arr) {
        int n = arr.length;
        int max = 0;

        for (int i :  arr) {
            max = Math.max(max, i);
        }

        int [] count = new int[max + 1];

        for (int j : arr) {
            count[j]++;
        }

        int idx = 0;
        for (int i = count.length -1 ; i >= 0; i--) {
            while (count[i] > 0) {
                arr[idx] = i;
                idx++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
//        int [] arr = {4, 2, 2, 8, 3, 3, 1};
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        ContDesc(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
