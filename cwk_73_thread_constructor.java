class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 38;
        System.out.println("Thank you");
        // while(true){
        // System.out.println("I am thread");
        // }
    }
}

public class cwk_73_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("KAMIL");
        MyThr t2 = new MyThr("IRFAN");
        t1.start();
        t2.start();
        System.out.println("The id of the thread is! " + t1.getId());
        System.out.println("The Name of the thread is! " + t1.getName());
        System.out.println("The id of the thread is! " + t2.getId());
        System.out.println("The Name of the thread is! " + t2.getName());
    }
}
