package abstractFactoryExample;

public class Macbook extends Device{

	private String ram;
	private String battery;
	private String processor;
	
	public Macbook(String ram, String battery, String processor) {
		super();
		this.ram = ram;
		this.battery = battery;
		this.processor = processor;
	}

	@Override
	public String getDetails() {
		return "Mackbook : ram size:"+this.ram+", battery : "+this.battery+", ProcessorType : "+this.processor;
		
	}

}
