import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public static void main(String[] args) {

    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        int[] requiredFreq = new int[26];

        for (String b : words2) {
            int[] freq = countFrequency(b);
            for (int i = 0; i < 26; i++) {
                requiredFreq[i] = Math.max(requiredFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (String a : words1) {
            int[] freq = countFrequency(a);
            if (isUniversal(freq, requiredFreq)) {
                result.add(a);
            }
        }
        return result;
    }

    public static int[] countFrequency(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static boolean isUniversal(int[] wordFreq, int[] requiredFreq) {
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < requiredFreq[i]) {
                return false;
            }
        }
        return true;
    }
}
