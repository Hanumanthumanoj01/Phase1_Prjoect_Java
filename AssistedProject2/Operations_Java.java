package AssistedProject2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Operations_Java {
	static void write() throws IOException {
		  String data ="THE file is created \n work is done";
			
			try {
				FileWriter output = new FileWriter("C:\\temp\\notnow.txt");
				output.write(data);
				System.out.println("Data is written successfully");
				output.close();
			} catch (IOException e) {
				System.out.println("File write error");
		}		
	}
static void read() throws IOException {
	char[] d = new char[100];
	try {
		FileReader input = new FileReader("C:\\temp\\notnow.txt");
		input.read(d);
		System.out.println("data is received from a file");
		System.out.println(d);
		input.close();
	}
	catch (FileNotFoundException e) {
		System.out.println("file read error");
	}	
}
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\temp\\notnow.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File has been created  Successfully ");
				write();
				read();	
			}
			else {
				System.out.println("File creation error ");
			}	}
		catch (IOException e) {
			
			e.printStackTrace();
			}
	}
}