package apna.arrays;
import java.util.*;
//leetcode problem not yet solved
class Solution {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(228, 394, 463, 227, 388, 757, 782 ,238, 967));
        System.out.println(pairWithMaxSum(arr));
    }
    // Function to find pair with maximum sum
    public static int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int largest = 1;
        int sl = 1;

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > largest) {
                sl = largest;
                largest = arr.get(i);
            } else if (arr.get(i) < largest && arr.get(i) > sl) {
                sl = arr.get(i);
            }
        }

        return largest + sl;
    }
}