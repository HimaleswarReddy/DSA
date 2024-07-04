package kunal_classes.arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 83, 40, 23};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max=arr[0];
        for (int i =0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;

    }
}
