package com.javaKunalClassesBasics;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("Given number is even");
        } else {
            System.out.println("Given number is odd");
        }
    }
}
