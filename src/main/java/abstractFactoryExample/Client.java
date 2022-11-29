package abstractFactoryExample;

public class Client {

	public static void main(String[] args) {
		
		Device dell = FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.Dell);
		System.out.println(dell.getDetails());
		
		AbstractDeviceFactory mb = FactoryGenerator.getFactory(FactoryType.MobileFactory);
		Device samsung = mb.getGadget(DeviceType.Samsung);
		System.out.println(samsung.getDetails());
		
		Device mac = FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.Macbook);
	    System.out.println(mac.getDetails());
	    
	    Device nokia = FactoryGenerator.getFactory(FactoryType.MobileFactory).getGadget(DeviceType.Nokia);
	    System.out.println(nokia.getDetails());
	}

}
