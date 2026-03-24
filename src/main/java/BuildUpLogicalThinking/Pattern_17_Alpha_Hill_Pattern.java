package BuildUpLogicalThinking;

public class Pattern_17_Alpha_Hill_Pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            // 1️⃣ Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // 2️⃣ Increasing letters
            for (int j = 0; j <= i; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch+" ");
            }

            // 3️⃣ Decreasing letters
            for (int j = i - 1; j >= 0; j--) {
                char ch = (char) ('A' + j);
                System.out.print(ch+" ");
            }

            System.out.println();
        }
    }
}
