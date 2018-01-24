import javax.swing.JOptionPane;

public class Assignment2 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Name: ");
		String input1 = JOptionPane.showInputDialog("Email: ");
		String input2 = JOptionPane.showInputDialog("Zip Code: ");
		String input3 = JOptionPane.showInputDialog("Phone Number: ");
		
		System.out.println("Name: " + input);
		System.out.println("Email: " + input1);
		System.out.println("Zip Code: " + input2);
		System.out.println("Phone Number: " + input3);
		

	}

}
