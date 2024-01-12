import java.util.*;
import java.io.*;

public class non_consecutive_two_array_max_subset {
    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(inputReader.readLine());

        int[] input1 = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        inputReader.close();

        int[] arr1 = new int[n + 1];
        int[] arr2 = new int[n + 1];

        int i = 1;
        while (i <= n) {
            arr1[i] = input1[i - 1];
            i++;
        }

        i = 1;
        while (i <= n) {
            arr2[i] = input2[i - 1];
            i++;
        }

        int[] dp = new int[n + 1];

        dp[1] = Math.max(Math.max(arr1[1], arr2[1]), 0);
        dp[2] = Math.max(Math.max(arr1[2], arr2[2]), dp[1]);

        i = 3;
        while (i <= n) {
            dp[i] = Math.max(Math.max(arr1[i], arr2[i]) + dp[i - 2], dp[i - 1]);
            i++;
        }

        System.out.println("Max subset from two arrays is: " + dp[n]);
    }
}
