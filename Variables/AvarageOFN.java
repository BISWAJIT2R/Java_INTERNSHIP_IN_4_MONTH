package Variables;

import java.util.Scanner;

public class AvarageOFN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avarage = (a+b+c )/ 3.0f;

        System.out.println(avarage);

    }
}
