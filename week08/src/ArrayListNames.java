import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListNames {

	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList <>();
		names.add("Jack"); 
		names.add("Sam");
		names.add("Matt"); 
		names.add("Tyler");
		names.add("Jacob");
		
		System.out.println(names);
		
		names.add(0, "Faith");
		System.out.println(names);
		
		names.remove("Matt");
		System.out.println(names);
		
		names.add(2, "Norm");
		System.out.println(names);
		
		names.add(2, "Norm");
		System.out.println(names);
		
		names.remove("Norm");
		System.out.println(names);  // removes first iteration of "norm"
	
			
		if(names.contains("Danzo")) {
				System.out.println("Danzo is in this list");  //searches array for given input
		}else {
				System.out.println("Danzo is not in this list");
		}
		
		ArrayList<String> names2 = new ArrayList<>(
				Arrays.asList("Jamie", "Shisui", "Dingus", "Brule", "Wasabi"));  //adds 1 array to another
		
		names.addAll(names2);
		System.out.println(names);
		
		for(int i = 0; i < names.size(); i++) {  // Iterates over names list
			System.out.println(names.get(i));
		}
		
		for(String n : names) { 	 //Enhanced for loop that iterates over the array 
			System.out.println(n);	//(only for arrays and arraylist)
		}
		
		}
}

