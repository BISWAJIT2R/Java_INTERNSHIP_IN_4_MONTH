package Pattern.QuestionChapter;

public class ButterFly {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int m = 0; m <  i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
