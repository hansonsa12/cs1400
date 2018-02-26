import java.util.Scanner;

public class Assignment06 {

	public static void main(String[] args) {
		

	}
	public static double calcProfit(double ns, double sp, double sc, double pp, double pc, double profit) {
		Scanner in = new Scanner(System.in);
		
		profit = ((ns * sp) - sc) - ((ns * pp) + pc);
		return profit;

	}
}
