class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

 class SubPath {
    
    public boolean isSubPath(Node head, Node root) {
        if (root == null) return false;
        // Check if the list starts from the current node or any of its descendants
        return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    
    private boolean dfs(Node head, Node node) {
        // If we reached the end of the list, return true
        if (head == null) return true;
        // If we reached a null node in the tree, return false
        if (node == null) return false;
        // Check if the current node matches the current list node
        if (head.val != node.val) return false;
        // Recursively check the left and right subtree
        return dfs(head.next, node.left) || dfs(head.next, node.right);
    }
    
    public static void main(String[] args) {
        // Example usage:
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(8);

        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(4);
        root.left.right = new Node(2);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(8);

        Solution solution = new Solution();
        System.out.println(solution.isSubPath(head, root)); // Output: true
    }
}
