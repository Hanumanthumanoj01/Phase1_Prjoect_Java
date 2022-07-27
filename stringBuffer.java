package Git;

public class stringBuffer {
	public static void main(String[] args) {
		  String str= new String("Hello World");
		  
		  StringBuffer s1= new StringBuffer(str);
		  System.out.println("Size: "+s1.length());
		  
		  System.out.println("uppercase letter: ");
		  
		 s1.append("welcome");
		 System.out.println(s1);
		 
		 s1.insert(11, " ");
		 System.out.println(s1);
		 
		 
		 s1.replace(12, 19, "Bye");
		 System.out.println(s1);
		 
		 
		 s1.reverse();
		 System.out.println(s1);
	}

}