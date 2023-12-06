public class half_pyramid {
    
    public static void pattern_function(int n) {
        // row loop
        for(int i=0; i<n; i++) {
            // column loop -- star printing loop
            for(int j=0; j<i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern_function(5);
    }
}
