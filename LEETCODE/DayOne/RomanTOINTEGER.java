package LEETCODE.DayOne;

public class RomanTOINTEGER {
    public static int RomanToInteger (char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };

    }
    public static void main(String[] args) {
        String Roman = "MCMXCIV";
        int res = 0;

        for (int i = 0; i < Roman.length(); i++){
            char ch = Roman.charAt(i);
            int number = RomanToInteger(ch);

            if (i + 1 < Roman.length() && number < RomanToInteger(Roman.charAt(i + 1))) {
                res -= number;
            } else {
                res += number;
            }
        }

        System.out.println(res);
    }

}
