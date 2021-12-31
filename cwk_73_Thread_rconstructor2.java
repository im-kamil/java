
//Another constructer of thread-(runnable r,String name);
class th3 extends Thread {
    th3(Runnable r, String name) {
        super(r, name);
    }
}

class th1 implements Runnable {
    public void run() {
        System.out.println("hii");
    }
}

class th2 implements Runnable {
    public void run() {
        System.out.println("hlw");
    }
}

public class cwk_73_Thread_rconstructor2 {
    public static void main(String[] args) {

        th1 gun3 = new th1();
        Thread bullet1 = new Thread(gun3, "KAMIL");
        th2 gun4 = new th2();
        Thread bullet2 = new Thread(gun4, "IRFAN");
        bullet1.start();
        bullet2.start();
        System.out.println("Id of thread 1 is " + bullet1.getId());
        System.out.println("Id of thread 2 is " + bullet2.getId());
    }
}
