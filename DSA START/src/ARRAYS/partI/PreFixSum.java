package ARRAYS.partI;

public class PreFixSum {
    public static int calculateSum (int [] arr) {
        int [] prefix = new int[arr.length];
        int  n = arr.length;
        int max = 0;
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i =1; i < n; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum = prefix[j] - prefix[i-1];
                max = Math.max(sum, max);
            }
        }

        return max;
    }
    public static void main(String[] args) {
       int [] arr = {1,-2,6,-1,3};
        System.out.println( calculateSum(arr));
    }
}
