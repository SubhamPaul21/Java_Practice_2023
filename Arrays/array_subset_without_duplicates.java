import java.util.HashSet;
import java.util.Set;

public class array_subset_without_duplicates {
    public static void main(String[] args) {
        // int[] arr1 = { 2, 4, 7, 1, 5 };
        // int[] arr2 = { 5, 2, 1 };
        int[] arr1 = { 9, 3, 1, 5 };
        int[] arr2 = { 9, 7 };
        Set<Integer> arr1_Set = new HashSet<>();
        Boolean isSubset = true;

        for (int element : arr1) {
            arr1_Set.add(element);
        }

        for (int element : arr2) {
            if (!arr1_Set.contains(element)) {
                System.out.println("arr2 is not subset of arr1");
                return;
            }
        }

        System.out.println("arr2 is a subset of arr1");
    }
}
