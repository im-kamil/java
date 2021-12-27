public class cwk_32_method_overloading {
  static void foo() {
    System.out.println("Good night KAMMO");
  }

  static void foo(int a, int b) {
    System.out.println(" Good night " + a + " kammo ");
    System.out.println(" Good night " + b + " kammo ");
  }

  static void change(int a) {
    a = 85;
  }

  static void change2(int[] arr) {
    arr[0] = 85;
  }

  static void tellJoke() {
    System.out.println("HE IS SPIDERMAN"); // when we donot want any method to return anything then we use VOID as
                                           // return type
  }

  public static void main(String[] args) {
    // tellJoke();
    // case 1: changing the integer
    /*
     * int x=45;
     * change(x);
     * System.out.println("The value of x after running change is  "+ x);
     */
    // case 2: changing the Array
    /*
     * int marks[] = {54, 77, 78 , 85, 95, 98};
     * change2(marks);
     * System.out.println("The value of x after running change is  "+ marks[0]);
     */
    // Method overloading
    foo();
    foo(3000, 4000);
    // arguments are actual!
  }
}
