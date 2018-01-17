import java.util.Scanner;

/* Calculates the area of a circle of a given radius */
public class CircleAreaAndPerimeter {
  public static void main(String[] args) {
    float radius; // To be entered
    final float PI = 3.14159F;

    System.out.println("Radius of circle:");
    Scanner in = new Scanner(System.in);
    radius = in.nextFloat();
    in.close();
    
    // Calculate and print area.
    float area = PI * radius * radius;
    System.out.println("Area: " + area);
    
    float perimeter = 2 * PI * radius;
    System.out.println("Perimeter: " + perimeter);
  }
}

