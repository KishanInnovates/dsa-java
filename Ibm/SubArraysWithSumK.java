import java.util.HashMap;

public class SubArraysWithSumK {
    public static void main(String[] args) {

    }

    public static int findSubArray(int[] arr, int k) {
        int n = arr.length;
        

        //HashMap to store (sum, frequency of sum) pairs
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

        //intialize the map with sum 0 and frequency 1
        prefixSumMap.put(0, 1);
        
        int currentSum = 0; //current cummulative sum;
        int count = 0; //count the subarrays with sum k



        //traverse through the array
        for (int i = 0; i < n; i++) {
            //added the current element to sum
            currentSum += arr[i];

            //check if (currentSum - k) exits in the map 
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }

            //update the map with currentSum
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }
        //return the count
        return count;

    }
}
