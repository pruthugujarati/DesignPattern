package abstractFactoryExample;

public class LaptopFactory extends AbstractDeviceFactory{

	@Override
	Device getGadget(DeviceType deviceType) {
		switch(deviceType) {
		  case Dell:
			return new Dell("8gb", "3100", "Intel");
		  case Macbook:
			return new Macbook("16gb","4600","IOs");
				
		}
		return null;
	}

}
