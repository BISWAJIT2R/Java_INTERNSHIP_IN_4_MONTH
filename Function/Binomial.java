package Function;

import java.util.Scanner;

public class Binomial {
    public static int CalculateUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }

        return n * CalculateUsingRecursion(n -1);
    }

    public static int myResult (int n, int r) {
        int res = CalculateUsingRecursion(n) / (CalculateUsingRecursion(r) * CalculateUsingRecursion(n-r));
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(myResult(5, 2));
    }
}
