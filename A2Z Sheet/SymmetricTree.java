import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}


class SymmetricTree{    
    public static void main(String[] args) {

    }
    public static boolean isSymmetry(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            
        }
    }
}