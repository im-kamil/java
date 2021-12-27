class Cylinder {
    private int radius;
    private int height;

    public Cylinder() {
        // this.radius = radius;
        // this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double SurfaceArea() {
        return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }

    public double volume() {
        return 3.14 * radius * radius * height;
    }
}

public class cwk_44_ch9_ps {
    public static void main(String[] args) {
        // PROBLEM 1
        Cylinder myCylinder = new Cylinder();
        
          myCylinder.setHeight(6);
          System.out.println(myCylinder.getHeight());
          myCylinder.setRadius(10);
          System.out.println(myCylinder.getRadius());
            
        // PROBLEM 2    
        /*
         * cylinder myCylinder = new cylinder();
         * myCylinder.setRadius(10);
         * System.out.println(myCylinder.volume());
         * System.out.println(myCylinder.SurfaceArea());
         */
        // PROBLEM 3
        
    }
}
