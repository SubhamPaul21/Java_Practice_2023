public class incrementing_different_number_triangle_pattern {

    public static void incrementing_number_pattern(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1;j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
            incrementing_number_pattern(6);
            //incrementing_number_pattern(5);
        }
}
