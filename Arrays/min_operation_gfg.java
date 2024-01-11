public class min_operation_gfg {

    public static int minCount(long n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n % 3 == 0) {
            return 1 + minCount(n / 3);
        } else if (n % 3 == 1) {
            return 1 + minCount(n - 1);
        } else {
            return 1 + minCount(n + 1);
        }
    }

    public static int efficient(long n) {
        int count = 0;
        while (n > 1) {
            if (n % 3 == 0) { // if n % 3 == 0 --> n /3
                n /= 3;
            } else if (n % 3 == 1) { // if n % 3 == 1 --> n--
                n--;
            } else {
                if (n == 2) {
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
