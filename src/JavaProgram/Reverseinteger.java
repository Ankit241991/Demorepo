package JavaProgram;

public class Reverseinteger {
	//This program will reverse the string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=234567;
		int r=0;
		
		while(num!=0)
		{
			r=r*10+num%10;
			num=num/10;
		}
System.out.println(r);
	}

}
