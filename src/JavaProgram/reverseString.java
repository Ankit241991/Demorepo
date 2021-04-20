package JavaProgram;

public class reverseString {
	
	public static void reverse(String inputstring) {
		
		String arr[]= inputstring.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse("This is ankitmangla string");

	}

}
