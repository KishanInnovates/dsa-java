class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class HeightOfABinaryTree {
    public static void main(String[] args) {

    }
    public static int maxDepth(Node root){
        if(root == null) return 0;
        int leftH = maxDepth(root.left);
        int rightH = maxDepth(root.right);

        return 1 + Math.max(leftH, rightH);
    }
}
