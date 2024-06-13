package Function;

public class PrimeNumber {
    public static boolean isPrimeNumber (int n) {

        for (int i = 2; i <= n -1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean optimisePrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public  static void prime (int n) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 2; i <= n; i++) {
            if (optimisePrime(i)) {
                sum1 += i;
            }else {
                sum2 += i;
            }
        }

        System.out.println("Prime: " + sum1);
        System.out.println("even: " + sum2);
    }

    public static void main(String[] args) {
        prime(12);
    }
}
