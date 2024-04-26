package KunalClasses.arrays;

public class maxInRange {
    public static void main(String[] args) {
        int [] arr={32, 43, 64, 42, 65, 1, 87};
        System.out.println(maxInRange(arr,0,3));
    }
    static int maxInRange(int [] arr,int startIndex,int endIndex){
        int max=arr[startIndex];
        for (int i = startIndex+1;i<=endIndex;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
