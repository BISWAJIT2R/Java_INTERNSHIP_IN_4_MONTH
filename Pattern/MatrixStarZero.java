package Pattern;

public class MatrixStarZero {
    public static void main(String[] args) {
//        Outer loop
        for (int i = 0; i < 4; i++) {
//            star
            for (int st = 0; st < 4 - i; st++) {
                System.out.print("* ");
            }

//            Zero
            for (int z = 0; z < i; z++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
