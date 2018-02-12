package week06;

public class Week06Lab1 {

	public static void main(String[] args) {
		printNewLine();
		
		System.out.printf("min: %f\ncube: %f\ndivisbleBy: %b\n",
		min(15,11),
		cube(5),
		divisibleBy(6,18));
		
	}
	
	public static void printNewLine() {
		System.out.println();
	}
	
	public static double min(double x, double y) {
		if(x < y) {
			return x;
		}else {
			return y;
		}
		
	}
	
	public static double cube(double x) {
		return x * x * x;
		
	}
	
	public static boolean divisibleBy(double x, double y) {
//		if(x % y== 0) {
//			return true;
//		}else {
//			return false;
//		}
		return x % y == 0;

	}
}
