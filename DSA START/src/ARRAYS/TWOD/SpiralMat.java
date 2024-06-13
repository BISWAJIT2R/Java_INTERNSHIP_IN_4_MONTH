package ARRAYS.TWOD;

public class SpiralMat {
    public static void Print (int [] [] arr) {
        int n = arr.length;

        int startRow = 0;
        int endRow =  n-1;
        int startCol = 0;
        int endCol= arr[0].length-1;

        while (startRow <=endRow && startCol <= endCol) {
            for (int top = startCol; top <= endCol; top++) {
                System.out.print(arr[startCol][top] + " ");
            }

            for (int right = startCol + 1; right <= endRow; right++) {
                System.out.print(arr[right][endCol] + " ");
            }

            for (int bottom = endCol - 1; bottom >= startCol; bottom--) {
                System.out.print(arr[endRow][bottom] + " ");
            }


            for (int left = endRow - 1; left >= startRow + 1; left--) {
                System.out.print(arr[left][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
    }
    public static void main(String[] args) {
        int [] [] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        Print(arr);
    }
}
