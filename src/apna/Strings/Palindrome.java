package apna.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "nani";
        String str1 = "noon";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 -i)) {
                return false;
            }

        }
        return true;
    }
}
