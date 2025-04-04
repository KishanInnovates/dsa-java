class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class SizeOfABinaryTree {
    public static void main(String[] args) {

    }

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
}
