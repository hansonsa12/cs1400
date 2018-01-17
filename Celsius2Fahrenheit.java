

import java.util.Scanner;

/* Converts a given Celsius temperature to an 
   equivalent Fahrenheit value */
public class Celsius2Fahrenheit {
  public static void main(String[] args){
    double fTemp; // To be entered
    double cTemp; // To be calculated

    Scanner in = new Scanner(System.in);
    System.out.println("Temperature in Celsius:");
    cTemp = in.nextDouble();
    in.close();
    
    
    fTemp = (cTemp * 9.0 / 5.0) + 32;
    System.out.println("Temperature in Fahrenheit is: " + fTemp);
  }
}

