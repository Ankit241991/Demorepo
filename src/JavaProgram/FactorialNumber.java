package JavaProgram;

public class FactorialNumber {
	
	// fact of 3=3*2*1=6
	// fact of 4= 4 *3 *2*1= 24
	//10= 10*9*8*7----*1
	//1=1
	
	//without recursive -- use for loop
	
	public static int factorial(int num)
	{
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factorial(10);

	}

}
