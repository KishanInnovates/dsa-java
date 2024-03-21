import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        ArrayList<String> ans = permutation("", "abc");
        System.out.println(ans);
    }
    
    static ArrayList<String> permutation(String p, String up) {
        ArrayList<String> ans = new ArrayList<>(); 
        
        if (up.isEmpty()) {
            ans.add(p);
            return ans;
        }
        
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutation(first + ch + second, up.substring(1)));
        }
        return ans;
    }
}
