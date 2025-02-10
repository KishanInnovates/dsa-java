import java.util.HashMap;

class Node{
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class KSumPath {
    public static void main(String[] args) {

    }

    public static int pathSum(Node node, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);
        return dfs(node, 0, k, prefixSumMap);
    }

    public static int dfs(Node node, int currentSum, int k, HashMap<Integer, Integer> prefixSumMap) {
        if (node == null)
            return 0;
        
        currentSum += node.data;

        int count = prefixSumMap.getOrDefault(currentSum - k, 0);

        prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);

        count += dfs(node.left, currentSum, k, prefixSumMap);
        count += dfs(node.right, currentSum, k, prefixSumMap);

        prefixSumMap.put(currentSum, prefixSumMap.get(currentSum) - 1);

        return count;
    }
}
