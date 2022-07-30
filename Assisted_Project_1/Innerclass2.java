package Git;

public class Innerclass2 {
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
			Innerclass2  ob=new Innerclass2 ();  
			ob.display();  
			}
}