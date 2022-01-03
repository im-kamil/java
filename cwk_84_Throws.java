class NegativeRadiusException extends Exception {
    @Override
    public String toString() { // new exception clss method
        return "radius cannot be negative!..";
    }

    @Override
    public String getMessage() { // again new method
        return "radius cannot be negative!";    // throw method
    }
}
public class cwk_84_Throws {
    // made by kamil
    public static double area(int r)throws NegativeRadiusException {  //THROWS METHOD SHOULD APPLY  
        if(r<0){
            throw new NegativeRadiusException();
        }
    
        double result = Math.PI * r * r;
        return result;
    }
     public static int divide(int a, int b) throws ArithmeticException{  // here we can use throws keyboard 
       int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        //  fazal - uses divide function created by kamil // fazal should add try
       
        try  {
            // int c = divide(6,0);   
            // System.out.println(c);
            double ar = area(6);
            System.out.println(ar);

        } catch (Exception e) {
        System.out.println("exception.");
        
        }

    }
}
