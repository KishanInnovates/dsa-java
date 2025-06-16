import java.util.HashSet;
import java.util.Set;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class PairSum {
    public static void main(String[] args) {

    }

    public static boolean findTarget(Node root, int target) {
        Set<Integer> seen = new HashSet<>();
        return dfs(root, target, seen);
    }

    public static boolean dfs(Node node, int target, Set<Integer> seen) {
        if (node == null)
            return false;
        if (seen.contains(target - node.data))
            return true;
        seen.add(node.data);
        return dfs(node.left, target, seen) || dfs(node.right, target, seen);
    }
}
