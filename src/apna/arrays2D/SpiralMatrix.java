package apna.arrays2D;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        sprialPrint(arr);
    }
    public static void sprialPrint(int[][] arr) {
        int startcol = 0;
        int endcol = arr[0].length - 1;
        int startrow = 0;
        int endrow = arr.length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            //for top row printing
            for (int i = startcol; i <= endcol; i++ ) {
                System.out.print(arr[startrow][i] + " ");
            }

            //for printing endcol
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }

            //for printing bottom row
            for (int i = endcol - 1; i >= startcol; i--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(arr[endrow][i] + " ");
            }

            //for printing startcol
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(arr[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }
}
