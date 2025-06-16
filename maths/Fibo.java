public class Fibo {
    public static void main(String[] args) {
         int n = 5;
        int[] fibonacciSequence = fib(n);
        for (int i = 0; i < fibonacciSequence.length; i++) {
            System.out.print(fibonacciSequence[i]);
        }
    }

    public static int[] fib(int n) {
        int mod = 1000000007;
        int[] f = new int[n + 1];

        f[0] = 0;
        if (n > 0) {
            f[1] = 1;
        }
        for (int i = 2; i <= n; i++) {
            f[i] = (f[i - 1] + f[i - 2]) % mod;
        }
        return f;
    }
}
