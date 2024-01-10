public class sum_of_numbers_0_n_recursion {

    public static int recursive_sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursive_sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(recursive_sum(n));
    }
}
