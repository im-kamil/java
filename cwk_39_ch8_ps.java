class MyMainEmployee {
    int id;
    String name;

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class cellPhone {
    public void ringing() {
        System.out.println("ringing...");
    }

    public void vibrating() {
        System.out.println("vibrating...");
    }

    public void callFriend() {
        System.out.println("call to Irfan...");
    }

}

class square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class tommy {
    public void hit() {
        System.out.println("Hitting the enemy");
    }

    public void run() {
        System.out.println("Running the enemy");
    }

    public void fire() {
        System.out.println("Firing the enemy");
    }
}

public class cwk_39_ch8_ps {
    public static void main(String[] args) {
        // problem 1
        /*
         * Employee kamil = new Employee();
         * kamil.setName("CodeWithKamil");
         * kamil.salary=244;
         * System.out.println(kamil.getSalary());
         * System.out.println(kamil.getName());
         */
        // problem 2
        /*
         * cellPhone asus = new cellPhone();
         * asus.callFriend();
         * asus.vibrating();
         * asus.ringing();
         */
        // Problem 3
        /*
         * square sq = new square();
         * sq.side = 4;
         * System.out.println(sq.area());
         * System.out.println( sq.perimeter());
         */
        // Question 5
        tommy player1 = new tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
