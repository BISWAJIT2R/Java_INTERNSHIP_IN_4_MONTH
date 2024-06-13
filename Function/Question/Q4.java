package Function.Question;

import java.util.Scanner;

public class Q4 {
    public  static  int sum (int n ) {
        int res = 0;
        res += n;

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int last;

        int res = 0;
        do {
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            res += n;
            System.out.println(res);
             last = res % 10;
        }while (last > 0);
    }
}
