class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

 class SubPath {
    
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
        // Check if the list starts from the current node or any of its descendants
        return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    
    private boolean dfs(ListNode head, TreeNode node) {
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
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(8);

        Solution solution = new Solution();
        System.out.println(solution.isSubPath(head, root)); // Output: true
    }
}
