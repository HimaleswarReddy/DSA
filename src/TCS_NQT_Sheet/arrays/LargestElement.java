package TCS_NQT_Sheet.arrays;

        /*Given an array, we have to find the largest element in the array.
        Example 1:
        Input:
         arr[] = {2,5,1,3,0};
        Output:
         5
        Explanation:
         5 is the largest element in the array.

        Example2:
        Input:
         arr[] = {8,10,5,7,9};
        Output:
         10
        Explanation:
         10 is the largest element in the array.
         */
public class LargestElement {
            public static void main(String[] args) {
                int[] arr = {2,5,1,3,0};
                System.out.println(largestNumber(arr));
            }

            static int largestNumber(int[] arr) {
                int largest = Integer.MIN_VALUE;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > largest) {
                        largest = arr[i];
                    }
                }
                return largest;
            }
}
