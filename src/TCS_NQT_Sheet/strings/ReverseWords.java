package TCS_NQT_Sheet.strings;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "this is an amazing program";
        String[] arr = str.split(" ");

        StringBuilder st = new StringBuilder(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            st.append(" ").append(arr[i]);
        }
        System.out.println(st.toString());
    }
}
