package BuildUpLogicalThinking;

public class Pattern_8_Inverted_Star_Pyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the inverted pyramid

        for (int i = rows; i >= 1; i--) {
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
