public class ReverseInteger {
    public static void main(String[] args) {
        int n = 123;
        System.out.println("The reverse of the number is: " + reverse(n));
    }
    // https://leetcode.com/problems/reverse-integer/description/

    public static int reverse(int n) {
        long ans = 0;

        while (n != 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : (int) ans;
    }
}
