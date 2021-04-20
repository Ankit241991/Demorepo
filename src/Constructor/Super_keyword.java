package Constructor;

import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.AccessBridgeWrapper;

 class child_class 
{
	int i=10;
	String name="Ankit";
	long h=1000000840;
	
	short f= (short) 100000;
	
	byte j=  (byte) 100000000;
	
	char[] ch= {'a','b'};
	
	public void display() {
		System.out.println("i am in parent class");
	}
	
	
	
	
}

public class Super_keyword extends child_class {
	
	int i=20;
	String name ="Aayusi";
	
	public  void access()
	
	{
		System.out.println(super.name);
	}
	public void display() {
		System.out.println("i am in child class");
		int j=8;
		super.display();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super_keyword sup= new Super_keyword();
		System.out.println(sup.i);
		sup.access();
		sup.display();
		

		
	

	}

}
