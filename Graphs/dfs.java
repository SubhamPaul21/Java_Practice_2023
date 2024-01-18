import java.io.*;
import java.util.*;

public class dfs {

    public static void dfs_algo(int node, ArrayList<ArrayList<Integer>> adjacencyList, int[] visited, int[] parent) {
        System.out.println(node);
        visited[node] = 1;

        for (int child : adjacencyList.get(node)) {
            if (visited[child] == 0) {
                parent[child] = node;

                dfs_algo(child, adjacencyList, visited, parent);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int[] graph = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = graph[0];
        int m = graph[1];

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();

        int i = 0;
        while (i <= n + 5) {
            adjacencyList.add(new ArrayList<>());
            i++;
        }

        int j = 1;
        while (j <= m) {
            int[] nodes = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjacencyList.get(nodes[0]).add(nodes[1]);
            adjacencyList.get(nodes[1]).add(nodes[0]);
            j++;
        }

        int[] visited = new int[n + 5];
        int[] parent = new int[n + 5];

        dfs_algo(1, adjacencyList, visited, parent);
    }
}
