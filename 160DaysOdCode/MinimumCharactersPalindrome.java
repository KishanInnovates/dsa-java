class MinimumCharactersPalindrome {
    public static int minCharsToAdd(String s) {
        
        String reverse = new StringBuilder(s).reverse().toString();
        String concat = s + "#" + reverse;

        
        int lps = computeLPS(concat);

        
        return s.length() - lps;
    }

    private static int computeLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps[n - 1]; // The value at the last index of the LPS array
    }

    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(minCharsToAdd(s1)); // Output: 2

        String s2 = "aacecaaaa";
        System.out.println(minCharsToAdd(s2)); // Output: 2

        String s3 = "abcd";
        System.out.println(minCharsToAdd(s3)); // Output: 3
    }
}

