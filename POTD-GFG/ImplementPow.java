public class ImplementPow {
    public static void main(String[] args) {
        double b = 3.00000;
        int e = 5;
        double res = power(b, e);
        System.out.println(res);
    }

    public static double power(double b, int e) {
        if (e < 0)
            return 1 / power(b, -e);
        if (e == 0)
            return 1;
        if (e == 1)
            return b;
        double halfPow = power(b, e / 2);
        if (e % 2 == 0)
            return halfPow * halfPow;
        return b * halfPow * halfPow;
    }
}
