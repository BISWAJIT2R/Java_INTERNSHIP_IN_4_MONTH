package Loop;

import java.util.Scanner;

public class InputGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Your number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }

            System.out.println(n);


        } while (true);
    }
}
