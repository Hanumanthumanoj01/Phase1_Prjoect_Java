package Git;



public class Callmethod2 {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	Callmethod2 b=new Callmethod2();
	int ans= b.multipynumbers(7,4);
	System.out.println("Multipilcation is :"+ans);
	}



    }