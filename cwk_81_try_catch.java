public class cwk_81_try_catch {
    public static void main(String[] args) {
        int a = 6;
        int b = 0; // exception arthmtic because we should not divide by 0 but it can be resolve by
                   // try and catch method lets c
      // without try   
    //   int c = a / b;
    //   System.out.println("the result  is " + c);          
     // with try
        try {
            int c = a / b;
            System.out.println("the result  is " + c);
        } catch (Exception e) {
            System.out.println("we failed to divide reason...");
            System.out.println(e);
        }
        System.out.println("end of the programme");

    }
}
