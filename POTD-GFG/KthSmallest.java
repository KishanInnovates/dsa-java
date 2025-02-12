import java.util.Stack;

class Node{
    int data;
    Node left, right;
    
    Node(int data) {
        this.data = data;
    }
}

public class KthSmallest {
    public static void main(String[] args) {

    }

    public static int kthSmallest(Node root, int k) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        int count = 0;

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;
            if (count == k)
                return current.data;

            current = current.right;
        }
        return -1;
    }
}
