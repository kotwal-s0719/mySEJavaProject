import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class UploadInfo {

	public void docWrite() throws IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of the device");
		String devName = input.nextLine();
		
		
		FileWriter fw = new FileWriter(devName+ ".txt", true);
		PrintWriter pw = new PrintWriter(fw);
		
		System.out.println("Enter the details you want to enter about the device");
		String details = input.next();
		
		pw.println(details);
		pw.close();
		
	}
	
}
