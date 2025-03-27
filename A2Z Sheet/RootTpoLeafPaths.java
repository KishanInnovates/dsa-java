import java.util.ArrayList;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}
public class RootTpoLeafPaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6)

        ArrayList<ArrayList<Integer>> paths = paths(root);
        System.out.println(paths); //output : [[1, 2, 4], [1, 2, 5], [1, 3]] //time complexity: O(n)
    }

    public static ArrayList<ArrayList<Integer>> paths(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        dfs(root, path, result);
        return result;
    }

    public static void dfs(TreeNode root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (root == null)
            return;
        path.add(root.data);

        if (root.left == null && root.right == null) {
            result.add(new ArrayList<>(path));
        } else {
            dfs(root.left, path, result);
            dfs(root.right, path, result);
        }
        path.remove(path.size() - 1); //backtrack
    }
}
