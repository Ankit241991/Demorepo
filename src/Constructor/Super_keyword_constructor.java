package Constructor;


class parent_class
{
	
	parent_class()
	{
		System.out.println("Parent class constructor");
	}
	
	
	
}

public class Super_keyword_constructor extends parent_class{
	
	
	Super_keyword_constructor()
	{
		super();
		System.out.println("Ankit mangla");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super_keyword_constructor supe= new Super_keyword_constructor();
		
		

	}

}
