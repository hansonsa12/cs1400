package week04;

import java.util.Random;
import java.util.Scanner;

public class MagicNumber{  
  public static void main(String args[]){ 
    Random generator = new Random();
    int magic = 1 + generator.nextInt(20);
    Scanner in = new Scanner(System.in);
    int n = 0, count = 0;
    
    while(n != magic) {
      System.out.println("Guess an integer between 1 and 20:");
      n = in.nextInt();
      if (n < magic) {
    	  System.out.println("guess a higher number: ");
      
      }else if (n > magic) {
    	  System.out.println("guess a lower number: ");
      }
      count++;
    }
    System.out.printf("Magic number is %d; ", magic); 
    System.out.printf("it took %d tries to find it.\n", count); 

    in.close();
  }
}
