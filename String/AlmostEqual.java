class AlmostEqual {
    public static void main(String[] args) {
        String s1 = "kelb";
        String s2 = "kelb";
        boolean result = areAlmostEqual(s1, s2);
        System.out.println(result);
    }
    // https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/description/?envType=daily-question&envId=2025-02-05

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;

        int n = s1.length();
        int first = -1, second = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count == 1)
                    first = i;
                else if (count == 2)
                    second = i;
                else
                    return false;
            }

        }
        return count == 2 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);
    }
}