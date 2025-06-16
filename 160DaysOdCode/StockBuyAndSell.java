class StockBuyAndSell{
    public static void main(String[] args) {
        int[] prices1 = {100, 180, 260, 310, 40, 535, 695};
        int[] prices2 = { 4, 2, 2, 2, 4 };

        System.out.println("The maximum profit for case1: " + maxProfit(prices1));
        System.out.println("The maximum profit for case2: " + maxProfit(prices2));
    }
    public static int maxProfit(int[] prices){
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}