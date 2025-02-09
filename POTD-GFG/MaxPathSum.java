class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class MaxPathSum {
    static int maxsum;
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        System.out.println(findmaxSum(root)); // Output: 42
    }
    public static int findmaxSum(Node root) {
        maxsum = Integer.MIN_VALUE;
        findMax(root);
        return maxsum;
    }

    public static int findMax(Node node) {
        if (node == null)
            return 0;
        int left = Math.max(0, findMax(node.left));
        int right = Math.max(0, findMax(node.right));

        int maxAtNode = node.data + left + right;
        maxsum = Math.max(maxsum, maxAtNode);
        return node.data + Math.max(left, right);
    }
}
