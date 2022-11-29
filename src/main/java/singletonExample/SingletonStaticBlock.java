package singletonExample;

public class SingletonStaticBlock {

	public static void main(String[] args) {
		Singleton_Static obj1 = Singleton_Static.getInstance();
		Singleton_Static obj2 = Singleton_Static.getInstance();
		
		if(obj1.equals(obj2))
			System.out.println("Both obj1 and obj2 are equal");
		
	}
}
/*Static block initialization implementation is similar to eager initialization, 
except that instance of the class is created in the static block that provides 
the option for exception handling.*/
class Singleton_Static{
	
	private static Singleton_Static obj;
	
	private Singleton_Static() {}
	
	static 
	{
		try 
		{
		  obj = new Singleton_Static();	
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
	public static Singleton_Static getInstance() {
		return obj;
	}
}