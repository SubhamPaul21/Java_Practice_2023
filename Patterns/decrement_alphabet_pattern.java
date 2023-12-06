// 0 <= N <= 26

public class decrement_alphabet_pattern {
    
    public static void pattern_function(int n) {
        if (0 <= n && n <= 26) {
            for(int i=0; i<n; i++) {
                for(int j=n-i-1; j<=n-1; j++) {
                    System.out.print((char) (65 + j) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Out of bound!");
        }
    }

    public static void main(String[] args) {
        pattern_function(5);
    }
}
