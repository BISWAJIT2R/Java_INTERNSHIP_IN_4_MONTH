package String.Easy;

public class CountVowel {

    public static int count (String str) {
        int n =  str.length();

        int count = 0;

        for (int i = 0; i < n ;i ++) {
            char ch = str.charAt(i);
            if (check(ch)) {
                count++;
            }
        }

        return count;
    }
    public static boolean check (char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        String str = "Biswajit Das";
        System.out.println(count(str));
    }
}
