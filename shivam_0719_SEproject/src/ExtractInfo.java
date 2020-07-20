import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExtractInfo {

	public void docRead() throws IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of the device you are looking for");
		
		String name = input.nextLine();
		
		File f = new File(name);
		Scanner fRead = new Scanner(f);
		while(fRead.hasNext()) {
			System.out.println(fRead.nextLine());
		}
		
		fRead.close();
		input.close();
		
	}
	
}
