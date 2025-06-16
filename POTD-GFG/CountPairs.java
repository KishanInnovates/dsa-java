import java.util.Arrays;

public class CountPairs {
    public static void main(String[] args) {
        int[] arr1 = {7, 2, 5, 3};
        int target1 = 8;
        System.out.println(countPairs(arr1, target1)); //output : 2
    }
    // https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-less-than-target/1
    public static int countPairs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        Arrays.sort(arr);

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum < target) {
                count += (end - start);
                start++;
            } else {
                end--;
            }
        }
        return count;
    }
}
