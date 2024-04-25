class FindSubstring {
    public static void main(String[] args) {
        String str = "kishan";
        String str1 = "s";
        int result = indexofsubstring(str, str1);
        System.out.println(result);
    }

    public static int indexofsubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
