package singletonExample;

import java.lang.reflect.Constructor;

public class SingletonReflection {

	public static void main(String[] args) {
		Single_Eager obj1 = Single_Eager.getInstance();
		Single_Eager obj2 = null;
		
		try {
			Constructor[] c = Single_Eager.class.getDeclaredConstructors();
			
			for(Constructor con : c) 
			{
				con.setAccessible(true);

			    obj2 = (Single_Eager) con.newInstance();
				break;	
			
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("obj1: "+obj1.hashCode());
		System.out.println("obj2: "+obj2.hashCode());
		
	}

}
