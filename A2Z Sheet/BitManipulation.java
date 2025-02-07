public class BitManipulation {
    public static void main(String[] args) {
        int a = 10, b = 20;
        swapTwoNumber(a, b);
        // int n = 4, i = 2;
        // System.out.println(checkIfIthBitSetOrNot(n, i));
        // System.out.println(setTheIthBit(n, i));
        // System.out.println(clearIthBit(n, i));
        // System.out.println(toggleIthBit(n, i));
        // System.out.println(removeTheLastSetBit(n));
        int n = 4;
        System.out.println(countSetBits(n));
    }

    public static void swapTwoNumber(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }

    public static boolean checkIfIthBitSetOrNot(int n, int i) {
        int mask = 1 << i;
        return (n & mask) != 0;
    }

    public static int setTheIthBit(int n, int i) {
        int res = n | (1 << i);
        return res;
    }

    public static int clearIthBit(int n, int i) {
        int res = n & ~(1 << i);
        return res;
    }

    public static int toggleIthBit(int n, int i) {
        return n ^ (1 << i);
    }

    public static int removeTheLastSetBit(int n) {
        return n & (n - 1);
    }

    public static boolean checkPowerOfTwo(int n) {
        int res = n & (n - 1);
        return res == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 1) {
            count += n & 1; // it is the same like checking odd even n % 2 == 1
            n = n >> 1; // it is same like n/2
        }
        if (n == 1)
            count++;
        return count;
    }
}
