import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "kishan";
        String s2 = "shanki";
        boolean result = isAnagram(s1, s2);
        System.out.print("The given string is anagram: " + result);
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] charArrayA = s1.toCharArray();
        char[] charArrayB = s2.toCharArray();

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        return Arrays.equals(charArrayA, charArrayB);
    }
}
