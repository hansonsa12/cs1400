import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		System.out.println("Enter three integers:");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		int max = y;
		
		if(x > y) {
			System.out.println("Min is " + x);
		}else {
			System.out.println("Min is " + y);
		}
		
		if(x % 2 == 0) {
			System.out.println("X is even");
		}else {
			System.out.println("X is odd");
		}
		
		if(x % y== 0) {
			System.out.println(x + " is divisible by " + y);
		}else {
			System.out.println(x + " is NOT divisble by " + y);
		}
		input.close();

	}

}
