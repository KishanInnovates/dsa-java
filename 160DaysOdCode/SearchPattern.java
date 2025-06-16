import java.util.ArrayList;

public class SearchPattern {
    public static void main(String[] args) {
        String txt1 = "abcab", pat1 = "ab";
        System.out.print(search(pat1, txt1)); //ouput : [0, 3]
    }
    // https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/search-pattern0205
    public static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int patLength = pat.length();
        int txtLength = txt.length();

        for (int i = 0; i <= txtLength - patLength; i++) {
            String substring = txt.substring(i, i + patLength);

            if (substring.equals(pat)) {
                result.add(i);
            }
        }
        return result;
    }
}
