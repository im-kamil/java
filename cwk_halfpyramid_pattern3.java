public class cwk_halfpyramid_pattern3 {
    public static void main(String[] args) {
        int n = 4; // m not because there is no column
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

}
