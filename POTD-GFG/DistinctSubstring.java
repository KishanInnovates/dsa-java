import java.util.HashSet;

public class DistinctSubstring {
    public static void main(String[] args) {
        System.out.println(lengthDistinctSubstring("geeksforgeeks")); // Output: 7
        System.out.println(lengthDistinctSubstring("aaa"));          // Output: 1
        System.out.println(lengthDistinctSubstring("abcdefabcbb"));  // Output: 6
    }

    public static int lengthDistinctSubstring(String s) {
        int maxLength = 0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
