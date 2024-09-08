package TCS_NQT_Sheet.arrays;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        String str = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(str));
    }
    public static int maxDepth(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == ')') {
                st.push(s.charAt(i));
            }
        }

        int max = 0;
        int k = st.size();
        for (int i = 0; i < k; i++) {
            int temp = 0;
            if(st.pop() == ')') {
                temp = 0;
            }
            temp++;
            max = Math.max(temp, max);
        }
        return max;

    }
}