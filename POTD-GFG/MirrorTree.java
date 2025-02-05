class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}
public class MirrorTree {
    public static void main(String[] args) {

    }

    public static void mirrorViewOfTree(Node root) {
        if (root == null)
            return;
        mirrorViewOfTree(root.left);
        mirrorViewOfTree(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
