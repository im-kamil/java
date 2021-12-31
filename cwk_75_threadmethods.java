class MyNewThr1 extends Thread {

    public void run() {

        int i = 0;
        while(i<30){
        // System.out.println("I am thread");
        System.out.println("Thank you");
        i++;
    }
}

class MyNewThr2 extends Thread {

    public void run() {

        System.out.println("Thank you");
        // while(true){
        // System.out.println("I am thread");
        // }
    }
}

public class cwk_75_threadmethods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr1 t2 = new MyNewThr1();
        t1.start();
        try {
            t1.join(); // error has gone like we saw in down
        } catch (Exception e) {

            System.out.println(e);
        }
        // t1.join(); // throws an error so we should use try catch formula this join
        // method should be inside try formula
        t2.start();
    }
}
}
