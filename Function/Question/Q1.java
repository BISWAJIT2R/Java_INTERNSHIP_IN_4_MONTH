package Function.Question;

import java.util.Scanner;

public class Q1 {

    public static  void Avarage (int a, int b, int c) {
        int av = (a+b+c) / 3;
        System.out.println(av);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Avarage(a,b,c);
    }
}
