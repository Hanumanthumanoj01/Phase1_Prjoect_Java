package Git;
public class Array {
	public static void main(String[] args) {

		//single-dimensional array
		int a[]= {10,20,30,40,50,100};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {{1,2,3,4,5,6,7}, {2,3,4,3, 6, 9} };
		      
	    System.out.println("\nLength of row 1: " + b[0].length);
   }


}