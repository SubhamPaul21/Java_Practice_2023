import java.util.*;

public class find_sum_pairs {
    public static void main(String[] args) {
        // int[] arr = { 0, -1, 2, -3, 1 };
        // int arr[] = {0, -1, 2, -3};
        // int x = -2;
        int[] arr = {1, -2, 1, 0, 5, -3};
        int x = 2;

        Set<Integer> hashSet = new HashSet<>();

        // loop through the arr, subtract the element with x and check if the difference
        // is present in set
        // If present -> return True.... Else add element in set

        for (int element : arr) {
            // a + b = x => b = x - a; 
            int difference = x - element;
            if (hashSet.contains(difference)) {
                System.out.println("True");
                // System.out.println("Pairs: [" + difference + "," + element + "]");
                return;
            } else {
                hashSet.add(element);
            }
        }
        System.out.println("False");
    }
}
