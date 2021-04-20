package Aggregation;

public class Emp {
	
	
	int emp_id;
	String Emp_name;
	Address adr;
	
	Emp(int emp_id,String Emp_name,Address adr)
	{
		this.emp_id=emp_id;
		this.Emp_name=Emp_name;
		this.adr=adr;
	}

	public void display()
	{
		System.out.println(emp_id+"   "+ Emp_name);
		
		System.out.println(adr.city+" "+adr.state+" "+ adr.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address adr1=new Address("Yamuna nagar", "Haryana", "India");
		
		Address adr2=new Address("Karnal", "Haryana", "India");
		Emp em= new Emp(4, "Ankit Mangla", adr1);
		
		Emp em1= new Emp(5, "Aayushi Singhal", adr2);
		
		em.display();
		em1.display();
		

	}

}
