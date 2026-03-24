package BuildUpLogicalThinking;

public class Pattern_9_Diamond_Star_Pattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the upper half of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
