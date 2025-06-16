import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BoundaryTraversal {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        result.add(root.data);
        getLeftBoundary(root.left, result);

        getLeaves(root.left, result);
        getLeaves(root.right, result);

        ArrayList<Integer> rightBoundary = new ArrayList<>();
        getRightBoundary(root.right, rightBoundary);
        for (int i = rightBoundary.size() - 1; i >= 0; i--) {
            result.add(rightBoundary.get(i));
        }
        return result;
    }

    public static void getLeftBoundary(Node node, ArrayList<Integer> result) {
        while (node != null) {
            if (!isLeaf(node))
                result.add(node.data);
            node = (node.left != null) ? node.left : node.right;

        }
    }

    public static void getLeaves(Node node, ArrayList<Integer> result) {
        if (node == null)
            return;
        if (isLeaf(node))
            result.add(node.data);
        getLeaves(node.left, result);
        getLeaves(node.right, result);
    }

    public static void getRightBoundary(Node node, ArrayList<Integer> result) {
        while (node != null) {
            if (!isLeaf(node))
                result.add(node.data);
            node = (node.right != null) ? node.right : node.left;

        }
    }

    public static boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }
}
