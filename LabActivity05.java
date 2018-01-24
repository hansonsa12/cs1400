import javax.swing.JOptionPane;


public class LabActivity05 {

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("Enter a Day of the Week: ");
		
		if(day.equals("sunday") || day.equals("saturday")){
			JOptionPane.showMessageDialog(null, "Day is a Weekend");
		}
		else{
				JOptionPane.showMessageDialog(null, "Day is a Weekday");
				}
	}
	}

