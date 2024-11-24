public class SumofAllDivisors {
    public static void main(String[] args) {
        int n = 4;

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * (n / i);
        }

        System.out.print("The sum of all divisors from 1 to " + n + " is: " + sum);
    }
}
