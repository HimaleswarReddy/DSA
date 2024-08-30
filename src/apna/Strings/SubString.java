package apna.Strings;

public class SubString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5));
        //inbuilt function
        System.out.println(str.substring(0, 5));
    }
    public static String subString(String str, int start, int end) {
        String str1 = "";
        for (int i = start; i < end; i++) {
            str1 += str.charAt(i);
        }
        return str1;
    }
}
