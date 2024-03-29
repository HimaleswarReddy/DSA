package com.javaKunalClassesBasics;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        System.out.print("Enter the number for which you need to find the frequency: ");
        int fNum= sc.nextInt();

        int count = 0;
        while(num>0){
            int rem = num%10;
            if (rem==fNum){
                count++;
            }
            num = num/10;
        }
        System.out.println("Frequency =" +count);
    }
}
