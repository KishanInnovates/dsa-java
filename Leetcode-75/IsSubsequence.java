class IsSubsequence{
    public static void main(String[] args) {
        String s = "ace";
        String t = "abcde";
        boolean result = isSubsequence(s, t);
        System.out.println(result);
    }

    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }
}