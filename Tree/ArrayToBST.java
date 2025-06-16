class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

class ArrayToBST {
    public static void main(String[] args) {

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    public static TreeNode buildBST(int[] nums, int low, int high) {
        if (low > high)
            return null;
        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(mid);
        node.data = nums[mid];
        node.left = buildBST(nums, low, mid - 1);
        node.right = buildBST(nums, mid + 1, high);
        return node;
    }
}