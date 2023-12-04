public class sum_of_array {
    public static void main(String[] args) {
        int[] arr = {10, 55, 78, 99, 155};
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum is: " + sum);
    }
}
