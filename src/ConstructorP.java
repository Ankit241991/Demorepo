
public class ConstructorP {
	int i;
	
	String name;
	
	public void display()
	{
		System.out.println(i);
		System.out.println(name);
	}
	
	ConstructorP()
	{
		System.out.println("Ankit Mangla");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorP co= new ConstructorP();
		co.display();
		

	}

}
