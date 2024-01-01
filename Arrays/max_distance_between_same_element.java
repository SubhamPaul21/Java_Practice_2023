import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class max_distance_between_same_element {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 1 };
        // int[] arr = { 3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2 };
        int maxDifference = Integer.MIN_VALUE;
        Map<Integer, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (arrMap.containsKey(arr[i])) {
                int difference = i - arrMap.get(arr[i]);
                maxDifference = Math.max(maxDifference, difference);
            } else {
                arrMap.put(arr[i], i);
            }
        }
        System.out.println(maxDifference);
    }
}
