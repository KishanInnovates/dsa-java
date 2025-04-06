public class BuyAndSellAStock {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int result = maxProfit(arr);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int minimum = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
            int cost = prices[i] - minimum;
            maxProfit = Math.max(maxProfit, cost);
            minimum = Math.min(minimum, prices[i]);
        }
        return maxProfit;
    }
}
