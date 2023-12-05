public class kite_star_pattern {
    
    public static void pattern_function(int n) {
        if (n % 2 != 0) {
            if (1<=n && n<=49) {
                int mid = n/2;
                // Part 1
                //row loop
                for(int i=0; i<=mid; i++) {
                    // dot loop
                    for(int j=0; j<mid-i; j++) {
                        System.out.print(". ");
                    }
                    // star loop
                    for(int k=0; k<2*i+1; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

                // Part 2
                // row loop
                for(int i=1; i<=mid; i++) {
                    // dot loop
                    for(int j=0; j<i; j++) {
                        System.out.print(". ");
                    }
                    // star loop
                    for(int k=n-2*i; k>0; k--) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Out of bound!");
            }
        } else {
            System.out.println("N is not an odd number!");
        }
        
    }

    public static void main(String[] args) {
        pattern_function(7);
    }
}
