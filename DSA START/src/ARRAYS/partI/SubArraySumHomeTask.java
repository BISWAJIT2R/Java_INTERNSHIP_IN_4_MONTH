package ARRAYS.partI;

public class SubArraySumHomeTask {
    public  static int maxSum (int [] arr) {
        int max = 0;
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            int sum = 0;
            for (int j = i+1; j<n ;j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    max = Math.max(sum, max);
                }
            }
        }

        return max;
    }

    public static int maxSum2 (int [] arr) {
        int max = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
                int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,3,8,6,7,9};
        System.out.println(maxSum2(arr));
    }
}
