import java.io.*;
import java.util.*;

public class matrix {
    public static void main(String[] args) throws IOException {
        // B[i][j] = 1;
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int[] graph = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = graph[0];
        int m = graph[1];
        int size = 1000;

        // create empty matrix
        int[][] matrix = new int[size][size];
        Set<Integer> nodes = new HashSet<>();
        // Store edge directions in the matrix
        for (int i = 1; i <= m; i++) {
            int[] edges = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[edges[0]][edges[1]] = 1;
            matrix[edges[1]][edges[0]] = 1;
            nodes.add(edges[0]);
            nodes.add(edges[1]);
        }

        for (int i : nodes) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 1) {
                    count = count + 1;
                }
            }
            System.out.println(i + " has " + count + " edges");
        }

        inputReader.close();
    }
}
