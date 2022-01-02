import java.util.Scanner;

public class cwk_82_handlingexception {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 50;
        marks[1] = 50;
        marks[2] = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int num = sc.nextInt();
        try {
            System.out.println("The value at array index entered is " + marks[ind]); 
            System.out.println("The value at array value number is " + marks[ind]/num); 
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException!");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException!");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some expection occured!");
            System.out.println(e);
        }
        
    }
}
