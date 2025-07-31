
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsOfGraph {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(1);
        adjList.get(0).add(3);
        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(2).add(4);
        adjList.get(3).add(0);
        adjList.get(3).add(4);
        adjList.get(4).add(2);
        adjList.get(4).add(3);

        System.out.print("BFS Traversal starting from node 0: ");
        bfs(0, adjList);
    }

    public static void bfs(int start, List<List<Integer>> adjList) {
        int n = adjList.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbour : adjList.get(node)) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
    }
}
