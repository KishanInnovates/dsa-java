class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class LowestCommonAncestor {
    public static void main(String[] args) {

    }

    public static Node lca(Node root, Node n1, Node n2) {
        if (root == null || root == n1 || root == n2) {
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2)

        if(left == null){
            return right;
        }else if(right == null){
            return left;
        }else{
            return root;
        }
    }
}
