import java.util.ArrayList;
import java.util.Scanner;

public class CourseEnrollment {

	public static void addAStudent(ArrayList<String> students, Scanner keyboard) {
		System.out.println("Enter the name of the student: ");
		String name = keyboard.nextLine();
		students.add(name);
	}
	public static void dropAStudent(ArrayList<String> students, Scanner keyboard) {
		System.out.println("Enter the name of the student: ");
		String drop = keyboard.nextLine();
		students.remove(drop);
	}
	public static void listStudent(ArrayList<String> students) {
		for (String n : students) {
			System.out.println(n);
		}		
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char choice;
		ArrayList<String> students = new ArrayList<>();

		do {
			System.out.println("Welcome to CS1400");
			System.out.println("================");
			System.out.println("a. Add a student");
			System.out.println("d. Drop a student");
			System.out.println("p. List all students");
			System.out.println("q. Quit Program");
			choice = keyboard.nextLine().trim().charAt(0);
			switch (choice) {
			case 'a':
				addAStudent(students, keyboard);
				break;
			case 'd':
				dropAStudent(students, keyboard);
				break;
			case 'p':
				listStudent(students);
				
				break;
			case 'q':
				System.out.println("Goodbye!");
				break;

			default:
				System.out.print("Invalid Input");
			}

		} while (choice != 'q');
	}
}