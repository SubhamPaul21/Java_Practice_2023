public class find_max_subset {
    public static void main(String[] args) {
        int[] arr = { -2, 4, -6, -7, 8 };
        int n = arr.length;
        int[] dp = new int[n];

        int i = 0;
        while (i < n) {
            if (i == 0) {
                dp[i] = Math.max(arr[i], 0);
            } else if (i == 1) {
                dp[i] = Math.max(arr[i], dp[i - 1]);
            } else {
                dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
            }
            i++;
        }

        for (int element : dp) {
            System.out.print(element + " ");
        }
    }
}
