
import java.util.HashSet;
class RemoveDuplicate{
    public static void main(String[] args) {
        String s = "gfg";
        System.out.println(removeDup(s));
    }
    public static String removeDup(String s){
        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                result.append(c);
                set.add(c);
            }
        }
        return result.toString();
    }
}