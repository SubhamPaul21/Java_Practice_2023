import java.util.*;
import java.io.*;

public class non_consecutive_max_subset {
    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(inputReader.readLine());
        
        int[] input = Arrays.stream(inputReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        inputReader.close();

        int[] arr = new int[n + 1];
        int i = 1;
        while(i <= n) {
            arr[i] = input[i - 1];
            i++;
        }
        
        int[] dp = new int[n + 1];

        dp[1] = Math.max(arr[1], 0);
        dp[2] = Math.max(dp[1], arr[2]);
        i = 3;
        while(i <= n) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + arr[i]);
            System.out.print(i + ": " + dp[i]);
            i++;
        }

        System.out.println();
        System.out.println("The sum of the maximum subset is " + dp[n]);
    }
}
