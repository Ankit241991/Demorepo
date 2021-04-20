package JavaProgram;

public class IsPrimeNumber {
	
	public static boolean isPrime(int num)
	{
		
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean value=isPrime(121);
		
		if(value==true)
		{
			System.out.println("Number is prime number");
		}
		
		else
		{
			System.out.println("Number is not prime number");
		}

	}

}
