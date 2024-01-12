import java.io.*;
import java.util.*;

public class sum_of_all_numbers_from_one_to_N {

    public static void main(String[] args) throws IOException {
        // Taking input from the user
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(inputReader.readLine());

        int[] input = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        inputReader.close();

        // create  n empty dp array of size n
        int[] dp = new int[n];

        int i = 0;
        while(i < n) {
            if(i == 0) {
                dp[i] = input[i];
            } else {
                dp[i] = dp[i - 1] + input[i];
            }
            i++;
        }

        int[] queries = {0, 3, 4, 2};
        i = 0;
        while(i < queries.length) {
            System.out.println(dp[queries[i]]);
            i++;
        }
    }
}