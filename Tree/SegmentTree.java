public class SegmentTree {
    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

       
    }

    Node root;
     public void SegmentTree(){
            
        }

        public static void main(String[] args) {
            int[] arr = { 3, 8, 6, 7, -2, -8, 4, 9 };

            SegmentTree tree = new SegmentTree(arr);
        }

        public SegmentTree(int[] arr) {
            this.root = constructTree(arr, 0, arr.length - 1);
        }

        private Node constructTree(int[] arr, int start, int end) {
            if (start == end) {
                Node leaf = new Node(start, end);
                leaf.data = arr[start];
                return leaf;
            }
            Node node = new Node(start, end);
            int mid = (start + end) / 2;
            node.left = this.constructTree(arr, start, mid);
            node.right = this.constructTree(arr, mid + 1, end);

            node.data = node.left.data + node.right.data;
            return node;
    }
}
