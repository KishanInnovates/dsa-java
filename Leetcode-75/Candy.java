public class Candy {
    // https://leetcode.com/problems/candy/submissions/1487684108/?envType=study-plan-v2&envId=top-interview-150
    public static void main(String[] args) {
        int[] candy = { 1, 2, 2 };
        int total = countCandy(candy);
        System.out.println("The total number of candy is: " + total);
    }

    public static int countCandy(int[] ratings) {
        int n = ratings.length;
        if (n == 1)
            return 1;
        
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int total = 0;
        for (int candy : candies) {
            total += candy;
        }
        return total;
    }
}
