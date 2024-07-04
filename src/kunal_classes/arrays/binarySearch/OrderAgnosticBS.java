package kunal_classes.arrays.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6,7,8,9,10};
        int[]arr2={10,9,8,7,6,5,4,3,2,1};
        System.out.println(orderAgnosticBD(arr1,9));
        System.out.println(orderAgnosticBD(arr2,9));

    }
    static int orderAgnosticBD(int[]arr,int target){
        int start=0;
        int end = arr.length-1;

        boolean isASC=arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;

            if(target==arr[mid]){
               return mid ;
            }

            if (isASC){
                if(target<mid){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else{
                if(target>mid){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;

    }
}
