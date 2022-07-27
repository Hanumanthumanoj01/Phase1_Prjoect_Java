package Git;

public class Stringbuilder {
	public static void main(String[] args) {
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("HappyLearning");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "WelcomeTO"));

		System.out.println(sb1.reverse());
				
	}
}