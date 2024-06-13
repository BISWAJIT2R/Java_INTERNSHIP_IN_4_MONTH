package Pattern.QuestionChapter;

public class Flody {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            int startDigit = (i % 2 == 0)? 0 : 1;
            System.out.println("iam " + i);
            System.out.println(startDigit);
            for (int j = 0; j <= i; j++) {
                System.out.print("inner" + startDigit+ " ");
                startDigit = 1 - startDigit;
            }
            System.out.println();
        }

//        System.out.println(1%2);
    }
}
