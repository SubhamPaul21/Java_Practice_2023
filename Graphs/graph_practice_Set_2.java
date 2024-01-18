import java.io.*;
import java.util.*;

public class graph_practice_Set_2 {
    public static void main(String[] args) throws IOException {
        /*
         * Given a graph of N nodes ; m edges ; undirected ; unweighted ; for each
         * node ‘i’ ; find the number of shortest paths from node ‘1’ to node ‘i’.
         */

        /*
6 6
1 5 5 0
1 2 5 0
5 6 0 0
2 3 0 5
3 4 5 5
6 4 0 5
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

        int[] nodeValue = new int[n + 5];
        // store the edges in the adjacency list
        int j = 1;
        while (j <= m) {
            int[] edges = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjacencyList.get(edges[0]).add(edges[1]);
            adjacencyList.get(edges[1]).add(edges[0]);
            nodeSet.add(edges[0]);
            nodeSet.add(edges[1]);
            nodeValue[edges[0]] = edges[2];
            nodeValue[edges[1]] = edges[3];
            j++;
        }

        Queue<Integer> queue = new LinkedList<>();

        int[] visited = new int[n + 5];
        int[] level = new int[n + 5];
        int[] ways = new int[n + 5];
        int[] fiveCount = new int[n + 5];

        queue.offer(1);
        visited[1] = 1;
        level[1] = 0;
        ways[1] = 1;
        fiveCount[1] = nodeValue[1] == 5 ? 1 : 0;

        while (!queue.isEmpty()) {
            int removed = queue.poll();
            for (Integer connectedEdge : adjacencyList.get(removed)) {
                if (visited[connectedEdge] == 0) {
                    queue.offer(connectedEdge);
                    visited[connectedEdge] = 1;
                    level[connectedEdge] = level[removed] + 1;
                    ways[connectedEdge] = ways[removed];
                    // System.out.println(connectedEdge + " Node Value : " + nodeValue[connectedEdge]);
                    if (nodeValue[connectedEdge] == 5) {
                        fiveCount[connectedEdge] = fiveCount[removed] + 1;
                    } else {
                        fiveCount[connectedEdge] = fiveCount[removed];
                    }
                    // System.out.println(connectedEdge + " Five Count : " + fiveCount[connectedEdge]);
                    // System.out.println(removed + " Five Count : " + fiveCount[removed]);
                } else {
                    if (level[connectedEdge] - level[removed] == 1) {
                        ways[connectedEdge] = ways[connectedEdge] + ways[removed];
                    }
                }
            }
        }

        int l = 1;
        while (l <= m) {
            System.out.println("For Node: " + l + " the shortest path length from Node 1 is: " + ways[l] + " and the maximum number of 5 possible in the path is: " + fiveCount[l]);
            l++;
        }

        // for (int node : nodeSet) {
        // System.out.println("The shortest path from Node 1 to Node: " + node + " is "
        // + level[node]);
        // System.out.println("The maximum number of 5 possible in the path is " +
        // fiveCount[node]);
        // // System.out.println("Node 1 to Node " + node + " --> " + ways[node] + "
        // way");
        // // if (visited[node] == 0) {
        // // System.out.println(node + " can not be visited from node 1");
        // // } else {
        // // System.out.println(node + " can be visited from node 1");
        // // }
        // }

        inputReader.close();
    }
}
