package ARRAYS.Searching;

public class BinarySearch {
    public static void check (int [] arr, int key) {
        int st = 0;
        int ed = arr.length - 1;

        while (st <= ed) {
            int mid = (ed + st) / 2;

            if (arr[mid] == key) {
                System.out.println(arr[mid]+" " + mid);
                return;
            }

            if (arr[mid] < key) {
                st = mid + 1;
            }else {
                ed = mid - 1;
            }
        }
    }
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7,8,9};
        int key = 1;
        check(num, key);
    }
}
