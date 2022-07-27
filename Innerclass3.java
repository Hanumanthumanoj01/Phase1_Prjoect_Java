package Git;

public class Innerclass3 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  
	 
	 public static void main(String[] args) {
			Innerclass3  ob=new Innerclass3 ();  
			ob.display();  
			}
}