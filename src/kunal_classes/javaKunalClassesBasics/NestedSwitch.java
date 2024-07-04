package kunal_classes.javaKunalClassesBasics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

// switch (empID){
//     case 1:
//         System.out.println("Nani");
//         break;
//     case 2:
//         System.out.println("Himaleswar Reddy");
//         switch (department){
//             case "IT":
//                 System.out.println("He is working in IT department");
//                 break;
//             case "Management":
//                 System.out.println("He is working in Management department");
//                 break;
//             default:
//                 System.out.println("Enter a valid department name");
//         }
//         break;
//     case 3:
//         System.out.println("Praneeth");
//         break;
//     default:
//         System.out.println("Enter valid employee ID");
// }

        switch (empID) {
            case 1 -> System.out.println("Nani");
            case 2 -> {
                System.out.println("Himaleswar Reddy");
                switch (department) {
                    case "IT" -> System.out.println("He is working in IT department");
                    case "Management" -> System.out.println("He is working in Management department");
                    default -> System.out.println("Enter a valid department name");
                }
            }
            case 3 -> System.out.println("Praneeth");
            default -> System.out.println("Enter valid employee ID");
        }


    }
}
