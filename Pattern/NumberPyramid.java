package Pattern;

public class NumberPyramid {
    public static void main(String[] args) {
//        outer loop
        char ch = 'A';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
