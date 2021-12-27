class myEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

// Calculating the area of a circle by using access modifier in this program
class Circle2 {
    private float r;

    public void setradius(float rad) {
        r = rad;
    }

    public float getperi() {
        return 2 * 3.14f * r;
    }

    public float getarea() {
        return 3.14f * r * r;
    }
}

public class cwk_40_ch9_access {
    public static void main(String[] args) {
        myEmployee kamil = new myEmployee();
        // kamil.id = 45;
        // kamil.name = "kamilWdPassion"; throws an error due to private access
        // modifier.....
        kamil.setName("kamilWdPassionate");
        System.out.println(kamil.getName());
        kamil.setId(350);
        System.out.println(kamil.getId());
        // Exercise question
        Circle2 c1 = new Circle2();
        // c1.r = 7; // 'r' can't be accessed here due to private access modifier
        c1.setradius(7);
        System.out.println("Area = " + c1.getarea());
        System.out.println("Perimeter = " + c1.getperi());

    }

}
