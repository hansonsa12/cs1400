package week04;

import java.util.Scanner;

public class FactorialFor{  
  public static void main(String args[]){  
    System.out.println("Enter a positive integer:");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
   
    
    System.out.print("Factorial of " + n + " is: ");
    long factorial = 1;
    for(int i = 1; i <= n; i++){ 
    	factorial *= i;
    }
    
    System.out.println(factorial); 

    in.close();
  }
}

