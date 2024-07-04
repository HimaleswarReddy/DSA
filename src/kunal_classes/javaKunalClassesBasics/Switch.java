package kunal_classes.javaKunalClassesBasics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Eat a apple every day,keep the doctor away");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("small fruit");
//            default -> System.out.println("Enter the valid fruit");
//        }
        int day = sc.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }
//
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


    }
}
