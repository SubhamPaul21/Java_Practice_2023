public class upper_bound {

    public static int upperBound(int[] arr, int target) {
        int index = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                // index = mid;
                left = mid + 1;
                index = left;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // Given a sorted array of size “N”; find the index of the number in the array
        // which is just greater than x and as close as possible to x.
        // -> Upper Bound (x) = Returns index of the number which is just greater than x
        // and as close as possible to x.
        // Output --> Upper bound of 6 is at index 5

        int[] arr = {1, 3, 5, 6 , 6, 7, 7, 9};
        // int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 7;
        int upperBoundIndex = upperBound(arr, target);
        if (upperBoundIndex != -1 && upperBoundIndex != arr.length) {
            System.out.println("Upper bound of " + target + " is at index " + upperBoundIndex
                    + " which is the element: " + arr[upperBoundIndex]);
        } else {
            System.out.println("Target number's upper bound doesn't exists in the array");
        }
    }
}
