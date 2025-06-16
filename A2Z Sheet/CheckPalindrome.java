public class CheckPalindrome {
    public static void main(String[] args) {
        int n = 13;
        System.out.print("The given number is palindrome: " + isPalindrome(n));
    }
    //https://leetcode.com/problems/palindrome-number/description/

    public static boolean isPalindrome(int n) {
        int sum = 0;
        int temp = n;

        while (n > 0) {
            int ld = n % 10;
            sum = sum * 10 + ld;
            n /= 10;
        }
        if (sum == temp) {
            return true;
        } else {
            return false;
        }
    }
}
