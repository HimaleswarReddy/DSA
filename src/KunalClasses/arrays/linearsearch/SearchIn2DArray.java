package KunalClasses.arrays.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums={
                {2,3,5},
                {11,22,44},
                {23,24,34,54}
        };
        int target=34;
        int[] ans=search(nums,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(nums));

    }

    static int[] search(int[][] arr, int target){
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max= Integer.MIN_VALUE;
        for(int[] ints:arr){
            for(int element:ints){
                if(element>max){
                    max=element;
                }
            }

        }
        return max;
    }
}
