class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class RootToLeafPathSum {
    public static void main(String[] args) {

    }

    public static boolean hasSum(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.data == target;
        }

        return hasSum(root.left, target - root.data) || hasSum(root.right, target - root.data);
    }
}
