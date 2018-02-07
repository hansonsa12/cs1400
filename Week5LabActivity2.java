import javax.swing.JOptionPane;

public class Week5LabActivity2 {

	public static void main(String[] args) {
		String[] months = {"January","February","March","April","May","June","July","August",
				"September","October","November","December"};
		
		String input = JOptionPane.showInputDialog("Enter Year:");
		int year = Integer.parseInt(input);
		int[] days = {31, year % 4 == 0? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%17s%15s\n", "MONTH", "DAYS");
		for(int x = 0; x < months.length; x++) {
			System.out.printf("%17s%15d\n", months[x], days[x]);
			
		}
			
		
		
		// This is a different way to initialize the array, more typing required
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		
	}

}
