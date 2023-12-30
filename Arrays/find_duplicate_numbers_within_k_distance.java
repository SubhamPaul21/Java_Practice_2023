import java.util.*;

public class find_duplicate_numbers_within_k_distance {
    public static void main(String[] args) {
        // Loop through array and create map entries as -->
        // <Number, First Index Encountered>
        // When same element found, subract the current index with first index
        // If difference <= k, return True else continue
        // Finally return False, if no duplicates found within k range

        int[] arr = { 1, 2, 3, 4, 1, 2, 3, 4 };
        // int[] arr = { 1, 2, 3, 1, 4, 5 };
        int k = 3;

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int previousIndex = hashMap.get(arr[i]);
                if ((i - previousIndex) <= k) {
                    System.out.println("True");
                    return;
                } else {
                    hashMap.put(arr[i], i);
                }
            } else {
                hashMap.put(arr[i], i);
            }
        }
        System.out.println("False");
    }
}
