public class parallelogram_pattern {
    
    public static void pattern_function(int n) {
        if(0<=n && n<=50) {
            //row loop
            for(int i=0; i<n; i++) {
                //dot loop
                for(int j=0; j<i; j++) {
                    System.out.print(". ");
                }
                //star loop
                for(int j=0; j<n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Out of bound!");
        }
    }

    public static void main(String[] args) {
        pattern_function(4);
        System.out.println();
        pattern_function(3);
        System.out.println();
        pattern_function(5);
    }
}
