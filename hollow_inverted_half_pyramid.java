public class hollow_inverted_half_pyramid {
    
    public static void pattern_function(int n) {
        // first row pattern
        for(int i=0; i<n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for(int i=n/2; i>=0; i--) {
            // first star in hollow pattern
            System.out.print("* ");
            // hollow pattern
            for(int j=i; j>0; j--) {
                System.out.print(". ");
            }
            //System.out.println();
            System.out.print("* ");
            System.out.println();
        }
        // last row pattern
        System.out.print("* ");
    }

    public static void main(String[] args) {
        pattern_function(6);
        System.out.println();
        System.out.println();
        pattern_function(3);
        System.out.println();
        System.out.println();
        pattern_function(5);
    }
}
