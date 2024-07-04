package kunal_classes.javaKunalClassesBasics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the principle amount:");
        int p = sc.nextInt();
        System.out.print("Enter the time(in years) of loan:");
        float t = sc .nextFloat();
        System.out.print("Enter the rate of interest");
        float r = sc.nextFloat();
        float si = p*t*r/100;
        System.out.print("The Simple Interest for the give data is "+si);
    }
}
