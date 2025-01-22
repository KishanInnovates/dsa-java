public class FloorSqrt {
    public static void main(String[] args) {
        int n = 28;
        int result = floorSqrt(n);
        System.out.println(result);
    }

    public static int floorSqrt(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid * mid) <= n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
