import org.jcp.xml.dsig.internal.SignerOutputStream;

public class cwk_numberpyramid {
    public static void main(String[] args) {
        int n = 5;
        // upper loop
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for numbers--> print row no ,row no of times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
