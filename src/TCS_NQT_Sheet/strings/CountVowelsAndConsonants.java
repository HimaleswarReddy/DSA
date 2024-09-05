package TCS_NQT_Sheet.strings;

//count the number of vowels, consonants, and spaces in that string.
import java.util.HashMap;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        System.out.println(countVowelsAndConsonantsAndSpaces(str));
    }

    public static String countVowelsAndConsonantsAndSpaces(String str) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                hm.put("Vowels", hm.getOrDefault("Vowels", 0) + 1);
            } else if (str.charAt(i) == 'a'||str.charAt(i) == 'e'|| str.charAt(i) == 'o' ||str.charAt(i) == 'i' ||str.charAt(i) == 'u' || str.charAt(i) == 'A'||str.charAt(i) == 'E'|| str.charAt(i) == 'O' ||str.charAt(i) == 'I' ||str.charAt(i) == 'U') {
                hm.put("Consonant",hm.getOrDefault("Consonant", 0) + 1);
            } else {
                hm.put("Space", hm.getOrDefault("Space", 0) + 1);
            }
        }
        return "Vowels: " + hm.get("Vowels") + "\nConsonant: " + hm.get("Consonant") + "\nSpaces: " + hm.get("Space");
    }
}
