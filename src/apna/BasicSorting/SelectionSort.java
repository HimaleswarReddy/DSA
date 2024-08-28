package apna.BasicSorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1, 9, 10};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;

        }
    }
}
