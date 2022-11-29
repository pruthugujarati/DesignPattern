package abstractFactoryExample;

public class MobileFactory extends AbstractDeviceFactory {

	@Override
	Device getGadget(DeviceType deviceType) {
		switch(deviceType) {
		  case Nokia:
			  return new Nokia("8gb", "1500","5.5");
		  case Samsung:
			  return new Samsung("16gb","1500","5.0");
		}
		return null;
	}

}
