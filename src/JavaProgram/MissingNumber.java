package JavaProgram;

public class MissingNumber {
	//This will give the missing number in a array
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num= {1,2,3,4,5,7,8};
		
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum =sum+num[i];
		}

		int sum1=0;
		
		for(int j=1;j<=8;j++)
		{
			sum1=sum1+j;
		}
		System.out.println("misssing character is  " +(sum1-sum));
		
	}

}
