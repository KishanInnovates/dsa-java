public class XorInARange {
    public static void main(String[] args) {
        int L = 4, R = 8;
        System.out.println(findXor(L, R)); 
    }

    public static int findXor(int l, int r) {
        return xor(l - 1) ^ xor(r);
    }

    public static int xor(int n) {
        if (n % 4 == 1)
            return 1;
        if (n % 4 == 2)
            return n + 1;
        if (n % 4 == 3)
            return 0;
        return n;
    }
}
