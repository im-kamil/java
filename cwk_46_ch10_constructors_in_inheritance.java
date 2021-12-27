class Base {
    Base() { // CONSTRUCTOR
        System.out.println("mai ek constructor hu kamina");
    }

    Base(int a) { // CONSTRUCTOR overloading of Base
        System.out.println("I am an overloaded constructor with value of a as: " + a);
    }
    /*
     * public int x;
     * 
     * public int getX() {
     * return x;
     * }
     * 
     * public void setX(int x) {
     * this.x = x;
     * }
     */
}

class Derived extends Base {
    Derived() { // constructor of derived class
        // super(0); // super keyword is used for passing overload constructor first.
        System.out.println("I am a derived constructor");
    }

    Derived(int a, int b) { // CONSTRUCTOR overloading of Derived
        super(a);
        System.out.println("I am an overloaded  Derived constructor with value of b as: " + b);
    }
    /*
     * public int y;
     * 
     * public int getY() {
     * return y;
     * }
     * 
     * public void setY(int y) {
     * this.y = y;
     * }
     */

}

class ChildofDerived {
    ChildofDerived() {
        System.out.println("I am child of a Derived ");
    }

    ChildofDerived(int a, int b, int c) {
        super();
        System.out.println("I am an overloaded  Derived constructor with value of c as: " + c);
    }
}

public class cwk_46_ch10_constructors_in_inheritance {
    public static void main(String[] args) {
       // Base b = new Base();
      //  Derived d = new Derived();
      //  Derived d1 = new Derived(12, 15);
      //  ChildofDerived cd = new ChildofDerived();
        ChildofDerived cd = new ChildofDerived(12, 15, 20);
}
}
