import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class adjacencyList {
    public static void main(String[] args) throws IOException {
        // [[],[],[],[]]
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int[] graph = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = graph[0];
        int m = graph[1];

        // create adjacency list
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<ArrayList<Integer>>(n);

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int[] edges = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            adjacencyList.get(edges[0]).add(edges[1]);
            adjacencyList.get(edges[1]).add(edges[0]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i + " has " + adjacencyList.get(i).size());
        }

        inputReader.close();
    }
}
