public class cwk_diamondpattern {
    public static void main(String[] args) {
        int n = 4;
        // upper half loop
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half loop
        for (int i = n; i >= 1; i--) {
            // for spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
