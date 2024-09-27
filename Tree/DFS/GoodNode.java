class TreeNode{
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

class GoodNode {
    public static void main(String[] args) {
        
    }

    public static int goodNode(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    public static int dfs(TreeNode node, int maxSoFar) {
        if (node == null)
            return 0;
        
        int count = 0;
        if(node.value >= maxSoFar){
            count++;
        }
        maxSoFar = Math.max(maxSoFar, node.value);
        count += dfs(node.left, maxSoFar);
        count += dfs(node.right, maxSoFar);
        return count;
    }
}