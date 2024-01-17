import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class matrix {
    public static void main(String[] args) throws IOException {
        // B[i][j] = 1;
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int[] graph = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = graph[0];
        int m = graph[1];

        // create empty matrix
        int[][] matrix = new int[n][n];

        // Store edge directions in the matrix
        for (int i = 0; i < m; i++) {
            int[] edges = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[edges[0]][edges[1]] = 1;
            matrix[edges[1]][edges[0]] = 1;
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j <= m; j++) {
                if (matrix[i][j] == 1) {
                    count = count + 1;
                }
            }
            System.out.println(i + " has " + count + " edges");
        }

        inputReader.close();
    }
}
