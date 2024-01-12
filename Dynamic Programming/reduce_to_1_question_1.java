import java.io.*;

public class reduce_to_1_question_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(inputReader.readLine());
        inputReader.close();

        // Each step we can -->
        // i -= 1
        // i -= 2
        // i % 7 == 0 --> i/= 7

        int[] dp = new int[n + 1];
        dp[1] = 0;
        dp[2] = 1 + dp[1];
        int i = 3;
        while (i <= n) {
            if (i % 7 == 0) {
                dp[i] = Math.min(1 + dp[i / 7], 1 + Math.min(dp[i - 1], dp[i - 2]));
            } else {
                dp[i] = 1 + Math.min(dp[i - 1], dp[i - 2]);
            }
            i++;
        }
        System.out.println("Minimum steps to reduce " + n + " to 1 is " + dp[n]);
    }
}
