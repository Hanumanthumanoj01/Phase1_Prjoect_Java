package AssistedProject2;

import java.util.Scanner;

public class Exception_1 {
             static void run() throws ArithmeticException{
            	 Scanner sc= new Scanner(System.in);
            	 System.out.println("enter numerator");
            	 int a = sc.nextInt();
            	 System.out.println("enter denominator");
            	int  b=sc.nextInt();
            	if(b!=0)
            	 try {
            		 System.out.println(a/b);
            	 }
            	finally {
           		 System.out.println("new method");
               	 
                }
            	else
            	
     				throw new ArithmeticException();
     				}
            		 
            	 
         public static void main(String[] args) {
        	 try {
        	    run();
         }
        	 catch(ArithmeticException e) {
        		 System.out.println("exception");
        		 
        	 }
        	 
}
}