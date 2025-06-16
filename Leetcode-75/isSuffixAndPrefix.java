public class isSuffixAndPrefix {
    public static void main(String[] args) {
        String[] words = { "a", "aba", "ababa", "aa" };
        int result = countPrefixAndSuffix(words);
        System.out.println(result);
        //https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/description/?envType=daily-question&envId=2025-01-08
    }

    public static int countPrefixAndSuffix(String[] words) {
        int n = words.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPrefixAndSuffix(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return false;
        }

        boolean isPrefix = str2.startsWith(str1);
        boolean isSuffix = str2.endsWith(str1);

        return isPrefix && isSuffix;
    }
}
