public class CWK_09_ch2_op_pre {
    public static void main(String[] args) {
        // 1. precedence and associativity

        // int a = 6*5-34/2;
        /* precedence --> 30-17=13 */
        // int b = 60/5-34*2;
        /* associativity --> 12-68=-56 */
        // System.out.println(a);
        // System.out.println(b);
        // 2. quick quiz
        /*
         * int x = 6;
         * int y = 1;
         * int k = x*y/2;
         * System.out.println(k);
         */
        /*
         * int b = 0;
         * int a = 10;
         * int c = 0;
         * int k = b*b-(4*a*c)/(2*a);
         * System.out.println(k);
         */
        int v = 4;
        int u = 4;
        int k = (v * v) - (u * u);
        System.out.println(k);
    }
}
