import java.io.*;
import java.util.*;

public class a_frog_1 {
    public static void main(String[] args) throws IOException {
        // 4
        // 10 30 40 20

        // 2
        // 10 10

        // 6
        // 30 10 60 10 60 50

        int n = 4;
        int[] arr = { 0, 10, 30, 40, 20 };
        // int n = 6;
        // int[] arr = { 0, 30, 10, 60, 10, 60, 50 };
        // int n = 2;
        // int[] arr = { 0, 10, 10 };

        // BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(inputReader.readLine());
        // int[] arr = new int[n + 1];
        // int[] input = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // inputReader.close();
        // int i = 1;
        // while (i <= n) {
        //     arr[i] = input[i - 1];
        //     i++;
        // }

        if (arr.length == 2) {
            System.out.println("The total cost incurred to reach Final Stone is " + arr[1]);
        } else if (arr.length == 3) {
            System.out.println("The total cost incurred to reach Stone " + n + " is " + Math.abs(arr[1] - arr[2]));
        } else {
            // create dp array of size n + 1 for 1 based indexing
            int[] dp = new int[n + 1];

            dp[1] = 0;
            dp[2] = Math.abs(arr[1] - arr[2]);
            dp[3] = Math.min(dp[2] + Math.abs(arr[2] - arr[3]), Math.abs(arr[1] - arr[3]));

            int i = 4;
            while (i <= n) {
                dp[i] = Math.min(dp[i - 1] + Math.abs(arr[i - 1] - arr[i]), dp[i - 2] + Math.abs(arr[i - 2] - arr[i]));
                i++;
            }

            System.out.println("The total cost incurred to reach Stone " + n + " is " + dp[n]);
        }
    }
}
