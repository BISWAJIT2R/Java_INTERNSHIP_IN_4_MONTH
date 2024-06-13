package ARRAYS.SORT;

public class BubbleSort {
    public static void Update (int [] arr) {
        int st = 0;
        int ed = arr.length - 1;

        while (st <= ed) {
            if (arr[st] > arr[ed]) {
                int temp = arr[st];
                arr[st] = arr[ed];
                arr[ed] = temp;
                ed--;
            }

            if (arr[st] < arr[ed]) {
                st++;
            }
        }
    }

    public static void UpadteWith2(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1- i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void updateDesce(int [] arr) {
        int n = arr.length;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        updateDesce( arr);
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
