package apna.arrays;

//Max subarray sum

public class MaxSubArraySumPrefixArr {
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        System.out.println(maxsum(arr));
    }
    static int maxsum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                int sum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
