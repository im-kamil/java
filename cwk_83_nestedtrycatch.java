

public class cwk_83_nestedtrycatch {
 public static void main(String[] args) {
    int marks[] = new int[3];
    marks[0] = 50;
    marks[1] = 50;
    marks[2] = 50;
     try {
        System.out.println("Welcome to video no 82"); 
     try {
        System.out.println(marks[9]);  
     } catch (IndexOutOfBoundsException e) {
        System.out.println("sorry we couldnot get this index ! "); 
        System.out.println("Exception in level 2");
     }
     } catch (Exception e) {
         System.out.println("Exception in level 1");
     }
 }   
}
