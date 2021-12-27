import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class cwk_19_ch4_ps {
  public static void main(String[] args) {
    // QUESTION 1
    /*
     * int a = 10;
     * if(a==11){
     * System.out.println("yes i am 11 :");
     * 
     * }
     * else{
     * System.out.println("yes i am not 11 :");
     * }
     */
    // QUESTION 2
    /*
     * byte m1, m2, m3;
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter the marks of physics : ");
     * m1 = sc.nextByte();
     * System.out.println("Enter the marks of chemistry : ");
     * m2 = sc.nextByte();
     * System.out.println("Enter the marks of biology : ");
     * m3 = sc.nextByte();
     * float avg = (m1+m2+m3)/3.0f;
     * System.out.println("Your overall percentage is : " + avg);
     * if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
     * System.out.println("Congratulation you have been promoted : ");
     * }
     * else{
     * System.out.println("Sorry you havenot been promoted! please try again: ");
     * 
     * }
     */
    // QUESTION 3
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your income in lakhs per second :");
    /*
     * float tax = 0;
     * float income = sc.nextFloat();
     * if(income<=2.5){
     * tax = tax + 0;
     * }
     * else if(income>2.5 && income<=5f){
     * tax = tax + 0.05f*(income - 2.5f);
     * 
     * }
     * else if(income>5f && income<=10.0f){
     * tax = tax + 0.05f*(5.0f - 2.5f);
     * tax = tax + 0.2f*(income - 5f);
     * }
     * else if(income>10f){
     * tax = tax + 0.05f*(5.0f - 2.5f);
     * tax = tax + 0.2f*(10.0f - 5.0f);
     * tax = tax + 0.3f*(income - 10.0f);
     * 
     * }
     * System.out.println("The total tax paid by employee is :" + tax);
     */
    // QUESTION 4
    /*
     * Scanner sc = new Scanner(System.in);
     * int day = sc.nextInt();
     * switch(day){
     * case 1 -> System.out.println("Monday");
     * case 2 -> System.out.println("Tuesday");
     * case 3 -> System.out.println("Wednesday");
     * case 4 -> System.out.println("Thursday");
     * case 5 -> System.out.println("Friday");
     * case 6 -> System.out.println("Saturday");
     * case 7 -> System.out.println("Sunday");
     * 
     * }
     */
    // question 6
    /*
     * Scanner sc = new Scanner(System.in);
     * String website = sc.next();
     * if(website.endsWith(".org")){
     * System.out.println("This is an organizational website : ");
     * }
     * else if(website.endsWith(".com")){
     * System.out.println("This is an commercial website : ");
     * }
     * else if(website.endsWith(".in")){
     * System.out.println("This is an Indian website : ");
     * }
     */
    // QUESTION 5
    int year;
    System.out.println("Enter an Year :: ");
    Scanner sc = new Scanner(System.in);
    year = sc.nextInt();

    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
      System.out.println("Specified year is a leap year");
    else
      System.out.println("Specified year is not a leap year");
  }
}
