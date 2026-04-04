package patterns;

public class Pattern_10_Half_Diamond_Star_Pattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the half diamond

        // Upper half of the half diamond
        for (int i = 1; i <= rows; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Lower half of the half diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
