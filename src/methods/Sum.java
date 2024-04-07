package methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
        System.out.println(sum3(20,30));
    }
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
//        int sum = num1+num2;
        return num2+num1;
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum of the numbers ="+sum);

    }
}
