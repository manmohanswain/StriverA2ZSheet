package patterns;

public class Pattern_6_Inverted_Numbered_Right_Pyramid {
    static void main(String[] args) {
        int n = 5; // Number of rows

//        for (int i = n; i >= 1; i--) {
////            // Print spaces
////            for (int j = 1; j <= n - i; j++) {
////                System.out.print(" ");
////            }
//            // Print numbers
//            for (int k = 1; k <= i; k++) {
//                System.out.print(k);
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= n; i++) {
            // Print numbers
            for (int k = n; k >= i; k--) {
                System.out.print(n - k + 1 + " ");
            }
            System.out.println();
        }
    }
}
