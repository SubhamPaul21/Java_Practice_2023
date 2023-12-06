public class full_pyramid {
    
    public static void pattern_function(int n) {
        // row loop
        for(int i=0; i<n; i++) {
            // space loop
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            // star loop
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
                if(j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        pattern_function(6);
    }
}