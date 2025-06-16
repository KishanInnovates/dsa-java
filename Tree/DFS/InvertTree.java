class Node {
    int value;
    Node left;
    Node right;

    Node() {

    }

    Node(int value) {
        this.value = value;
    }
}

public class InvertTree {
    public static void main(String[] args) {

    }

    public static Node invertTree(Node root) {
        if (root == null)
            return null;

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        return root;
    }
}
