
import javax.swing.JOptionPane;

public class Change {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a dollar amount: ");
		
		int amount = Integer.parseInt(input);
		
		String output = "";
		
		output = output + (amount / 20) + " twenties\n";
		amount = amount % 20;
		
		output = output + (amount / 10) + " tens\n";
		amount = amount % 10;
		
		output = output + (amount / 5) + " fives\n";
		amount = amount % 5;
		
		output = output + (amount / 1) +  " ones";
		
		JOptionPane.showMessageDialog(null, output);

	}

}
