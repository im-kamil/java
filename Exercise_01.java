import java.util.Scanner;
public class Exercise_01 { 
        public static void main(String[] args) {
            Scanner S=new Scanner(System.in);
            double total=500;
            double outof=100;
            System.out.println("Percentage Calculator");
            System.out.println("(Marks out of 100)");
            System.out.println("1. Marks of 1st subject");
            double a=S.nextInt();
            System.out.println("2. Marks of second subject");
            double b=S.nextInt();
            System.out.println("3. Marks of third subject");
            double c=S.nextInt();
            System.out.println("4. Marks of fourth subject");
            double d=S.nextInt();
            System.out.println("5. Marks of fifth subject");
           double e=S.nextInt();
            double sum=a+b+c+d+e;
            double percentage = sum/total*outof;
            System.out.println("Your total percentage is");
            System.out.println(percentage);
        }
    }
    


