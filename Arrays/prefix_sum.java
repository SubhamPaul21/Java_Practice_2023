import java.io.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class prefix_sum {
    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(inputReader.readLine());
        // System.out.println(n);

        int[] input = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int query = Integer.parseInt(inputReader.readLine());

        for (int i = 0; i < query; i++) {
            int[] range = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            // initialize the range of the sum
            int left_index = range[0];
            int right_index = range[1];

            // Create an empty prefix_sum array of length + 1 as arr
            // Initialize the elements with zero.
            int[] prefix_sum = new int[input.length + 1];
            Arrays.fill(prefix_sum, 0);

            // Run a for loop from (1 to prefix_sum length - 1) and populate each index of
            // the prefix_sum using the following operation
            // prefix_sum[i] = prefix_sum[i-1] + arr[i-1]
            for (int j = 1; j < prefix_sum.length; j++) {
                prefix_sum[j] = prefix_sum[j - 1] + input[j - 1];
            }

            // for (int element : prefix_sum) {
            //     System.out.print(element + " ");
            // }
            // System.out.println();

            // Calculate the sum of the range(l,r) using following operation
            // sum(l,r) = prefix_sum[r+1] - prefix_sum[l]
            int sum = prefix_sum[right_index + 1] - prefix_sum[left_index];

            System.out.println(sum);
        }

        inputReader.close();

    }
}
