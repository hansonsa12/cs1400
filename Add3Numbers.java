import java.util.Scanner;

/* Prints out the sum of three integer variables */
public class Add3Numbers {
  public static void main(String[] args) {
    int x, y, z; //define input variables x, y, and z

    // For reading from the keyboard
    Scanner in = new Scanner(System.in);
  
    // Getting the values of x, y, and z
    System.out.println("Enter x:"); 
    x = in.nextInt();
    
    System.out.print("Enter y:\n"); 
    y = in.nextInt();
    
    System.out.print("Enter z:\n"); 
    z = in.nextInt();
   
    in.close();
    
    int sum = (x + y + z);
    double average = (x + y + z) / 3.0;

    // Printing the result
    System.out.println("Sum of x, y, and z: " + (sum) + ".");
    System.out.println("Average of x, y, and z: " + (average) + ".");

  }
}

