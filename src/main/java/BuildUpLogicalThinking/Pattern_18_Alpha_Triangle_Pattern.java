package BuildUpLogicalThinking;

public class Pattern_18_Alpha_Triangle_Pattern {
    public static void main(String[] args) {
//        int n = 5;
//        char ch = 'A';
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(ch + " ");
//                ch++;
//            }
//            System.out.println();
//        }
        int n = 5;
        for (int i = 0; i < n; i++) {
            // starting character
            char ch = (char) ('A' + n - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;  // move forward
            }
            System.out.println();
        }
    }
}
