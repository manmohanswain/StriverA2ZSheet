package patterns;

public class Pattern_21_Hollow_Rectangle_Pattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int cols = 10; // Number of columns

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                // Print '*' for the borders, otherwise print space
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
