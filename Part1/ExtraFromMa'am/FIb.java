// package Part1;

import java.util.Scanner;

public class FIb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {
            int third = first + second;
            System.err.println(third);
            first = second;
            second = third;
        }
    }
}
