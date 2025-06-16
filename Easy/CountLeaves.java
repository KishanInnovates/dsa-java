class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
public class CountLeaves {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(10);
        node.right = new Node(39);
        node.left.left = new Node(5);
        int count = countLeaves(node);
        System.out.print("The number of leaves in the binary tree is: " + count);

    }

    public static int countLeaves(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaves(node.left) + countLeaves(node.right);
    }
}
