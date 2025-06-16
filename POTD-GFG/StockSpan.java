import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr1 = { 100, 80, 60, 70, 60, 75, 85 };
        System.out.println(calculateSpan(arr1)); // Output: [1, 1, 1, 2, 1, 4, 6]

    }

    public static ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            int currentSpan = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            result.add(currentSpan);

            stack.push(i);
        }
        return result;
    }
}
