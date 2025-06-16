class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }

}

public class SumTree {
    public static void main(String[] args) {

    }


    public static boolean isSumTree(Node root) {
        return isSumTreeHelper(root) != -1;
    }

    public static int isSumTreeHelper(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            return root.data;
        }
        int leftSum = isSumTreeHelper(root.left);
        int rightSum = isSumTreeHelper(root.right);
        if (leftSum == -1 || rightSum == -1) {
            return -1;
        }
        if (root.data != leftSum + rightSum)
            return -1;
        return root.data + leftSum + rightSum;
    }
}
