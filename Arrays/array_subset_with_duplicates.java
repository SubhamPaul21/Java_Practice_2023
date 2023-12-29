import java.util.HashMap;
import java.util.Map;

public class array_subset_with_duplicates {
    public static void main(String[] args) {
        // int[] arr1 = { 2, 4, 7, 1, 5, 5 };
        // int[] arr2 = { 5, 4, 2 };
        int[] arr1 = { 9, 3, 1, 5, 2, 1 };
        int[] arr2 = { 9, 1, 1, 1 };

        Map<Integer, Integer> arr1_Map = new HashMap<>();
        Map<Integer, Integer> arr2_Map = new HashMap<>();

        for (int element : arr1) {
            if (arr1_Map.containsKey(element)) {
                arr1_Map.put(element, arr1_Map.get(element) + 1);
            } else {
                arr1_Map.put(element, 1);
            }
        }

        for (int element : arr2) {
            if (arr2_Map.containsKey(element)) {
                arr2_Map.put(element, arr2_Map.get(element) + 1);
            } else {
                arr2_Map.put(element, 1);
            }
        }

        for (int key : arr2_Map.keySet()) {
            if (!arr1_Map.containsKey(key)) {
                System.out.println("arr2 is not a subset of arr1");
                return;
            } else {
                if (arr2_Map.get(key) > arr1_Map.get(key)) {
                    System.out.println("arr2 is not a subset of arr1");
                    return;
                }
            }
        }
        System.out.println("arr2 is a subset of arr1");
    }
}
