package Variables;

import java.util.Scanner;

public class CostWithGst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pencil cost: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter pen cost: ");
        float pen = sc.nextFloat();
        System.out.println("Enter eraser cost: ");
        float eraser = sc.nextFloat();

        float totalCost = pen+ pencil+eraser;
        float gst = totalCost + (totalCost * 0.18f);

        System.out.println(gst);
       int $ = 24;
    }
}
