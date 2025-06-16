class SummedMatrix {
    public static void main(String[] args) {
        int n = 4, q = 7;
        int result = summed(n, q);
        System.out.println(result);
    }

    public static int summed(long n, long q) {
        long lowerBound = Math.max(1, q - n);
        long upperBound = Math.max(n, q - 1);

        if (lowerBound <= upperBound) {
            return (int) (upperBound - lowerBound + 1);
        } else {
            return 0;
        }
    }
}
