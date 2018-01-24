
import java.util.Scanner;

public class DayOfWeekIfElse {
  public static void main(String[] args) {
    String name = "";    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a day (between 1 and 7):");
    int day = in.nextInt();
    
    if (day > 1 && day < 7){ name = "a Weekday"; } 
    else{ name = "a Weekend"; }
    
    System.out.println("Day of week is " + name + ".");
    
    in.close();
  }
}

