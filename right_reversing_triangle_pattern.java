public class right_reversing_triangle_pattern {
    
    public static void pattern_function(int n) {
        if (0<=n && n<=50) {
            // row loop
            for(int i=0; i<n; i++) {
                // dot loop
                for(int j=0; j<n-i-1; j++) {
                    System.out.print(". ");
                }
                // front number loop
                for(int k=i+1; k<=2*i+1; k++) {
                    System.out.print(k + " ");
                }
                // reverse number loop
                for(int l=2*i; l>=i+1; l--) {
                    System.out.print(l + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Out of bound!");
        }
    }

    public static void main(String[] args) {
        pattern_function(4);
    }
}
