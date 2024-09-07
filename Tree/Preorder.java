import java.util.ArrayList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}


public class Preorder {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    public static void preorderHelper(Node node, ArrayList<Integer> result) {
        if (node == null)
            return;

        result.add(node.data);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }
}
