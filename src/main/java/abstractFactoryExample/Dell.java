package abstractFactoryExample;

public class Dell extends Device{

	private String ram;
	private String battery;
	private String processor;
	
	public Dell(String ram, String battery, String processor) {
		super();
		this.ram = ram;
		this.battery = battery;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		return "Dell : ram size:"+this.ram+", battery : "+this.battery+", ProcessorType : "+this.processor;
		
	}

}
