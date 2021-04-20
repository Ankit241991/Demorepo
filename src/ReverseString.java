
public class ReverseString {
	
	//java program to reverse each word of a given string
	
	public static void reverseString(String str)
	{
		
		String input[]=str.split(" ");
		
		String reverseStringout="";

		for(int i=0;i<input.length;i++)
		{
			String actString= input[i];
			String revesein= " ";
			
			for(int j=actString.length()-1;j>=0;j--)
			{
				revesein=revesein+actString.charAt(j) ;
				 
				 System.out.println(revesein);
			}
			reverseStringout=reverseStringout+revesein+ " ";
			
		}
		
		System.out.println(reverseStringout);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("This is Java Classes");
	}

}
