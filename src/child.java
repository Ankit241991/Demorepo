
 class child extends Parent {
	
	public void Cmethod()
	{
		System.out.println("Parent method is called");
	}
	
	public void comm()
	{
		System.out.println("child common  method is called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p= new child();

p.comm();
	}

}
