abstract class parent1 { // it is clear by adding abstract word in class hence from down it is abstract
                         // class.....
    public parent1() {
        System.out.println("Main ek base1 ka constructor hu");
    }

    public void sayHello() {
        System.out.println("hello world");
    }

    abstract public void greet();// this is abstract class we should add abstract word into class
}

class child1 extends parent1 { // now inheritance is apply
    @Override
    public void greet() {
        System.out.println("good morning");
    }
}

abstract class child2 extends parent1 { // adding abstract word in class
    public void th() {
        System.out.println("I am good");
    }
}

public class cwk_54_ch11_abstract {
    public static void main(String[] args) {
        child1 c = new child1(); // but it is occur
        // child2 cd = new child2(); // object is not occur because class is
        // abstract.throws an error
        // parent1 p = new parent1(); // same
    }
}
