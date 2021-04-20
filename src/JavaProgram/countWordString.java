package JavaProgram;

import java.util.Scanner;

public class countWordString {
	
	// java program to count the number of words in a string
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		
	int count=1;
	
	for(int i=0;i<=s.length()-1;i++)
	{
		System.out.println(s.charAt(i)==' ' && s.charAt(i+1)!=' ');
		count++;
		
	}
		
	System.out.println("Count of string is"+count);
	

	}
	
}
