package apna.advance_patterns;

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        zeroOneTriangle(n);
    }
    static void zeroOneTriangle(int n) {
        int difference = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                difference = i - j;
                if (difference % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
