// Constraints
// 0 <= N <= 26


public class incrementing_alphabet_traingle_pattern {
    
    public static void incrementing_alphabet_traingle(int n) {
        //char character = (char) n;
        //int number = (int) character;

        if( 0 <= n && n <= 26) {
            for(int i=0; i<n; i++) {
                for(int j=0; j<i+1; j++) {
                    System.out.print((char)(65 + i));
                }
                System.out.println();
            }
        } else {
            System.out.println("Out of bound!");
        }
        
    }

    public static void main(String[] args) {
        incrementing_alphabet_traingle(7);
        incrementing_alphabet_traingle(50);
    }
}
