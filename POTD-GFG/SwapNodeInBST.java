class Node {
    int val;
    Node right, left;

    Node(int val) {
        this.val = val;
    }
}

class SwapNodeInBST {
     static Node first, prev, middle, last;
    public static void main(String[] args) {

    }

    public static void correntBST(Node node) {
        first = prev = middle = last = null;
        inorder(node);
        if (first != null && last != null) {
            swap(first, last);
        } else if (first != null && middle != null) {
            swap(first, middle);
        }
    }

    public static void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.right);
        if (prev != null && node.val < prev.val) {
            if (first == null) {
                first = prev;
                middle = node;
            } else {
                last = node;
            }
        }
        prev = node;
        inorder(node.right);
    }

    public static void swap(Node a, Node b) {
        a.val = a.val ^ b.val;
        b.val = a.val ^ b.val;
        a.val = a.val ^ b.val;

    }
}