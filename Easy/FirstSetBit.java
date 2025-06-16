public class FirstSetBit {
    public static void main(String[] args) {
        
    }

    public static int findFirstSetBit(int n) {
        if (n == 0)
            return 0;
        return (int)(Math.log(n & -n)/Math.log(2)) + 1;
    }
}
