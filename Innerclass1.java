package Git;

public class Innerclass {
	private String msg = "Welcome to Java";

	class Inner {
		void hello() {
			System.out.println(msg + ", Let us start learning Inner Classes");
		}
	}

	public static void main(String[] args) {

		Innerclass obj = new Innerclass();
		Innerclass.Inner in = obj.new Inner();
		in.hello();
	}
}