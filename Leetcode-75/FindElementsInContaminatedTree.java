import java.util.HashSet;
import java.util.Set;
class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
    }
}

public class FindElementsInContaminatedTree {
    private Set<Integer> values;  
    public static void main(String[] args) {

    }

    public void FindElements(TreeNode root){
        values = new HashSet<>();
        recoverTree(root, 0); 
    }

    public void recoverTree(TreeNode node, int value) {
        if (node == null)
            return;
        node.value = value;
        values.add(value);
        recoverTree(node.left, 2 * value + 1);
        recoverTree(node.right, 2 * value + 2);
    }

    public boolean find(int target) {
        return values.contains(target);
    }
}
