package patterns;

public class Pattern_16_Alpha_Ramp_Pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char ch = (char) ('A' + i);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
