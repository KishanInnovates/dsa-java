import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaseSpecificSorting {
    public static void main(String[] args) {
        
    }

    public static String caseSort(String s){
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper.add(c);
            }else{
                lower.add(c);
            }
        }
        Collections.sort(upper);
        Collections.sort(lower);

        StringBuilder result = new StringBuilder();
        int u = 0, l= 0;
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                result.append(upper.get(u++));
            }else{
                result.append(lower.get(l++));
            }
        }
        return result.toString();
    }   
}
