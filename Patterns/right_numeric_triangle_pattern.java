public class right_numeric_triangle_pattern {
    
    public static void pattern_function(int n) {
        if (0<=n && n<=50) {
            // row loop
            for(int i=0; i<n; i++) {
                // dot loop
                for(int j=0; j<n-i-1; j++) {
                    System.out.print(". ");
                }
                //number loop
                for(int j=1; j<=i+1; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Out of bound!");
        }
    }

    public static void main(String[] args) {
        pattern_function(9);
    }

}
