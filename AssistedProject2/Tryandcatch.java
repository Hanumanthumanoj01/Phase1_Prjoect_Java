package AssistedProject2;

import java.util.Scanner;

public class Tryandcatch {
	public static void main(String[] args){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number 1");
		a=sc.nextInt();
		System.out.println("Enter the Number 2");
		b=sc.nextInt();
		
		try{
		  System.out.println("Result is num1/num2 = "+a/b);		  
		}	
		catch(ArithmeticException e){  // child
			System.out.println("Numbers cannot be divided by zero");
		}
		
	  }
}