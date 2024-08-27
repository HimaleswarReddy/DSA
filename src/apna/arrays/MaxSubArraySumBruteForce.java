package apna.arrays;

import java.util.Scanner;

public class MaxSubArraySumBruteForce {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        System.out.println(maxsum(arr));
    }
    static int maxsum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
