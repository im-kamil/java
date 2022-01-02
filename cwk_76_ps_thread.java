class practice13 extends Thread {
    public void run() {
    /*    int i = 0;
        while (i < 20) {
            try {
                Thread.sleep(200); 
            } catch (Exception e) {
                System.out.println(e);
            }
            
            System.out.println("Good Morning... ! ");
            i++;
        }  */
    }
}

class practice13b extends Thread {
    public void run() {
      //  int i = 0;
     /*   while (i < 20) {
            try {
                Thread.sleep(200); //QUESTION 2
            } catch (Exception e) {
                System.out.println(e);
            }
            
            System.out.println("Welcome... ! ");
            i++;
        }  */
    }
}

public class cwk_76_ps_thread {
    public static void main(String[] args) {
        // QUESTION 1
        practice13 t1 = new practice13();
        practice13b t2 = new practice13b();
        t1.setPriority(12); // QUESTION 3
        t2.setPriority(14);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t2.getState()); //QUESTION 4
      //  t1.start();
      //  t2.start();
      System.out.println(t2.getState());
      System.out.println(Thread.currentThread().getState()); // QUESTION 5  
    }
}
