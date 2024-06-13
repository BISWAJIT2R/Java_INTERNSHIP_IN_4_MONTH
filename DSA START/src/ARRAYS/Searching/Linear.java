package ARRAYS.Searching;

public class Linear {
    public static void checkSearch (int []arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key ) {
                System.out.println("True");
                return;
            }
        }

        System.out.println("False");
    }
    public static void main(String[] args) {
        int [] num = {1,3,8,9,7,6,2,4,5};
        int key = 7;

        checkSearch(num, key);
    }
}
