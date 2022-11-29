package singletonExample;

public class SingletonLazy {

	public static void main(String[] args) {
		Single_Lazy obj1 = Single_Lazy.getInstance();
		Single_Lazy obj2 = Single_Lazy.getInstance();

	}

}
class Single_Lazy{
	private Single_Lazy() 
	{
		System.out.println("Instance created");
	}
	
	public static Single_Lazy obj; 
	
	public static Single_Lazy getInstance() {
		
		//instance create only 1 time if already created it will create again
		if(obj==null) 
		{
		obj = new Single_Lazy();
		}
		return obj;
		
	}
	
}
