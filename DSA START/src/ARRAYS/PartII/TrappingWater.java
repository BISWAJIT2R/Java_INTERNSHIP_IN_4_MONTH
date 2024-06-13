package ARRAYS.PartII;

public class TrappingWater {
    public static int CalculateMaxArea (int [] arr){
        int max = 0;
        for (int i  = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++){
                int width = Math.abs(j - i);
                int minHeight = Math.min(arr[i], arr[j]);
                int area = width * minHeight;
                max = Math.max(area, max);
            }
        }
        return  max;
    }
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(CalculateMaxArea(height));
    }
}
