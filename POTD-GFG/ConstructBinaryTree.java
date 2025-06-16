import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int value;
    TreeNode left, right;
    TreeNode(int value){
        this.value = value;
    }
}
public class ConstructBinaryTree {
    private int preorderIndex = 0;
    private Map<Integer, Integer> inorderMap;
    public static void main(String[] args) {
        int n = 1 % 2;
        System.out.println(n);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return constructTree(preorder, 0, inorder.length - 1);
    }

    private TreeNode constructTree(int[] preorder, int left, int right) {
        if (left > right)
            return null;
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);
        int inorderIndex = inorderMap.get(rootValue);
        root.left = constructTree(preorder, left, inorderIndex - 1);
        root.right = constructTree(preorder, inorderIndex + 1, right);

        return root;
    }
}
