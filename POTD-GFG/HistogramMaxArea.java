import java.util.Stack;

class HistogramMaxArea {
    public static void main(String[] args) {
        int[] arr1 = { 60, 20, 50, 40, 10, 50, 60 };
        System.out.println(largestRectangleArea(arr1)); // Output: 100

        int[] arr2 = { 3, 5, 1, 7, 5, 9 };
        System.out.println(largestRectangleArea(arr2)); // Output: 15

        int[] arr3 = { 3 };
        System.out.println(largestRectangleArea(arr3)); // Output: 3
    }

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek()])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}