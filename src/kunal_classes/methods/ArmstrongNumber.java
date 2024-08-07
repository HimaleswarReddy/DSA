package kunal_classes.methods;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int m = sc.nextInt();

        System.out.println(isArmstrong(m));
        for(int i =100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n ){
        int sum = 0;
        int original = n;
        while (n>0){
            int rem=n%10;
            n/=10;
            sum=sum+rem*rem*rem;
        }
        return sum == original;

    }
}
