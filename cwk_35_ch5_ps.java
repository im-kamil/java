import javax.sound.sampled.SourceDataLine;

public class cwk_35_ch5_ps {
   public static void main(String[] args) {
      // PRACTICE SET
      // QUESTION 1
      int n = 4;
      for (int i = n; i > 0; i--) {
         for (int j = 0; j < i; j++) {
            System.out.print("*");
         }
         System.out.print("\n");

      }
      // QUESTION 2
      /*
       * int sum = 0;
       * int n = 3;
       * for(int i=0; i<n; i++){
       * sum = sum+(2*i); // output is 6 = o,2,4
       * 
       * }
       * System.out.print("Sum of even number is: ");
       * System.out.println(sum);
       */
      // QUESTION 3
      /*
       * int n = 5;
       * // for(int i=0; i<10; i++) them goes from i=0 to i=9
       * for(int i=1; i<=10; i++){
       * System.out.printf("%d X %d = %d\n", n, i, n*i );
       * }
       */
      // QUESTION 4
      /*
       * int n = 10;
       * // DECREMENTING FOR LOOP
       * for(int i=10; i>=1; i--){
       * System.out.printf("%d X %d = %d\n", n, i, n*i );
       * }
       */
      // QUESTION 6
      // int n=5;
      // factorial n = n*n-1 * n-2.......1
      // 5! = 5*4*3*2*1 =120
      /*
       * int i=1;
       * int factorial = 1;
       * while(i<=n){
       * factorial *= i;
       * i++;
       * }
       * System.out.println(factorial);
       */
      // QUESTION 9
      /*
       * int n = 8;
       * int sum=0;
       * for(int i=10; i>=1; i--){
       * System.out.printf("%d X %d = %d\n", n, i, n*i );
       * sum += n*i;
       * }
       * System.out.println(sum);
       */
   }
}