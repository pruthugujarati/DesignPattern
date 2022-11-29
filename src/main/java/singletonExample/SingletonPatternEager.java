package singletonExample;

public class SingletonPatternEager {

	public static void main(String args[]) {
		
		//return same object every time (obj) from getInstance()
		Single_Eager obj1 = Single_Eager.getInstance();
		Single_Eager obj2 = Single_Eager.getInstance();
		
		obj1.i=5;
		obj1.show();
		
		obj2.i=6;
		obj1.show(); //here obj1=obj2 if it is not same then output will be 5,5
	}
}
class Single_Eager{
	//early instance will be created at load time
		private static Single_Eager obj = new Single_Eager();

		private Single_Eager() 
		{
		  System.out.println("Singleton eager implementation : Instance Created");
		}
		
		public static Single_Eager getInstance() 
		{
			return obj;
		}
		
		int i;
		public void show() {
			System.out.println(i);
		}
}