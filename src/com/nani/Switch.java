package com.nani;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Eat a apple every day,keep the doctor away");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("Enter the valid fruit");
        }

    }
}
