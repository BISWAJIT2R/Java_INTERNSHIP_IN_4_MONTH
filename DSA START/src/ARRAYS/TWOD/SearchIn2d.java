package ARRAYS.TWOD;

public class SearchIn2d {
    public static boolean sort (int [] [] arr,  int key) {
        int n = arr.length;

          /*  for (int j  = 0; j < arr[0].length; j++){
                if (arr[i] [j] == key) {
                    return true;
                }
            } O(n^2) */
        for (int i = 0; i < n; i++) {

            int st = 0;
            int ed = arr[0].length - 1;

            while (st <= ed) {
                int mid = st + (ed - st) / 2;

                if (arr[i][mid] == key) {
                    return true;
                }

                if (arr[i] [mid] < key) {
                    st = mid + 1;
                }else {
                    ed = mid - 1;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int [] [] arr = {
                {10,20,30,40},
                {15, 25,35,45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        System.out.println(sort(arr, 27));
    }
}
