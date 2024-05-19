
import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
   
        if (n % 2 == 0) {
            System.out.println("Even number");
        }else {
            System.out.println("Odd Number");
        }
    }
}
