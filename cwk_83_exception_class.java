import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() { // new exception clss method
        return "I am toString()";
    }

    @Override
    public String getMessage() { // again new method
        return " I am getMessage()";
    }
}

public class cwk_83_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
              //  throw new MyException();
              throw new ArithmeticException("this is exception"); // if things invalid so we can use exception in java class
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("finished");

            }
            System.out.println("yes finished !");

        }
    }
}
