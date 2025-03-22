import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
    }

}

class CustomNode{
    Node node;
    int col;

    CustomNode(Node node, int col) {
        this.node = node;
        this.col = col;
    }

}

class BottomViewOfBinaryTree {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        Queue<CustomNode> q = new LinkedList<>();
        q.offer(new CustomNode(root, 0));

        TreeMap<Integer, Integer> map = new TreeMap<>();

        while (!q.isEmpty()) {
            CustomNode customNode = q.poll();
            Node node = customNode.node;
            int col = customNode.col;

            map.put(col, node.data);

            if (node.left != null) {
                q.offer(new CustomNode(node.left, col - 1));
            }
            if (node.right != null) {
                q.offer(new CustomNode(node.right, col + 1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}