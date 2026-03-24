package BuildUpLogicalThinking;

public class Pattern_15_Reverse_Letter_Triangle_Pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                char ch = (char) ('A' + j);
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                char ch = (char) ('A' + n - j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
