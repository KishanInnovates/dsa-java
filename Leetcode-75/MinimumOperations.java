public class MinimumOperations {
    public static void main(String[] args) {
        String s = "abaacbcbb";
        System.out.println(minLength(s));
    }

    public static int minLength(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int result = 0;
        for (int count : freq) {
            if (count % 2 == 0) {
                result += Math.min(2, count);
            } else {
                result += 1;
            }
        }
        return result;
    }
}
