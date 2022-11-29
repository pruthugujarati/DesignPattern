package singletonExample;

//not require synchronization
public class SingletonPatternBillPugh {

	private SingletonPatternBillPugh() 
	{
		System.out.println("Instance created");
	}
	
	private static class SingletonHelper
	{
		private static final SingletonPatternBillPugh obj = new SingletonPatternBillPugh();
	}
	
	public static SingletonPatternBillPugh getmethod() 
	{
		return SingletonHelper.obj;
	}
	
	public static void main(String[] args) {
		
		SingletonPatternBillPugh obj1 = SingletonPatternBillPugh.getmethod();
		SingletonPatternBillPugh obj2 = SingletonPatternBillPugh.getmethod();
		
		if(obj1.equals(obj2))
			System.out.println("Both obj1 and obj2 are equal");
	}
}
