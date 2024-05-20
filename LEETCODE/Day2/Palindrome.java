package LEETCODE.Day2;

import java.util.Scanner;

public class Palindrome {
    public  static  boolean  isPalindrome(int x) {
          if (x < 0) {
              return false;
          }

          int reverseNumber = reverseFn(x);

        return x == reverseNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }

    public static int reverseFn (int n) {
        int reverse = 0;
        while (n != 0) {
            int lastDigit = n % 10;
             reverse = (reverse * 10) + lastDigit;
             n /= 10;
        }

        return reverse;
    }
}
