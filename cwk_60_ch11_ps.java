abstract class pen {
    abstract void write(); // abstract word is necessary as we already discuss..

    abstract void refill(); // question 1 + 2
}

class fountainPen extends pen {
    void write() {
        System.out.println("write");
    }

    void refill() {
        System.out.println("refill");
    }

    void changeNib() { // question2 additional method
        System.out.println("changeNib");
    }
}

class monkey {
    void jump() {
        System.out.println("jumping....");
    }

    void bite() {
        System.out.println("Biting....");
    }
}

interface BasicAnimal { // after interface thn we can implements as per questions //question 3
    void eat();

    void sleep();
}

class Human extends monkey implements BasicAnimal { // like here now we can implements // question 3
    void speak() {
        System.out.println("speaking....");
    }

    public void eat() {
        System.out.println("i am eating...");
    }

    public void sleep() {
        System.out.println("i am sleeping...");
    }
}

public class cwk_60_ch11_ps {
    public static void main(String[] args) {
        // QUESTION 1+2
        fountainPen pen = new fountainPen();
        pen.changeNib();
        pen.refill();
        pen.write();
        // QUESTION 3
        Human kamil = new Human();
        kamil.bite();
        kamil.eat();
        kamil.jump();
        kamil.sleep();
        // QUESTION 5
        monkey M1 = new Human();
        M1.jump(); // allowed
        M1.bite();
      //  M1.speak();//cannot use speak methods because the reference is monkey which doesnot have speak methods
      BasicAnimal loveguru = new Human();
     // loveguru.speak(); // same as above not allowed because basicAnimal is only for eat and sleep
     loveguru.eat();
     loveguru.sleep(); // now it will work
    }
}
