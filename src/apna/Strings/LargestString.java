package apna.Strings;

public class LargestString {
    public static void main(String[] args) {
        String[] arr = {"apple", "ball", "Mango"};

        String largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest.compareToIgnoreCase(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
