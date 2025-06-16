import java.util.ArrayList;
import java.util.Collections;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class NodeWithOutSibling {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1?page=2&difficulty=Basic,Easy&status=unsolved&sortBy=submissions
    }

    public static ArrayList<Integer> noSibling(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        findNode(node, result);
        if (result.isEmpty()) {
            result.add(-1);
        }
        Collections.sort(result);
        return result;
    }

    public static void findNode(Node node, ArrayList<Integer> result) {
        if (node == null)
            return;
        
        if (node.left == null && node.right != null) {
            result.add(node.right.data);
        } else if (node.left != null && node.right == null) {
            result.add(node.left.data);
        }

        findNode(node.left, result);
        findNode(node.right, result);
    }
}
