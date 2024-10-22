import java.util.HashMap;

class Solution {
    public static int sameOccurrence(int arr[], int x, int y) {
        // Initialize a map to store prefix differences
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);  // Start with a zero difference

        int diff = 0;  // To track the difference between counts of x and y
        int count = 0;  // To store the number of valid subarrays

        // Traverse the array
        for (int num : arr) {
            if (num == x) {
                diff++;  // Increase diff if the current number is x
            } else if (num == y) {
                diff--;  // Decrease diff if the current number is y
            }

            // Check if the current diff has been seen before
            if (prefixMap.containsKey(diff)) {
                count += prefixMap.get(diff);
            }

            // Update the map with the current diff
            prefixMap.put(diff, prefixMap.getOrDefault(diff, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1};
        System.out.println(sameOccurrence(arr1, 1, 2));  // Output: 2

        int[] arr2 = {1, 2, 1};
        System.out.println(sameOccurrence(arr2, 4, 6));  // Output: 6

        int[] arr3 = {1, 2, 1};
        System.out.println(sameOccurrence(arr3, 1, 4));  // Output: 1
    }
}
