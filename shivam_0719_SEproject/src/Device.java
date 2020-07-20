
public class Device {

	String deviceName, brandName, deviceType, specs, pricingDetails;
	int modelNo;
	
	public Device(String deviceName, String brandName, String deviceType,
			String specs, String pricingDetails, int modelNo) {
		this.deviceName = deviceName;
		this.brandName = brandName;
		this.deviceType = deviceType;
		this.specs = specs;
		this.pricingDetails = pricingDetails;
		this.modelNo = modelNo;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	public String getBrandName() {
		return brandName;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public String getSpecs() {
		return specs;
	}
	public String getPricingDetails() {
		return pricingDetails;
	}
	public int getModelNo() {
		return modelNo;
	}
	
	
}