package Function.NumberSystem;

public class DecimalToBinary {
    public static String Converter(int n ) {
        StringBuilder res = new StringBuilder(0);

        while (n > 0) {
            int reminder =  n % 2;
            res.append(reminder);
            n /= 2;
        }

        return res.toString();
    }
 public static String Converter3(int n ) {
        StringBuilder res = new StringBuilder(0);

        while (n > 0) {
            int reminder =  n % 8;
            res.append(reminder);
            n /= 8;
        }

        return res.toString();
    }

    public static int Converter2 (int n) {
        int i = 0;
        int res = 0;
        while (n > 0) {
            int last = n % 10;
            res += last * (int) Math.pow(2, i);
            i++;
            n /= 10;
        }
     return res;
    }
    public static int Converter4 (int n) {
        int i = 0;
        int res = 0;
        while (n > 0) {
            int last = n % 10;
            res += last * (int) Math.pow(8, i);
            i++;
            n /= 10;
        }
     return res;
    }
    public static void main(String[] args) {
        System.out.println(Converter(27));
        System.out.println(Converter2(11011));
        System.out.println(Converter3(27));
        System.out.println(Converter4(33));
    }
}
