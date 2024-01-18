import java.io.*;
import java.util.*;

public class adjacencyList {
    public static void main(String[] args) throws IOException {
        // [[],[],[],[]]
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int[] graph = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = graph[0];
        int m = graph[1];

        // create adjacency list
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n + 5; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        Set<Integer> nodes = new HashSet<>();
        for (int i = 1; i <= m; i++) {
            int[] edges = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjacencyList.get(edges[0]).add(edges[1]);
            adjacencyList.get(edges[1]).add(edges[0]);
            nodes.add(edges[0]);
            nodes.add(edges[1]);
        }

        for (int node : nodes) {
            System.out.println(node + " has " + adjacencyList.get(node).size());
        }

        inputReader.close();
    }
}
