class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
    }
}

public class HeightOfABinaryTree {
    public static void main(String[] args) {
        Node root1 = new Node(12);
        root1.left = new Node(8);
        root1.right = new Node(18);
        root1.left.left = new Node(5);
        root1.left.right = new Node(11);
        System.out.println(height(root1)); // Output: 2
    }

    public static int height(Node root){
        if (root == null)
            return -1;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
