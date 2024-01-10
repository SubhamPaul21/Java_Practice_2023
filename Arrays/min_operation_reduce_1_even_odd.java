import java.util.Arrays;

public class min_operation_reduce_1_even_odd {

    public static int minCount(long n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            return 1 + minCount(n / 2);
        } else {
            return 1 + Math.min(minCount(n - 1), minCount(n + 1));
        }
    }

    public static int efficient(long n) {
        int count = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                if (n % 4 == 1 || n == 3) {
                    n--;
                } else {
                    n++;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        long n = 15;
        System.out.println("Steps to reduce " + n + " using Recursion is " + minCount(n));
        System.out.println("Steps to reduce " + n + " using Efficient Method is " + efficient(n));
    }
}
