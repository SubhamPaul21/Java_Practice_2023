public class incrementing_alphabet_traingle_pattern {
    
    public static void incrementing_alphabet_traingle(int n) {
        //char character = (char) n;
        //int number = (int) character;
        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print((char)(65 + i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        incrementing_alphabet_traingle(7);
    }
}
