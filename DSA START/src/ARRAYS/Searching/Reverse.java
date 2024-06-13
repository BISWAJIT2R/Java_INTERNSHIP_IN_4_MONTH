package ARRAYS.Searching;

public class Reverse {
    public static void check (int [] arr, int key) {
        int st = 0;
        int ed = arr.length - 1;

        while (st <= ed) {
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;

            st++;
            ed--;
        }
    }

    public static void  printArr(int [] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9};
        check(num, 3);
        printArr(num);
    }
}
