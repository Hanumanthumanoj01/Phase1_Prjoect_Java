package Git;

public class Implicitexplicit {
	public static void main(String[] args) {
		// implicit conversion
		System.out.println("Implicit Type Casting");
		char a = 'B';
		System.out.println("Value of a: " + a);
		int b = a;
		System.out.println("Value of b: " + b);
		float c = a;
		System.out.println("Value of c: " + c);
		long d = a;
		System.out.println("Value of d: " + d);
		double e = a;
		System.out.println("Value of e: " + e);
		System.out.println("\n");
		System.out.println("Explicit Type Casting");
		// explicit conversion
		double x = 75.5;
		int y = (int) x;
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);

	}
}