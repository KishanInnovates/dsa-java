import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKUnique {
    public static void main(String[] args) {

    }

    public static int longestUniqeSubstring(String s, int k) {
        if (s == null || s.length() == 0 || k == 0)
            return -1;

        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = -1;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            if (map.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }
}
