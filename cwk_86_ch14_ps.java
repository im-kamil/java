import java.util.Scanner;

public class cwk_86_ch14_ps {
    public static void main(String[] args) {
        // PROBLEM 2
        try {
            int a = 9 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println(" hehehehehe ");
        } catch (ArithmeticException e) {
            System.out.println(" hahahah ");
        }
        // PROBLEM 3
        boolean flag = true;
        int marks[] = new int[3];
        marks[0] = 40;
        marks[1] = 50;
        marks[2] = 60;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid index!..");
                i++;
            }

        }
        if (i >= 5) {
            System.out.println("Error");
        }
    }
}
