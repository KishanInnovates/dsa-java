import java.util.HashMap;

public class KPalindromeStrings {
    public static void main(String[] args) {
        //https://leetcode.com/problems/construct-k-palindrome-strings/description/?envType=daily-question&envId=2025-01-11
        String s = "annabelle";
        int k = 2;
        System.out.println(canConstruct(s, k));
    }

    public static boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for (int freq : map.values()) {
            if (freq % k != 0)
                count++;

        }
        return count <= k;
    }
}
