
public class BooleanProof {

	public static void main(String[] args) {
		System.out.println("b\t\ta\ta&&(a||b)");
		boolean a = false, b = false;
		System.out.println(b + "\t\t" + a + "\t\t" + (a&&(a||b)));
		a = true;
		b = false;
		System.out.println(b + "\t\t" + a + "\t\t" + (a&&(a||b)));
		a = false;
		b = true;
		System.out.println(b + "\t\t" + a + "\t\t" + (a&&(a||b)));
		a = true;
		b = true;
		System.out.println(b + "\t\t" + a + "\t\t" + (a&&(a||b)));


	}

}
