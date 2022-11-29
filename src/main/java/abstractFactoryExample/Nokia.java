package abstractFactoryExample;

public class Nokia extends Device {

	private String ram;
	private String battery;
	private String screenSize;
	
	@Override
	public String getDetails() {
		return "Nokia : ram size:"+this.ram+", battery : "+this.battery+", Screen Size : "+this.screenSize;
	}

	public Nokia(String ram, String battery, String screenSize) {
		super();
		this.ram = ram;
		this.battery = battery;
		this.screenSize = screenSize;
	}

	
}
