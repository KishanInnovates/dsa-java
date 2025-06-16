class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BalancedHeight {
    public static void main(String[] args) {

    }

    public static boolean isBalance(Node root) {
        return checkHeight(root) != -1;
    }

    public static int checkHeight(Node node) {
        if (node == null)
            return 0;
        
        int left = checkHeight(node.left);
        int right = checkHeight(node.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
