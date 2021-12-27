import javax.sound.sampled.SourceDataLine;

public class cwk_17_ch3_logicals {
    public static void main(String[] args) {
        System.out.println("for logical AND");
        boolean a = true;
        boolean b = true;
        boolean c = true;
        if (a && b && c) {
            System.out.println("y");
        } else {
            System.out.println("N");

        }
        System.out.println("for logical OR");
        boolean d = true;
        boolean e = true;
        boolean f = true;
        if (d || e || f) {
            System.out.println("y");
        } else {
            System.out.println("N");

        }
        System.out.println("for logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
