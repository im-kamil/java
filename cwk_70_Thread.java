class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("My thread is running");
            System.out.println("I am good");
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread 1 is good!");
            System.out.println("I am sad!");
        }
    }
}

public class cwk_70_Thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();
        t1.start();
        t2.start();
    }
}
