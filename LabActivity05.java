import javax.swing.JOptionPane;


public class LabActivity05 {

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("");
		
		if(day.equalsIgnoreCase("sunday" || "saturday")){
				JOptionPane.showMessageDialog(null, "Day is a Weekend");
	}
	}
}
