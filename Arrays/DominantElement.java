import java.util.HashMap;
import java.util.Map;

public class DominantElement {
    //https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/DOMINANT2
    public static void main(String[] args) {
        int n = 6;
        int[] a = { 1, 1, 2, 2, 3, 4 };
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        int maxFreq = 0, secondMax = 0;
        for (int freq : map.values()) {
            if (freq > maxFreq) {
                secondMax = maxFreq;
                maxFreq = freq;
            } else if(freq > secondMax){
                secondMax = freq;
            }
        }
        System.out.println(maxFreq > secondMax ? "Yes" : "No");
    }
}
