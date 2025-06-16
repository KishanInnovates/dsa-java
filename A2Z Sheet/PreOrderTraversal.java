import java.util.ArrayList;
class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value){
        this.value = value;
    }
}

class PreOrderTraversal{
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> preOrder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public static void traverse(TreeNode root, ArrayList<Integer> result) {
        if (root == null)
            return;
        result.add(root.value);
        traverse(root.left, result);
        traverse(root.right, result);
    }
}