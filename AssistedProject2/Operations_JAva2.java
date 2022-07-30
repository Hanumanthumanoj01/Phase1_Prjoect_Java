package AssistedProject2;
import java.io.File;

public class Operations_JAva2 {
	  public static void main(String[] args) { 
	    File dlt= new File("C:\\temp\\notnow.txt"); 
	    if (dlt.delete()) { 
	      System.out.println("Deleted the file: " + dlt.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	  } 
	}