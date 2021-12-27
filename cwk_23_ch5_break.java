public class cwk_23_ch5_break {
  public static void main(String[] args) {
    // BREAK AND CONTINUE USING LOOP
    for (int i = 0; i < 50; i++) {

      /*
       * if(i==2){
       * System.out.println("ending the loop");
       * break;
       * }
       */
      if (i == 2) {
        System.out.println("ending the loop");
        continue;
      }
      System.out.println(i);
      System.out.println("java is best");
    }

  }
}
