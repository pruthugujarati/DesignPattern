package factoryPattern;

public class OperatingSystemFactory {

	public OS getInstance(String str) {
		
		if(str.equals("open"))
			return new Android();
		else if(str.equals("closed"))
			return new IOs();
		else 
			return new Windows();
	}
}
