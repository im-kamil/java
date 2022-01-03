public class cwk_85_finallyblock {
    public static int greet() {
        try {
            int a = 50;
            int b = 2;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleaning up resources....This is the end of the function");
        }
        return 0;

    }

    public static void main(String[] args) {
        greet(); // finally value is executed if like below thn 25 will come
        int k = greet();
        System.out.println(k);
        int a = 10;
        int b = 8;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally { // finally block is executed at any cost chahe aap break lgale ya return krale
                System.out.println("I am finally for value of b is = " + b);
            }
            b--;
        }
        // lets c if we can add try with cath only or try with final
        try {
            System.out.println(5 / 0);
        } finally { // try catch but with try we can add finally
            System.out.println("yes we can");
        }

    }
}
