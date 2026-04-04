package patterns;

public class Pattern_1_Rectangular_Star_Pattern
{
    static void main(String[] args) {
        int n = 5; // number of lines
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
