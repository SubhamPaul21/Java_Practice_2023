public class odd_square {
    
    public static void pattern_function(int n) {
        if(0<=n && n<=50) {
            // first row loop
            for(int i=0; i<n; i++) {
                // first part column loop
                for(int j=0; j<n; j++) {
                    // odd number loop
                    if(i+j < n) {
                        System.out.print(2*(i+j) + 1 + " ");
                    }
                }
                // second part column loop
                for(int j=0; j<i; j++) {
                    System.out.print(2*j + 1 + " ");
                }
                System.out.println();
            }
            // Second row loop
            //for9int i=0; i
        } else {
            System.out.println("Out of bound!");
        }
    }

    public static void main(String[] args) {
        pattern_function(4);
        System.out.println();
        pattern_function(5);
    }
}
