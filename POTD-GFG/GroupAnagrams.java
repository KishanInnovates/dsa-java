import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Collections;


public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = { "act", "god", "cat", "dog", "tac" };
        List<List<String>> result = groupAnagrams(arr);
        System.out.println(result); 
    }

    public static List<List<String>> groupAnagrams(String[] arr) {
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        for (String str : arr) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(str);
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            Collections.sort(group);
            result.add(group);
        }
        return result;
    }
}
