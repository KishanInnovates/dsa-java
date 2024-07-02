public class HappyNumber {
    public static void main(String[] args) {
        int n = 191;
        boolean result = happyNumber(n);
        System.out.println(result);
    }

    public static boolean happyNumber(int n) {

        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    public static int findSquare(int n) {
        int ans = 0;

        while (n > 0) {
            int r = n % 10;
            ans += r * r;
            n /= 10;
        }
        return ans;
    }
}
