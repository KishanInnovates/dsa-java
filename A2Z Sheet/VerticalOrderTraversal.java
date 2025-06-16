import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class VerticalOrderTraversal {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> verticalTraversal(Node root) {
        TreeMap<Integer, List<int[]>> columnMap = new TreeMap<>();
        Queue<Object[]> q = new LinkedList<>();

        q.add(new Object[] { root, 0, 0 });

        while (!q.isEmpty()) {
            Object[] curr = q.poll();
            Node node = (Node) curr[0];
            int row = (int) curr[1];
            int col = (int) curr[2];

            columnMap.putIfAbsent(col, new List<>());
            columnMap.get(col).add(new int[] { row, node.data });

            if (node.left != null)
                q.add(new Object[] { node.left, row + 1, col - 1 });
            if (node.right != null)
                q.add(new Object[] { node.right, row + 1, col + 1 });
        }
        List<List<Integer>> result = new List<>();
        for (List<int[]> values : columnMap.values()) {
            values.sort((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
            List<Integer> colList = new List<>();
            for (int[] pair : values)
                colList.add(pair[1]);
            result.add(colList);
        }
        return result;
    }
}
