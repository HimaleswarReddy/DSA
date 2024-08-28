package apna.BasicSorting;
import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3,4,5};
        countingSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void countingSort(int[] arr) {
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largestNumber = Math.max(largestNumber, arr[i]);
        }
        int[] count = new int[largestNumber + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
        }
    }
}
