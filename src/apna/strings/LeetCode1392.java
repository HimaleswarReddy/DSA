package apna.strings;


// BruteForce approach in leetcode
public class LeetCode1392 {
    public static void main(String[] args) {
        System.out.println(longestPrefix("level"));
    }
    public static String longestPrefix(String s) {

        String str = "";

        for(int i = 0; i < s.length(); i++) {
            if (s.substring(0, i).equals(s.substring(s.length()  - i))) {
                str = s.substring(0, i);
            }
        }
        return str;
    }
}
