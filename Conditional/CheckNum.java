package Conditional;

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number to check the number is positive or negative: ");
        int num = sc.nextInt();

        if (num < 0 ) {
            System.out.println("Negative number");
        }else {
            System.out.println("Positive number");
        }
    }
}
