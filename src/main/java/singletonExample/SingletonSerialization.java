package singletonExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerialization {

	public static void main(String[] args) throws Exception {
		
		SingletonSerialized obj1 = SingletonSerialized.get();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
		out.writeObject(obj1);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
		SingletonSerialized obj2 = (SingletonSerialized) in.readObject();
	    in.close();
	    
	    System.out.println("obj1: "+obj1.hashCode());
	    System.out.println("obj2: "+obj2.hashCode());
	}

}

class SingletonSerialized implements Serializable{

	private static final long serialVersionUID = 8527419063L;
	
	private SingletonSerialized() {}
	
	private static class SingletonHelper{
		private static final SingletonSerialized obj = new SingletonSerialized();
	}
	
	public static SingletonSerialized get() {
		return SingletonHelper.obj;
	}
	
	protected Object readResolve() {
		return get();
	}
}