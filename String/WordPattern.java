import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {

    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(w)) {
                    return false;
                }
            } else {
                charToWord.put(c, w);
            }
            if (wordToChar.containsKey(w)) {
                if (wordToChar.get(w) != c) {
                    return false;
                }
            } else {
                wordToChar.put(w, c);
            }
        }
        return true;
    }
}
