import java.util.*;

public class subarray_with_sum_k {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int m = 6;
        // int[] arr = { 5, 6, 7, 8, 9 };
        // int m = 5;

        Map<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        hashMap.put(0, 1);
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
            int remaining = xor ^ m;
            count = count + hashMap.getOrDefault(remaining, 0);
            hashMap.put(xor, hashMap.getOrDefault(xor, 0) + 1);
        }
        System.out.println(count);
    }
}
