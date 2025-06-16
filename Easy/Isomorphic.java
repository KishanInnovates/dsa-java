import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "xxb";

        boolean result = isIsomorphic(s1, s2);
        System.out.println(result);

    }

    public static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (map1.containsKey(c1) && map1.get(c1) != c2) {
                return false;
            }
            if (map2.containsKey(c2) && map2.get(c2) != c1) {
                return false;
            }
            map1.put(c1, c2);
            map2.put(c2, c1);
        }
        return true;
    }
}
