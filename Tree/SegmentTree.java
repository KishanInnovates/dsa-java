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
        
    }
}
