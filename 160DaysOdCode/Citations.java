import java.util.Arrays;

public class Citations {
    public static void main(String[] args) {
         int[] citations1 = {3, 0, 5, 3, 0};
        System.out.println(hIndex(citations1)); // Output: 3

        // Example 2
        int[] citations2 = {5, 1, 2, 4, 1};
        System.out.println(hIndex(citations2)); // Output: 2

        // Example 3
        int[] citations3 = {0, 0};
        System.out.println(hIndex(citations3)); // Output: 0
    }
    // https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/find-h-index--165609
    public static int hIndex(int[] citations){
        Arrays.sort(citations);
        int n = citations.length;
        System.out.println("The length of the array is: " + n);

        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }
}
