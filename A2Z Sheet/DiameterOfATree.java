class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class DiameterOfATree {
    static int diameter = 0;

    public static void main(String[] args) {

    }

    public static int diameterOfBinaryTree(Node root) {
        height(root);
        return diameter - 1;
    }

    public static int height(Node root) {
        if (root == null)
            return 0;

        int leftH = height(root.left);
        int rightH = height(root.right);

        diameter = Math.max(diameter, leftH + rightH + 1);

        return Math.max(leftH + rightH) + 1;
    }
}
