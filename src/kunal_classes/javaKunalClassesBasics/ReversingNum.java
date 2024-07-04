package kunal_classes.javaKunalClassesBasics;

import java.util.Scanner;

public class ReversingNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the  number for which you need to find reverse: ");
        int num  =sc.nextInt();

        System.out.print("Reverse of "+num+" is ");
        while(num>0){
            int rem = num%10;
            System.out.print(rem);
            num/=10;
        }
    }
}
