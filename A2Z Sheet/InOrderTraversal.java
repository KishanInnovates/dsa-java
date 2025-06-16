import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}
public class InOrderTraversal {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> inorder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public static void traverse(TreeNode node, ArrayList<Integer> result) {
        if (node == null)
            return;
        traverse(node.left, result);
        result.add(node.data);
        traverse(node.right, result);
    }
}
