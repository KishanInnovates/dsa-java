import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class UniqueOccurences {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        boolean result = occurances(arr);
        System.out.println("The result is : " + result);
    }

    public static boolean occurances(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        Set<Integer> occurenceSet = new HashSet<>(countMap.values());
        return countMap.size() == occurenceSet.size();
    }
}
