import java.util.ArrayList;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class PostOrderTraversal {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> postOrder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public static void traverse(TreeNode node, ArrayList<Integer> result) {
        if (node == null)
            return;
        traverse(node.left, result);
        traverse(node.right, result);
        result.add(node.data);
    }
}
