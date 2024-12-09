import java.util.ArrayList;
import java.util.HashSet;

//https://leetcode.com/problems/keyboard-row/
public class FindWords {
    public static void main(String[] args) {
        String[] words1 = {"Hello", "Alaska", "Dad", "Peace"};
        String[] words2 = {"omk"};
        String[] words3 = { "adsdf", "sfd" };

        System.out.println(String.join(", ", findWords(words1)));
        System.out.println(String.join(", ", findWords(words2)));
        System.out.println(String.join(", ", findWords(words3)));
    }

    public static String[] findWords(String[] words) {
        HashSet<Character> row1 = new HashSet<>();
        HashSet<Character> row2 = new HashSet<>();
        HashSet<Character> row3 = new HashSet<>();

        for (char c : "qwertyuiop".toCharArray()) {
            row1.add(c);
        }
        for (char c : "asdfghjkl".toCharArray()) {
            row2.add(c);
        }
        for (char c : "zxcvbnm".toCharArray()) {
            row3.add(c);
        }

        ArrayList<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            char firstChar = lower.charAt(0);

            HashSet<Character> row = null;
            if (row1.contains(firstChar))
                row = row1;
            else if (row2.contains(firstChar))
                row = row2;
            else if (row3.contains(firstChar))
                row = row3;

            boolean isValid = true;
            for (char c : lower.toCharArray()) {
                if (!row.contains(c)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result.add(word);
            }

        }
        return result.toArray(new String[0]);
    }
}
