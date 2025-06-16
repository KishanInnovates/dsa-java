import java.util.Arrays;

public class EqualizeTheTowers {
    public static void main(String[] args) {
        int[] heights1 = { 1, 2, 3 };
        int[] cost1 = { 10, 100, 1000 };
        System.out.println(minCost(heights1, cost1)); // Output: 120

        int[] heights2 = { 7, 1, 5 };
        int[] cost2 = { 1, 1, 1 };
        System.out.println(minCost(heights2, cost2)); // Output: 6
    }

    public static int minCost(int[] heights, int[] cost) {
        int n = heights.length;
        int low = Arrays.stream(heights).min().getAsInt();
        int high = Arrays.stream(heights).max().getAsInt();
        int answer = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            int costMid = totalCost(heights, cost, mid);
            int costLeft = totalCost(heights, cost, mid - 1);
            int costRight = totalCost(heights, cost, mid + 1);
            answer = Math.min(answer, costMid);

            if (costLeft < costMid) {
                high = mid - 1;
            } else if (costRight < costMid) {
                low = mid + 1;
            } else {
                break;
            }
        }
        return answer;
    }

    public static int totalCost(int[] heights, int[] cost, int target) {
        int total = 0;
        for (int i = 0; i < heights.length; i++) {
            total += Math.abs(heights[i] - target) * cost[i];
        }
        return total;
    }
}
