public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        int res = minEatingBanans(piles, h);
        System.out.println(res);
    }

    public static int minEatingBanans(int[] piles, int h) {
        int low = 1;
        int high = max(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int hour = totalHours(piles, mid);
            if (hour <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int totalHours(int[] num, int h) {
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += Math.ceil((double) num[i] / h);
        }
        return total;
    }
}
