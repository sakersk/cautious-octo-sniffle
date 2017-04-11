import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class demo
{
	public static void main(String args[]) 
	{
		System.out.println("hello world");
		File file = new File("test.txt");
		try {
			PrintWriter output = new PrintWriter(file);
			output.println("sk saker uddin");
			output.println(30);
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}