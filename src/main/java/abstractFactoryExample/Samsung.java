package abstractFactoryExample;

public class Samsung extends Device{

	private String ram;
	private String battery;
	private String screenSize;
	
	public Samsung(String ram, String battery, String screenSize) {
		super();
		this.ram = ram;
		this.battery = battery;
		this.screenSize = screenSize;
	}

	@Override
	public String getDetails() {
		return"Samsung : ram size:"+this.ram+", battery : "+this.battery+", Screen Size : "+this.screenSize;
		
	}

}
