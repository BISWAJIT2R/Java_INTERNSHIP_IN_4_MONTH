package Function.Question;

public class Q3 {

    public static boolean isPalindrome (int n) {
        int store = n;
        int rev = 0;
        int i = 0;
        while (n > 0) {
            int last = n % 10;
            rev = (rev * 10 )+ last;
            n /= 10;
        }
//        System.out.println(rev);
        return store == rev;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }
}
