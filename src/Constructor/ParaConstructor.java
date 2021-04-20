package Constructor;

public class ParaConstructor {
	
	int emp_num;
	String emp_ka_name;
	float emp_salary;
	
	ParaConstructor(int emp_id,String emp_name)
	{
		emp_num=emp_id;
		emp_ka_name=emp_name;
		
		System.out.println(emp_num+"  "+emp_ka_name);
	}
	
	ParaConstructor(int emp_id1,String emp_name1,float salary)
	{
		emp_num=emp_id1;
		emp_ka_name=emp_name1;
		emp_salary=salary;
		
		System.out.println(emp_num+"  "+emp_ka_name+"  "+emp_salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConstructor para= new ParaConstructor(10, "Ayushi Kullar");
		ParaConstructor para1= new ParaConstructor(2, "Umesh Bhai");
		ParaConstructor para2= new ParaConstructor(3,"ankita gupta",1000);
		

	}

}
