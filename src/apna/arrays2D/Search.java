package apna.arrays2D;

public class Search {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        System.out.println(search(arr, 33));
    }
    public static boolean search(int[][] arr, int key) {
        int currRow = 0;
        int currCol = arr[0].length - 1;

        while (currRow <= arr.length - 1 && currCol >= 0){
            if(key == arr[currRow][currCol]) {
                return true;
            } else if(key > arr[currRow][currCol]) {
                currRow++;
            } else {
                currCol--;
            }
        }
        return false;

    }
}
