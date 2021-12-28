public class cwk_inverted_halfpyramid_pattern4 {
    public static void main(String[] args) {
        int n = 4; // m not because there is no column
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop --> space pattern
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Inner loop --> to print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
