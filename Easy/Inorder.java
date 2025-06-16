import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}
public class Inorder {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(20);
        node.left.left = new Node(40);
        node.left.right = new Node(60);
        node.right = new Node(30);
        node.right.left = new Node(50);
        ArrayList<Integer> result = inOrder(node);
        System.out.println(result);
    }

    public static ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    public static void inOrderTraversal(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, result);
        result.add(node.data);
        inOrderTraversal(node.right, result);
    }
}
