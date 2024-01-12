import java.io.*;

public class reduce_to_1_question_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(inputReader.readLine());
        inputReader.close();

        int[] dp = new int[n + 2];

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 2;

        int i = 4;
        while (i <= n) {
            if (i % 2 == 0) {
                dp[i] = Math.min(1 + dp[i / 2], Math.min(1 + dp[i - 1], 2 + dp[i % 4]));
            } else {
                if (i % 4 == 3) {
                    if (i % 5 == 0) {
                        dp[i] = 3 + dp[i % 4];
                    } else {
                        dp[i] = 2 + dp[i % 4];
                    }
                } else {
                    dp[i] = 1 + dp[i - 1];
                }
            }
            i++;
        }
        System.out.println("Minimum steps to reduce " + n + " to 1 is " + dp[n]);
    }
}
