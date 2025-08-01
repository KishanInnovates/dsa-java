import java.util.HashMap;
import java.util.Map;

public class BalancingConsonantsAndVowels {
    public static void main(String[] args) {

    }
    public int countBalanced(String[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int sum = 0, res = 0;
        for (String s : arr) {
            for (char c : s.toCharArray()) 
                sum += "aeiou".indexOf(c) >= 0 ? 1 : -1;
            res += mp.getOrDefault(sum, 0);
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}

