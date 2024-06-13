package Function;

public class Factorial {
    public static int CalculateFactorial(int n){
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static int CalculateUsingRecursion(int n) {
       if (n == 1) {
           return 1;
       }

       return n * CalculateUsingRecursion(n -1);
    }
    public static void main(String[] args) {
        System.out.println(CalculateFactorial(5));
        System.out.println(CalculateUsingRecursion(5));
    }
}
