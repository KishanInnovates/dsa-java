import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    public static void main(String[] args) {
         String[] words1 = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(words1));
    }

    public static List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }
}
