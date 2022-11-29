package factoryPattern;

public class FactoryMain {

	public static void main(String[] args) {
		
		OperatingSystemFactory obj = new OperatingSystemFactory();
		OS obj1 = obj.getInstance("closed");

		obj1.spec();
		
	}

}
