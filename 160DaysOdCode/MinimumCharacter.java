public class MinimumCharacter {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.print("The minimum length of the substring is:" + minChar(s1));
    }

    public static int minChar(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        String concat = s + "#" + reverse;

        int lps = computeLPS(concat);

        return s.length() - lps;
    }

    public static int computeLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0;
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
        return lps[n - 1];
    }
}
