import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.util.Scanner;

public class cwk_80_errorsdemo {
 public static void main(String[] args) {
     // logical Error demo
     // write a program to print all prime prime numbers between 1 to 10
     System.out.println(2); // logical error because we think of print prime number but 9 is odd number
    for(int i=1; i<5; i++){
        System.out.println(2*i+1);
    }
    // Run time error
    int k=0;
    Scanner sc = new Scanner(System.in);
    k = sc.nextInt();
    System.out.println("Integer part of 1000 divided by k " + 1000/k);
 }   
}
