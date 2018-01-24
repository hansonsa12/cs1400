import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		System.out.println("Enter two integers:");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int max = y;
		
		if(x > y) {
			System.out.println("Max is " + x);
		}else {
			System.out.println("Max is " + y);
		}
		input.close();
		

	}

}
