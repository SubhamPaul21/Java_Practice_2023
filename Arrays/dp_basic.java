public class dp_basic {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 6, 7, 3, 2, 2 };
        int[] queries = { 0, 3, 4, 2 };

        int[] dp = new int[n];
        // 0(N) to Pre-compute the sum till ith index in a new array
        int i = 0;
        while(i < n) {
            if(i == 0) {
                dp[i] = arr[i];
            } else {
                dp[i] = arr[i] + dp[i-1];
            }
            i++;
        }
        
        // 0(1) to find the result since we already have pre-computed array
        for(int query: queries) {
            System.out.println(dp[query]);
        }
    }
}
