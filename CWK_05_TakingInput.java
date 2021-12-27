import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;

public class CWK_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking inout from the users");
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter number1");
        /*
         * int a = SC.nextInt();
         * float a = SC.nextFloat();
         * System.out.println("Enter number2");
         * // int b = SC.nextInt();
         * float b = SC.nextFloat();
         * // int sum = a+b;
         * float sum = a+b;
         * System.out.println("The sum of these number is");
         * System.out.println(sum);
         */
        // boolean b1 = SC.hasNextInt();
        // System.out.println(b1);
        // String str = SC.next();
        String str = SC.nextLine();
        System.out.println(str);

    }
}