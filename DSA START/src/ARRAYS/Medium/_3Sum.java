package ARRAYS.Medium;

public class _3Sum {

    public static void Three(int [] arr) {
        int n = arr.length;
        for (int i =0 ; i < n - 2; i++) {
            System.out.print(arr[i]);
            System.out.print(arr[i+1]);
            System.out.print(arr[i+2]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] arr ={-1, 0 , 1, 2, -1, -4};
        Three(arr);
    }
}
