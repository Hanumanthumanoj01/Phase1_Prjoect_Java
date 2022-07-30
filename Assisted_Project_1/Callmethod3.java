package Git;

public class Callmethod3 {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

Callmethod3 ob=new Callmethod3();
       ob.area(11,12);
       ob.area(7);  
   }
}

