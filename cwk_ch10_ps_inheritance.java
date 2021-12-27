class circle {
    public int radius;

    circle(int r) {
        System.out.println("I am paramaterized circle");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder1 extends circle {
    public int height;

    cylinder1(int r, int h) {
        super(r);
        System.out.println("I am cylinder paramaterized circle");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class cwk_ch10_ps_inheritance {
    public static void main(String[] args) {
        // QUESTION 1
        // circle objc =new circle(12);
        cylinder1 obj = new cylinder1(12, 6);
    }
}
