
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class ZigZagOrderTraversal {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> zigZagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean reverse = false;

        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode currentNode = q.pollFirst();
                    currentLevel.add(currentNode.data);
                    if (currentNode.left != null) {
                        q.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        q.addLast(currentNode.right);
                    }
                } else {
                    TreeNode currentNode = q.pollLast();
                    currentLevel.add(currentNode.data);
                    if (currentNode.right != null) {
                        q.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        q.addFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }
}
