public class minimize_step_gfg {

    public static int minSteps(long n) {
        if (n == 1) {
            return 0;
        } else if (n == 2 || n == 3) {
            return 1;
        } else if (n % 3 == 0) {
            return 1 + Math.min(minSteps(n / 3), minSteps(n - 1));
        } else if (n % 2 == 0) {
            return 1 + Math.min(minSteps(n / 2), minSteps(n - 1));
        } else {
            return 1 + minSteps(n - 1);
        }
    }

    public static int dp(long n) {
        int[] dpArr = new int[(int) n + 1];

        dpArr[1] = 0;
        dpArr[2] = 1;
        dpArr[3] = 1;
        int i = 4;
        while (i <= n) {
            if (i % 3 == 0) {
                dpArr[i] = 1 + Math.min(dpArr[i / 3], dpArr[i - 1]);
            } else if (i % 2 == 0) {
                dpArr[i] = 1 + Math.min(dpArr[i / 2], dpArr[i - 1]);
            } else {
                dpArr[i] = 1 + dpArr[i - 1];
            }
            i++;
        }
        return dpArr[(int) n];
    }

    public static void main(String[] args) {
        long n = 10;
        System.out.println("Steps to reduce " + n + " using Recursion is " + minSteps(n));
        System.out.println("Steps to reduce " + n + " using DP is " + dp(n));
    }
}
