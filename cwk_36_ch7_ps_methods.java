public class cwk_36_ch7_ps_methods {
  void multiplication(int n) {
    for (int i = 1; i <= 10; i++) {
      System.out.format("%d x %d = %d\n", n, i, n * i);
    }
  }

  static void pattern1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static int sumRec(int n) {
    // BASE CONDITION
    if (n == 1) {
      return 1;
    }
    return n + sumRec(n - 1);
  }

  static void pattern2(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static int fib(int n) {
    /*
     * if(n==1){
     * return 0;
     * }
     * else if(n==2){
     * return 1;
     * }
     */
    if (n == 1 || n == 2) {
      return n - 1;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }

  static void pattern1Rec(int n) {

    if (n > 0) {
      pattern1Rec(n - 1);
      for (int i = 0; i < n; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void Temperature(float c) {
    if (c == 0) {
      System.out.println("32 Faherenit ");
    } else {
      float f = (c * 9 / 5) + 32;
      System.out.println(f + " Faherenit");

    }
  }

  public static void main(String[] args) {
    cwk_36_ch7_ps_methods vb = new cwk_36_ch7_ps_methods();
    // PROBLEM 1
    vb.multiplication(8);
    // PROBLEM 2
    pattern1(4);
    // PROBLEM 3
    int c = sumRec(4);
    System.out.println(c);
    // PROBLRM 4
    pattern2(4);
    // PROBLEM 5
    // fibonacci series= 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …….
    int result = fib(7);
    System.out.println(result);
    // PROBLEM 8
    pattern1Rec(4);
    // PROBLEM 9
    Temperature(45);
  }
}
