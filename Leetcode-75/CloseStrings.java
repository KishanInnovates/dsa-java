import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CloseStrings {
    public static void main(String[] args) {
        String  word1 = "abc";
        String word2 = "bca";
        boolean result = iscloseString(word1, word2);
        System.out.println(result);
    }

    public static boolean iscloseString(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
            set1.add(c);
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
            set2.add(c);
        }

        if(!set1.equals(set2)){
            return false;
        } 

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}
