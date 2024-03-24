package com.nani;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String lowerCase = str.toLowerCase();
        StringBuilder str1 = new StringBuilder(lowerCase);
        str1.reverse();

        if(lowerCase.equals(str1.toString())){
            System.out.println("Palindrome String");
        }else{
            System.out.println("not a Palindrome");
        }
    }
}
