package kunal_classes.methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        String personalisedMessage = greet1(name);
        System.out.println(personalisedMessage);
    }

    static String greet1(String name) {
        String personalised = "Hello "+name;
        return personalised;
    }

    static String greet(){
        return "How are you...?";
    }
}
