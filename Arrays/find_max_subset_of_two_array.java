public class find_max_subset_of_two_array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 3, 21234 };
        int[] arr2 = { -4509, 200, 3, 40 };
        int n = arr1.length;
        int[] dp = new int[n];

        int i = 0;
        while (i < n) {
            if (i == 0) {
                dp[i] = Math.max(Math.max(arr1[i], arr2[i]), 0);
            } else if (i == 1) {
                dp[i] = Math.max(Math.max(arr1[i], arr2[i]), dp[i - 1]);
            } else {
                dp[i] = Math.max(Math.max(arr1[i], arr2[i]) + dp[i - 2], dp[i - 1]);
            }
            i++;
        }

        for (int element : dp) {
            System.out.print(element + " ");
        }
    }
}
