import java.util.*;

public class array_basic {
    public static void main(String[] args) {
        // initialize a Scanner variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        // store the user input as an integer
        int arr_size = sc.nextInt();
        // initialize arr of size entered by user
        int[] arr = new int[arr_size];
        // declare the size of the arr
        int size = arr.length;
        // run a for loop based on size of array to store the element in the array
        for(int i=0; i<size; i++) {
            System.out.println("Enter the element of array:");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        // print the elements of the array
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
