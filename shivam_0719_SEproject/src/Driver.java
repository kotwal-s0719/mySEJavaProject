import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your username:");
		String userName = input.next();

		System.out.println("password:");
		String pass = input.next();
		
		boolean x = true;
		while(x = true) {

		System.out.println("---->Tech Centre<----");
		System.out.println("1. Extract data");
		System.out.println("2. Upload data");
		System.out.println("3. Pricing details");
		System.out.println("4. Brief details");

		int opt = input.nextInt();

		switch(opt) {

		case 1:
			ExtractInfo extObj = new ExtractInfo();
			try {
				extObj.docRead();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;

		case 2: 		
			
			UploadInfo upObj = new UploadInfo();
			try {
				upObj.docWrite();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			break;
			
		case 3:
			PricingDetails PriObj = new PricingDetails(1099, "Apple i11");
		    String cheapAlt = PriObj.getCheapAlt();
			int price = PriObj.getPrice();
			System.out.println("The price is " + price + " and cheap alternative is: " + cheapAlt);
			
			break;
			
		case 4: 
			Device devObj = new Device("Galaxy s20", "Samsung", "SmartPhone", 
					"Snapdragon 865 Processor, 8GB RAM, 128/512GB ROM, "
					+ "Super Amoled Display", "1099 CAD", 981  );
			System.out.println(devObj.getBrandName() + " " +
			devObj.getDeviceName() + " " +
			devObj.getDeviceType() + " " +
			devObj.getModelNo() + " " +
			devObj.getSpecs() + " " + 
			devObj.getPricingDetails());
			
			
			break;
		
		}
		
			
		}
		



	}

}
