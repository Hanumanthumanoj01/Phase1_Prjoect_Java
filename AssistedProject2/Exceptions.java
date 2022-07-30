package AssistedProject2;

import java.util.Scanner;


class cusex extends Exception{
     
	public String tostring() {
		return "you are not eligible for voting";
    
     }
	
}

public class Exceptions {
	
		static  void validate() throws cusex {
			Scanner s=new Scanner(System.in);
			int a;
			System.out.println("Enter your Age  ");
			a = s.nextInt();
			
			if (a>18) {
				System.out.println("you are eligible for voting");
			}
			else
				throw new cusex();
			}
		
       public static void main(String[] args) {
    	   try {
    		   validate();
    	   }
    	   catch (cusex e) {
    		   System.out.println(e.tostring());
    			
    		   
    	   }
       }
}