public class triangle_integer_sum_pattern {
    
    public static void pattern_function(int n) {
        if(0<=n && n<=50) {
            // row loop
            for(int i=0; i<n; i++) {
                int sum = 0;
                // column loop
                for(int j=0; j<=i; j++) {
                    System.out.print(j+1);
                    if (j != i) {
                        System.out.print("+");
                    }
                    sum = sum + (j + 1);
                }
                System.out.println(" = " + sum);
            }
        } else {
            System.out.println("Out of bound!");
        }
    }

    public static void main(String[] args) {
        pattern_function(3);
        System.out.println();
        pattern_function(5);
    }
}
