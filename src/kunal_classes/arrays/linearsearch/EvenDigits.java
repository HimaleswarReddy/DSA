package kunal_classes.arrays.linearsearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={123,23,52,652,42,6,1};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] arr){
        int count = 0;
        for(int nums:arr){
            if(even(nums)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberOfDigits=digits(num);
        return numberOfDigits%2==0;
    }

    static int digits(int num){
        if (num<0){
            num*=-1;
        }

//        if(num==0){
//            return 1;
//        }
//
//        int count=0;
//        while(num>0){
//            count++;
//            num/=10;
//
//        }
//        return count;
        return (int)(Math.log10(num))+1;
    }
}
