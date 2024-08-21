
class TreeNode {
    int val;
     TreeNode left;
    TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
public class cousins {
    public static void main(String[] args) {
            //gfg test cases not passed
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
            (level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy))
        );
    }

    private static boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
       if (node == null) {
      return false;
    }

    return (
      (node.left == x && node.right == y) || (node.left == y && node.right == x)
      || isSibling(node.left, x, y) || isSibling(node.right, x, y)
    );
    }

    private static Object level(TreeNode node, TreeNode x, int lev) {
        if (node == null) {
            return 0;
        }
        if (node == x) {
            return lev;
        }
        int l = (int) level(node.left, x, lev + 1);
        if (l != 0) {
            return l;
        }
        return level(node.right, x, lev+1);
    }

    private static TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        }
        if (node.val == x) {
            return node;
        }
        TreeNode n = findNode(node.left, x);
        if (n != null) {
            return n;
        }
        return findNode(node.right, x);
    }
}
