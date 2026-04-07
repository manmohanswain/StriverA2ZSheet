package patterns;

public class Pattern_20_Symmetric_Butterfly_Pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Print left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Print right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
