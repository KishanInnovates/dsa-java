class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = { "geeksforgeek", "geeks", "geek", "geezer" };
        int n = str.length;

        System.out.println(commonPrefix(str, n));
    }

    public static String commonPrefix(String[] arr, int n) {
        if (arr == null || n == 0) {
            return "-1";
        }

        String prefix = arr[0];

        for (int i = 1; i < n; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "-1";
                }
            }
        }
        return prefix;
    }
}