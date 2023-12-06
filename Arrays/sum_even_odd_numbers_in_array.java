import java.util.Random;

public class sum_even_odd_numbers_in_array {
    
    public static void main(String[] args) {
        // initialize an array of size 10
        int[] array = new int[10];
        Random random = new Random();
        for(int i=0; i<array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.print("Elements of the array are: ");
        for(int element: array) {
            System.err.print(element + " ");
        }

        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i<array.length; i++) {
            if(array[i] % 2 == 0) {
                evenSum = evenSum + array[i];
            } else {
                oddSum = oddSum + array[i];
            }
        }
        System.out.println();
        System.out.println("The sum of Odd Numbers are: " + oddSum);
        System.out.println("The sum of Even Numbers are: " + evenSum);
    }
}
