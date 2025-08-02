
import java.util.ArrayList;


public class DfsOfGraph {
    public static void main(String[] args) {
         int n = 5;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
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
        ArrayList<Integer> result = dfs(adjList);
        System.out.println(result);
    }

    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> result = new ArrayList<>();
        dfsHelper(0, adj, visited, result);
        return result;
    }

    public static void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited,
            ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);

        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                dfsHelper(neighbour, adj, visited, result);
            }
        }
    } 
}
