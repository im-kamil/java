interface Bicycle { // interface class first
    int a = 45; // final

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface HornBicycle { // double interface
    void blowHorn45();

    void blogHorn55();
}

class AvonCycle implements Bicycle, HornBicycle { // interface inheritance
  //  void blowHorn() {
   //     System.out.println("pee pee poo");
    // }

    public void applyBrake(int decrement) {
        System.out.println("applying brake");
    }

    public void speedUp(int increment) {
        System.out.println("speedUp brake");
    }

    public void blowHorn45() {
        System.out.println("pee pee peee pee");
    }

    public void blogHorn55() {
        System.out.println("poo poo poo poo");
    }

}

public class cwk_56_interface {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle();
        AvonCycle b = new AvonCycle();
        a.applyBrake(1);
        // u can create properties in interfaces
        System.out.println(a.a);
        // u cannot modify properties as they are final
        b.speedUp(1);
        a.blogHorn55();
        a.blowHorn45();
    }
}
