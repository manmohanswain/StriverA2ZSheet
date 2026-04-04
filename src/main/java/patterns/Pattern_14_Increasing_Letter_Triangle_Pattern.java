package patterns;

public class Pattern_14_Increasing_Letter_Triangle_Pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        char letter = 'A'; // Starting letter

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
//                System.out.print(letter + " ");
//                letter++;
                char ch = (char) ('A' + j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
