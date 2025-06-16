class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class IdenticalTree {
    public static void main(String[] args) {

    }

    public static boolean isIdentical(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return (p == q);

        return (p.data == q.data) && isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
    }
}
