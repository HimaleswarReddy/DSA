package apna.strings;

//bruteforce but TLE

public class LeetCode28 {

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }


    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                if(haystack.charAt(i + j) != haystack.charAt(j)) {
                    break;
                }
                if(j == needle.length() - 1) {
                    return i;
                }
                j++;
            }
        }
        return -1;
    }
}


