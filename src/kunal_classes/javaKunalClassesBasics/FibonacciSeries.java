package kunal_classes.javaKunalClassesBasics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number of the series:");
        int n1 =sc.nextInt();
        System.out.print("Enter the second number of the series:");
        int n2 =sc.nextInt();

        System.out.print("Enter the count(where the series should break):");
        int count=sc.nextInt();
        System.out.print(n1+" "+n2);
        for(int i =2;i<=count;i++){
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
