class MyRunnableThread1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 500)
            System.out.println("I am thread1 not a threat!");
        i++;
        // loop for more runnable....
    }
}

class MyRunnableThread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println("I am thread2 not a threat!");
            i++;
        }
    }
} 

public class cwk_71_runnable_thread_method {
    public static void main(String[] args) {
        // MyRunnableThread1 t1 = new MyRunnableThread1();
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);
        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);
        // t1.start(); // this error can be resolve with an example like GUN without
        // bullet gun is nothing so we use runnable method see above some changing in
        // obj
        // t2.start();
        gun1.start(); // finally error gone by runnable method thread
        gun2.start(); // one more important point Thread will start at start method not Run which we were declared at above run method
    }
}
