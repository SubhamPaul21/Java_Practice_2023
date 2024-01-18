import java.io.*;
import java.util.*;

public class graph_practice_Set_1 {
    public static void main(String[] args) throws IOException {
        /*
         * Given a graph of N nodes ; m edges ; undirected ; unweighted ; for each
         * node ‘i’ ; find the number of shortest paths from node ‘1’ to node ‘i’.
         */
        // create two adjacency list to store the graph and also to keep track of
        // visited nodes
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int[] graph = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = graph[0];
        int m = graph[1];

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();
        Set<Integer> nodeSet = new HashSet<>();

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
            nodeSet.add(edges[0]);
            nodeSet.add(edges[1]);
            j++;
        }

        Queue<Integer> queue = new LinkedList<>();

        int[] visited = new int[n + 5];
        int[] level = new int[n + 5];
        int[] ways = new int[n + 5];

        queue.offer(1);
        visited[1] = 1;
        level[1] = 0;
        ways[1] = 1;

        while (!queue.isEmpty()) {
            int removed = queue.poll();
            System.out.println(removed + " --> Level: " + level[removed]);

            for (Integer connectedEdge : adjacencyList.get(removed)) {
                if (visited[connectedEdge] == 0) {
                    queue.offer(connectedEdge);
                    visited[connectedEdge] = 1;
                    level[connectedEdge] = level[removed] + 1;
                    ways[connectedEdge] = ways[removed];
                } else {
                    if (level[connectedEdge] - level[removed] == 1) {
                        ways[connectedEdge] = ways[connectedEdge] + ways[removed];
                    }
                }
            }
        }

        for (int node : nodeSet) {
            System.out.println("Node 1 to Node " + node + " --> " + ways[node] + " way");
            // if (visited[node] == 0) {
            // System.out.println(node + " can not be visited from node 1");
            // } else {
            // System.out.println(node + " can be visited from node 1");
            // }
        }

        inputReader.close();
    }
}
