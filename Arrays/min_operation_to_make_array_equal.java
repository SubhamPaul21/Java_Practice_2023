import java.util.HashMap;
import java.util.Map;

public class min_operation_to_make_array_equal {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 1, 5, 5, 5, 5, 5};
        int minCount = Integer.MIN_VALUE;
        int target = 0;
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int element: arr) {
            int count = frequency.getOrDefault(element, 0) + 1;
            frequency.put(element, count);
            if (count > minCount) {
                minCount = count;
                target = element;
            }
        }
        System.out.println(frequency);

        int operationCount = arr.length - frequency.get(target);
        System.out.println(operationCount);
    }
}
