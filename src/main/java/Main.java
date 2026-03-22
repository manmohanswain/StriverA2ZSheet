void main() {
    int n = 5; // number of lines
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            IO.print("*");
        }
        IO.println();
    }
}
