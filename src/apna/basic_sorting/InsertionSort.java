package apna.basic_sorting;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 5};
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int cur = numbers[i];
            int previous = i - 1;
            while (previous >= 0 && numbers[previous] > cur) {
                numbers[previous + 1] = numbers[previous];
                previous--;
            }
            //insertion
            numbers[previous + 1] = cur;

        }
    }
}
