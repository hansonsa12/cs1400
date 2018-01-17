import javax.swing.JOptionPane;

public class InputDialog {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter x: ");
		String input1 = JOptionPane.showInputDialog("Enter y: ");
		
		int x = Integer.parseInt(input);
		int y = Integer.parseInt(input1);
		int sum = Integer.parseInt(input, x + y);
		
		JOptionPane.showMessageDialog(null, x + " + " + y + " = " + (x + y) );
		

	}

}
