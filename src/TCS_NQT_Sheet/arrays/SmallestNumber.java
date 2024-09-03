package TCS_NQT_Sheet.arrays;

//Find the smallest number in an array
         /*Example 1:
            Input: arr[] = {2,5,1,3,0};
            Output: 0
            Explanation: 0 is the smallest element in the array.

          */
public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println(smallestNumber(arr));
    }

    public static int smallestNumber(int[] arr) {
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
