import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
    }
}

public class TopViewOfATree {
    public static void main(String[] args) {
        //tc: O(NlogN)
    }

    public static ArrayList<Integer> topViw(Node root) {
        if (root == null)
            return new ArrayList<>();

        TreeMap<Integer, Integer> topViewMap = new TreeMap<>();
        Queue<Object[]> q = new LinkedList<>();

        q.add(new Object[] { root, 0 });

        while (!q.isEmpty()) {
            Object[] curr = q.poll();
            Node node = (Node) curr[0];
            int hd = (int) curr[1];
            topViewMap.putIfAbsent(hd, node.data);

            if (node.left != null)
                q.add(new Object[] { node.left, hd - 1 });
            if (node.right != null)
                q.add(new Object[] { node.right, hd + 1 });

        }
        return new ArrayList<>(topViewMap.values());
    } 
}
