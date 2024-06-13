package Pattern.QuestionChapter;

public class HalfPyramid {
    public static void main(String[] args) {
      /*  for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++){
                System.out.print("  ");
            }

            for (int k = 0;  k < 5-(5-i-1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

       */
//        Optimize logic
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print("  ");
//            }
//
//            for (int k = 0; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 5-i-1) {
                    System.out.print(" ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
