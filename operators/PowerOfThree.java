public class PowerOfThree {
    public static void main(String[] args) {
        int a = 27;
        boolean result = power(a);
        System.out.println(result);
    }

    static boolean power(int n) {
        return n > 0 && Math.pow(3, 19) % n == 0;
    }
}
