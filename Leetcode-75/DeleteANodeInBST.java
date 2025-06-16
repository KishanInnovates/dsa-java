class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }
}

public class DeleteANodeInBST {
    public static void main(String[] args) {

    }

    public Node deleteNode(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.value) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node minNode = findMin(root.right);
            root.value = minNode.value;
            root.right = deleteNode(root.right, minNode.value);
        }
        return root;
    }

    public static Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
