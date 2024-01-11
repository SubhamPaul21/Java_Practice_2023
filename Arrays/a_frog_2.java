import java.io.*;
import java.util.*;

public class a_frog_2 {
    public static void main(String[] args) throws IOException {
        // 4
        // 10 30 40 20

        // 2
        // 10 10

        // 6
        // 30 10 60 10 60 50
        // PASSED
        // int n = 5;
        // int k = 3;
        // int[] arr = { 0, 10, 30, 40, 50, 20 };
        // PASSED
        // int n = 6;
        // int k = 3;
        // int[] arr = { 0, 30, 10, 60, 10, 60, 50 };
        // PASSED
        int n = 3;
        int k = 1;
        int[] arr = { 0, 10, 20, 10 };
        // PASSED
        // PASSED
        // int n = 2;
        // int k = 100;
        // int[] arr = { 0, 10, 10};
        // PASSED
        // int n = 10;
        // int k = 4;
        // int[] arr = { 0, 40, 10, 20, 70, 80, 10, 20, 70, 80, 60 };

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

            int i = 3;
            while (i <= n) {
                int answer = Integer.MAX_VALUE;
                int j = 1;
                while(j <= k && i-j >= 1) {
                    int option = dp[i-j] + Math.abs(arr[i-j] - arr[i]);
                    answer = Math.min(answer, option);
                    j++;
                }
                dp[i] = answer;
                i++;
            }
            System.out.println("The total cost incurred to reach Stone " + n + " is " + dp[n]);
        }
    }
}