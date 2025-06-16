class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class MaximumPathSum {
    static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {

    }

    public static int maxPathSum(TreeNode root) {
        maxDepth(root);
        return maxSum;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftH = Math.max(0, maxDepth(root.left));
        int rightH = Math.max(0, maxDepth(root.right));

        maxSum = Math.max(maxSum, leftH + rightH + root.data);
        return Math.max(leftH, rightH) + root.data;
    }
}
