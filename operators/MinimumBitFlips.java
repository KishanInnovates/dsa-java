public class MinimumBitFlips {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        int result = minBitFlip(start, goal);
        System.out.println("The minimum required bit flip is : " + result);
    }

    public static int minBitFlip(int start, int goal) {
        int xorResult = start ^ goal;
        int count = 0;
        while (xorResult > 0) {
            count += xorResult & 1;
            xorResult >>= 1;
        }
        return count;
    }
}
