package singletonExample;

public class SingletonSynchronized {

	public static void main(String[] args) {

    Thread t1 = new Thread(new Runnable(){
    	public void run()
    	{
    	Lazysyn obj1 = Lazysyn.getInstance();
    	}
    	}) ;
    	
    Thread t2 = new Thread(new Runnable(){
    	public void run()
    	{
    	Lazysyn obj2 = Lazysyn.getInstance();
    	}
    	}) ;
    
    t1.start();
    t2.start();
    }
}
class Lazysyn {
	
	private Lazysyn() 
	{
		System.out.println("Instance created");
	}
	
	public static Lazysyn obj; 
	
	//without synchronized it will create 2 objects at same time
	//increase time bcz of synchronized
	public static synchronized Lazysyn getInstance() {
		
	//instance create only 1 time if already created it will create again
		if(obj==null) 
		{
		obj = new Lazysyn();
		}
		return obj;
	/*
		Double checked locking 
		
		 if(obj==null) 
		{
		  synchronized(Lazysyn.class)
		    obj = new Lazysyn();
		}
		 return obj;
     */	
	}
}
