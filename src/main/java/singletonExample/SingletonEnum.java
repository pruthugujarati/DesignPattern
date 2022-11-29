package singletonExample;

public class SingletonEnum {

	public static void main(String[] args) {
		
		Singleton_enum obj1 = Singleton_enum.INSTANCE;
		obj1.i= 3;
		obj1.show();
		
		Singleton_enum obj2 = Singleton_enum.INSTANCE;
		obj2.i=4;
		obj1.show();
	}

}
enum Singleton_enum{ //enum special type of class -->has private constructor by default
	
	INSTANCE;  //public static Singleton_enum show();
	
	int i;
	public void show() {
		System.out.println(i);
	}
}