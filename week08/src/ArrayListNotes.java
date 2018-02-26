import java.util.ArrayList;

public class ArrayListNotes {

	public static void main(String[] args) {
		int [] numbers = new int [10]; // static array
		numbers[0] = 10;
		numbers[1] = 20;
		
		//dynamic array
	
		ArrayList <Integer> list = new ArrayList <Integer>();
//		list.add(10);
//		list.add(20);
//		or
		for(int i = 0; i < 100; i++) {
			list.add(i * 10);
		}
		
		System.out.println(list);
		System.out.printf("%d elements found", list.size());

	}

}
