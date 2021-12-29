class C1{
    public int a=45;
    protected int x=50;
     int z=10;
     private int y=12; 
     public void meth1(){
         System.out.println(a);
         System.out.println(x);
         System.out.println(z);
         System.out.println(y);
     }
}
public class cwk_66_access_modifier {
  public static void main(String[] args) {
      C1 c = new C1();
     // c.meth1();
         System.out.println(c.a);
         System.out.println(c.x);
         System.out.println(c.z);
        //  System.out.println(c.y); // throws an error because we cannot access private in same package
  }  
}
