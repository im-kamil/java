import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.SourceLocator;
import java.util.Scanner;

public class cwk_18_ch4_elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        // switchcase control
        switch (age) {
            case 18:
                System.out.println("You are going to become adult ! ");
                break;
            case 23:
                System.out.println("You are going to get a job ! ");
                break;
            case 60:
                System.out.println("You are going to get retired ! ");
                break;
            default:
                System.out.println("ENJOY YOUR DAY VIBES ! ");
        }

        // elseifclause
        /*
         * if(age>56){
         * System.out.println("You are experienced :");
         * }
         * else if(age>46){
         * System.out.println("You are semi-experienced :");
         * }
         * else if(age>36){
         * System.out.println("You are semi-semi experienced :");
         * }
         * else{
         * System.out.println("You are not experienced :");
         * }
         */
    }
}
