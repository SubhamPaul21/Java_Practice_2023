public class reverse_string {

    public static void reversal(String str) {
        int length = str.length();
        char[] str_arr = str.toCharArray();
        char[] reversed_arr = new char[length];

        int i = 0;
        // Odd numbered string
        if (length % 2 != 0) {
            System.out.println("Odd");
            while (i < length && i != length / 2) {
                reversed_arr[i] = str_arr[length - i - 1];
                reversed_arr[length - i - 1] = str_arr[i];
                i++;
            }
            reversed_arr[i] = str_arr[length - i - 1];
        }
        // Even numbered string
        else {
            System.out.println("Even");
            while (i < length && i != length / 2) {
                reversed_arr[i] = str_arr[length - i - 1];
                reversed_arr[length - i - 1] = str_arr[i];
                i++;
            }
        }
        String reversedString = "";
        for (char character : reversed_arr) {
            // System.out.println(character);
            reversedString = reversedString + character + "";
        }

        System.out.println(reversedString);
    }

    public static void main(String[] args) {
        String str1 = "abdul";
        // String str2 = "subham";
        reversal(str1);
    }
}
