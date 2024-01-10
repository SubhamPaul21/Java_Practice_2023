public class min_operation_to_reduce_n_to_1 {

    public static void main(String[] args) {
        int n = 14;

        int[] dp = new int[n + 1];

        dp[1] = 0;
        dp[2] = 1;

        int i = 3;
        while (i <= n) {
            if (i % 7 == 0) {
                dp[i] = Math.min(Math.min(dp[i - 1] + 1, dp[i - 2] + 1), dp[i / 7] + 1);
            } else {
                dp[i] = Math.min(dp[i - 1] + 1, dp[i - 2] + 1);
            }
            i++;
        }

        for (int element : dp) {
            System.out.print(element + " ");
        }
    }
}
