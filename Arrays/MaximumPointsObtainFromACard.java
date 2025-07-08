public class MaximumPointsObtainFromACard {
    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        System.out.println(maxScore(arr, k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }
        int max = total;
        for (int i = 1; i <= k; i++) {
            total = total - cardPoints[k - i] + cardPoints[n - i];
            max = Math.max(max, total);
        }
        return max;
    }
}
