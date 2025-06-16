public class substringpalindrome {
    public static void main(String[] args) {
         boolean[][] dp = new boolean[n][n];
        int count = 0;
        
        // Loop for substrings of length 1 (all single characters, but not counted)
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        
        // Loop for substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                count++;
            }
        }
        
        // Loop for substrings of length greater than 2
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    count++;
                }
            }
        }
        
        return count;
    }
    
}
