package Git;
public class AccessModifiers {
	public void methodpublic() {
		System.out.println("This is public method");
	}
	public void methodPrivate() {
		System.out.println("This is private method");
	}
	public void methodDefault() {
		System.out.println("This is default method");
		
	}
	public void methodProtected() {
		System.out.println("This is protected method");
	}
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		
		obj.methodpublic();
		obj.methodPrivate();
		obj.methodDefault();
		obj.methodProtected();
	
		
	}
}