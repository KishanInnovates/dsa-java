import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
    }
}

public class Tree {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node node = q.poll();
            if (node == null) {
                result.add(-1);
            } else {
                result.add(node.data);
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        return result;
    }

    public static Node deSerialize(ArrayList<Integer> arr) {
        if (arr.isEmpty() || arr.get(0) == -1)
            return null;
        Node root = new Node(arr.get(0));
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.size()) {
            Node node = q.poll();

            if (arr.get(i) != -1) {
                node.left = new Node(arr.get(i));
                q.offer(node.left);
            }
            i++;
            if (i < arr.size() && arr.get(i) != -1) {
                node.right = new Node(arr.get(i));
                q.offer(node.right);
            }
            i++;
        }
        return root;
    }
}
