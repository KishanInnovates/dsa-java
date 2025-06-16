import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        combination("", "12");
        System.out.println(combinationArray("", "12"));
        System.out.println(combinationInt("", "12"));
    }

    public static void combination(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            combination(p + ch, up.substring(1));
        }

    }
    // to return ans in arraylist 
    public static ArrayList<String> combinationArray(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(combinationArray(p + ch, up.substring(1)));
        }
        return list;
    }
    // to return count 
    public static int combinationInt(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + combinationInt(p + ch, up.substring(1));
            
        }
        return count;
    }
}
