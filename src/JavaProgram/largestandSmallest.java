package JavaProgram;

public class largestandSmallest {
	
	public static void sortNum() {
		
		int arr[]= {20,30,50,567,8976,-30};
		
		int smallest= arr[0];
		
		int largest= arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if (largest<arr[i])
			{
				largest=arr[i];
			}
			else
			{
				smallest=arr[i];
			}
			
		}
		System.out.println(smallest);
		System.out.println(largest);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sortNum();
	}

}
