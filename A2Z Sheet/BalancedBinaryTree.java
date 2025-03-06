class TreeNode{
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}
public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    public static int dfsHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftH = dfsHeight(root.left);
        if (leftH == -1)
            return -1;
        int rightH = dfsHeight(root.right);
        if (rightH == -1)
            return -1;
        
        if (Math.abs(leftH - rightH) > 1)
            return 1;
        return Math.max(leftH, rightH) + 1;
    }
}
