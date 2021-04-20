package JavaProgram;

public class ArmStrongNumber {
	
	//370=3*3*3+7*7*7+0
	//371=3*3*3+7*7*7+1
	//407=4*4*4+0+7*7*7
	//1=1*1*1
	//153=1*1*1+5*5*5+3*3*3
	// 333=3*3*3+3*3*3+3*3*3
	
	public static void armstrong(int num)
	{
		int cube=0;
		int r;
		int t;
		
		
		t=num;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
			
		}
		
		if(t==cube)
		{
			System.out.println("Number is armstrong number");
		}
		
		else {
			System.out.println("Number is not armstrong number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		armstrong(371);

	}

}
