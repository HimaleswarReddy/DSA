package apna.fuctions;

import java.util.Scanner;

public class DecimalTOBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(binary(n));
    }
    static int binary(int n) {
        int binarynumber = 0;
        int rem = 0;
        int pow = 0;
        while (n > 0) {
            rem = n % 2;
            binarynumber = (int) (binarynumber +(rem * Math.pow(10, pow)));
            n /= 2;
            pow++;
        }
        return binarynumber;
    }
}
