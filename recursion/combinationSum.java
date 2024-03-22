import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {

    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); 
        findCombination(candidates, 0, target, ans, new ArrayList<>());
        return ans;
    }
    
    public void findCombination(int[] arr, int index, int target, List<List<Integer>> ans, List<Integer> store){
        if(target == 0){
            ans.add(new ArrayList<>(store));
            return;
        }
        if(index == arr.length || target < 0)
            return;
        
        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i - 1])
                continue;
            store.add(arr[i]);
            findCombination(arr, i + 1, target - arr[i], ans, store); 
            store.remove(store.size() - 1);
        }
    } 
}
