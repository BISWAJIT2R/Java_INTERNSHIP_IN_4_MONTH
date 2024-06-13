package Function.Question;

public class Q2 {
    public static boolean IsEven (int n ) {

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(IsEven(3));
    }
}
