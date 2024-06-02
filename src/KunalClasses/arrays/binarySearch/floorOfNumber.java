package KunalClasses.arrays.binarySearch;

public class floorOfNumber {
    public static void main(String[] args) {
        int [] arr={22,20,18,17,16,14,12,8,5,1};
        int ans=ceiling(arr,15);
        System.out.println(arr[ans]);
    }
    static  int ceiling(int[]arr,int target){
        int start=0;
        int end= arr.length-1;

        boolean isAsc=arr[start]<=arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(arr[mid]<target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        int returnIndex=isAsc?end:start;
        return returnIndex;
    }
}
