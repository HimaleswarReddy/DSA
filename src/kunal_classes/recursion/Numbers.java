package kunal_classes.recursion;

public class Numbers {
    public static void main(String[] args) {
        numbers(1, 5);
    }

    public static void numbers(int i, int n) {

        if (i > n) {
            return;
        }
        System.out.println(i);
        numbers(i + 1, n);


    }
}
