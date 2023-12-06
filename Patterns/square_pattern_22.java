public class square_pattern_22 {

    public static void pattern_function(int n) {
        if (1<=n && n<=20) {
            //upper part
            // row loop
            for(int i=0; i<n; i++) {
                //left pattern loop
                for(int j=0; j<=i-1; j++) {
                    System.out.print(n-j + " ");
                }
                //middle repeating loop
                for(int j=0; j<2*(n-i)-1; j++) {
                    System.out.print(n-i + " ");
                }
                //right pattern loop
                for(int j=i-1; j>=0; j--) {
                    System.out.print(n-j + " ");
                }
                System.out.println();
            }
            //lower part
            //row loop
            for(int i=1; i<n; i++) {
                //left pattern loop
                for(int j=0; j<n-i-1; j++) {
                    System.out.print(n-j + " ");
                }
                //middle repeating loop
                for(int j=0; j<2*i+1; j++) {
                    System.out.print(i+1 + " ");
                }
                //right pattern loop
                for(int j=n-i-1; j>0; j--) {
                    System.out.print(n-j+1 + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Out of bound!");
        }
    }

    public static void main(String[] args) {
        pattern_function(2);
    }
}