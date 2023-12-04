public class reverse_repeating_pattern {
    
    public static void pattern_function(int n) {
        if (0<=n && n<=50) {
            // row loop
            for(int i=0; i<n; i++) {
                // pattern loop
                for(int j=0; j<n-i; j++) {
                    System.out.print(n-i + " ");
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
