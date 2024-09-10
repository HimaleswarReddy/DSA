package apna.arrays_2d;

public class DiagonalSum_Optimized {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(sprialSum(arr));
    }
    public static int sprialSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //pd
            sum += arr[i][i];
            //secondaryDiagonal
            if(i != arr.length - 1 - i) {
                sum += arr[i][arr.length - 1 -i];
            }
        }
        return  sum;
    }
}
