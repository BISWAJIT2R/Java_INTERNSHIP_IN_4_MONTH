package ARRAYS.TWOD;

import java.util.Scanner;

public class TwoArray {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

         int [] [] arr = {
                 {1,2,3},
                 {4,5,6},
                 {7,8,9},
         };

//        System.out.println(arr[0][2]);

        int [] [] arr2 = new int[3][3];

        for (int i = 0; i < 3; i++) { // track Row
            for (int j = 0; j < 3; j++) { // track col
                arr2[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++) { // track Row
            for (int j = 0; j < 3; j++) { // track col
               if (arr2[i][j] > max){
                   max = arr2[i][j];
               }
               if (arr2[i][j] < min){
                   min = arr2[i][j];
               }
            }
            System.out.println();
        }

        System.out.println(max);
        System.out.println(min);
    }
}
