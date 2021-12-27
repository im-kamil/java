public class cwk_ch7_31_methods {
    static void tellJoke(){
        System.out.println("HE IS SPIDERMAN"); //when we donot want any method to return anything then we use VOID as return type
    }
    static int logic(int x, int y){
        int z;
        if(x>y){
         z = x+y;
        }
        else{
         z = (x+y)*5;
        }
        return z;
    }
   public static void main(String [] args){
       
       int a=6;
       int b=5;
       int c;
       // method invocation using object creation
     //  cwk_ch7_31_methods obj = new cwk_ch7_31_methods();
     //   c = obj.logic(a, b);
        c = logic(a, b);
      int a1=5;
      int b1=6;
      int c1;
    // c1= obj.logic(a1, b1);
     c1 = logic(a, b);
      System.out.println(c);
      System.out.println(c1);
   } 
}
