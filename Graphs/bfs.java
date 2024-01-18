import java.io.*;
import java.util.*;

public class bfs {
    public static void main(String[] args) throws IOException {
        // create two adjacency list to store the graph and also to keep track of
        // visited nodes
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int[] graph = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = graph[0];
        int m = graph[1];

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();

        // create entries in the adjacency list
        int i = 0;
        while (i <= n + 5) {
            adjacencyList.add(new ArrayList<>());
            i++;
        }

        // store the edges in the adjacency list
        int j = 1;
        while (j <= m) {
            int[] edges = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjacencyList.get(edges[0]).add(edges[1]);
            adjacencyList.get(edges[1]).add(edges[0]);
            j++;
        }

        Queue<Integer> queue = new LinkedList<>();

        int[] visited = new int[n + 5];
        int[] level = new int[n + 5];

        queue.offer(1);
        visited[1] = 1;
        level[1] = 0;

        while (!queue.isEmpty()) {
            int removed = queue.poll();
            System.out.println(removed + " --> Level: " + level[removed]);

            for (Integer connectedEdge : adjacencyList.get(removed)) {
                if (visited[connectedEdge] == 0) {
                    queue.offer(connectedEdge);
                    visited[connectedEdge] = 1;
                    level[connectedEdge] = level[removed] + 1;
                }
            }
        }

        inputReader.close();
    }
}
