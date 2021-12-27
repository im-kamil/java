public class cwk_27_ch6_arrays {
   public static void main(String[] args) {
      // float [] marks = {9.8f,7.5f,6.5f,4.5f,3.5f};
      /*
       * String [] student ={"KAMIL","SHARIA","FARRI","SANIA","FARIHA"};
       * System.out.println(student[1]);
       * System.out.println(student.length);
       */
      int[] marks = { 98, 75, 65, 55, 45 };
      // System.out.println(marks[4]);
      // System.out.println(marks.length);
      // DISPLAYING THE ARRAY
      System.out.println("Printing using naive way");
      System.out.println(marks[0]);
      System.out.println(marks[1]);
      System.out.println(marks[2]);
      System.out.println(marks[3]);
      System.out.println(marks[4]);
      // DISPLAYING AN ARRAY FOR LOOP
      System.out.println("Printing using for loop");
      for (int i = 0; i < marks.length; i++) {
         System.out.println(marks[i]);
      }
      // QUICK QUIZ
      System.out.println("Printing using DECREMENTING OF LOOP IN REVERSE ORDER");
      for (int i = marks.length - 1; i >= 0; i--) {
         System.out.println(marks[i]);
      }
      // QUICK QUIZ
      System.out.println("PRINTING USING FOR EACH LOOP");
      for (int element : marks) {
         System.out.println(element);
      }

   }
}
