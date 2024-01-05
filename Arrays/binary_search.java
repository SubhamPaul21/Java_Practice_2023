public class binary_search {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int k = 7;

        int ans = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                ans = mid;
                // first occurence of element
                right = mid - 1;
                // last occurence of element
                // left = mid + 1;
            } else if (arr[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("The index of the element " + k + " is " + ans);
    }
}
