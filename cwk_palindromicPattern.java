import javax.sound.sampled.SourceDataLine;

public class cwk_palindromicPattern {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            // for 1st half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // 2nd half number
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
