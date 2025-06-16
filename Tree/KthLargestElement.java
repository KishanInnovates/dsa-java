class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
    }
}

public class KthLargestElement {
    static int count = 0;
    static int result = -1;
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int k = 3; // Find the 3rd largest element
        System.out.println("Kth Largest Element: " + kthLargest(root, k));
    }
    public static int kthLargest(Node root, int k){
        
        if(root == null || count >= k){
            return -1;
        }

        kthLargest(root.right, k);
        count++;
        if(count == k){
            result = root.data;
            return result;
        }

        kthLargest(root.left, k);
        return result;
    }
}
