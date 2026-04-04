package patterns;

public class Pattern_12_Number_Crown_Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // 1️⃣ Left increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // 2️⃣ Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  "); // double space for alignment
            }

            // 3️⃣ Right decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
