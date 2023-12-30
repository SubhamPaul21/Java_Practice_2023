import java.util.Arrays;

public class prefix_sum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 1, 6, 5, 7, 3, 2 };

        // Create an empty prefix_sum array of length + 1 as arr
        // Initialize the elements with zero.
        int[] prefix_sum = new int[arr.length + 1];
        Arrays.fill(prefix_sum, 0);

        // Run a for loop from (1 to prefix_sum length - 1) and populate each index of
        // the prefix_sum using the following operation
        // prefix_sum[i] = prefix_sum[i-1] + arr[i-1]
        for (int i = 1; i < prefix_sum.length; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + arr[i - 1];
        }

        for (int element : prefix_sum) {
            System.out.print(element + " ");
        }
        System.out.println();
        // initialize the range of the sum
        int left_index = 4;
        int right_index = 5;

        // Calculate the sum of the range(l,r) using following operation
        // sum(l,r) = prefix_sum[r] - prefix_sum[l-1]
        int sum = prefix_sum[right_index] - prefix_sum[left_index - 1];

        System.out.println(sum);

    }
}
