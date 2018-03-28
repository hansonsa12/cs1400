import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		ArrayList<String> names = new ArrayList<>();
		PrintWriter out = null;
		/** Reads in the down loaded names.txt file
		 * and prints them to the console
		 */
		
		try {
			in = new Scanner(new File("names.txt"));
			while (in.hasNextLine()) {
				names.add(in.nextLine());
			}
			
			names.sort(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					return o2.compareTo(o1);
				}
			});
			
			out = new PrintWriter("names-sorted.txt");
			for(String name : names) {
				out.println(name);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			in.close();
			out.close();
	}

}
}
