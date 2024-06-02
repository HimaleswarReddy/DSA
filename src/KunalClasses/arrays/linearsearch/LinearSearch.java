package KunalClasses.arrays.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] nums={1,5,86,93,74,64,63,35};
        int target = 63;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index< arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;
    }
}
