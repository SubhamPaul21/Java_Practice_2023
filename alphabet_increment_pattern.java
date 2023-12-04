public class alphabet_increment_pattern {
    
    public static void pattern_function(int n) {
        for(int i=0; i<n; i++) {
            for(int j=i; j<=2*i; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern_function(4);
    }
}
