package KunalClasses.javaKunalClassesBasics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //    System.out.print("Enter your roll number:");
        //  int rollNo = input.nextInt();
        //System.out.println("Your roll number is "+rollNo);

        //Type Casting

        int num = (int)(67.56f);
        System.out.println(num);

        //automatic type promotion in expressions

        int a = 257;
        byte b= (byte)(a); //257%256=1



    }
}