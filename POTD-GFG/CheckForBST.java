class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class CheckForBST {
    public static void main(String[] args) {

    }

    public static boolean isBST(Node node) {
        return validate(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }   

    public static boolean validate(Node node, long minValue, long maxValue) {
        if (node == null)
            return true;
        if (node.data <= minValue || node.data >= maxValue) {
            return false;
        }

        return validate(node.left, minValue, maxValue) && validate(node.right, minValue, maxValue);
    }
}
