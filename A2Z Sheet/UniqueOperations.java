import java.util.Set;
import java.util.HashSet;

public class UniqueOperations {
    public static void main(String[] args) {

    }

    public static int minOperations(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!seen.add(nums[i])) {
                return (i + 1 + 2) / 3;
            }
        }
        return 0;
    }
}
