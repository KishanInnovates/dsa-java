class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }
}
class InsertNodeInBST {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        int k = 4;
        root = insert(root, k);
        inorder(root);
    }

    public static Node insert(Node root, int k) {
        if (root == null)
            return new Node(k);

        if (k < root.value) {
            root.left = insert(root.left, k);
        } else if (k > root.value) {
            root.right = insert(root.right, k);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }
}
