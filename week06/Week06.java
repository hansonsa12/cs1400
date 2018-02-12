package week06;

public class Week06 {

	public static void main(String[] args) {
		stars(3);
		stars(8);
		equalSigns();

	}

	
	public static void stars(int numberOfStars) {
		for(int i =0; i < numberOfStars; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
	
	public static void equalSigns() {
		
		System.out.println("    =");
		System.out.println("   =");
		System.out.println("  =");
		System.out.println(" =");
		System.out.println("=");
	}
}	