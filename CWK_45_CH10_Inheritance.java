class Base {
     int x; // public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'am in base class and setting X now ");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I'am a constructor");
    }
}

class Derived extends Base { // due to Inheritance all the method or constructor in class is entered by
                             // extends words used
    int y; // public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWK_45_CH10_Inheritance {

    public static void main(String[] args) {
        // creating an object ob Base class
        Base b = new Base(); // if i will make Derived object then there will no
        // change same as output lets see below
        b.setX(350);
        System.out.println(b.getX());
        // Creating an Object of Base Class
       Derived d = new Derived(); // if i will make Derived object then there will no
        // change same as output lets see below
       /* d.setX(346); // we can setY in Derived because Y is additional in Derived
        System.out.println(d.getX()); */
        d.setY(306); 
        System.out.println(d.getY());
    }
}
