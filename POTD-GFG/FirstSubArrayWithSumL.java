import java.util.List;
import java.util.Arrays;

public class FirstSubArrayWithSumL {
    public static void main(String[] args) {
        
    }

    public static List<Integer> firstSubArray(int[] arr, int target) {
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                return Arrays.asList(start + 1, end + 1);
            }
        }
        return Arrays.asList(-1);
    }
}
