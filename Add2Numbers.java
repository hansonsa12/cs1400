package week01;


import java.util.Scanner;

/* Prints out the sum of two integer variables */
public class Add2Numbers {
  public static void main(String[] args) {
    int x, y; //define input variables x and y
    
    // For reading from the keyboard
    Scanner in = new Scanner(System.in);
  
    // Getting the values of both x and y
    System.out.println("Enter x:"); 
    x = in.nextInt();
    
    System.out.print("Enter y:\n"); 
    y = in.nextInt();
    
    in.close();
    
    // Printing the result
    System.out.println("x + y is " + (x + y) + ".");
  }
}

