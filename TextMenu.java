import java.util.Scanner;

public class TextMenu {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter km: ");
		double kilometers = keyboard.nextDouble();
		
		int choice;
		do {
			System.out.println("1. Convert to meters");
			System.out.println("2. Convert to feet");
			System.out.println("3. Convert to inches");
			System.out.println("4. Quit Program");
			
			System.out.println("Enter your choice: ");
			choice = keyboard.nextInt();
		
			switch(choice) {
			case 1:
				System.out.printf("There are %.2f meters in %.2f kilometers ", 
						kilometers * 1000,kilometers);
				break;
			case 2:
				System.out.printf("There are %.2f feet in %.2f kilometers ", 
						kilometers * 3280.84,kilometers);
				break;
			case 3:
				System.out.printf("There are %.2f inches in %.2f kilometers, ",
						kilometers * 39370.08, kilometers);
				break;
			case 4:
			}
		} while(choice != 4);
		
		
		
		keyboard.close();
		

	}

}
