package ARRAYS.TWOD;

public class DiagonalSum {

    public static  int calculateSum (int [] [] arr) {
        int sum = 0;
        int n = arr.length;

//        for (int i = 0; i < n; i++) {
//            for (int j = 0;  j < arr[0].length; j++) {
//                if (i == j) {
//                    sum += arr[i][j];
//                } else if (i+j == arr[0].length - 1) {
//                    sum+= arr[i][j];
//                }
//            }
//        }

//        time complexity -> outer loop and inner loop runs 0 to n -1, so it's O(n^2)

        for (int i = 0; i < n; i++) {

            sum += arr[i][i];

            if (i != arr.length - i - 1) {
                sum += arr[i] [arr.length - i - 1];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int [] [] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        System.out.println(calculateSum(arr));
    }
}
