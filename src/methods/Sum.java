package methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        sum();


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
