import java.util.*;

public class prefix_sum_v2 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 1 };
        int[] prefix = new int[arr.length];
        Arrays.fill(prefix, 0);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            prefix[i] = sum;
        }

        for (int element : prefix) {
            System.out.print(element + " ");
            System.out.println();
        }

        int l = 1;
        int r = 2;

        int ans = prefix[r] - (l == 0 ? 0 : prefix[l - 1]);
        System.out.println("Output: " + ans);
    }
}